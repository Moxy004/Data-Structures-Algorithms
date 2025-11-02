package HashMap;

import java.util.*;

public class PrintAllHashMap {

     /*

    Hash Map - is a data structure that stores key-value pairs. Each key is unique,
               and it is used to quickly access its associated value

     */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();

//        map.put(1001, "Jaren");
//        map.put(1002, "Test");
//
//        // Looks up keys and search up value separately
//        // Use for simple lookup
//        for(int key : map.keySet()){
//            System.out.println(key + " = " + map.get(key));
//        }
//
//        // Better performance - For searching both key and value
//        // Use when looking for both the key and value
//        for(Map.Entry<Integer,String> entry : map.entrySet()){
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//        }

        System.out.print("Enter key: ");
        int key = scn.nextInt();
        scn.nextLine();

        System.out.print("Enter value: ");
        String value = scn.nextLine();


        map.put(key, value);

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
