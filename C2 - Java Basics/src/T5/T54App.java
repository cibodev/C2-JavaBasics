/**
 * 
 */
package T5;

import javax.swing.JOptionPane;

/**
 * @author Christian Rivas Pottier 
 * 
 * 3 feb. 2021
 *
 */
public class T54App {

	/**
	 * @param args
	 */
	static double PI =3.141592653589793238462;//Creo una constante global que sera pi ya que el numero pi no puede variar
	public static void main(String[] args) {
		//hacemos el parse double para que coja el string como double
		double r = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el radio en mm"));
		//multiplicamos PI por el radio al cuadrado y nos dara el area. Podria haber buscado como hacer elevaciones en java pero multiplicar r por si misma tambien funciona
		JOptionPane.showMessageDialog(null, "El area del circulo cuyo radio es "+r+" milimetros es: "+(PI*(r*r))+" milimetros cuadrados");
	}

}
