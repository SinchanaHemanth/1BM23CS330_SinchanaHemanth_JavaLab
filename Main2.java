class A extends Thread {
	public void run() {
		while(true) {
			System.out.println("BMS College of Engineering");
			try {
				Thread.sleep(10000);
			}
			catch (InterruptedException ie) {
				System.out.println("Thread has been woken up");
			}
		}
	}
}

class B extends Thread {
	public void run() {
		while(true) {
			System.out.println("CSE");
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException ie) {
				System.out.println("Thread has been woken up");
			}
		}
	}
}

class Main2 {
	public static void main(String args[]) {
		A objA = new A();
		B objB = new B();
		objA.start();
		objB.start();
		
	}
}