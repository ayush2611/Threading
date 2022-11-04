package Threading;
class UserDefinedThread extends Thread
{
	public void run() {
		System.out.println("User defined thread is running");
	}
}

public class ThreadOperations {
	public static void main(String[] args) {
		System.out.println("Programm started..");
		int x=43+54;
		Thread t= Thread.currentThread();
		String ThreadName=t.getName();
		System.out.println(x);
		System.out.println(ThreadName);
		
		try {
			t.sleep(2000);
		} catch (Exception e) {
			
		}
		t.setName("AyushMain");
		System.out.println("Thread name updated to "+t.getName());
		System.out.println("Thread id is :- "+t.getId());
		
		
		

		System.out.println("Program ended..");
		UserDefinedThread us = new UserDefinedThread();
		us.start();
	}

}
