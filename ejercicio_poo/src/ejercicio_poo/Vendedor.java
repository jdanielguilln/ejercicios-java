package ejercicio_poo;
/*
 * Esta es la clase vendedor que extiende de persona
 * con sus variables propias y el metodo de añadir una nueva venta
 */
public class Vendedor extends Persona{
	
	private int nEmpleado;
	private String sucursal;
	private int nVentas;
	
	
	




	public Vendedor(String nombre, String apellido, String dni, int nEmpleado, String sucursal, int nVentas) {
		super(nombre, apellido, dni);
		this.nEmpleado = nEmpleado;
		this.sucursal = sucursal;
		this.nVentas = nVentas;
	}



	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}



	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}



	@Override
	public String getApellido() {
		// TODO Auto-generated method stub
		return super.getApellido();
	}



	@Override
	public void setApellido(String apellido) {
		// TODO Auto-generated method stub
		super.setApellido(apellido);
	}



	@Override
	public String getDni() {
		// TODO Auto-generated method stub
		return super.getDni();
	}



	@Override
	public void setDni(String dni) {
		// TODO Auto-generated method stub
		super.setDni(dni);
	}



	public int getnEmpleado() {
		return nEmpleado;
	}



	public void setnEmpleado(int nEmpleado) {
		this.nEmpleado = nEmpleado;
	}



	public String getSucursal() {
		return sucursal;
	}



	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}



	public int getnVentas() {
		return nVentas;
	}



	public void setnVentas(int nVentas) {
		this.nVentas = nVentas;
	}







	@Override
	public String toString() {
		return "Nombre: " + getNombre() + ", Apellido: " + getApellido() + ", DNI: " + getDni()
				+ ", Número de epleado: " + getnEmpleado() + ", Sucursal: " + getSucursal() + ", Número de Ventas: "
				+ getnVentas();
	}



	public void nVenta() {
		nVentas++;
	}
}
