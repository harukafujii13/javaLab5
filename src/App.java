import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static int getRandomNumber(int min, int max){
        Random rand = new Random();
        return rand.nextInt(max) + min;
    }

    public static void question1() {
        try (Scanner input = new Scanner(System.in)){
        ArrayList<Integer> randomNList = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            randomNList.add(getRandomNumber(1, 50));
        }

        // option1
        System.out.println("Generated random numbers are: " + randomNList);
        // System.out.println("Please enter an integer:");
        // Integer x = input.nextInt();

        // if(randomNumList.contains(x)){
        // System.out.println(x+ " is in the list.");
        // }else{
        // System.out.println(x+ " is not in the list.");
        // }

        // option2
        while (true) {
            System.out.println("Please enter an integer:");
            Integer x = input.nextInt();

            if (randomNList.contains(x)) {
                System.out.println(x + " is in the list.");
                break;
            } else {
                System.out.println(x + " is not in the list.");
            }
        }
    }
}

public static void question2(){
    ArrayList<Integer> randomNumList = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
        randomNumList.add(getRandomNumber(1, 50));
    }

    // ArrayList<Integer> randomCopyList = new ArrayList<>(randomNumList);
    ArrayList<Integer> randomCopyList = new ArrayList<>();
    randomCopyList.addAll(randomNumList);

    System.out.println("---Before setting---");
    System.out.println("Original: " + randomNumList);
    System.out.println("Copy: " + randomCopyList);

    randomNumList.set(randomNumList.size() - 1, -5);

    System.out.println("---After setting---");
    System.out.println("Original: " + randomNumList);
    System.out.println("Copy: " + randomCopyList);
}

public static void question3(){
    ArrayList<Car> cars = new ArrayList<>();

    cars.add(new Car("Jeep", "Wrangler", 1986));
    cars.add(new Car("Honda", "Civic", 1975));
    cars.add(new Car("Toyota", "Camry", 1980));

    for(Car car: cars){
        System.out.println("Element: " + car);
    }

    cars.sort(null);
    System.out.println("================");

    for(Car car: cars){
        System.out.println("Element: " + car);
    }
}

public static void main(String[] args) throws Exception {
    question1();
    question2();
    question3();
    }
}

class Car implements Comparable<Car>{

private String make;
private String model;
private int year;

public Car(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
}
public String getMake() {
    return make;
}

public void setMake(String make) {
    this.make = make;
}

public String getModel() {
    return model;
}

public void setModel(String model) {
    this.model = model;
}

public int getYear() {
    return year;
}

public void setYear(int year) {
    this.year = year;
}

@Override
public String toString() {
    return "Car [make=" + make + ", model=" + model + ", year=" + year + "]";
}

@Override
public int compareTo(Car o) {
    if(year == o.year){
        return 0;
    }else if(year > o.year){
        return 1;
    }else{
        return -1;
    }
}

}

