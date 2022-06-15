package test15_6_2022;
import java.util.Scanner;
public class Exercise_1 {
    public static void main(String args[])
    {
        double balance, rate, interset;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập vào số tiền vay : ");
        balance = scan.nextDouble();
        System.out.print("Nhập vào lãi xuất hàng năm (%) : ");
        rate = scan.nextDouble();
        scan.close();
        interset = balance*(rate/1200);
        System.out.print("Số tiền lãi là: " +interset);
    }
}
