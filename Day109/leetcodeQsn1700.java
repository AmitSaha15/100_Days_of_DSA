package Day109;

// https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/

public class leetcodeQsn1700 {
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        int[] arr = new int[2];
          
        for(int stud : students)
            arr[stud]++;
        
        for(int i=0; i<n; i++) {
            if(arr[sandwiches[i]] == 0) return n - i;
            
            arr[sandwiches[i]]--;
        }
        
        return 0;
    }
}
