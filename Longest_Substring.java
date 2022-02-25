class Solution {
  public int lengthOfLongestSubstring(String s) {
        int maxl=0;
        int size =s.length();
        for(int i=size;i>0;i--) //size of substring
        {
            int arr[]=new int[i];
            for(int j=0;j<size-i+1;j++)
            {
                int p=0;
                for(int k=j;k<i+j;k++)
                {
                    arr[p]=s.charAt(k);
                    p++;
                }
                if(isDistinct(arr)){
                    return i;
                }
            }
        }
        return maxl;
    }
   
     public boolean isDistinct(int arr[])
    {
        int size = arr.length;
        int data[]=new int[257];
        Arrays.fill(data, 0);
        for(int i=0;i<size;i++)
        {
            if(data[(int)arr[i]]==1)
            {
                return false;
            }
            else
            {
                data[(int)arr[i]]++;
            }
        }
         return  true;
    }
}
