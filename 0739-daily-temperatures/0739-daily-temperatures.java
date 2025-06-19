class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int v=0;
        // int a[]=new int[n];
        // for(int i=0;i<n-1;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(temperatures[i]<temperatures[j])
        //         {
        //            a[i]=j-i;
        //            break;
        //         }

        //     }
           
        // }
        //  return a;

         int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>(); 

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
 return answer;

        
        
    }
}