import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số a:");
        int a = scanner.nextInt();
        System.out.println("nhập số b:");
        int b = scanner.nextInt();
        if(a>b){
            System.out.println("ước chung lớn nhất là: "+findGCD(a, b));
        }else{
            System.out.println("ước chung lớn nhất là: "+findGCD(b, a));
        }
    }
    public static int findGCD(int x, int y) {
        int temp;
        while(y != 0) {
            temp = x % y;
            x= y;
            y= temp;
        }
        return x;
    }
}