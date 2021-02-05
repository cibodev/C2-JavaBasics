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
public class T603App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		boolean bn=primo(n);
		if (bn) {
			JOptionPane.showMessageDialog(null, "El numero es primo");
		}else {
			JOptionPane.showMessageDialog(null, "El numero no es primo");
		}
	}
	public static boolean primo (int n) {
		boolean bn=true;
		 if(n<2) {
		        bn = true;
		 }else{
			 for(int i=2; i*i<=n; i++){
				 if(n%i==0){
					 bn = false;
					 break;
				 }
			 }
		 }
		return bn;
	}

}
