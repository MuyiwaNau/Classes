package basic;

public class Eagle implements Animal, Bird {

    enum blood{
        Warm,
        Cold
    }
    public void animalSound() {
        System.out.println("The eagle says: tweet");
    }


    public void sleep() {
        System.out.println("Zzzzzzzzzzzzz");
    }

    public void fly() {
        System.out.println("The bird can fly");
    }

    public void eagleBlood(){
        blood dog = blood.Cold;
        System.out.println("Eagle blood is " + dog);
    }

}
