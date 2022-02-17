package myExample.myPrototype;

public class OrcReplicator {
    public static void main(String[] args) {
        Orc orc = new Orc("Mm", 31);
        OrcFactory orcFactory = new OrcFactory(orc);
        System.out.println(orc);
        System.out.println(orcFactory.buildClone());
    }
}
