package HW;

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
    public String toString() {
        return super.toString() + "Cat{" +
                "color='" + color + '\'' +
                '}';
    }
}
