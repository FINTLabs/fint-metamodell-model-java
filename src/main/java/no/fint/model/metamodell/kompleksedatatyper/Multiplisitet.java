// Built from tag master

package no.fint.model.metamodell.kompleksedatatyper;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.FintComplexDatatypeObject;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Multiplisitet implements FintComplexDatatypeObject {
    @NonNull
    private String nedre;
    @NonNull
    private String ovre;
}
