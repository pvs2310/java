class loop
{
    public static void main(String a[])
    {
        for (int i=1; i<=5 ; ++i)
        
        switch(i){
            case 1:
                if(i == 1)
                    System.out.println("print " + i);
                else
                    System.out.println("check " + i);
                continue;
            case 2:
                if(i == 2)
                    System.out.println("print " + i);
                else
                    System.out.println("check " + i);
                continue;

            case 3:
                if (i == 6)
                    System.out.println("print " + i);
                else
                    System.out.println("check " + i);
                continue;
            case 4:
                if(i == 4)
                    System.out.println("print " + i);
                else
                    System.out.println("check " + i);
                continue;
            default:
                System.out.println("bye");


        }
    }
}