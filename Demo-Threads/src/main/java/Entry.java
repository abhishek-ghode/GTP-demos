
public class Entry {

	public static void main(String[] args) {

		String currentThread = Thread.currentThread().getName();

		System.out.println(currentThread);

		Thread t1;

		Runnable target = new MyJob();

		// t1 = new MyThread();
		t1 = new Thread(target, "T1");

		t1.start();

		Thread t2 = new MyAnotherThread();
		t2.start();

	}

}

class MyAnotherThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();

		int count = 0;
		try {
			while (true) {
				Thread.sleep(900);
				System.out.println((count += 2) + " in " + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

class MyJob implements Runnable {
	@Override
	public void run() /* throws InterruptedException */ {
		// TODO Auto-generated method stub
		// super.run();

		int count = 1;
		while (true) {
			try {
				Thread.sleep(700);
				System.out.println((count += 2) + " in " + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
