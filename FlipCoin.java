package Day5;

public class FlipCoin {
	public static void main(String[] args) {
		int isHead = 1;
		double TotalHead = 0;
		double TotalTail = 0;
		double HeadPercentage = 0;
		double TailPercentage = 0;
		int numberOfTimesFlip = 10;
		for (int flip=1; flip<=numberOfTimesFlip; flip++ ) {
		double coinCheck = Math.floor(Math.random() * 10) % 2;
		if ( coinCheck == isHead) 
			System.out.println("Head");
		else
			System.out.println("Tail");
		 TotalHead += coinCheck; 
		}
		 System.out.println("Number of times Head "+TotalHead);
		HeadPercentage =((TotalHead/numberOfTimesFlip)*100);
		System.out.println("Percentage of Head "+HeadPercentage);
		 TotalTail = numberOfTimesFlip - TotalHead;
		 System.out.println("Number of times Tail comes "+TotalTail);
		 TailPercentage =((TotalTail/numberOfTimesFlip)*100);
		 System.out.println("Percentage of Tail "+TailPercentage);
	}
}
