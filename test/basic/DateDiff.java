package test.basic;
import java.util.*;

public class DateDiff {
	public static void main(String[] args) {
		int d1,d2,m1,m2,y1,y2,i;
		Scanner sc = new Scanner(System.in);
		d1=sc.nextInt();
		m1=sc.nextInt();
		y1=sc.nextInt();
		d2=sc.nextInt();
		m2=sc.nextInt();
		y2=sc.nextInt();
		
		int days=0;
		int arr[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		days=arr[m1-1]-d1+d2;
		for(i=m1+1;i<=m2-1;i++) {
			days = days+ arr[i-1];
			
		}
		System.out.println(days);
	}
	
	
}
