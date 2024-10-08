package Story;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DialogReader {

    private final ArrayList<Dialog> dialogs = new ArrayList<Dialog>();

    public void readDialogs() {

        String zeile = ""; //Lesestrings
        StringBuffer m = new StringBuffer();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                getClass().getClassLoader().getResourceAsStream(
                    "DBZ/Ressourcen/Story.txt")));//Textdatei mit Name name einlesen
            while ((zeile = reader.readLine()) != null) {
                m.append(zeile);
            }

        } catch (IOException f) {
            System.err.println("Error2 :" + f);
        }


    }


}
