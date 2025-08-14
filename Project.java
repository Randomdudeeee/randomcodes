import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int number;

        System.out.println("Input number to be squared");
        try {number = scan.nextInt();}
        catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scan.close();
            return;
        }
        
        int sqnum = number*number;

        System.out.println(sqnum);

        scan.close();
    }
}
