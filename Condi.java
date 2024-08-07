class condition
{
    public static void main (String args[])
    {
        
        int x = 5;
        int y = 5;
        int z = 7;
        // x++;
        if(x > y || y > z || x > z)
            System.out.println(z);
        else
            System.out.println("check the statement");
    }
}