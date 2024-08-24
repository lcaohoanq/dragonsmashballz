package Story;

import java.util.ArrayList;
import lombok.Getter;

public class Chapter {

    private final String name;

    private final ArrayList<StoryBattle> fights = new ArrayList<StoryBattle>();

    public Chapter(String name) {
        this.name = name;
    }

    public ArrayList<StoryBattle> getStoryBattles() {
        return fights;
    }

    public StoryBattle getFight(int id) {
        return fights.get(id);
    }

    public int getBattleAmount() {
        return fights.size();
    }


    public void addFight(StoryBattle fight) {
        fights.add(fight);
    }

}
