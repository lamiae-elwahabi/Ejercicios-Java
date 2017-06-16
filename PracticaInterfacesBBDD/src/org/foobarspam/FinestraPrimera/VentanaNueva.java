package org.foobarspam.FinestraPrimera;
// la libreria grafica que usamos en java 
import java.awt.*;
//La finestra sempre es crea com una classe heretada de la classe Frame de AWT
public class VentanaNueva extends Frame{
	//constructor
	public VentanaNueva(){
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int ancho=d.width/3; // Un terç de l'amplada de la finestra
		int alto=d.height/3; // Un terç de l'alçada de la finestra
		this.setSize(ancho, alto);
		this.setLocation(d.width/2-ancho/2,d.height/2-alto/2); //Així queda en el centre de la pantalla
		this.setBackground(new Color(20,140,10));// El color del fons de la pantalla. Hem de crear un objecte de la classe Color amb els paràmeres del RGB. Aquests paràmetres són un verd
		
		this.setForeground(Color.blue);// El color de la barra de dalt.Es una variable de la classe Color. Una altra manera de donarcolor
		
		Font fuente = new Font("Arial", Font.PLAIN, 20);// Cream un objecte de la classe Font amb els paràmetres: Nom de la font, aspecte (normal:PLAIN, negreta:BOLD o cursiva:ITALIC
		
		this.setFont(fuente);//Establim la font de ventana a partir de l'objecte fuente anterior
		
		this.setTitle("Ejemplo de ventana ");//Establim el nou titol de la finestra.
		
	}
	

}
