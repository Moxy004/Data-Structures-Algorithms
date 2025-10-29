import java.util.*;

public class HashMap1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        boolean cont = true;

        while(cont){
            System.out.println("==== HashMap ====");
            System.out.println("1. Insert Data");
            System.out.println("2. Print All Data");
            System.out.println("3. Edit Data");
            System.out.println("4. Delete Data");
            System.out.println("5. Exit");
            System.out.println("=================");
            System.out.print("Enter choice: ");
            int choice = scn.nextInt();
            scn.nextLine();

            switch(choice){
                case 1 -> {
                    System.out.print("Enter # of inputs: ");
                    int count = scn.nextInt();
                    scn.nextLine();

                    inputData(map, scn, count);
                }

                case 2 -> {
                    printAllData(map);
                }

                case 3 -> {
                    System.out.print("Enter key to update: ");
                    int key = scn.nextInt();
                    scn.nextLine();

                    System.out.print("Enter new value: ");
                    String newValue = scn.nextLine();

                    editData(map, key, newValue);
                }

                case 4 -> {
                    System.out.print("Enter key to delete: ");
                    int key = scn.nextInt();

                    deleteData(map, key);
                }

                case 5 -> cont = false;
            }
        }
    }

    public static void inputData(HashMap<Integer, String> map, Scanner scn, int count){
        System.out.println("====== Input Data ======");
        for(int x = 1; x <= count; x++){
            System.out.print("Enter key #" + x + ": ");
            int key = scn.nextInt();
            scn.nextLine();

            System.out.print("Enter value #" + x + ": ");
            String value = scn.nextLine();

            System.out.println();

            map.put(key, value);
        }
    }

    public static void printAllData(HashMap<Integer, String> map){
        System.out.println("====== All Data ======");
        if(map.isEmpty()){
            System.out.println("No data");
        } else {
            for(Map.Entry<Integer, String> entry : map.entrySet()){
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }

    }

    public static void editData(HashMap<Integer, String> map, int key, String newValue){
        if(map.containsKey(key)){
            map.replace(key, newValue);
            System.out.println("Updated successfully!");
        } else {
            System.out.println("ID not found");
        }
    }

    public static void deleteData(HashMap<Integer, String> map, int key){

        if(map.containsKey(key)){
            map.remove(key);
            System.out.println("Deleted Successfully!");
        } else {
            System.out.println("Failed to delete...");
        }
    }
}
