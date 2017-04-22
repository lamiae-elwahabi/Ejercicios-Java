package org.foobarspam.furnanceDIP;

public class AmbientTemperature {

	private double temperature = 0;

	public AmbientTemperature(double temperature){
		this.temperature = temperature;
	}
	
	public double getTemperature() {
		return this.temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
}
