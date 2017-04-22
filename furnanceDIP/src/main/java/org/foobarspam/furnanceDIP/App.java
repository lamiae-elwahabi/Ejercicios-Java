package org.foobarspam.furnanceDIP;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        final double temperaturaMaxima = 21.0;
        final double temperaturaMinima = 15.0;
        
        GasHeater calentador = new GasHeater();
        RemoteComandSensor termometro = new RemoteComandSensor();
        
        AmbientTemperature temperature = new AmbientTemperature(15.2);
        Regulator regulator = new Regulator();
        System.out.println("Arrancando");
        
        regulator.regulate(termometro, calentador, temperaturaMinima, temperaturaMaxima, temperature);
    }
}
