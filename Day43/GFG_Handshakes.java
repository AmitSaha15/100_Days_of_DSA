package Day43;

// https://www.geeksforgeeks.org/problems/handshakes1303/1

public class GFG_Handshakes {
    static int count(int N) 
    { 
        // code here
        return calculateCount(N/2);
    }
    
    static int calculateCount(int n){
        if(n == 0 || n == 1) return 1;
        
        int c = 0;
        for(int i=0; i<n; i++){
            c += calculateCount(i) * calculateCount(n-i-1);
        }
        
        return c;
    }
}
