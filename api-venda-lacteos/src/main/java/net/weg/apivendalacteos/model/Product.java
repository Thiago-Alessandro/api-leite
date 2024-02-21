package net.weg.apivendalacteos.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    @Column(unique = true)
    private String name;
    @NonNull
    private Double price;

    @OneToOne(cascade = CascadeType.ALL)
    private File image;

    @OneToMany(mappedBy = "product")
    @JsonIgnore
    private Collection<ProductBatch> batches;

    public void setImage(MultipartFile picture) {
        File file = new File();
        try {
            file.setData(picture.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        file.setName(picture.getOriginalFilename());
        file.setType(picture.getContentType());
        this.image = file;
    }
}
