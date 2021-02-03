/**
 * 
 */
package T5;

import java.util.Iterator;

import javax.swing.JOptionPane;

/**
 * @author Christian Rivas Pottier 
 * 
 * 3 feb. 2021
 *
 */
public class T512App {

	/**
	 * @param args
	 */
	/*ya que la contraseña no se debe modificar la he creado como una variable
	 * estatica global*/
	static String PASS="P@ssw0rd";
	public static void main(String[] args) {
		String inpass="";
		/*creo un bucle que seguira funcionando solo si i es menor que 0 y si
		 * input password(inpass) es diferente a PASS*/
		for (int i = 0; i < 3 && inpass.compareTo(PASS)!=0; i++) {
			inpass=JOptionPane.showInputDialog("Introduzca la contraseña");
		}
		/*Una vez fuera del bucle vuelvo a comparar las contraseñas y con un 
		 * ifelse enseño un mensaje dependiendo si lo ha escrito bien o no*/
		if (inpass.compareTo(PASS)==0) {
			JOptionPane.showMessageDialog(null, "Enhorabuena!!");
		} else {
			JOptionPane.showMessageDialog(null, "Casi, intenta otra vez");
		}
	}

}
