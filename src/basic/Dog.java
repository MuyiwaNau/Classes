package basic;

public class Dog implements Animal, Bird{

    enum blood{
        Warm,
        Cold
    }

    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The Dog says: woof woof");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }

    public void fly() {
        System.out.println("The Dog can't fly");
    }

    public void dogBlood(){
        blood dog = blood.Warm;
        System.out.println("Dog blood is " + dog);
    }
}
