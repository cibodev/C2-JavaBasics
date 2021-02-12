/**
 * 
 */
package T7;

import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.JOptionPane;

/**
 * @author Christian Rivas Pottier 
 * 
 * 12 feb. 2021
 *
 */
public class T703 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hashtable<String, Double> bbdd = new Hashtable<String, Double>();
		bbdd.put("Leche", 4.99);
		bbdd.put("Cereales", 2.49);
		bbdd.put("Garbanzos", 3.99);
		bbdd.put("Mantequilla", 3.98);
		bbdd.put("Hielo", 0.99);
		bbdd.put("Arroz", 2.99);
		bbdd.put("Tableta chocolate", 4.99);
		bbdd.put("Galletas", 5.79);
		bbdd.put("Cola", 3.99);
		
		boolean sel =false;
		do {
			int menu=menu();
			switch (menu) {
			case 0:
				bbdd=introducirDatos(bbdd);
				break;
			case 1:
				mostrarDatos(bbdd);
				break;
			case 2:
				String[] op={"Si","No"};
				int salir=JOptionPane.showOptionDialog(null, "Esta seguro que quiere salir?", null, 0, JOptionPane.QUESTION_MESSAGE, null, op, null);
				if (salir==0) {
					sel=true;
				}
				break;
			default: JOptionPane.showMessageDialog(null, "No has introducido una opcion correcta");
				break;
			}
			
		}while(!sel);
	}
	
	public static int menu(){
		String[] op={"Introducir productos","Ver productos","Salir"};
		int menu=JOptionPane.showOptionDialog(null, "Que quiere hacer", null, 0, JOptionPane.QUESTION_MESSAGE, null, op, null);
		return menu;
	}
	
	public static Hashtable<String, Double> introducirDatos(Hashtable<String, Double> bbdd){
		boolean sel=false;
		String[] op={"Si","No"};
		do {
		String bbddkey=JOptionPane.showInputDialog("Introduzca el producto");
		double bbddprecio=Double.parseDouble(JOptionPane.showInputDialog("Introduzca su precio"));
		bbdd.put(bbddkey, bbddprecio);
		int menu=JOptionPane.showOptionDialog(null, "Quiere seguir?", null, 0, JOptionPane.QUESTION_MESSAGE, null, op, null);
		if (menu==1) {
			sel=true;
		}
		}while(!sel);
		return bbdd;
	}
	
	public static void mostrarDatos(Hashtable<String,Double> bbdd) {
		Enumeration<Double> enu = bbdd.elements();
		Enumeration<String> key = bbdd.keys();
		String strbbdd="";
		while(enu.hasMoreElements()) {
			strbbdd+= key.nextElement()+": "+enu.nextElement()+"\n";
		}
		JOptionPane.showMessageDialog(null, "Estos son los productos y sus precios: \n"+strbbdd);
	}

}
