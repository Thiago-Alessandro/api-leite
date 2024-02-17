package net.weg.apivendalacteos.service;

import lombok.AllArgsConstructor;
import net.weg.apivendalacteos.model.ProductBatch;
import net.weg.apivendalacteos.repository.ProductBatchRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class ProductBatchService {

    private final ProductBatchRepository productBatchRepository;

    public Collection<ProductBatch> findAll(){
        return productBatchRepository.findAll();
    }

    public ProductBatch findOne(Long id){
        return productBatchRepository.findById(id).get();
    }

    public ProductBatch create(ProductBatch productBatch){
        return productBatchRepository.save(productBatch);
    }

    public ProductBatch update(ProductBatch productBatch){
        return productBatchRepository.save(productBatch);
    }

    public void delete(Long id){
        productBatchRepository.deleteById(id);
    }

}
