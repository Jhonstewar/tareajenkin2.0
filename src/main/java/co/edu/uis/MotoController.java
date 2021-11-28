package co.edu.uis;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
//@RequestMapping("/demo")
public class MotoController {

	private static Moto moto;
	private static ArrayList<Moto> motos = new ArrayList<>();
	

	@GetMapping("/getMoto")
	public ArrayList<Moto> mostrar(@RequestParam(value = "id", defaultValue = "null") String id) {
	ArrayList<Moto> motos2 = new ArrayList<>();
			if (id != "null") {
				for(Moto moto: motos){
					if (moto.getId() == id) {
						motos2.add(new Moto(moto.getId(), moto.getMarca(), moto.getNombre(), moto.getYear(), moto.getColor()));
					}
				}
				return motos2;
			}
			for(Moto moto: motos){
				motos2.add(new Moto(moto.getId(), moto.getMarca(), moto.getNombre(), moto.getYear(), moto.getColor()));
			}
			return motos2;
	}
	// aqui se crean las motos

	@PostMapping("/addMoto")
	public void registrar(@RequestParam String id,
						@RequestParam String marca,
						@RequestParam String nombre,
						@RequestParam String year,
						@RequestParam String color){

		moto = new Moto(id, marca, nombre, year, color);

		motos.add(moto);
	}

	@PutMapping("/editMoto")
	public void actualizar(@RequestParam String id,
	@RequestParam String marca,
	@RequestParam String nombre,
	@RequestParam String year,
	@RequestParam String color)
	{
		
		int i = 0;
		for(Moto moto: motos){
			if (moto.getId()==id) {
				moto.setMarca(marca);
				moto.setNombre(nombre);
				moto.setYear(year);
				moto.setColor(color);
				motos.set(i, moto);
			}
			i++;
		}

	}

	@DeleteMapping("/deleteMoto")
	public void deletear(@RequestParam String id)
	{
		for(Moto moto: motos){
			if (moto.getId().equals(id)) {
				motos.remove(moto);
			}
			
		}
	}
}