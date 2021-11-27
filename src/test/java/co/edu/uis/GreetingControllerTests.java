package co.edu.uis;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.assertj.core.internal.bytebuddy.implementation.bind.annotation.This;


@SpringBootTest
class GreetingControllerTests {

	
	

	@InjectMocks
	private GreetingController greetingController;
	
	private static ArrayList<Greeting> hola;
	private ArrayList<Greeting>  greeting;
	private Greeting comp1;
	private Greeting comp2;


	@BeforeEach
	void setUp(){
		MockitoAnnotations.initMocks(this);
		
	}

	@Test
	void greting() {
		greetingController=new GreetingController();
		greetingController.registrar("05", "BMW", "gs 1200", "2017", "gris");
		
		
		comp1=greetingController.get("05", "BMW", "gs 1200", "2017", "gris").get(0);
		
		GreetingController.moto.add("05");
		GreetingController.moto.add("BMW");
		GreetingController.moto.add("gs 1200");
		GreetingController.moto.add("2017");
		GreetingController.moto.add("gris");
		GreetingController.motos.add(GreetingController.moto);
		GreetingController.motos2.add(new Greeting(GreetingController.moto.get(0), GreetingController.moto.get(1), GreetingController.moto.get(2), GreetingController.moto.get(3), GreetingController.moto.get(4)));
		comp2=GreetingController.motos2.get(0);
		
		assertSame(comp1,comp2);
	
		
		//assertSame(hola=greetingController.get("05", "BMW", "gs 1200", "2017", "gris"),hola);

	}

	

	

}
