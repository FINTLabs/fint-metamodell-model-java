// Built from tag v1.0.0-rc-2

package no.fint.model.resource.metamodell;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

import no.fint.model.FintMainObject;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;
import no.fint.model.metamodell.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class KontekstResource implements FintMainObject, FintLinks {
    // Attributes
    @NotNull
    private @Valid Identifikator id;
    @NotBlank
    private String navn;
    @NotBlank
    private String stereotype;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    @JsonIgnore
    public List<Link> getUnderordnet() {
        return getLinks().getOrDefault("underordnet", Collections.emptyList()); 
    }
    public void addUnderordnet(Link link) {
        addLink("underordnet", link);
    }
    @JsonIgnore
    public List<Link> getKlasse() {
        return getLinks().getOrDefault("klasse", Collections.emptyList()); 
    }
    public void addKlasse(Link link) {
        addLink("klasse", link);
    }
    @JsonIgnore
    public List<Link> getOverordnet() {
        return getLinks().getOrDefault("overordnet", Collections.emptyList()); 
    }
    public void addOverordnet(Link link) {
        addLink("overordnet", link);
    }
}
