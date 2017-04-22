package org.foobarspam.furnanceDIP;

public class RemoteComandSensor implements Thermometer{

	public RemoteComandSensor(){
		
	}
	
	public double read(AmbientTemperature temperature){
		return temperature.getTemperature();
	}
}
