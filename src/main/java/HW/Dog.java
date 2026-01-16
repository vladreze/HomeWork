package HW;

public class Dog extends Mammal{

    private String breed;

    public Dog(String name, int age, boolean hasFur, String breed) {
        super(name, age, hasFur);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return super.toString() + "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
