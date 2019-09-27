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
import no.fint.model.metamodell.kompleksedatatyper.Dokumentasjon;
import no.fint.model.metamodell.kompleksedatatyper.Identifikator;
import no.fint.model.metamodell.kompleksedatatyper.Multiplisitet;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Relasjon implements FintMainObject {
    public enum Relasjonsnavn {
            KILDE,
            MAL
    }

    private List<@Valid Dokumentasjon> dokumentasjon;
    @NotNull
    private @Valid Identifikator id;
    private List<@Valid Multiplisitet> multiplisitet;
    @NotBlank
    private String navn;
}
