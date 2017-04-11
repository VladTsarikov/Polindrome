package by.htp.polindrom.logic;
import java.util.Scanner;


public class Main {

	public static void main(String[] args){
		
		int b = 1;
		String reverted = "";
		String[] s1;
		
		System.out.println("Enter count of numbers: ");
		Scanner sc1 = new Scanner(System.in);
		int c = sc1.nextInt();
		int[] arr = new int[c];
	
		for(int i = 0; i<c; i++){
			System.out.println("Enter " + b + " number: ");
			Scanner sc2 = new Scanner(System.in);
			int n = sc2.nextInt();
			arr[i] = n;
			b++;
		}	

		for(int i = 0; i<arr.length;i++){
			String s = Integer.toString(arr[i]);
	        for (int j = s.length() - 1; j >= 0; j--) {
	            reverted += s.charAt(j);
	            
		}
	        reverted = reverted + " ";
		}
		
	        s1 = reverted.split(" ");
	        int[] newArr = new int[c];
	        for(int i=0; i<c;i++){
	            newArr[i] = Integer.parseInt(s1[i]);
	        }
	          
	       for(int i = 0; i<c;i++){
	        	if(arr[i] == newArr[i] && arr[i]>10){
	        		System.out.println(arr[i] + " is polindrome.");
	        	}
	        } 
	}
}


	


