// Built from tag master

package no.fint.model.metamodell;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.FintMainObject;
import no.fint.model.metamodell.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Pakke implements FintMainObject {
    public enum Relasjonsnavn {
            UNDERORDNET,
            KLASSE,
            OVERORDNET
    }

    @NonNull
    private Identifikator id;
    @NonNull
    private String navn;
    @NonNull
    private String stereotype;
}
