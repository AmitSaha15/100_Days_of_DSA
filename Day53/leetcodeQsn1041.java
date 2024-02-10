package Day53;

// https://leetcode.com/problems/robot-bounded-in-circle/

public class leetcodeQsn1041 {
    public boolean isRobotBounded(String instructions) {
        int x=0, y=0; //initial position
        int dirX = 0, dirY=1; //the direction the robot is facing towards(north)(^)

        for(char ch : instructions.toCharArray()){
            if(ch == 'G'){
                x += dirX;
                y += dirY;
            } else if(ch == 'L'){ //if we are rotating 90deg then if we think it as perpendicular
            // line then the dirX & dirY will be swapped but then the direction will be
            // (1,0) == (>) but we need (<) that's why take the negative of dirY
                int temp = dirX;
                dirX = -1*dirY;
                dirY = temp;
            } else{
                int temp = dirX;
                dirX = dirY;
                dirY = -1*temp;
            }
        }

        // return true if the position didn't change or if the position changed then if the
        // direction is also changed
        return (x==0 && y==0) || (dirX!=0 || dirY!=1);
    }
}
