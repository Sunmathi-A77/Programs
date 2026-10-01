class Solution {
    public String reverseOnlyLetters(String s) {
        char[] str = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while(i < j)
        {
            if(!Character.isLetter(str[i]))
            {
                i++;
                continue;
            }
            if(!Character.isLetter(str[j]))
            {
                j--;
                continue;
            }
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        return new String(str);
    }
}