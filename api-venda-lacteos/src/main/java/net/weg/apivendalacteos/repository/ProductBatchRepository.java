package net.weg.apivendalacteos.repository;

import net.weg.apivendalacteos.model.ProductBatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductBatchRepository extends JpaRepository<ProductBatch, Long> {

}
