package net.weg.apivendalacteos.controller;

import lombok.AllArgsConstructor;
import net.weg.apivendalacteos.model.Order;
import net.weg.apivendalacteos.model.ProductBatch;
import net.weg.apivendalacteos.service.ProductBatchService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/productBatch")
@AllArgsConstructor
public class ProductBatchController {

    private final ProductBatchService productBatchService;

    @GetMapping()
    public Collection<ProductBatch> findAll(){return productBatchService.findAll();}

    @GetMapping("/{id}")
    public ProductBatch findOne(@PathVariable Long id){
        return productBatchService.findOne(id);
    }
    @PostMapping()
    public ProductBatch create(@RequestBody ProductBatch productBatch){
        return productBatchService.create(productBatch);}


    @PutMapping()
    public ProductBatch update(@RequestBody ProductBatch productBatch){
        return productBatchService.update(productBatch);
    }

    @GetMapping("/product/{id}")
    public Collection<ProductBatch> getProductbatchesByProductId(@PathVariable Integer id){
        return productBatchService.findByProductId(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        productBatchService.delete(id);
    }

}
