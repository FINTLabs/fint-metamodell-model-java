// Built from tag v1.0.0-rc-2

package no.fint.model.metamodell;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;
import no.fint.model.FintMainObject;
import no.fint.model.metamodell.kompleksedatatyper.Attributt;
import no.fint.model.metamodell.kompleksedatatyper.Dokumentasjon;
import no.fint.model.metamodell.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Klasse implements FintMainObject {
    public enum Relasjonsnavn {
            RELASJON,
            KONTEKST,
            ARVER
    }

    @NotNull
    private Boolean abstrakt;
    private List<@Valid Attributt> attributter;
    private List<@Valid Dokumentasjon> dokumentasjon;
    @NotNull
    private @Valid Identifikator id;
    @NotBlank
    private String navn;
    @NotBlank
    private String stereotype;
}
