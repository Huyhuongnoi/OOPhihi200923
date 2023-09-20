import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listStudent = new ArrayList<String>();
        boolean flag = true;
        Admissions admissions = new Admissions();
        while (flag) {
            System.out.print("1: add new student\n2: Display information\n3: Search for students\n4: exit\nYou choose: ");
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    admissions.add(listStudent);
                    break;
                case 2:
                    admissions.displayInformation(listStudent);
                    break;
                case 3:
                    admissions.findId(listStudent);
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Please select again:");
                    break;
            }
        }
    }
}
