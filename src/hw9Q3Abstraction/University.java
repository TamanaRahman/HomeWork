package hw9Q3Abstraction;

public interface University extends College,Hospital { 
	/*here interface class University and used 
extends keywords more than one like college , hospital */
	public void classSize();
	public void playGround();
    public void teacher();

    public default void gymnasium(){
    }
    public static void library(){
    }
}