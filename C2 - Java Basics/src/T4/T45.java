/**
 * 
 */
package T4;

/**
 * @author Christian Rivas
 *
 */
public class T45 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=1, b=2, c=3, d=4;
		System.out.println("Valores iniciales:\nA="+a+"\nB="+b+"\nC="+c+"\nD="+d+"\n\n-------------------------------------------------");
		b=c;
		System.out.println("\nA="+a+"\nB="+b+"\nC="+c+"\nD="+d);
		c=a;
		System.out.println("\nA="+a+"\nB="+b+"\nC="+c+"\nD="+d);
		a=d;
		System.out.println("\nA="+a+"\nB="+b+"\nC="+c+"\nD="+d);
		d=b;
		System.out.println("\nA="+a+"\nB="+b+"\nC="+c+"\nD="+d);
		
	}

}
