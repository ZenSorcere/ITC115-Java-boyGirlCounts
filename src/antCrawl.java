import java.util.*;
public class antCrawl {

	public static void main(String[] args) {
		int steps = 0;
		int falls = 0;
		Random chance = new Random();
		while (steps < 6) {
			boolean climb = chance.nextBoolean();
			if (climb) {
				steps++;
				System.out.println("Now at step # " + steps);
			} else {
				falls++;
				steps = 0;
			}
		}
		
		System.out.print("number of falls: " + falls);
		
	
			
			
		

	}

}
