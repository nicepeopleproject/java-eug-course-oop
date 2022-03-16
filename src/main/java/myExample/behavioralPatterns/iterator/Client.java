package myExample.behavioralPatterns.iterator;

public class Client {
    public static void main(String[] args) {
        Weapon[] weapons = {new Weapon("Axe"),
                new Weapon("Mace"),
                new Weapon("Bow")};
        Orc orc = new Orc("Lalaldin", weapons);

        Iterator weaponIterator = orc.getIterator();
        while (weaponIterator.hasNext()) {
            System.out.println(weaponIterator.next());
        }
    }
}
