// Built from tag v1.0.0-rc-2

package no.fint.model.metamodell;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

import no.fint.model.metamodell.kompleksedatatyper.Dokumentasjon;
import no.fint.model.metamodell.kompleksedatatyper.Identifikator;
import no.fint.model.metamodell.kompleksedatatyper.Multiplisitet;
import no.novari.fint.model.FintIdentifikator;
import no.novari.fint.model.FintMainObject;

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
    private @Valid FintIdentifikator id;
    private List<@Valid Multiplisitet> multiplisitet;
    @NotBlank
    private String navn;

    @Override
    public Map<String, FintIdentifikator> getIdentifikators() {
        return id == null ? Collections.emptyMap() : Collections.singletonMap("id", id);
    }
}
