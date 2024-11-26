package ejercicio_poo;

public class Cliente extends Persona{
	/*
	 * Clase Cliente que extiende de persona con sus 
	 * propias variables
	 */
	private int nCliente;
	private String direccion;
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
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	public int getnCliente() {
		return nCliente;
	}
	public void setnCliente(int nCliente) {
		this.nCliente = nCliente;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Cliente(String nombre, String apellido, String dni, int nCliente, String direccion) {
		super(nombre, apellido, dni);
		this.nCliente = nCliente;
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Nombre: " + getNombre() + ", Apellido: " + getApellido() + ", DNI: " + getDni()
				+  ", número de cliente: " + getnCliente() + ", Dirección: "
				+ getDireccion();
	}
	

}
