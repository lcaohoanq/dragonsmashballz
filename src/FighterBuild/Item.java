package FighterBuild;

import java.util.ArrayList;
import lombok.Getter;

@Getter
public class Item {

    private final String name;
    private final String beschreibung;
    private final int preis;
    private final int bildid;
    private final ArrayList<Effect> effect = new ArrayList<Effect>();

    public Item(String name, String beschreibung, int preis, int bildid) {
        this.name = name;
        this.bildid = bildid;
        this.preis = preis;
        this.beschreibung = beschreibung;
    }

    public void addEffect(float eff, int type, int art) {
        effect.add(new Effect(eff, type, art));

    }

}
