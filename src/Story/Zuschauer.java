package Story;

import lombok.Getter;
import lombok.NoArgsConstructor;
import utils.GameImages;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

@NoArgsConstructor
@Getter
public class Zuschauer {

    private final ArrayList<Integer> zuschauer = new ArrayList<Integer>();
    private final ArrayList<Boolean> zuschauerplatz = new ArrayList<Boolean>();
    private final ArrayList<Integer> ypos = new ArrayList<Integer>();
    private float winkel;
    private final Dimension dim = new Dimension(150, 150);

    public void addZuschauer(int nr, boolean platz) {
        zuschauer.add(nr);
        zuschauerplatz.add(platz);
        ypos.add((int) Math.random() * 100 + 1 + 200);
    }

    public void paint(Graphics g) {

        winkel += 2;

        int lx = 20;
        int rx = 850;

        for (int i = 0; i < zuschauer.size(); i++) {

            int x = 0;
            int y = ypos.get(i) + (int) (Math.sin(Math.toRadians(winkel + i * 30)) * 7
                + Math.cos(Math.toRadians(winkel + i * 30)) * 7);
            if (zuschauerplatz.get(i)) {//links schauer

                x = rx;
                g.drawImage(GameImages.fighter[zuschauer.get(i)][4], x + dim.width, y, -dim.width,
                    dim.height, null);
                rx -= 80;
            } else {// rechts schauer

                x = lx;
                g.drawImage(GameImages.fighter[zuschauer.get(i)][4], x, y, dim.width, dim.height,
                    null);
                lx += 80;
            }

        }

    }


}
