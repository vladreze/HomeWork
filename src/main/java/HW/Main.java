package HW;

public class Main {

    public static void main(String[] args) {
        Dog anim = new Dog("Buddy",5,true,"Haski");
        Dog anim2 = new Dog("Buddy",5,true,"Haski");


        System.out.println("--- == ----");
        System.out.println(anim == anim2);
        System.out.println("----- equals or not----");
        System.out.println(anim.equals(anim2));

    }
}
