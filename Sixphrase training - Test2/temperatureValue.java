import java.util.*;

public class temperatureValue{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temperature value: ");
		int temp = sc.nextInt();

		if(temp<=0) System.out.println("Temperature category: freezing");
		else if(temp>=1 && temp<=15) System.out.println("Temperature category: cold");
		else if(temp>=16 && temp<=30) System.out.println("Temperature category: warm");
		else System.out.println("Temparature category: Hot");
	}
}