package cz.upce.fei.cviceni01.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class AppUser {
    @Id
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private Boolean active;

    @Column
    private LocalDateTime creationDate;

    @Column
    private LocalDateTime updateDate;

    @OneToMany(mappedBy = "author")
    private List<Task> tasks = Collections.emptyList();

    @ManyToMany(mappedBy = "users")
    private List<Role> roles = Collections.emptyList();
}
