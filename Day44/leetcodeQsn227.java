package Day44;

// https://leetcode.com/problems/basic-calculator-ii/

public class leetcodeQsn227 {
    public int calculate(String s) {
        if(s == null || s.isEmpty()) return 0;

        char[] arr = s.toCharArray();
        char operation = '+';
        int currNum = 0, lastNum = 0, sum = 0;

        for(int i=0; i<arr.length; i++){
            if(Character.isDigit(arr[i])){
                currNum = (currNum * 10) + (arr[i] - '0');
            }

            if(!Character.isDigit(arr[i]) && arr[i] != ' ' || i == arr.length-1){ 
                if(operation == '+'){
                    sum += lastNum;
                    lastNum = currNum;
                } else if (operation == '-'){
                    sum += lastNum;
                    lastNum = -currNum;
                } else if(operation == '*'){
                    lastNum = lastNum*currNum;
                } else if(operation == '/'){
                    lastNum = lastNum/currNum;
                }
                operation = arr[i];
                currNum = 0;
            }
        }

        sum += lastNum;
        return sum;
    }
}
