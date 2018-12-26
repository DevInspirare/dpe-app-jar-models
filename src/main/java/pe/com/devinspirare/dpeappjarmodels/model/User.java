package pe.com.devinspirare.dpeappjarmodels.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "User")
public class User extends GenericEntity{
    @Column(name = "usercode", length = 100)
    private String userCode;
    @Column(name = "username", length = 100)
    private String username;
    @Column(name = "password", length = 150)
    private String secretPassword;
}
