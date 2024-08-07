class Ternary
{
    public static void main (String args[])
    {
        int x = 7;
        int y = 3;
        int result = 0;
        x++;
        result = x%2==3 ? 10 : 20;
        System.out.println(result);
    }
}