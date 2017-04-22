package org.foobarspam.furnanceDIP;

public class GasHeater implements Heater{
	
	public GasHeater(){
		
	}
	
	public void engage(AmbientTemperature temperature){
		temperature.setTemperature(temperature.getTemperature() + 1);
		System.out.println("Encendido: La temperatura sube 1 grado. Temperatura actual: " + temperature.getTemperature());
	}

	public void disengage(AmbientTemperature temperature){
		temperature.setTemperature(temperature.getTemperature() - 1);
		System.out.println("Apagado: La temperatura baja 1 grado. Temperatura actual: " + temperature.getTemperature());
	}
}
