package hotelaria.app;

import hotelaria.modelo.Hotel;
import hotelaria.persistencia.HotelBd;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cstipkovic
 */
public class HotelBdApp {

    public static void main(String args[]) {
        HotelBd hotelBd = new HotelBd();
        List<Hotel> hoteis = new ArrayList<>(); 
        
        for (Hotel h : hoteis) {
            System.out.println(h.getId() + " | " + h.getNome() + " | " + h.getLogradouro() + " | " + h.getNumero());
        }
    }
}
