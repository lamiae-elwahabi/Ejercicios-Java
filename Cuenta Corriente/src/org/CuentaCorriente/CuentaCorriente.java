package org.CuentaCorriente;

public class CuentaCorriente {
	//propiedades 
	private String nombre;
	private String apellidos;
	private String direccion;
	private String telefono;
	private String nif;
	private double saldo;
    //constructor de la calse
	public CuentaCorriente(String nombre, String apellidos, String direccion,
			String telefono, String nif, double saldo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.nif = nif;
		this.saldo = saldo;
	}
	//incializamos una constructor vacio por defecto  
	public CuentaCorriente() {

	}
	//metodos de la clase  	 	
public void sacarDinero(double resta) {
		saldo -= resta;
	}

	public void ingresarDinero(double suma) {
		saldo += suma;
	}
	//Geters y seters 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Metodo para consultar cuenta 

	public void consultarCuenta() {
		System.out.println("Nombre :" + nombre);
		System.out.println("Apellidos :" + apellidos);
		System.out.println("Dirección :" + direccion);
		System.out.println("Telefono :" + telefono);
		System.out.println("nif :" + nif);
		System.out.println("Saldo :" + saldo);
	}

	public boolean saldoNegativo() {
		if (saldo < 0) {
			return true;
		} else {
			return false;
		}
	}
}
