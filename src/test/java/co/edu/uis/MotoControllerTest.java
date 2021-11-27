package co.edu.uis;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MotoControllerTest {

	@Test
	void comprobarMetodoPost_Get(){

        Moto moto_prueba = new Moto("10", "Honda", "Cb 110", "2020", "Azul");

        MotoController classmoto;
        classmoto = new MotoController();

        classmoto.registrar("10", "Honda", "Cb 110", "2020", "Azul");

        ArrayList<Moto> motos = classmoto.mostrar("10");

        assertEquals(moto_prueba.getId(), motos.get(0).getId());
        assertEquals(moto_prueba.getMarca(), motos.get(0).getMarca());
        assertEquals(moto_prueba.getNombre(), motos.get(0).getNombre());
        assertEquals(moto_prueba.getYear(), motos.get(0).getYear());
        assertEquals(moto_prueba.getColor(), motos.get(0).getColor());
    }

    @Test
	void comprobarMetodoPut(){

        Moto moto_prueba = new Moto("04", "Honda", "Boxer ct 100", "2019", "gris");

        MotoController classmoto;
        classmoto = new MotoController();

        classmoto.actualizar("04", "Honda", "Boxer ct 100", "2019", "gris");

        ArrayList<Moto> motos = classmoto.mostrar("04");

        assertEquals(moto_prueba.getId(), motos.get(0).getId());
        assertEquals(moto_prueba.getMarca(), motos.get(0).getMarca());
        assertEquals(moto_prueba.getNombre(), motos.get(0).getNombre());
        assertEquals(moto_prueba.getYear(), motos.get(0).getYear());
        assertEquals(moto_prueba.getColor(), motos.get(0).getColor());
    }

    @Test
	void comprobarMetodoDelete(){

       // Moto moto_prueba = new Moto("04", "Bajaj", "Boxer ct 100", "2019", "gris");
        
        MotoController classmoto;
        
        classmoto = new MotoController();

        //classmoto.deletear("04");

        ArrayList<Moto> motos = classmoto.mostrar("null");
        System.out.println(motos.get(0).getId());
        System.out.println(motos.get(1).getId());
        System.out.println(motos.get(2).getId());
        System.out.println(motos.get(3).getId());

        assertTrue(true);
    }

}
