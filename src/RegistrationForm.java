import java.util.*;

public class RegistrationForm {
    public static class Student{
        private int id;
        private String name;
        private int age;
        private double average;
        private char gender;
        private String address;
        private String email;
        private long phoneNumber;
        private boolean isInternational;
        private String course;

        public Student(int id, String name, int age, double average, char gender, String address, String email, long phoneNumber, boolean isInternational, String course) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.average = average;
            this.gender = gender;
            this.address = address;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.isInternational = isInternational;
            this.course = course;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        public char getGender() {
            return gender;
        }

        public void setGender(char gender) {
            this.gender = gender;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public long getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(long phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public boolean isInternational() {
            return isInternational;
        }

        public void setInternational(boolean international) {
            isInternational = international;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        @Override
        public String toString() {
            return "Student Details:\n" +
                    "ID: " + id + "\n" +
                    "Name: " + name + "\n" +
                    "Age: " + age + "\n" +
                    "Average: " + average + "\n" +
                    "Gender: " + gender + "\n" +
                    "Address: " + address + "\n" +
                    "Email: " + email + "\n" +
                    "Phone Number: " + phoneNumber + "\n" +
                    "International: " + isInternational + "\n" +
                    "Course: " + course;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean cont = true;
        ArrayList<Student> students = new ArrayList<>();

        while(cont){

            System.out.println("========================================");
            System.out.println("||          REGISTRATION FORM          ||");
            System.out.println("========================================");
            System.out.println("||  1. Register New Student            ||");
            System.out.println("||  2. View All Students               ||");
            System.out.println("||  3. Modify Student Record           ||");
            System.out.println("||  4. Delete Student Record           ||");
            System.out.println("||  5. Search Student                  ||");
            System.out.println("||  6. Exit                            ||");
            System.out.println("========================================");
            System.out.print("Select an option (1-6): ");
            int choice = scn.nextInt();

            switch(choice) {
                case 1 -> {

                    System.out.print("1. Enter Student ID: ");
                    int id = scn.nextInt();

                    scn.nextLine();

                    System.out.print("2. Enter Full Name: ");
                    String name = scn.nextLine();

                    System.out.print("3. Enter Age: ");
                    int age = scn.nextInt();

                    System.out.print("4. Enter Average: ");
                    double average = scn.nextDouble();

                    System.out.print("5. Enter Gender (M/F): ");
                    char gender = scn.next().charAt(0);

                    scn.nextLine();

                    System.out.print("6. Enter Address: ");
                    String address = scn.nextLine();

                    System.out.print("7. Enter Email: ");
                    String email = scn.nextLine();

                    System.out.print("8. Enter Phone Number: ");
                    long phoneNumber = scn.nextLong();

                    System.out.print("9. Are you an international student? (true/false): ");
                    boolean isInternational = scn.nextBoolean();

                    scn.nextLine();

                    System.out.print("10. Enter Course Enrolled: ");
                    String course = scn.nextLine();

                    boolean isAdded = students.add(new Student(id,name,age,average,gender,address,email,phoneNumber,isInternational,course));
                    if(isAdded){
                        System.out.println("Student Added Successfully!");
                    } else {
                        System.out.println("Failed to add student...");
                    }
                }

                case 2 -> {
                    System.out.println("========================================");
                    System.out.println("||         ALL REGISTERED STUDENTS     ||");
                    System.out.println("========================================");

                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for (Student s : students) {
                            System.out.println(s);
                            System.out.println("----------------------------------------");
                        }
                    }
                }

                case 3 -> {
                    System.out.print("Enter Student ID to modify: ");
                    int searchId = scn.nextInt();
                    scn.nextLine();

                    boolean found = false;

                    for (Student s : students) {
                        if (s.getId() == searchId) {
                            found = true;
                            System.out.println("Student found: " + s.getName());
                            System.out.println("Select field to modify:");
                            System.out.println("1. Name");
                            System.out.println("2. Age");
                            System.out.println("3. GPA");
                            System.out.println("4. Gender");
                            System.out.println("5. Address");
                            System.out.println("6. Email");
                            System.out.println("7. Phone Number");
                            System.out.println("8. International Status");
                            System.out.println("9. Course");
                            System.out.print("Enter choice: ");
                            int opt = scn.nextInt();
                            scn.nextLine();

                            switch (opt) {
                                case 1 -> {
                                    System.out.print("Enter new name: ");
                                    s.setName(scn.nextLine());
                                }
                                case 2 -> {
                                    System.out.print("Enter new age: ");
                                    s.setAge(scn.nextInt());
                                }
                                case 3 -> {
                                    System.out.print("Enter new GPA: ");
                                    s.setAverage(scn.nextDouble());
                                }
                                case 4 -> {
                                    System.out.print("Enter new gender (M/F): ");
                                    s.setGender(scn.next().charAt(0));
                                }
                                case 5 -> {
                                    System.out.print("Enter new address: ");
                                    s.setAddress(scn.nextLine());
                                }
                                case 6 -> {
                                    System.out.print("Enter new email: ");
                                    s.setEmail(scn.nextLine());
                                }
                                case 7 -> {
                                    System.out.print("Enter new phone number: ");
                                    s.setPhoneNumber(scn.nextLong());
                                }
                                case 8 -> {
                                    System.out.print("Is the student international (true/false): ");
                                    s.setInternational(scn.nextBoolean());
                                }
                                case 9 -> {
                                    System.out.print("Enter new course: ");
                                    s.setCourse(scn.nextLine());
                                }
                                default -> System.out.println("Invalid option");
                            }

                            System.out.println("Student record updated successfully.");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("No student found with ID: " + searchId);
                    }
                }

                case 4 -> {
                    System.out.print("Enter Student ID to delete: ");
                    int searchId = scn.nextInt();

                    boolean removed = students.removeIf(s -> s.getId() == searchId);

                    if (removed) {
                        System.out.println("Student Removed Successfully!");
                    } else {
                        System.out.println("No student found with ID: " + searchId);
                    }
                }

                case 5 -> {
                    System.out.print("Enter Student ID to view: ");
                    int searchId = scn.nextInt();
                    scn.nextLine();

                    boolean found = false;

                    for (Student s : students) {
                        if (s.getId() == searchId) {
                            System.out.printf("ID: %d | Name: %s | Age: %d | Average: %.2f | Gender: %c | Course: %s%n",
                                    s.getId(), s.getName(), s.getAge(), s.getAverage(), s.getGender(), s.getCourse());
                            System.out.println("----------------------------------------");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found...");
                    }
                }

                case 6 -> {
                    System.out.println("Exiting Program...");
                    cont = false;
                }

                default -> System.out.println("Invalid input..");
            }

        }
    }
}
