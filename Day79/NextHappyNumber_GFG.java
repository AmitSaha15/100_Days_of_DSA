package Day79;

// https://www.geeksforgeeks.org/problems/next-happy-number4538/1

public class NextHappyNumber_GFG {
    static int nextHappy(int N){
        // code here
        int next = N+1;
        int ans = next;
        
        while(true){
            if(isHappy(next)){
                return next;
            }
            next++;
            ans=next;
        }
    }
    
    static boolean isHappy(int n){
        if(n == 1 || n == 7){
            return true;
        }
        if(n == 2 || n == 3 || n == 4 || n == 5 || n == 6 || n == 8 || n == 9){
            return false;
        }
        
        int sum = 0;
        while(n>0){
            int currDig = n%10;
            sum += (currDig*currDig);
            n /= 10;
        }
        
        return isHappy(sum);
    }
}
