package Day5;

public class LargestNumberAmongThree {
	public static void main(String[] args) {
		int N1=10, N2=50, N3=100;
		if (N1>=N2 && N1>=N3) {
			System.out.println("N1 is Largest");
		}
		else if (N2>=N1 && N2>=N3) {
			System.out.println("N2 is Largest");
		}
		else {
			System.out.println("N3 is Largest");
		}
	}

}
