import java.util.*;
public class Mirror_star_pattern2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
     int n = sc.nextInt();
     
     int star = 1;
     int space = n / 2;
     int row = 0;

     while (row < n) {
         int i = 1;
         while (i <= space) {
             System.out.print("  ");
             i++;
         }

         int j = 1;
         while (j <= star) {
             System.out.print("* ");
             j++;
         }

         if (row < n / 2) {
             space--;
             star += 2;
         } else {
             space++;
             star -= 2;
         }
         System.out.println();
         row++;
       
     }
            
    }
}
