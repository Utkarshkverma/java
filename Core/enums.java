public class enums {
    public static void main(String[] args) {
       var s = Status.Failed;
       if(s == Status.Failed)
       System.out.println("U failed "+ s.ordinal());


       else if (s ==  Status.Success)
           System.out.println("You passed  " + s.ordinal());
        
        else if(s == Status.Running)
        System.out.println("Runnning..... "+ s.ordinal() );

        else{
            System.out.println("Pending "+ s.ordinal());
        }

        Status [] ss = Status.values();
        for(Status st :ss) System.out.println(st+ " " + st.ordinal()) ;

    }
}


enum Status{
    Running, Failed, Pending, Success;
}