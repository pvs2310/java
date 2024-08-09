
// constructor example
class medicine
{
    int value;
    String name;

    public  medicine(){
        if(value <= 18)
        {
            System.out.println("under age");
        }
        else
        {
            System.out.println("proceed");
        }
    

    }
        // getters and setters we no need to write the complete code double click the mouse select
        // source action and select getters and setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class practice
{
    public static void main(String a[]){
        medicine medi = new medicine();
        medi.setName("sandy");
        medi.setValue(17);
        System.out.println(medi.getName() + " : " + medi.getValue());
    }
    
    
}
