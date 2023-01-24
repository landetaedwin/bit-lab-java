package ec.com.bit.lab.restapi.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String username;
    @Column
    private String lastname;
    @Column
    private String email;

}
