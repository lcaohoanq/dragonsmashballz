package Save;

import java.io.Serializable;
import java.util.ArrayList;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MatchHistory implements Serializable {


    private final ArrayList<HistoryFight> fights = new ArrayList<HistoryFight>();

    public void addFight(HistoryFight fight) {
        fights.add(fight);
    }

    public int getFightAmount() {
        return fights.size();
    }

    public HistoryFight getFight(int nr) {
        return fights.get(nr);
    }


}
