package hw10Q3Abstraction;
    //Here interface university inherit more then one by extends keyword
public interface University extends College,Hospital {
	public void classSize();
	public void playGround();
    public void teacher();

    public default void gymnasium(){
    }
    public static void library(){
    }
}
/*In interface one extends keyword used for the inheritance. yes interface inherit more then one interfaces,or a regular class or abstract class cannot extends or implements in interface.
In interfcae more then one inheritance is possible */

 