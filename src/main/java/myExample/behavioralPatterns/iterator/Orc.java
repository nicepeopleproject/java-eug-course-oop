package myExample.behavioralPatterns.iterator;

public class Orc implements Collection {
    private String name;
    private Weapon[] weapons;

    public Orc(String name, Weapon[] weapons) {
        this.name = name;
        this.weapons = weapons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon[] getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapon[] weapons) {
        this.weapons = weapons;
    }

    @Override
    public Iterator getIterator() {
        return new WeaponIterator();
    }

    private class WeaponIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < weapons.length ? true : false;
        }

        @Override
        public Object next() {
            return weapons[index++];
        }
    }

}
