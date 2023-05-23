package Webinar6;

public class Cat {
    private String poroda;
    private String name;
    private int age;
    private String owner;

    public Cat(String name, String poroda, int age, String owner) {
        this.name = name;
        this.poroda = poroda;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name: " + name + ", poroda: " + poroda + ", age: " + age + ", owner: " + owner;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cat)) {
            return false;
        }
        Cat cat = (Cat) obj;
        if (name.equals(cat.name) && poroda.equals(cat.poroda) && age == cat.age && owner.equals(cat.owner)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 7 * age + 11 * poroda.hashCode() + 17 * owner.hashCode();
    }
}
