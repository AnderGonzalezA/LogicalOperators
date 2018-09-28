import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = 0;
	    System.out.println("Please, tell me your 'Programming' mark.");
		number=sc.nextInt();
	    while (number<0 || number>10 ) {
		    if (number>10) {
		    	System.out.println("Don't joke me, you are not so intelligent. Tell the truth.");
				number=sc.nextInt();
		    }
		    else {
		    	System.out.println("I'm sure you did it better.Tell the truth.");
				number=sc.nextInt();
		    }
	    }
		if (number!=10 && number>5) {
			System.out.println("You passed it but you don't have a 10.");
		}
		else {
			if (number>5) {
				System.out.println("Congrats, you did what you had to do.");
			}
			else {
				System.out.println("You are a loser.");
			}
		}
	    sc.close();
	}

}
