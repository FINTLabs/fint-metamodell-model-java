// Built from tag v0.2.0

package no.fint.model.metamodell.kompleksedatatyper;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.metamodell.kompleksedatatyper.Dokumentasjon;
import no.fint.model.metamodell.kompleksedatatyper.Multiplisitet;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Attributt implements FintComplexDatatypeObject {
    @NonNull
    private List<Dokumentasjon> dokumentasjon;
    @NonNull
    private Multiplisitet multiplisitet;
    @NonNull
    private String navn;
    @NonNull
    private String stereotype;
    @NonNull
    private String type;
}
