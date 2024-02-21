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

    @NonNull
    @ManyToOne
    private Product product;

//    @NonNull
//    private Double unitPrice = 0.0;
    @NonNull
    private LocalDate expirationDate;
    private LocalDate fabricationDate;
    @NonNull
    private Integer productQuantity = 0;
    @NonNull
    private Integer quantityAvailable = 0;

}
