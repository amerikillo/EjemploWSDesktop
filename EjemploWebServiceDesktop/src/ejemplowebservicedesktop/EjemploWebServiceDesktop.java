/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplowebservicedesktop;

import com.cdyne.ws.weatherws.*;

/**
 *
 * @author Amerikillo
 */
public class EjemploWebServiceDesktop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Weather service = new Weather();
            WeatherSoap weatherSoap = service.getWeatherSoap();
            String zip = "97867";
            WeatherReturn resp = weatherSoap.getCityWeatherByZIP(zip);
            System.out.println("Ciudad: " + resp.getCity());
            System.out.println("Temperatura: " + resp.getTemperature());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
