package com.crud.crud.model;


import com.crud.crud.dtos.UserDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "\"user\"")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String role;

    public User(UserDTO user){
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.role = user.getRole();
    }
}
