
public class Hellorun implements Runnable {

	public void run()
	{
		System.out.println("this is runnable thread");
	}
 
}
 class example {
	public static void main(String[] args) {
	Thread h = new Thread();
	h.start();
	//Thread obj2 =new Thread(hello1);
	//obj2.start();
	System.out.println("this is runnable thread 1");

		}
}