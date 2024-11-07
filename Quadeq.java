import java.util.Scanner;
class Quadeq
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter coefficient of a:");
		double a = sc.nextDouble();
		System.out.println("Enter coefficient of b:");
		double b = sc.nextDouble();
		System.out.println("Enter coefficient of c:");
		double c = sc.nextDouble();
		double disc = b*b-4*a*c;
		if(disc>0)
		{
			double root1 = (-b+Math.sqrt(disc))/(2*a);
			double root2 = (-b-Math.sqrt(disc))/(2*a);
			System.out.println("Equation has two real roots: "+root1+" "+root2);
		}
		else if(disc==0)
		{
			double root = -b/(2*a);
			System.out.println("Equation has one real solution: "+root);
		}
		else
		{
			System.out.println("Equation has no real roots");
		}
	}
}
