// Built from tag v1.0.0-rc-2

package no.fint.model.metamodell.kompleksedatatyper;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;
import no.fint.model.FintComplexDatatypeObject;
import no.fint.model.metamodell.kompleksedatatyper.Dokumentasjon;
import no.fint.model.metamodell.kompleksedatatyper.Multiplisitet;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Attributt implements FintComplexDatatypeObject {
    private List<@Valid Dokumentasjon> dokumentasjon;
    @NotNull
    private @Valid Multiplisitet multiplisitet;
    @NotBlank
    private String navn;
    @NotBlank
    private String stereotype;
    @NotBlank
    private String type;
}
