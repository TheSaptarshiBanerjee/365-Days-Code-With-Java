class Solution {
    public boolean isPalindrome(String s) {
        // String rev = "";
        // boolean ans = false;

        // for(int i = s.length() - 1; i>=0 ; i--)
        // {
        //     rev += s.charAt(i);
        // }

        // if(s.equals(rev))
        // {
        //     return true;
        // }
        // return ans;
       StringBuilder cleanStr = new StringBuilder();
        
        // Remove non-alphanumeric characters and convert to lowercase
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleanStr.append(Character.toLowerCase(c));
            }
        }

        // Check if the cleaned string is a palindrome
        StringBuilder reversedStr = new StringBuilder(cleanStr).reverse();
        return cleanStr.toString().equals(reversedStr.toString());
    }
}
