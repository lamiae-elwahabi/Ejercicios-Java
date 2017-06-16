package org.foobarspam.KataNumerosRomanos.test;

public enum SimbolosRomanos {
	M(1000),
	C(100),
	L(50),
	X(10),
	V(5),
	I(1);
	
	private int valor;

	SimbolosRomanos(int valor){
		this.valor = valor;
	}
}
