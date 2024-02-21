package net.weg.apivendalacteos.service;

import lombok.AllArgsConstructor;
import net.weg.apivendalacteos.model.Product;
import net.weg.apivendalacteos.model.ProductBatch;
import net.weg.apivendalacteos.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Collection;
import java.util.PrimitiveIterator;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Product create(Product product) {
        return productRepository.save(product);
    }

    public Product update(Product product) {
        return productRepository.save(product);
    }

    public Product findById(Long id){
        return productRepository.findById(id).get();
    }
    public Collection<Product> findAll(){
        return productRepository.findAll();
    }

    public Product patchImage(Long productId, MultipartFile image){
        Product product = findById(productId);
        product.setImage(image);
        return productRepository.save(product);
    }

    public void delete(Product product){
        productRepository.delete(product);
    }

    public void deleteById(Long id){
        productRepository.deleteById(id);
    }
}
