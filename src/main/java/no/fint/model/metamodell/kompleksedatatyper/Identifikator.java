// Built from tag master

package no.fint.model.metamodell.kompleksedatatyper;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.FintComplexDatatypeObject;
import no.fint.model.metamodell.kompleksedatatyper.Periode;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Identifikator implements FintComplexDatatypeObject {
    private Periode gyldighetsperiode;
    @NonNull
    private String identifikatorverdi;
}
