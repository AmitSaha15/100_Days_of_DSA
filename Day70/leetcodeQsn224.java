package Day70;

// https://leetcode.com/problems/basic-calculator/

public class leetcodeQsn224 {
    int index;
    public int calculate(String s) {
        index = 0;
        char[] arr = s.toCharArray();
        return calculator(arr);
    }

    public int calculator(char[] arr){
        int sum = 0, currNum = 0;
        int sign = 1;

        while(index<arr.length){
            char ch = arr[index++];
            if(ch >= '0' && ch <= '9'){
                currNum = currNum*10 + (ch-'0');
            } else if(ch == '('){  //when '(' found divide in sub problems and call recursive function
                currNum = calculator(arr);
            } else if(ch == ')'){
                return sum + (sign*currNum);
            }else if(ch == '-' || ch == '+'){
                sum += sign*currNum;
                currNum = 0;
                sign = ch == '-' ? -1 : 1;
            }
        }
        return sum + (sign*currNum); //for the last number 
    }
}
