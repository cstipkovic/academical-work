package hotelaria.app;

import hotelaria.modelo.Hotel;
import hotelaria.persistencia.HotelBd;
import java.util.ArrayList;
import java.util.List;

public class HotelBdApp {

    public static void main(String args[]) {
        HotelBd hotelBd = new HotelBd();
        List<Hotel> hoteis = hotelBd.ler();
        
        for (Hotel h : hoteis) {
            System.out.println(h.getId());
            System.out.println(h.getNome());
            System.out.println(h.getLogradouro());
            System.out.println(h.getNumero());
        }
    }
}
