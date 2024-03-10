public class classes_and_objects
{
    public static void main(String[] args) {
        var cal  = new Calci();
        System.out.println(cal.add(10, 12));
    }
}

class Calci {
    public int add(int a, int b){
        return a + b;
    }  
}