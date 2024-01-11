package Day23;

// https://leetcode.com/problems/defanging-an-ip-address/

public class leetcodeQsn1108 {
    public String defangIPaddr(String address) {
        // String ans = "";
        // for(int i=0; i<address.length(); i++){
        //     if(address.charAt(i) == '.') ans+="[.]";
        //     else ans+=address.charAt(i);
        // }
        // return ans;

        return address.replace(".", "[.]");
    }
}
