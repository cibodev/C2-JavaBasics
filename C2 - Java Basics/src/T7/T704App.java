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
public class T704App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hashtable<String, Double> bbdd4 = new Hashtable<String, Double>();
		Hashtable<String, Double> bbdd21 = new Hashtable<String, Double>();
		bbdd4.put("leche", 4.99);
		bbdd4.put("lereales", 2.49);
		bbdd4.put("garbanzos", 3.99);
		bbdd4.put("mantequilla", 3.98);
		bbdd21.put("hielo", 0.99);
		bbdd4.put("arroz", 2.99);
		bbdd21.put("chocolate", 4.99);
		bbdd4.put("galletas", 5.79);
		bbdd21.put("cola", 3.99);
		
		boolean sel=false;
		String[] op={"Controlar stock","Hacer un ticket", "Salir"};
		do {
			int programa=JOptionPane.showOptionDialog(null, "Que quiere hacer", null, 0, JOptionPane.QUESTION_MESSAGE, null, op, null);
			switch (programa) {
			case 0:
				Stock(bbdd4, bbdd21);
				break;
			case 1:
				Ventas(bbdd4, bbdd21);
				break;
			case 2:
				sel=true;
				break;

			default:JOptionPane.showMessageDialog(null, "No ha introducido una opcion correcta");
				break;
			}
		}while(!sel);
	}
	
	
//VENTAS-----------------------------------------------------------------------------------------------------------------------
	public static void Ventas(Hashtable<String, Double> bbdd4, Hashtable<String, Double> bbdd21) {
		Enumeration<Double> enu4 = bbdd4.elements();
		Enumeration<String> key4 = bbdd4.keys();
		Enumeration<Double> enu21 = bbdd21.elements();
		Enumeration<String> key21 = bbdd21.keys();
		String productos4="";
		String productos21="";
		String carrito4strprear="";
		String carrito21strprear="";
		double carritot=0;
		String carrito4str="";
		String carrito21str="";
		
		
		while(key4.hasMoreElements()) {
			productos4+=key4.nextElement()+"\n";
		}
		while(key21.hasMoreElements()) {
			productos21+=key21.nextElement()+"\n";
		}
		
		boolean ok=false;
		do {
			carrito4strprear=(JOptionPane.showInputDialog("Introduzca los articulos basicos separados por espacios, los articulos disponibles son los siguientes:\n"+productos4)).toLowerCase();
			String[] carrito4strar=carrito4strprear.split(" ");
			for (int i = 0; i < carrito4strar.length; i++) {
				if(bbdd4.containsKey(carrito4strar[i])) {
					ok=true;
				}
			}
		}while(!ok);
		String[] carrito4strar=carrito4strprear.split(" ");
		
		ok=false;
		do {
			carrito21strprear=(JOptionPane.showInputDialog("Introduzca los articulos basicos separados por espacios, los articulos disponibles son los siguientes:\n"+productos21)).toLowerCase();
			String[] carrito21strar=carrito21strprear.split(" ");
			for (int i = 0; i < carrito21strar.length; i++) {
				if(bbdd21.containsKey(carrito21strar[i])) {
					ok=true;
				}
			}
		}while(!ok);
		String[] carrito21strar=carrito21strprear.split(" ");
		
		
		for (int i = 0; i < carrito4strar.length; i++) {
			carrito4str+=carrito4strar[i]+": IVA:4%, Precio: "+(bbdd4.get(carrito4strar[i]))*1.04+"€ ("+bbdd4.get(carrito4strar[i])+"€ sin IVA)\n";
			carritot+=(bbdd4.get(carrito4strar[i]))*1.04;
		}
		
		for (int i = 0; i < carrito21strar.length; i++) {
			carrito21str+=carrito21strar[i]+": IVA:21%, Precio: "+(bbdd21.get(carrito21strar[i]))*1.04+"€ ("+bbdd21.get(carrito21strar[i])+"€ sin IVA)\n";
			carritot+=(bbdd21.get(carrito21strar[i]))*1.21;
		}
		
		
		double cpagada=Double.parseDouble(JOptionPane.showInputDialog("Cantidad a pagar: "+carritot+"€\nIntroduzca la cantidad pagada"));
		JOptionPane.showMessageDialog(null, "Ticket:\n"+carrito4str+carrito21str+"Cantidad pagada: "+cpagada+"€. Tiene que devolver "+(cpagada-carritot)+"€");

	}
	
//CONTROL DE STOCK-------------------------------------------------------------------------------------------------------------
	
	public static void Stock(Hashtable<String, Double> bbdd4, Hashtable<String, Double> bbdd21) {
		boolean sel =false;
		do {
			int menu=menuStock();
			switch (menu) {
			case 0:
				String[] iva= {"21","4"};
				int ivasel=JOptionPane.showOptionDialog(null, "Es un producto con 21 o 4 % de IVA?", null, 0, JOptionPane.QUESTION_MESSAGE, null, iva, null);
				if (ivasel==0) {
					bbdd21=introducirDatosStock(bbdd21);
				} else {
					bbdd4=introducirDatosStock(bbdd4);
				}
				
				break;
			case 1:
				mostrarDatosStock(bbdd4, bbdd21);
				break;
			case 2:
				String[] op={"Si","No"};
				int salir=JOptionPane.showOptionDialog(null, "Esta seguro que quiere salir?", null, 0, JOptionPane.QUESTION_MESSAGE, null, op, null);
				if (salir==0) {
					sel=true;
				}
				break;
			default: JOptionPane.showMessageDialog(null, "No ha introducido una opcion correcta");
				break;
			}
			
		}while(!sel);
	}
	
	public static int menuStock(){
		String[] op={"Introducir productos","Ver productos","Salir"};
		int menu=JOptionPane.showOptionDialog(null, "Que quiere hacer", null, 0, JOptionPane.QUESTION_MESSAGE, null, op, null);
		return menu;
	}
	
	public static Hashtable<String, Double> introducirDatosStock(Hashtable<String, Double> bbdd){
		boolean sel=false;
		String[] op={"Si","No"};
		do {
		String bbddkey=JOptionPane.showInputDialog("Introduzca el producto");
		double bbddprecio=Double.parseDouble(JOptionPane.showInputDialog("Introduzca su precio"));
		bbdd.put(bbddkey, bbddprecio);
		int menu=JOptionPane.showOptionDialog(null, "Quiere seguir introduciendo productos del mismo iva?", null, 0, JOptionPane.QUESTION_MESSAGE, null, op, null);
		if (menu==1) {
			sel=true;
		}
		}while(!sel);
		return bbdd;
	}
	
	public static void mostrarDatosStock(Hashtable<String,Double> bbdd4, Hashtable<String,Double> bbdd21) {
		Enumeration<Double> enu4 = bbdd4.elements();
		Enumeration<String> key4 = bbdd4.keys();
		Enumeration<Double> enu21 = bbdd21.elements();
		Enumeration<String> key21 = bbdd21.keys();
		String strbbdd="";
		while(enu4.hasMoreElements()) {
			strbbdd+= key4.nextElement()+": "+enu4.nextElement()+"\n";
		}
		while(enu21.hasMoreElements()) {
			strbbdd+= key21.nextElement()+": "+enu21.nextElement()+"\n";
		}
		JOptionPane.showMessageDialog(null, "Estos son los productos y sus precios: \n"+strbbdd);
	}

	

}
