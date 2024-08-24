package Story;

import java.util.ArrayList;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Dialog {


    private boolean show = false;
    private int messagenr = 0;
    private final ArrayList<String> messages = new ArrayList<String>();
    private final ArrayList<Integer> speeker = new ArrayList<Integer>();
    private final ArrayList<DialogAktion> aktion = new ArrayList<DialogAktion>();

    public void addMessage(String text, int fighter, DialogAktion daktion) {
        messages.add(text);
        speeker.add(fighter);
        aktion.add(daktion);
    }

    public DialogAktion getDialogAktion() {
        return aktion.get(messagenr);
    }

    public String getMessage() {
        return messages.get(messagenr);
    }

    public int getDialogSpeeker() {
        return speeker.get(messagenr);
    }

    public boolean showDialog() {
        return show;
    }

    public void nextMessage() {
        show = false;
        messagenr++;
    }

    public boolean lastMessage() {
        return messagenr == messages.size() - 1;
    }

    public void clearAktion() {
        // TODO Auto-generated method stub
        aktion.set(messagenr, null);
    }
}
