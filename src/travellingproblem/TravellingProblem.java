package travellingproblem;
import java.util.*;

public class TravellingProblem {
	public static void getCurrency(int amount, int[] notes, int n) {
		int[] cnt = new int[n];
		for(int i =0;i<n;i++) {
			if(amount>=notes[i]) {
				cnt[i] = amount/notes[i];
				amount=amount%notes[i];
			}
		}
		for(int i=0;i<n;i++) {
			if(cnt[i]!=0) {
				System.out.println(notes[i]+":"+cnt[i]);
			}
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size if currency denominations");
		int n = sc.nextInt();
		int[] notes=new int[n];System.out.println("Enter the currrency denominations value");
		for(int i =0;i<n;i++) {
			notes[i]=sc.nextInt();
		}
		Arrays.sort(notes);
		ReverseSort.reverse(notes);
		System.out.println("Enter the amount you want to pay");
		int amount=sc.nextInt();
		sc.close();
		getCurrency(amount,notes,n);
	}
}
