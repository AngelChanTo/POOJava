package entidades;

//instruccion de que quiero heredar

public class Empleado extends Persona{
	//1. atributos o propiedades
	public String numEmpleado;
	public String nss;
	public String puesto;
	
	//generamos el constructor
	public Empleado(String nombre, int edad, String correo, String telefono, String numEmpleado, String nss,
			String puesto) {
		super(nombre, edad, correo, telefono); //indica lo que se heredo de la superclase
		this.numEmpleado = numEmpleado;
		this.nss = nss;
		this.puesto = puesto;
	}
	//3. metodo para imprimir la informacion del empleado;
	
	public void mostrarInfo() {
		System.out.println("Nombre: " + nombre);
		System.out.println("edad: " + edad);
		System.out.println("correo: " + correo);
		System.out.println("telefono: " + telefono);
		System.out.println("Numero de empleado: " + numEmpleado);
		System.out.println("numero de seguro social: " + nss);
		System.out.println("puesto: " + puesto);
	}//cierreMetodo
	
	
	
	
	

}
