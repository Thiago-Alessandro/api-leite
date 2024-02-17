package net.weg.apivendalacteos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.aspectj.weaver.ast.Or;

import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @NonNull
    private String email;
    @NonNull
    private String password;
    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Address> address;
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private Collection<Order> orders;

}
