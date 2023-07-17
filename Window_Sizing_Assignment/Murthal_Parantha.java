package Window_Sizing_Assignment;
import java.util.*;
public class Murthal_Parantha {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int nop=sc.nextInt();
		int noc=sc.nextInt();
		int [] rank=new int [noc];
		for (int i = 0; i < rank.length; i++) {
			rank[i]=sc.nextInt();
		}
		Arrays.sort(rank);
		System.out.println(MinTime(rank,nop));
		
	}
 public static int MinTime(int [] rank,int nop) {
	 int lo=0;
	 int hi= (rank[rank.length-1]*(nop*(nop+1)))/2;
	 int ans=0;
	 while(lo<=hi) {
		 int mid= (lo+hi)/2;
		 if (isitpossible(rank,mid,nop)) {
			ans=mid;
			hi=mid-1;
		} else {
			lo=mid+1;
		}
	 }
	 return ans;
 }
 public static boolean isitpossible(int[] rank, int mid, int nop) {
	 // TODO Auto-generated method stub
	int cook=1;
	int paratha=1; // kon sa paratha banayega
	int totaltime=0;
	int totalparatha=0;
	int i=0;
	while (i<rank.length) {
		if (totaltime+paratha*rank[i]<=mid) {
			totaltime=totaltime+paratha*rank[i];
			paratha++;
			totalparatha++;
		} else {
			i++;
			paratha=1;
			totaltime=0;
		}
		if (totalparatha==nop) {
			return true;
		}
	}
	return false;
   }
}
