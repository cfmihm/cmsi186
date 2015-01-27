public class ChangeMaker {

	public static void main(String[] args) {
		int cents = 0;

		try {
			cents = Integer.parseInt(args[0]);
			
			if (cents < 0) {
				throw new IllegalArgumentException("negative value");
			}

			int[] answer = getChange(cents);
			
			System.out.println("Quarters: " + answer[0]);
			System.out.println("Dimes: " + answer[1]);
			System.out.println("Nickels: " + answer[2]);
			System.out.println("Pennies: " + answer[3]);
			System.out.println("Java ChangeMaker " + cents);
	
		} catch(ArrayIndexOutOfBoundsException nfe) {
			System.out.println("Usage: java ChangeMaker <amount in cents>");
		} catch (NumberFormatException nfe) {
			System.out.println("Supplied value is not an integer.");
		} catch(IllegalArgumentException e) {
			System.out.println("Cannot make change for negative cents.");
		}
	}
	
	public static int getQuarters(int cents) {
		int quarterValue = 25;
		return (cents / quarterValue);
	}
	
	public static int getDimes(int cents) {
		int dimeValue = 10;	
		return (cents / dimeValue);
	}
	
	public static int getNickels(int cents) {
		int nickelValue = 5;	
		return (cents / nickelValue);
	}
	
	public static int getPennies(int cents) {
		int pennyValue = 1;	
		return (cents / pennyValue);
	}
	
	public static int[] getChange(int cents) {
		int totalQuarters = 0;
		int totalDimes = 0;
		int totalNickels = 0;
		int totalPennies = 0;
		
		int remainingCents = cents;
		
		if (remainingCents >= 25) {
			totalQuarters = getQuarters(cents);
			remainingCents = cents - (totalQuarters * 25);
		}
		
		if (remainingCents >= 10) {
			totalDimes = getDimes(remainingCents);
			remainingCents = remainingCents - (totalDimes * 10);		
		}
			
		if (remainingCents >= 5) {
			totalNickels = getNickels(remainingCents);
			remainingCents = remainingCents - (totalNickels * 5);
		}
			
		if (remainingCents >= 1) {
			totalPennies = getPennies(remainingCents);	
			remainingCents = remainingCents - (totalPennies * 1);
		}
		
		return new int[] {totalQuarters, totalDimes, totalNickels, totalPennies};
	}	

}
