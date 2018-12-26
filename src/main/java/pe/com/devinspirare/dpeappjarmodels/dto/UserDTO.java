package pe.com.devinspirare.dpeappjarmodels.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Usuario Data Transfer Object
 *
 * @author Zeler Benji Villarrel Marcelo
 * @version 1.0.0
 * @since 23/11/2018
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO extends GenericResponse{
    private Long id;
    private String userCode;
    private String userName;
    private String password;
    private Date dateOfLastmodification;
    private boolean isActive;
}
