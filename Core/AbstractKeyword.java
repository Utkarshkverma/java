public class AbstractKeyword
{
  public static void main(String[] args) {
    //car c = new car(); // ! We can't create  an instance of the abstract class directly
    wagonR obj = new updatedwagonR();
    obj.drive();
    obj.playMusic();
    obj.stop();
    obj.fly();
    
  }
}


abstract class car{
    public abstract void drive();
    public abstract void playMusic();

    public void stop()
    {
        System.out.println("Stopping ................");
    }
}


abstract class wagonR extends  car {

    @Override
    public void drive() {
        System.out.println("Driving.................");
    }
     public abstract void fly();
    
}

class updatedwagonR extends wagonR
{

    @Override
    public void playMusic() {
        System.out.println( "Playing music.........." );
    }

    @Override
    public void fly() {
       
        System.out.println( "Flying..............." );
        
    }
    
}
