import java.util.Scanner;

public class QuarterBackStats {
	public static void main(String[]args){
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter number of touchdowns collected: ");
		double TD = scan.nextDouble();
		
		System.out.print("Enter number of yards completed: ");
		double Yards = scan.nextDouble();
		
		System.out.print("Enter number of interceptions: ");
		double INT = scan.nextDouble();
		
		System.out.print("Enter number of completions: ");
		double comp = scan.nextDouble();
		
		System.out.print("Enter number of attempted passes: ");
		double ATT = scan.nextDouble();

		double c = ((comp/ATT )-0.3) * 5; 
		double y = ((Yards/ATT)-3)* 0.25;
		double t = ((TD/ATT)* 20 );
		double ia = (2.375 - ((INT/ATT)*25));
		
		double QB_Rating = ((c + y + t + ia)/6)*100;
		
		System.out.printf("This is the rating of this player: %.1f ", QB_Rating);
	}
}