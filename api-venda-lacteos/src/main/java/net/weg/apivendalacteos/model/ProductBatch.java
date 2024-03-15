package net.weg.apivendalacteos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductBatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne(optional = false)
    private Product product;

//    @NonNull
//    private Double unitPrice = 0.0;

    private LocalDate expirationDate;
    private LocalDate fabricationDate;
    @Column(nullable = false)
    private Integer productQuantity = 0;

    private Integer quantityAvailable = 0;

}
