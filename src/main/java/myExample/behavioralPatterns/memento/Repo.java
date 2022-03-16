package myExample.behavioralPatterns.memento;

public class Repo {
    Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
