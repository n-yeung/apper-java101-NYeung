package cakes;//package map;
import java.util.HashMap;
import java.util.Map;


public class App {
    public static void main(String[] args) {
        Map<String, String> cars = new HashMap<>();
        cars.put("c1", "Innova");
        cars.put("c2", "FJ Cruiser");
        cars.put("c3", "Expander");
        //cars.put("c3", "Toyota");
        // c3 would be toyota since it was updated or replaced
        cars.put("c4", "Vios");
        cars.put("c5", "Honda");
        cars.put("c6", "Tesla");

        System.out.println(cars.get("c4"));
        System.out.println(cars.size());
        System.out.println(cars.keySet());
        System.out.println(cars.containsKey("c7"));
        System.out.println(cars.containsValue("FJ Cruiser"));
        //use containsValue only for validation, not really good practice
        //if use containsValue flexibility is limited since value can be repeated
        System.out.println(cars.values());



    }
}
