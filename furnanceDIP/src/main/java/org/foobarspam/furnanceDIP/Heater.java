package org.foobarspam.furnanceDIP;

public interface Heater {

	void engage(AmbientTemperature temperature);

	void disengage(AmbientTemperature temperature);

}
