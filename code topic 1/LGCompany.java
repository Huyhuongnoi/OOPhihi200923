import java.util.ArrayList;
import java.util.Scanner;

public class LGCompany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrData = new ArrayList<String>();
        ArrayList<String> arrName = new ArrayList<String>();
        boolean flag = true;
        while (flag) {
            System.out.println("Choose one of the following functions");
            System.out.println("1: add.\n2: search by name.\n3: search by char of name.\n4: Show info. \n5: exit");
            int choice = scanner.nextInt();
            StaffManagement staffManagement = new StaffManagement();
            switch (choice) {
                case 1:
                    staffManagement.addData(arrData, arrName);
                    break;
                case 2:
                    staffManagement.findData(arrData);
                    break;
                case 3:
                    staffManagement.findChar(arrName, arrData);
                    break;
                case 4:
                    staffManagement.printData(arrData);
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Please select again!: ");
            }
        }
    }
}
