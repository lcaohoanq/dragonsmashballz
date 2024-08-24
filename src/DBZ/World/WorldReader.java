package DBZ.World;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
@Getter
@Setter
public class WorldReader {
    public Map[] read() {
        Map[] maps = new Map[2];
        for (int i = 0; i < 2; i++) {
            maps[i] = readSingleMap(i + 1).orElse(null);
        }
        return maps;
    }

    private String getMapFilePath(int mapNumber) {
        return "resources/Ressourcen/World" + mapNumber + ".txt";
    }

    private Optional<Map> readSingleMap(int mapNumber) {
        log.info("Reading World {}...", mapNumber);
        String mapFilePath = getMapFilePath(mapNumber);

        try (BufferedReader reader = Optional.ofNullable(
                new BufferedReader(new InputStreamReader(
                    getClass().getClassLoader().getResourceAsStream(mapFilePath))))
            .orElseThrow(() -> new IOException("File not found: " + mapFilePath))) {

            String mapContent = reader.lines().collect(Collectors.joining());
            log.debug("Map content: {}", mapContent);

            byte[][][] mapData = parseMap(mapContent);
            return Optional.of(new Map(mapData));

        } catch (IOException | IllegalArgumentException e) {
            log.error("Error reading or parsing World {}: {}", mapNumber, e.getMessage());
            return Optional.empty();
        }
    }

    private byte[][][] parseMap(String mapContent) {
        if (mapContent.isEmpty()) {
            throw new IllegalArgumentException("Map content is empty");
        }

        String[] sections = mapContent.split(";");
        if (sections.length == 0) {
            throw new IllegalArgumentException("Invalid map content: no sections found");
        }

        String[] dimensions = sections[0].split(",");
        if (dimensions.length != 2) {
            throw new IllegalArgumentException("Invalid dimensions: expected width,height format");
        }

        int width, height;
        try {
            width = Integer.parseInt(dimensions[0]);
            height = Integer.parseInt(dimensions[1]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid dimensions: non-numeric values");
        }

        byte[][][] fields = new byte[width][height][2];
        int x = 0, y = 0;

        for (int i = 1; i < sections.length; i++) {
            String[] fieldData = sections[i].split(",");
            if (fieldData.length != 2) {
                throw new IllegalArgumentException("Invalid field data: expected two values per field");
            }

            try {
                fields[x][y][0] = Byte.parseByte(fieldData[0]);
                fields[x][y][1] = Byte.parseByte(fieldData[1]);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid field data: non-numeric values");
            }

            y++;
            if (y >= height) {
                y = 0;
                x++;
            }
        }

        return fields;
    }

    public static void main(String[] args) {
        WorldReader reader = new WorldReader();
        Map[] maps = reader.read();
        for (Map map : maps) {
            System.out.println(map);
        }
    }
}
