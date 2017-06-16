package org.foobarspam.EjemplosInterfaz;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class Ejemplo3 extends JPanel {
	static JPanel creaBorde( Border b ) {
		JPanel panel = new JPanel();
		String str = b.getClass().toString();
		str = str.substring( str.lastIndexOf('.') + 1 );
		panel.setLayout( new BorderLayout() );
		panel.add(new JLabel( str,JLabel.CENTER ),BorderLayout.CENTER );
		panel.setBorder( b );
		return( panel );
	}
	public Ejemplo3() {
		setLayout( new GridLayout( 2,4 ) );
		
		add( creaBorde( new TitledBorder("Titulo") ) );
		add( creaBorde( new EtchedBorder() ) );
		add( creaBorde( new LineBorder(Color.blue) ) );
		add( creaBorde( new MatteBorder(5,5,30,30,Color.green) ) );
		add( creaBorde( new BevelBorder(BevelBorder.RAISED) ) );
		add( creaBorde( new SoftBevelBorder(BevelBorder.LOWERED) ) );
		add(creaBorde(new CompoundBorder(new EtchedBorder(),new LineBorder(Color.red) ) ) );
	}
	public static void main( String args[] ) {
		JFrame frame = new JFrame( "Tutorial de Java, Swing" );
				frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE );
				frame.getContentPane().add( new Ejemplo3(),BorderLayout.CENTER );
				frame.setSize( 500,300 );
				frame.setVisible( true );
	}
}