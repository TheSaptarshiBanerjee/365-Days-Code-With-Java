import java.lang.*;
import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();
        if(s.length() != t.length())
        {
            return false;
        }

        if(s.length() == t.length())
        {
            char[] s1 = s.toCharArray();
            char[] s2 = t.toCharArray();

            Arrays.sort(s1);
            Arrays.sort(s2);

            for(int i = 0; i < s1.length; i++)
            {
                if(s1[i] != s2[i])
                {
                    return false;
                }
               
            }
            return true;

        }
        return true;
    }
}
