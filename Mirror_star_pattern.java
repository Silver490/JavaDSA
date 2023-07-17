import java.util.*;
public class Mirror_star_pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
     int N = sc.nextInt();
     
     int row =1;
     int space = N-1;
     int star= 1;
     
     while(row<=N){
       int i =1;
       while(i<=space){
         System.out.print("\t");
         i++;
       }
       
       int j=1;
       
       while(j<=star){
         System.out.print("*\t"); 
         j++;
       }
       
       if(row<=N/2 ){
         star+=2;
         space--;
       }
       else{
         star-=2;
         space++;
       }
       
       row++;
       System.out.println();
       
     }
            
    }
}
