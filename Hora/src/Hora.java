	
public class Hora {
private int hora;
private int minutos;
private int segundos;

public Hora() {
hora = 0;
minutos = 0;
segundos = 0;
}
 //Consructor
public Hora(int hora, int minutos, int segundos) {
this.hora = hora;
this.minutos = minutos;
this.segundos = segundos;
if (minutos > 60 || segundos > 60 || hora > 24 || minutos < 0 || 
segundos < 0 || hora < 0) {
hora = 0;
minutos = 0;
segundos = 0;
}
}
    //Get and Set
public void setHora (int hora, int minutos, int segundos) {
this.hora = hora;
this.minutos = minutos;
this.segundos = segundos;
}

public int getHora() {
return hora;
}

public void setHora(int hora) {
this.hora = hora;
}

public int getMinutos() {
return minutos;
}

public void setMinutos(int minutos) {
this.minutos = minutos;
}

public int getSegundos() {
return segundos;
}
	
public void setSegundos(int segundos) {
this.segundos = segundos;
}
}
