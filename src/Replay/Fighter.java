package Replay;

import java.util.ArrayList;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Fighter {

    private final ArrayList<Integer> xpos = new ArrayList<Integer>();
    private final ArrayList<Integer> ypos = new ArrayList<Integer>();
    private final ArrayList<Integer> pid = new ArrayList<Integer>();
    private final ArrayList<Integer> fid = new ArrayList<Integer>();
    private final ArrayList<Boolean> left = new ArrayList<Boolean>();

    public void add(int x, int y, int p, int f, boolean dir) {
        xpos.add(x);
        ypos.add(y);
        pid.add(p);
        fid.add(f);
        left.add(dir);
    }
}
