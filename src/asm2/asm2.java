import asm2.Barista;
import asm2.Customer;
import asm2.Person;
import java.util.ArrayList;
import java.util.Scanner;


import java.util.ArrayList;
import java.util.Scanner;

public class asm2 {

    private static int person_id = 0;
    private static ArrayList<Person> persons = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Coffee Shop Management System");
            System.out.println("1. Person");
            System.out.println("2. Product");
            System.out.println("3. Order");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    personMenu();
                    break;
                case 2:
//                    productMenu();
                    break;
                case 3:
//                    orderMenu();
                    break;
                case 4:
                    System.out.println("Exiting the system...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }
        }
    }

    private static void personMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Person Menu");
            System.out.println("1. Add Person");
            System.out.println("2. Edit Person");
            System.out.println("3. Delete Person");
            System.out.println("4. Show Person");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addPerson();
                    break;
                case 2:
                    editPerson();
                    break;
                case 3:
                    deletePerson();
                    break;
                case 4:
                    showPerson();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }
        }
    }

   public static void addPerson() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter name: ");
    String name = scanner.nextLine();

    System.out.print("Enter email: ");
    String email = scanner.nextLine();

    System.out.print("Enter age: ");
    int age = scanner.nextInt();
    scanner.nextLine(); // Consume the newline character

    System.out.println("Select person type:");
    System.out.println("1. Barista");
    System.out.println("2. Customer");

    int choice = scanner.nextInt();
    scanner.nextLine(); // Consume the newline character

    switch (choice) {
        case 1:
            System.out.print("Enter salary: ");
            float salary = scanner.nextFloat();
            scanner.nextLine(); // Consume the newline character
            Barista barista = new Barista(++person_id, name, email, age, salary);
            persons.add(barista);
            System.out.println("Barista added successfully!");
            break;
        case 2:
            System.out.print("Enter phone: ");
            int phone = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            Customer customer = new Customer(++person_id, name, email, age, phone);
            persons.add(customer);
            System.out.println("Customer added successfully!");
            break;
        default:
            System.out.println("Invalid choice!");
            break;
    }
}



    private static void editPerson() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEdit Person");
        System.out.print("Enter person id to edit: ");
        int id = scanner.nextInt();

        boolean personFound = false;

        for (Person person : persons) {
            if (person.getPerson_id() == id) {
                personFound = true;
                scanner.nextLine(); // consume the newline character
                            System.out.print("Enter new name: ");
            String name = scanner.nextLine();
            System.out.print("Enter new email: ");
            String email = scanner.nextLine();
            System.out.print("Enter new age: ");
            int age = scanner.nextInt();

            if (person instanceof Barista) {
                System.out.print("Enter new salary: ");
                float salary = scanner.nextFloat();
                ((Barista) person).setSalary(salary);
            } else if (person instanceof Customer) {
                System.out.print("Enter new phone: ");
                int phone = scanner.nextInt();
                ((Customer) person).setPhone(phone);
            }

            person.setName(name);
            person.setEmail(email);
            person.setAge(age);

            System.out.println("Person edited successfully!");
            break;
        }
    }

    if (!personFound) {
        System.out.println("Person with ID " + id + " not found!");
    }
}

private static void deletePerson() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nDelete Person");
    System.out.print("Enter person id to delete: ");
    int id = scanner.nextInt();

    boolean personFound = false;

    for (Person person : persons) {
        if (person.getPerson_id() == id) {
            personFound = true;
            persons.remove(person);
            System.out.println("Person deleted successfully!");
            break;
        }
    }

    if (!personFound) {
        System.out.println("Person with ID " + id + " not found!");
    }
}

private static void showPerson() {
    System.out.println("\nShow Person");

    if (persons.size() == 0) {
        System.out.println("No persons found.");
    }

    for (Person person : persons) {
        System.out.println(person.toString());
    }
}
}
