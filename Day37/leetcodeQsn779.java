package Day37;

// https://leetcode.com/problems/k-th-symbol-in-grammar/

public class leetcodeQsn779 {
    public int kthGrammar(int n, int k) {
        if(n==1 && k==1) return 0;

        int left = 1;
        int right = (int)Math.pow(2,n-1);
        int mid = (left+right) / 2;

        if(k<=mid){ // if k is less than mid then we can simply check k for n-1 row as the string before mid in nth row is the copy of the n-1 th row 
            return kthGrammar(n-1,k);
        }else{ // otherwise we obsereved that the string after the mid is complement of the n-1 th string
            return kthGrammar(n-1,k-mid) == 1?0:1;
        }
    }
}
