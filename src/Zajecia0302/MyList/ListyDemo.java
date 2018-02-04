package Zajecia0302.MyList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListyDemo {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Mercedes");
        cars.add("Audi");
        cars.add("Skoda");
        for (String car: cars) {
            System.out.println(car);
        }

        for (int i = 0; i <cars.size() ; i++) {
            System.out.println(cars.get(i));
        }
    }
}
