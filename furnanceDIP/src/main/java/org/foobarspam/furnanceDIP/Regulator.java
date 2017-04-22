package org.foobarspam.furnanceDIP;

public class Regulator {
		
		public void regulate(Thermometer t, Heater h, double minTemp, double maxTemp, AmbientTemperature temperature){
				RegulatorDisplayCodes code;
				while(t.read(temperature) < maxTemp){
					code = RegulatorDisplayCodes.HEATING;				
					h.engage(temperature);
					message(code, temperature);
				}
				while (t.read(temperature) > minTemp){
					code = RegulatorDisplayCodes.WAITING;
					h.disengage(temperature);			
					message(code, temperature);
				}
		}

		private void message(RegulatorDisplayCodes code, AmbientTemperature temperature){

		}

	}
