package hw9Q3Abstraction;
    //Here i did interface university inherit more then one by extends keyword
public interface University extends College,Hospital {
	//one extends keywords are used the inheritance in interface
	/*more than one interface inherit other interfaces,not possible 
	to extends keyword for a regular class or abstract class*/
	//more than one inheritance is possible
	public void classSize();
	public void playGround();
    public void teacher();

    public default void gymnasium(){
    }
    public static void library(){
    }
}