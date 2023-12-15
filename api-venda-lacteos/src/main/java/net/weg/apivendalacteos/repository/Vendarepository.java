package net.weg.apivendalacteos.repository;

import net.weg.apivendalacteos.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Vendarepository extends JpaRepository<Venda, Integer> {
}
