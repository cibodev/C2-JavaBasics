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
public class T511 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String dia= JOptionPane.showInputDialog("Introduce un dia de la semana");
		/*para saber si el dia introducido es laborable o no toca hacer un switch case 
		 * con todos los dias de la semana. Tambien he añadido un tolowercase para que 
		 * no haya problemas si se escribe en mayusculas*/
		switch (dia.toLowerCase()) {
		case "lunes":
			JOptionPane.showMessageDialog(null, dia+" es un dia laborable, a currar");
			break;
		case "martes":
			JOptionPane.showMessageDialog(null, dia+" es un dia laborable, a currar");
			break;
		case "miercoles":
			JOptionPane.showMessageDialog(null, dia+" es un dia laborable, a currar");
			break;
		case "jueves":
			JOptionPane.showMessageDialog(null, dia+" es un dia laborable, a currar");
			break;
		case "viernes":
			JOptionPane.showMessageDialog(null, dia+" es un dia laborable, pero es viernes oleeeeeeee");
			break;
		case "sabado":
			JOptionPane.showMessageDialog(null, dia+" no es un dia laborable, a dormir hasta las 3 de la tarde");
			break;
		case "domingo":
			JOptionPane.showMessageDialog(null, dia+" no es un dia laborable, a dormir hasta las 3 de la tarde");
			break;

		default: JOptionPane.showMessageDialog(null, "Eso no es un dia");
			break;
		}

	}

}
