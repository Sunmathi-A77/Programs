class Solution {
    public int largestRectangleArea(int[] heights) {
        
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int maxArea = 0;
        int cur, height, width, area;

        for(int i = 0; i <= n; i++)
        {
            if(i == n)
            {
                cur = 0;
            }
            else
            {
                cur = heights[i];
            }
            while(!st.isEmpty() && heights[st.peek()] > cur)
            {
                height = heights[st.pop()];
                if(st.isEmpty())
                {
                    width = i;
                }
                else
                {
                    width = i - st.peek() - 1;
                }
                area = height * width;
                maxArea = Math.max(maxArea, area);
            }
            st.push(i);
        }
        return maxArea;
    }
}