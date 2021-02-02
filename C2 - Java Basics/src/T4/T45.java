/**
 * 
 */
package T4;

/**
 * @author User
 *
 */
public class T45 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=1, b=2, c=3, d=4;
		System.out.println("Valores iniciales:\nA="+a+"\nB="+b+"\nC="+c+"\nD="+d+"\n\n-------------------------------------------------\n");
		b=c;
		c=a;
		a=d;
		d=b;
		System.out.println("Valores finales:\nA="+a+"\nB="+b+"\nC="+c+"\nD="+d);
		

	}

}
