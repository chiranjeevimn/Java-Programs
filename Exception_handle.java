//write a java program to demonstrate exception handling.
import java.util.Scanner;

class DemoExce {
    double a[][] = new double[3][3]; 
    Scanner sc = new Scanner(System.in);
    //public DemoExce(){}

    public void acceptValues() {
        System.out.println("Enter 3*3 values:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextDouble(); 
            }
    }

    public void sumOfAllValues() {
        System.out.println("Sum of All elements of 2D array:");
        double sum = 0;
	try{
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 3; j++) {
                sum = sum + a[i][j];
            }
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		e.printStackTrace();
	}
	finally{
        System.out.println("Sum = " + sum); 
	}
    } 
	
}

class Exception_handle {
    public static void main(String a[]) {
        DemoExce d1 = new DemoExce();
        d1.acceptValues();
        d1.sumOfAllValues();
    }
}
