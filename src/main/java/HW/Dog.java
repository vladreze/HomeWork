package HW;

import java.util.Objects;

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


    /*Пояснення для себе:
    Методи equals() та hashCode() потрібні для того,
    щоб Java могла порівнювати об'єкти за їхнім фактичним вмістом
    (даними всередині), а не за їхньою адресою в пам'яті.
     */

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return getAge() == dog.getAge() &&
                Objects.equals(getName(),dog.getName()) &&
                Objects.equals(breed, dog.breed) ;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(breed);
    }

    @Override
    public String toString() {
        return super.toString() + "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
