package Lec08;

import java.util.Scanner;

public class Print_armstrong_numbers {

	public static void main(String args[])
	   { 
	     Scanner sc = new Scanner (System.in);
	     int n1 = sc.nextInt();
	     int n2 = sc.nextInt();
	     System.out.println(Armstrong(n1, n2));
	    
	   }
	   
	   public static int Armstrong(int n1,int n2){
	     int val=0;
	     for(int i= n1; i<=n2; i++){
	    	 
	    	if(IsArmstrong(i)==true) {
	    		val++;
	    	}
	    	
	       }
	     return val;
	   }
	      
	      
	   
	   // check if number is Armstrong
	   public static boolean IsArmstrong(int n){
		     
		    
		     int sum=0;
		     //int val=0;
		     int x=n;
		     int cod = count(n);
		       while(n>0){
		       int rem = n%10;
		       sum += (int)( sum+ Math.pow(rem,cod));
		       n=n/10;
		       }
		      
		       //val++;
		       if(x==sum){
		         return true;
		       }
		       else {
		    	   
		    	   return false;
		       }
		       
	    }
	   
	   
	   // Count 
	   public static int count(int n){
	     int count =0;
	     while(n>0){
	       n= n/10;
	       count++;
	   
	     }
	     return count;
	   }
	    
	 }

