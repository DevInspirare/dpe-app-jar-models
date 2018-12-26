package pe.com.devinspirare.dpeappjarmodels.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product")
public class Product extends GenericEntity{
    @Column(name = "code")
    private String code;
    @Column(name = "description")
    private String description;
}
