package Day5;

public class SwapTwoNumber {
	public static void main(String[] args) {
		int FirstNumber = 20 ;
		int SecondNumber = 5 ;
		System.out.println("Before swaping First Number "+FirstNumber);
		System.out.println("Before swaping Second Number "+SecondNumber);
		FirstNumber = FirstNumber + SecondNumber ;
		SecondNumber = FirstNumber - SecondNumber ;
		FirstNumber = FirstNumber - SecondNumber ;
		System.out.println("After swaping First Number "+FirstNumber);
		System.out.println("After swaping Second Number "+SecondNumber);
	}

}
