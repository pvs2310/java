class fMDarray
{
    public static void main(String a[])
    {
        int nums[][] = new int[2][4]; // for double dimen array we have to use [] [] braces


        for(int i=0; i<2;i++)
        {
             for(int j=0;j<4;j++)
            {
                nums[i][j] = (int)(Math.random() *10);
            }
        }
        for(int i=0; i<2;i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        // enhance for loop
        for(int n[] : nums) //Here n is a single dimen array was taken from nums 
        {
            for(int m: n) // to get the first value we use here m is taken the value from array of n
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }   
}
    