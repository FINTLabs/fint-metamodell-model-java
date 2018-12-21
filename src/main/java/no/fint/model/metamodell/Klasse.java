// Built from tag master

package no.fint.model.metamodell;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
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
            PAKKE,
            ARVER
    }

    @NonNull
    private Boolean abstrakt;
    @NonNull
    private List<Attributt> attributter;
    @NonNull
    private List<Dokumentasjon> dokumentasjon;
    @NonNull
    private Identifikator id;
    @NonNull
    private String navn;
    @NonNull
    private String stereotype;
}
