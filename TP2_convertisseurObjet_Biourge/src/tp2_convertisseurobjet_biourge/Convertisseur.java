/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_biourge;

/**
 *
 * @author utilisateur
 */
public class Convertisseur {

    int nbConversions;

    public void Convertisseur() {
        nbConversions = 0;
    }

    public double CelciusVersKelvin(double tCelcius) {
        tCelcius = tCelcius + 273.15;
        return tCelcius;
    }

    public double KelvinVersCelcius(double tKelvin) {
        tKelvin = tKelvin - 273.15;
        return tKelvin;
    }

    public double FarenheitVersCelcius(double tFarenheit) {
        tFarenheit = (tFarenheit - 32) / 1.8;
        return tFarenheit;
    }

    public double CelciusVersFarenheit(double tCelsius) {
        tCelsius = (tCelsius * 1.8) + 32;
        return tCelsius;
    }

    public double KelvinVersFarenheit(double tKelvin) {
        double t1;
        t1 = CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
        return t1;

    }

    public double FarenheitVersKelvin(double tFarenheit) {
        double t2;
        t2 = CelciusVersKelvin(FarenheitVersCelcius(tFarenheit));
        return t2;
    }

    @Override
    public String toString() {
        return "nb de conversions" + nbConversions;
    }
}
