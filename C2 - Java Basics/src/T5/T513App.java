package T5;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Christian Rivas Pottier 
 * 
 * 3 feb. 2021
 *
 */
public class T513App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
		//se que podria hacer esto un char pero me ahorro codigo haciendo q sea un string
		String op=JOptionPane.showInputDialog("Introduce el signo de la operacion");
		int n2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));
		int res=0;
		/*despues de iniciar todas las variables y darles valor compararemos
		 * con un switch lo introducido en la variable op para hacer la
		 * operacion que se ha pedido*/
		switch (op) {
		case "+":
			res=n1+n2;
			break;
		case "-":
			res=n1-n2;
			break;
		case "*":
			res=n1*n2;
			break;
		case "/":
			res=n1/n2;
			break;
		case "^":
			res=(int)Math.pow(n1, n2);
			break;
		case "%":
			res=n1%n2;
			break;

		default:JOptionPane.showMessageDialog(null, "El signo que has introducido no se reconoce");
			break;
		}
		/*Una vez hecha la operacion pertinente mostraremos por pantalla el 
		 * resultado, podria hacer un mensaje personalizado por cada opcion 
		 * pero me ahorro codigo de esta manera*/
		JOptionPane.showMessageDialog(null, "El resultado es "+res);
	}

}
