package mx.unam.aragon.ico.is.computadoraapi.services;

import mx.unam.aragon.ico.is.computadoraapi.entities.Computadora;
import mx.unam.aragon.ico.is.computadoraapi.repositories.ComputadoraRepository;
import mx.unam.aragon.ico.is.computadoraapi.services.interfaces.ComputadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ComputadoraServiceImpl implements ComputadoraService {
    @Autowired
    private ComputadoraRepository computadoraRepository;

    @Override
    public Computadora crear(Computadora computadora) {
        return computadoraRepository.save(computadora);
    }

    @Override
    public Iterable<Computadora> listarTodas() {
        return computadoraRepository.findAll();
    }

    @Override
    public Optional<Computadora> buscarPorId(Long clave) {
        return computadoraRepository.findById(clave);
    }

    @Override
    public Computadora actualizar(Long clave, Computadora computadora) {
        Optional<Computadora> computadoraActual = computadoraRepository.findById(clave);
        if (computadoraActual.isPresent()){
            Computadora tmp = computadoraActual.get();
            tmp.setModelo(computadora.getModelo());
            tmp.setModelo(computadora.getModelo());
            tmp.setClave(computadora.getClave());
            tmp.setMarca(computadora.getMarca());
            tmp.setFoto(computadora.getFoto());
            tmp.setPrecio(computadora.getPrecio());
            return computadoraRepository.save(tmp);
        }else{
            return null;
        }
    }

    @Override
    public Computadora eliminar(Long clave) {
       /* Computadora tmp =computadoraRepository.findById(clave).orElse(null);
        if (tmp != null){
            computadoraRepository.delete(tmp);
            return tmp;
        }else{
            return null;
        }*/

        //return computadoraRepository.deleteByClave(clave);

        return computadoraRepository.deleteByClave(clave);    }
}

