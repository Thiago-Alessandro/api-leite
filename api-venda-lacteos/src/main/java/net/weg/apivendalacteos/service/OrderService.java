package net.weg.apivendalacteos.service;

import lombok.AllArgsConstructor;
import net.weg.apivendalacteos.model.Order;
import net.weg.apivendalacteos.model.ProductBatch;
import net.weg.apivendalacteos.repository.OrderRepository;
import net.weg.apivendalacteos.repository.ProductBatchRepository;
import net.weg.apivendalacteos.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
@AllArgsConstructor
public class OrderService {

    private OrderRepository orderRepository;

    private UserRepository userRepository;
    private ProductBatchRepository productBatchRepository;

    public Collection<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findOne(Long id){
        return orderRepository.findById(id).get();
    }

    public Order create(Order order){

        order.setUser(userRepository.findById(order.getUser().getId()).get());

//        Collection<ProductBatch> productBatches = new ArrayList<>();
//
//        order.getProductBatches()
//                .forEach(productBatch -> productBatches.add(productBatchRepository.findById(productBatch.getId()).get()));
//
//
//        order.setProductBatches(productBatches);


//        Order savedOrder = orderRepository.save(order);
        order.setPrice(order.getProductBatch().getProduct().getPrice() * order.getProductBatch().getProductQuantity());
        System.out.println(order.getPrice());

        return orderRepository.save(order);
    }

    public Order update(Order order){
        return orderRepository.save(order);
    }

    public void delete(Long id){
        orderRepository.deleteById(id);
    }

}
