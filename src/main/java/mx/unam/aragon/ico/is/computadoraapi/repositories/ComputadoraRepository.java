package mx.unam.aragon.ico.is.computadoraapi.repositories;

import mx.unam.aragon.ico.is.computadoraapi.entities.Computadora;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ComputadoraRepository extends CrudRepository<Computadora, Long> {
    public Computadora findComputadoraByClave(Long clave);
}
