package Day5;

public class Swapstring {
	public static void main(String args[]) {  
        String a = "Imran";  
        String b = "Shaikh";  
        System.out.println("Before swap: " + a + " " + b);  
        a = a + b;  
        b = a.substring(0, a.length() - b.length());  
        a = a.substring(b.length());  
        System.out.println("After : " + a + " " + b);  
    }  

}
