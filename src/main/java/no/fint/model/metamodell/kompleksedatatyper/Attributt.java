// Built from tag v0.1.0

package no.fint.model.metamodell.kompleksedatatyper;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Attributt implements FintComplexDatatypeObject {
    @NonNull
    private String dokumentasjon;
    @NonNull
    private String multiplisitet;
    @NonNull
    private String navn;
    private Boolean skrivbar;
    @NonNull
    private String stereotype;
    @NonNull
    private String type;
}
