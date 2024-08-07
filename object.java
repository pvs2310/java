

class calculator
{
    double c;
    public double add(double n1, double n2)
    {
        double n = n1 + n2 ;
        return n;
    }
    public double subb(double n3 , double n4)
    {
        double n = n3 - n4;
        System.out.println(n + "s");
        return n;
    }
    public double multi(double n2, double n3)
    {
        double n = n2 * n3;
        System.out.println(n);
        return n;
    }
    public double div(double n3, double n4)
    {
        double n = n3 / n4;
        return n;
    }
} 

public class object
{
    public static void main(String a[])
    {
        double n1 = 25.5;
        double n2 = 3.5;
        double n3 = 40.5;
        double n4 = 4.5;
        calculator cal = new calculator();

        double result = cal.div(cal.subb(cal.multi(n2, n2),cal.multi(n1, n2)), cal.subb(n3, n4));

        System.out.println(result);
    }
}
    