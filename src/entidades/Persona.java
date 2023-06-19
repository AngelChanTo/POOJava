package entidades;

public class Persona {
	//1. propiedades o atributos
	
	
	
	public String nombre;
	public int edad;
	public String correo;
	public String telefono;
	
	//2.constructor
	
	public Persona(String nombre, int edad, String correo, String telefono){
		this.nombre = nombre;
		this.edad = edad;
		this.correo=correo;
		this.telefono=telefono;
	}//cierreConstructor
	
	//sobrecarga de metodo (overloading)
	public Persona(String nombre, int edad, String correo){
		this.nombre = nombre;
		this.edad = edad;
		this.correo=correo;
	}//cierreConstructor
	
	//3. metodos
	public void mostrarInfo() {
		System.out.println("Nombre: " + nombre);
		System.out.println("edad: " + edad);
		System.out.println("correo: " + correo);
		System.out.println("telefono: " + telefono);
		
	}//cierreMetodo
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona Angel = new Persona("Angel", 22, "angel.chan@gmail", "9991642939");
		Persona Esteban = new Persona("Esteban", 23, "Esteban.alvarez@gmail", "199913569");
		Persona Alexandra = new Persona("Alexandra", 23, "AleCarrilo@gmail", "1234567891");
		Persona Manuel =  new Persona ("Manuel", 23, "Chulim201@gmail", "1235678912");
		
		
		Angel.mostrarInfo();
		Esteban.mostrarInfo();
		Alexandra.mostrarInfo();
		Manuel.mostrarInfo();
		
		
	}//cierre main
	
	

}//cierre class
