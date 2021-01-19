package pack3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UtilImp implements Util{
	
	
	static int x=1;

	public int add(int a, int b) {
		
		return a+b;
	}

	public int mult(int a, int b) {
		
		return a+b;
	}

	public int max(int a, int b) {
		if (a>b) return a;
		else return b;
	}

	public int min(int a, int b) {
		if (a<b) return a;
		else return b;
	}

	public float divFloat(float a, float b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	public double divDouble(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	public int divInt(int a, int b) {
		// TODO Auto-generated method stub
		if (b==0)
			throw new IllegalArgumentException(" / By Zero");
		
		return a/b;
	}
	
	
	public String afficher() {
		// TODO Auto-generated method stub
		return "Bonjour";
	}

	public boolean paire (int a) {

		if (a%2 ==0) return true;
		else return false;
	}
	
	
	
	public int Sum(int[] tab) {
	 int sum =0;
	 
	for (int i = 0; i<tab.length; i++)
	{
		sum +=tab[i];
	}
	return sum;
  }
	
	public String binaire(int a) {
		
		return Integer.toBinaryString(a);
	}
	

	
	
	public int PGCD(int a, int b) {
		while (a != b) {         
			if (a < b)            
				b = b - a;        
			else            
				a = a - b;      
			}      return a;
	}

	
	public int Fact(int a) {
		if (a<0)
			{System.out.println(" negative number for factoriel");
		return 0;}
		else if (a==0) return(1);		
	    else return(a*Fact(a-1));	}
	
	
	public int increment() {
		return x++;
	}
	
	//// added in BR1
	public int decrement() {
		return x--;
	}
	
	
	public void msg(String m) {
		System.out.println("le message est : " + m);
	}
	
	
	public void zero () {
		System.out.println("the output is zero = " + 0);
	}
		
}

