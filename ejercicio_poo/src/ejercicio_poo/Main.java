package ejercicio_poo;

public class Main {
/* 
 * Esta es la clase principal en la que instancial los dos objetos
 * Cliente y vendendor tambien se hace una llamada al metodo de
 * añardir nua nueva venta que se sumara a las que ya tiene el vendedor
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c1= new Cliente("Pedro", "García", "123355654A", 12321, "Calle los Almendros 12");
		System.out.println(c1.toString());
		Vendedor v1= new Vendedor("Antonio", "Sánchez", "64548798S", 54984, "Albacete", 5);
		System.out.println(v1.toString());
		
		v1.nVenta();
		System.out.println(v1.toString());

	}
}
