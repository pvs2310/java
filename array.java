class obje{
    
    public int add(int n1 , int n2)
    {
        int num = n1 + n2;
        return num;
    }
}

class array
{
    public static void main(String a[])
    {
       int n1 = 4;
       int n2 = 4;
       int nums[] = new int[5];
       nums[0] = 0;
       nums[1] = 1;
       nums[2] = 2;
       nums[3] = 3;

       //nums[2] = 4;
        obje cal = new obje();
        int result = cal.add(n1,n2);
        System.out.println(result);
        for(int i =0; i<5; i++ )
        {
            for(int j=1; j<3;   j++)
            {
                System.out.println(nums[i]);
            }
        }
    }
}