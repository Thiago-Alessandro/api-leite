package net.weg.apivendalacteos.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import net.weg.apivendalacteos.model.Order;
import net.weg.apivendalacteos.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/order")
@AllArgsConstructor
public class OrderController {

    private OrderService vendaService;

    @GetMapping()
    public Collection<Order> findAll(){return vendaService.findAll();}

    @GetMapping("/{id}")
    public Order findOne(@PathVariable Long id){
        return vendaService.findOne(id);
    }
    @PostMapping()
    public Order create(@RequestBody Order order){
        System.out.println("controller");
        System.out.println(order);
        return vendaService.create(order);}


    @PutMapping()
    public Order update(@RequestBody Order order){
        return vendaService.update(order);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        vendaService.delete(id);
    }

    @GetMapping("/notDemanded")
    public Collection<Order> findOrdersByDemandedFalse(){
        System.out.println(vendaService.findOrdersByDemandedFalse());
        return vendaService.findOrdersByDemandedFalse();
    }

    @PutMapping("/setDemanded")
    public void setDemandedTrue(){
        vendaService.setDemandedTrue();
    }

}
