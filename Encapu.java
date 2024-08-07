class medicine
{
   private int value;
    String name;

    // constructor --  it has the same name as a class name, and it never returns any thing
    public medicine()
    {
        
    }

    public int getValue() {  // you get these by double click and select the getters and setters, automatically it will create the code
        return value;
    }
    public void setValue(int value) {
        this.value = value; 
        // when you have same name for both intance varibale and the local variable the we will the get
        // the value as zero. so to avoid that/to metion it was a diff variable the java use this object to diff it
        
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
//     public int getvalue() // we can use any variable name instead of getvaluse and setvalue, but the only reason we use that was to know to other what we r geting and setting
//     {
//         return value;
//     }
//     public void setvalue(int v)
//     {
//         value = v;
//     }
//     public String getname()
//     {
//         return name;
//     }
//     public void setname(String n)
//     {
//         name = n;
//     }
 }

class Encapu
{
    public static void main(String a[])
    {
        medicine med = new medicine();
        med.setName("sandy");
        med.setValue(100);
        System.out.println(med.getName() + " :" + med.getValue());
    } 
}