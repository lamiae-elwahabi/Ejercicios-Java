package org.foobarspam.EjemplosInterfaz;

import javax.swing.*;
public class Ejemplo1 extends JFrame {
	public static void main( String argv[] ) {
		new Ejemplo1();
	}
	Ejemplo1() {
		JLabel hola = new JLabel( "Hola Mundo!" );
		getContentPane().add( hola,"Center" );
		setSize( 200,100);
		setVisible( true );
	}
}