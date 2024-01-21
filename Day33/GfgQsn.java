package Day33;

import java.util.Scanner;

// https://www.geeksforgeeks.org/problems/geek-onacci-number/0

public class GfgQsn {
    public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++){
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    int N = sc.nextInt();
		    
		    System.out.println(geekonacci(A,B,C,N));
		}
	}
	
	static int geekonacci(int A, int B, int C, int N){
	    if(N == 1) return A;
	    if(N == 2) return B;
	    if(N == 3) return C;
	    
	    return (geekonacci(A,B,C,N-1) + geekonacci(A,B,C,N-2) + geekonacci(A,B,C,N-3));
	}
}
