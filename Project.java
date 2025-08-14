import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Input number to be squared");
        int number = scan.nextInt();
        
        int sqnum = number*number;

        System.out.println(sqnum);

        scan.close();
    }
}
