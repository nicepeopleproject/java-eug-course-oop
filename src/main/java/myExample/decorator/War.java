package myExample.decorator;

public class War {
    public static void main(String[] args) {
        Orc orc = new OrcLeader(new OrcGeneral( new JustOrc()));

        System.out.println(orc.prepareForFight());
    }
}
