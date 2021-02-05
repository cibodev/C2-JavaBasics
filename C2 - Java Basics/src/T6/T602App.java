/**
 * 
 */
package T6;

import javax.swing.JOptionPane;

/**
 * @author Christian Rivas Pottier 
 * 
 * 5 feb. 2021
 *
 */
public class T602App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int min=Integer.parseInt(JOptionPane.showInputDialog("Introduce el minimo"));
		int max=Integer.parseInt(JOptionPane.showInputDialog("Introduce el maximo"));
		int rn[]=new int[10];
		for (int i = 0; i < rn.length; i++) {
			rn[i]=(int)(Math.random()*(max - min +1)+min);
			System.out.println(rn[i]);
		}

	}

}
