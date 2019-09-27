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
import no.fint.model.metamodell.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Kontekst implements FintMainObject {
    public enum Relasjonsnavn {
            UNDERORDNET,
            KLASSE,
            OVERORDNET
    }

    @NotNull
    private @Valid Identifikator id;
    @NotBlank
    private String navn;
    @NotBlank
    private String stereotype;
}
