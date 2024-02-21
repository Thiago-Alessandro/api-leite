package net.weg.apivendalacteos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class File  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type;
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] data;

}
