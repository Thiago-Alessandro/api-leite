package net.weg.apivendalacteos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @NonNull
    private ProductBatch productBatch;
    @NonNull
    private Double price = 0.0;
    @ManyToOne
    @NonNull
    private User user;
    @ManyToOne
    @NonNull
    private Address address;

}
