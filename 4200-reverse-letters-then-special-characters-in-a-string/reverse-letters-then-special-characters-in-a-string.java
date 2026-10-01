class Solution {
    public String reverseByType(String s) {
        char[] str = s.toCharArray();
        int l = 0;
        int r = s.length() - 1;
        while(l <= r)
        {
            if(!Character.isLetter(str[l]))
            {
                l++;
                continue;
            }
            if(!Character.isLetter(str[r]))
            {
                r--;
                continue;
            }
            char temp = str[l];
            str[l] = str[r];
            str[r] = temp;
            l++;
            r--;
        }
        l = 0;
        r = s.length() - 1;
        while(l <= r)
        {
            if(Character.isLetter(str[l]))
            {
                l++;
                continue;
            }
            if(Character.isLetter(str[r]))
            {
                r--;
                continue;
            }
            char temp = str[l];
            str[l] = str[r];
            str[r] = temp;
            l++;
            r--;
        }
        return new String(str);
    }
}