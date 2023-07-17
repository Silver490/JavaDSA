import java.util.*;
public class Main2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
     int n = sc.nextInt();
     
     int row = 1;
	 int star = n;
     int space = n-1;
     int middlespace = 0;

     while(row<=n){
         
         int i = 1;
         while(i<=space){
             System.out.print("\t");
             i++;
         }
         
         int k = 1;
         if(row==1 || row==n){
             star = n;
         }
         else{
             star = 1;
         }
         while(k<=star){
             System.out.print("*"+"\t");
             k++;
         }

         int j = 1;
         if(row==1 || row == n){
             middlespace = 0;
         }
         else{
             middlespace = n-2;
         }
         while(j<=middlespace){
             System.out.print("\t");
             j++;
         }

         int p = 1;
         if(row==1 || row == n) {
         	star=0;
         }
         else{
             star =1;
         }
         while(p<=star){
             System.out.print("*"+"\t");
             p++;
         }
         
         row++;
         space = space-1;
         System.out.println();

 }
 }

}
