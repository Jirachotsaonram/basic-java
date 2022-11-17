
 
import java.util.Scanner;
 
public class calNum {
 
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
         
        System.out.print(" ใส่ค่าของสี่เหลี่ยมจัตุรัสด้านข้าง   : ");
        float side = scan.nextFloat();
         
        System.out.printf(" พื้นที่ของสี่เหลี่ยมจัตุรัสทั้งหมด %.2f", side * side);
 
        scan.close();       
    }
}