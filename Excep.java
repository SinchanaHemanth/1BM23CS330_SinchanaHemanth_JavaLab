import java.util.Scanner;
class WrongAge extends Exception {
	String message;
	WrongAge (String message) {
		this.message = message;
	}
	public String toString() {
		return "Error: " + message;
	}
}

class Father {
	int fage;
	Father(int x) throws WrongAge {
		if(x<0) {
			throw new WrongAge("Father's age cannot be negative");
		}
		fage = x;
	}
}

class Son extends Father {
	int sage;
	Son(int x,int y) throws WrongAge {
		super(x);
		if(y<0) {
			throw new WrongAge("Son's age cannot be negative");
		}
		if(y>=x) {
			throw new WrongAge("Son's age cannot be greater than Father's age");
		}
		sage = y;
	}
}

class Excep {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		try {
			int x,y;
			System.out.println("Enter father's age");
			x=sc.nextInt();
			System.out.println("Enter son's age");
			y=sc.nextInt();
			Son son = new Son(x,y);
			System.out.println("Father's age: "+son.fage);
			System.out.println("Son's age: "+son.sage);
		}
		catch (WrongAge wa) {
			System.out.println(wa);
		}
	}
}