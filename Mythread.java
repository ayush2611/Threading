package Threading;

public class Mythread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {
		Mythread t1 = new Mythread();
		t1.start();
	}
}
