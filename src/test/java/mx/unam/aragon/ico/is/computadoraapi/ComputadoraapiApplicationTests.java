package mx.unam.aragon.ico.is.computadoraapi;

import mx.unam.aragon.ico.is.computadoraapi.entities.Computadora;
import mx.unam.aragon.ico.is.computadoraapi.repositories.ComputadoraRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComputadoraapiApplicationTests {
	@Autowired
	private ComputadoraRepository computadoraRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void insertarComputadora(){
		Computadora computadora = new Computadora(0,"HP", "pavillion 200",null,1300.0f);
		computadoraRepository.save(computadora); //insert into
	}

	@Test
	void leerComputadoraPorClave(){
		Long claveTemp = 2l;
		Computadora tmp= computadoraRepository.findComputadoraByClave(claveTemp);
		System.out.println(tmp);
	}

	@Test
	public void eliminarComputadora(){
		Long claveTemp = 2l;
		computadoraRepository.deleteById(claveTemp);
	}

	@Test
	public void actualizarComputadora(){
		Long claveTemp = 4l;
		Computadora tmp = computadoraRepository.findComputadoraByClave(claveTemp);
		tmp.setModelo("patito 3000");
		computadoraRepository.save(tmp);
	}
}
