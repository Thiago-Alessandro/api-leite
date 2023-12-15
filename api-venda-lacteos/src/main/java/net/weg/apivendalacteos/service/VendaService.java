package net.weg.apivendalacteos.service;

import lombok.AllArgsConstructor;
import net.weg.apivendalacteos.model.Venda;
import net.weg.apivendalacteos.repository.Vendarepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class VendaService  {

    private Vendarepository vendaRepository;

    public Collection<Venda> findAll(){
        return vendaRepository.findAll();
    }

    public Venda create(Venda venda){
        return vendaRepository.save(venda);
    }

    public Venda update(Venda venda){
        return vendaRepository.save(venda);
    }

}
