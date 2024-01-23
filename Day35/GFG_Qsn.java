package Day35;

import java.util.ArrayList;

// https://www.geeksforgeeks.org/problems/n-digit-numbers-with-digits-in-increasing-order5903/1

public class GFG_Qsn {
    static ArrayList<Integer> increasingNumbers(int N){
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        if(N==1){
            traverse(0,N,list,sb);
        } else{
            traverse(1,N,list,sb);
        }
        
        return list;
    }
    
    static void traverse(int start, int N, ArrayList<Integer> list, StringBuilder sb){
        
        if(sb.length() >= N){
            list.add(Integer.parseInt(sb.toString()));
            return;
        }
        for(int i=start; i<=9; i++){
            sb.append(i);
            traverse(i+1,N,list,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        return ;
    }
}
