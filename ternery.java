import java.util.Scanner;

public class ternery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 40;
        // String type = ((num%2) == 0)?"Even": "odd";
        // System.out.println(type);

        String result = (num>=33)?"PAss": "Fail";
        System.out.println(result);
    }
}
