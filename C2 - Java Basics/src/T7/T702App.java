/**
 * 
 */
package T7;

import javax.swing.JOptionPane;

/**
 * @author Christian Rivas Pottier 
 * 
 * 10 feb. 2021
 *
 */
public class T702App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String carrito4strprear=JOptionPane.showInputDialog("Introduzca el precio de los articulos basicos separados por espacios");
		String[] carrito4strar=carrito4strprear.split(" ");
		double[] carrito4intbase=new double[carrito4strar.length];
		double[] carrito4intiva=new double[carrito4strar.length];
		String carrito4str="";
		double carritot=0;
		for (int i = 0; i < carrito4strar.length; i++) {
			carrito4intbase[i]=Double.parseDouble(carrito4strar[i]);
			carrito4intiva[i]=carrito4intbase[i]*1.04;
			carritot+=carrito4intiva[i];
			carrito4str+="IVA:4%, Precio: "+carrito4intiva[i]+"€ ("+carrito4intbase[i]+"€ sin IVA)\n";
		}
		
		String carrito21strprear=JOptionPane.showInputDialog("Introduzca el precio de el resto de articulos separados por espacios");
		String[] carrito21strar=carrito21strprear.split(" ");
		double[] carrito21intbase=new double[carrito4strar.length];
		double[] carrito21intiva=new double[carrito4strar.length];
		String carrito21str="";
		for (int i = 0; i < carrito21strar.length; i++) {
			carrito21intbase[i]=Double.parseDouble(carrito21strar[i]);
			carrito21intiva[i]=carrito21intbase[i]*1.21;
			carritot+=carrito21intiva[i];
			carrito21str+="IVA:21%, Precio: "+carrito4intiva[i]+"€ ("+carrito4intbase[i]+"€ sin IVA)\n";
		}
		double cpagada=Double.parseDouble(JOptionPane.showInputDialog("Cantidad a pagar: "+carritot+"€\nIntroduzca la cantidad pagada"));
		JOptionPane.showMessageDialog(null, "Ticket:"+carrito4str+carrito21str+"Cantidad pagada: "+cpagada+"€. Tiene que devolver "+(cpagada-carritot)+"€");

	}

}
