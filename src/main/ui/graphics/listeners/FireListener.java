package ui.graphics.listeners;

import ui.graphics.PlayMusic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ui.graphics.Guiv3;

//EFFECTS: This actionlistener is removes a task from a list

public class FireListener implements ActionListener {
    private Guiv3 guiv3;

    public void actionPerformed(ActionEvent e) {
        guiv3 = new Guiv3();

        //This method can be called only if
        //there's a valid selection
        //so go ahead and remove whatever's selected.
        int index = guiv3.list.getSelectedIndex();
        guiv3.listModel.remove(index);
        PlayMusic p = new PlayMusic();
        p.playMusic("Music\\\\x.wav");
        int size = guiv3.listModel.getSize();

        if (size == 0) { //Nobody's left, disable firing.
            guiv3.fireButton.setEnabled(false);

        } else { //Select an index.
            if (index == guiv3.listModel.getSize()) {
                //removed item in last position
                index--;
            }

            guiv3.list.setSelectedIndex(index);
            guiv3.list.ensureIndexIsVisible(index);
        }
    }
}

