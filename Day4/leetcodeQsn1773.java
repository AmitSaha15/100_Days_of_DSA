package Day4;

import java.util.List;

// https://leetcode.com/problems/count-items-matching-a-rule/

public class leetcodeQsn1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
    	int ruleItemIndex = 0;
    	switch (ruleKey) {
			case "type":
				ruleItemIndex = 0;
				break;
			case "color":
				ruleItemIndex = 1;
				break;
			case "name":
				ruleItemIndex = 2;
				break;
		}
    	for (List<String> item : items) {
			if(item.get(ruleItemIndex).equals(ruleValue)) {
				count++;
			}
		}
    	return count;
    }
}
