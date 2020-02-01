package come.swagger.example.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "student")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    private int id;

    @Column(name = "student_name")
    private String username;

    @Column(name = "email")
    private String email;
}
