import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int sqnum;

        System.out.println("Input number to be squared");
        int number = scan.nextInt();
        
        sqnum = number*=number;

        System.out.println(sqnum);

        scan.close();
    }
}
