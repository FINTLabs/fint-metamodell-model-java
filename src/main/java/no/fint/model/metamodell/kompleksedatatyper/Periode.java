// Built from tag v0.2.0

package no.fint.model.metamodell.kompleksedatatyper;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import java.util.Date;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Periode implements FintComplexDatatypeObject {
    private String beskrivelse;
    private Date slutt;
    @NonNull
    private Date start;
}
