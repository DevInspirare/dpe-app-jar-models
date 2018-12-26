package pe.com.devinspirare.dpeappjarmodels.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Clase abstracta para obtener una respuesta genérica.
 *
 * @author Zeler Benji Villarreal Marcelo
 * @version 1.0.0
 * @since 23/11/2018
 *
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenericResponse {
    private String response;
    private Integer codeResponse;
}
