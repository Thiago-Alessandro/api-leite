package net.weg.apivendalacteos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    private String productName;
    @NonNull
    private Double unitPrice = 0.0;
    @NonNull
    private LocalDate expirationDate;
    private LocalDate fabricationDate;
    @NonNull
    private Integer quantity = 0;

}
