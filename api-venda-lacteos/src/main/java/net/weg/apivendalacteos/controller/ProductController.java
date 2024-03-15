package net.weg.apivendalacteos.controller;

import lombok.AllArgsConstructor;
import net.weg.apivendalacteos.model.Product;
import net.weg.apivendalacteos.model.ProductBatch;
import net.weg.apivendalacteos.service.ProductService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Collection;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public Product create(@RequestBody Product product){
        return productService.create(product);
    }
    @PutMapping
    public Product update(@RequestBody Product product){
        return productService.update(product);
    }
    @GetMapping("/{id}")
    public Product findById(@PathVariable Long id){
        return productService.findById(id);
    }
    @GetMapping
    public Collection<Product> findAll(){
        return productService.findAll();
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        productService.deleteById(id);
    }
    @DeleteMapping
    public void delete(@RequestBody Product product){
        productService.delete(product);
    }

//    @PatchMapping("/image/{productId}")
//    public Product patchImage(@PathVariable Long productId, @RequestParam MultipartFile image){
//        return productService.patchImage(productId, image);
//    }

}
