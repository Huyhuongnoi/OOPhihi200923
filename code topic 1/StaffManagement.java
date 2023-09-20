import java.util.ArrayList;
import java.util.Scanner;

public class StaffManagement {
    public static void addData(ArrayList<String> arr, ArrayList<String> arrName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Sex: ");
        String sex = scanner.nextLine();
        System.out.println("Address: ");
        String address = scanner.nextLine();
        System.out.println("What do you want to add?\n1. Engineer\n2. Worker\n3. Staff");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.println("add Engineer : ");
                System.out.print("Training industry: ");
                String trainingIndustry = scanner.nextLine();
                Engineer engineer = new Engineer(name, age, sex, address, trainingIndustry);
                arr.add(engineer.dataEngineer());
                arrName.add(engineer.getName());
                break;
            case 2:
                System.out.println("add Worker: ");
                System.out.print("Level 1-10: ");
                int rank = scanner.nextInt();
                Worker worker = new Worker(name, age, sex, address, rank);
                arr.add(worker.dataWorker());
                arrName.add(worker.getName());
                break;
            case 3:
                System.out.println("Staff: ");
                System.out.print("Job: ");
                String job = scanner.nextLine();
                Staff staff = new Staff(name, age, sex, address, job);
                arr.add(staff.dataStaff());
                arrName.add(staff.getName());
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }

    public static void findData(ArrayList<String> arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("name you want to search: ");
        String name = scanner.nextLine();
        boolean flag = false;
        for (String val : arr) {
            int index = val.indexOf(name);
            if (index != -1) {
                System.out.println(val);
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("Can not find!");
        }
    }

    public static void findChar(ArrayList<String> arrName, ArrayList<String> arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Char you want to find: ");
        String charName = scanner.next();
        int count = -1;
        for (String val : arrName) {
            int index = val.indexOf(charName);
            count += 1;
            if (index != -1) {
                System.out.println(arr.get(count));
            }
        }
    }

    public static void printData(ArrayList<String> arr) {
        for (String val : arr) {
            System.out.println(val);
        }
    }
}

