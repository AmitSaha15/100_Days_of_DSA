package Day43;

import java.util.ArrayList;

// https://www.geeksforgeeks.org/problems/gray-code-1611215248/1

public class GFG_GrayCode {
    public ArrayList<String> graycode(int n)
    {
        //code here
        return generateCode(n);
    }
    
    public ArrayList<String> generateCode(int n){
        if(n == 1){
            ArrayList<String> al = new ArrayList<>();
            al.add("0");
            al.add("1");
            return al;
        }
        
        ArrayList<String> al = generateCode(n-1); // recursive call
        ArrayList<String> res = new ArrayList<>();
        
        // iterating over it to prepend 0 at beginning
        for(int i=0; i<al.size(); i++){
            res.add("0" + al.get(i));
        }
        
        // iterate in reverse order to prepend 1 at beginning
        for(int i=al.size()-1; i>=0; i--){
            res.add("1" + al.get(i));
        }
        return res;
    }
}
