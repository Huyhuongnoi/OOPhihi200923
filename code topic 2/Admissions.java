import java.util.ArrayList;
import java.util.Scanner;
public class Admissions {
    public void add(ArrayList<String> arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("add new student: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Ptiority Level: ");
        String ptiorityLevel = scanner.nextLine();
        System.out.print("Exam Subject(A, B or C): ");
        String examSubject = scanner.next();
        Class aClass = new Class(name, address, ptiorityLevel, examSubject);
        arr.add(aClass.getData());
    }
    public void findId(ArrayList<String> arr){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the id number you want to search: ");
        int id = scanner.nextInt();
        System.out.println(arr.get(id));
    }
    public void displayInformation(ArrayList<String> arr){
        for(String val : arr){
            System.out.println(val);
        }
    }
}
