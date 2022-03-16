package myExample.prototype;

public class Orc implements Cloneable {
    private String name;
    private int age;

    public Orc(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Orc(name, age);
    }

    @Override
    public String toString() {
        return "Orc{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
