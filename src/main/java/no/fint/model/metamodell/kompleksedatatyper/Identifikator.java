// Built from tag v1.0.0-rc-2

package no.fint.model.metamodell.kompleksedatatyper;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;
import no.novari.fint.model.FintComplexDatatypeObject;
import no.novari.fint.model.FintIdentifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Identifikator implements FintComplexDatatypeObject, FintIdentifikator {
    private @Valid Periode gyldighetsperiode;
    @NotBlank
    private String identifikatorverdi;
}
