package basic;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        // write your code here

        Dog dog = new Dog();
        Eagle eagle = new Eagle();
        dog.animalSound();
        eagle.animalSound();
        dog.sleep();
        eagle.sleep();
        eagle.fly();
        dog.fly();
        dog.dogBlood();
        eagle.eagleBlood();

        LocalDateTime localDate = LocalDateTime.now();
        System.out.println(localDate);

        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String date = localDate.format(formatDate);
        System.out.println(date);


        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Camry");
        cars.add("Tesla");
        cars.add("Kia");
        cars.add("Bentley");
        cars.add("Bmw");
        cars.add("Honda");
        Collections.sort(cars);
        System.out.println(cars);

        cars.set(3, "Range");

        for ( String i : cars){
            System.out.println(i);
        }


        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("Akin", 89);
        people.put("Glow", 59);
        people.put("King", 78);
        people.put("Glen", 60);
        System.out.println(people);

        for ( String i : people.keySet() ){
            System.out.println("Key: " + i + " Value: " + people.get(i));
        }


        }
    }