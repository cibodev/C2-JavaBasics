/**
 * 
 */
package T6;

import javax.swing.JOptionPane;

/**
 * @author Christian Rivas Pottier 
 * 
 * 8 feb. 2021
 *
 */
public class T608App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] aryn=arrayNumberRellenar();
		arrayNumberMostrar(aryn);
		
	}
	public static String[] arrayNumberRellenar() {
		String[] aryn;
		do {
			String strn=JOptionPane.showInputDialog("Introduzca 10 numeros separados por espacios");
			aryn=strn.split(" ");
			}while(aryn.length!=10);
		return aryn;
		/*en este metodo lo que he hecho es decirle al usuario que me diga los 10 numeros en un solo mensaje que
		 * creo que es mas ameno que que te salgan 10 ventanitas pidiendo numeros. Lo que pierdo es que no compruebo
		 * si los numeros son un numero*/
	}
	public static void arrayNumberMostrar(String[] aryn){
		String strn="";
		for (int i = 0; i < aryn.length; i++) {
			strn=strn+aryn[i]+" ";
		}
		JOptionPane.showMessageDialog(null, "Los numeros introducidos son los siguientes: \n"+strn);
		/*con este metodo lo que hago es transformar el array en un string de nuevo para imprimirlo en la pantalla
		 *  que en realidad es algo tonto pero si hubiese tenido que hacer algo con los numeros del array 
		 *  los tendria disponibles*/
	}

}
