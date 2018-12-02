package project.smartlock.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "locks")
@Getter @Setter
public class Lock {

    @Id
    private Long id;

    private String name;
    private String description;

    private Boolean active;
    private Boolean deleted;

}
