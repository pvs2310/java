class jaggedarray
{
    public static void main(String a[])
    {
        int jdar[][] = new int[3][];
        jdar[0] = new int[3];
        jdar[1] = new int[4];
        jdar[2] = new int[5];
        
        for(int i=0; i<jdar.length; i++)
        {
            for(int j=0; j<jdar[i].length; j++)
            {
                jdar[i][j] = (int)(Math.random() *10);
            }
        }
        for(int n[]: jdar)
        {
            for(int m: n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}