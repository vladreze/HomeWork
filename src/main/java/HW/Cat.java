package HW;

import java.util.Objects;

public class Cat extends Mammal{

    private String color;

    public Cat(String name, int age, boolean hasFur, String color) {
        super(name, age, hasFur);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void feedCat(){
        System.out.println("Yum yum fro cat");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return  getAge() == cat.getAge() &&
                Objects.equals(getName(),cat.getName()) &&
                Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(),getName(),color);
    }

    @Override
    public String toString() {
        return super.toString() + "Cat{" +
                "color='" + color + '\'' +
                '}';
    }
}
