package HW;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog("Buddy",5,true,"Haski");
        Animal cat = new Cat("Бася", 4, false, "black");

        System.out.println(dog);
        System.out.println(cat);

        if(dog instanceof Dog d){
            d.feed();
        }if(cat instanceof Cat c){
            c.feedCat();
        }
    }
}
