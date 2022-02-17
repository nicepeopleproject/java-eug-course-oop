package myExample.myPrototype;

public class OrcFactory {
    Orc orc;

    public OrcFactory(Orc orc) {
        this.orc = orc;
    }

    public Orc buildClone(){
        try {
            return (Orc)orc.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
