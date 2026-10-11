package bglist.user;


import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false,unique = true)
    private String username;
    private String passwordHash;
}
