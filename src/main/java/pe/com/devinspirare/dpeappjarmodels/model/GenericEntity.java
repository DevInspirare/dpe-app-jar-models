package pe.com.devinspirare.dpeappjarmodels.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * <h1>GenericEntity</h1>
 * <p>
 * Clase abstract que posee las propiedades básicas de una entidad, es necesario que hereden aquellas clases del dominio que se maneje.
 * como persistencia.
 * </p>
 *
 * @author Zeler Benji Villarreal Marcelo
 * @version 1.0.0
 * @since 2018-10-31
 *
 */
@Data
@MappedSuperclass
public abstract class GenericEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Campo que indica si la entidad se encuentra habilitada o deshabilitada.
     */
    @Column(length = 1, name = "flagActive")
    protected Boolean flagActive;

    /**
     * Campo que indica el estado de la entidad, es eliminado por completo o no.
     */
    @Column(length = 1, name = "flagState")
    protected Boolean flagState;

    @Column( name = "lastModification")
    @Temporal(TemporalType.TIMESTAMP)
    @Setter(AccessLevel.NONE)
    private Date lastModification;

    @Column( name = "creationDate")
    @Temporal(TemporalType.TIMESTAMP)
    @Setter(AccessLevel.NONE)
    private Date creationDate;

    @PrePersist
    private void prePersist(){
        creationDate = new Date();
        flagActive = true;
        flagState = true;
    }

    @PreUpdate
    private void preUpdate() {
        lastModification = new Date();
    }
}
