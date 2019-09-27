// Built from tag master

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
import no.fint.model.metamodell.kompleksedatatyper.Attributt;
import no.fint.model.metamodell.kompleksedatatyper.Dokumentasjon;
import no.fint.model.metamodell.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class KlasseResource implements FintMainObject, FintLinks {
    // Attributes
    @NotNull
    private Boolean abstrakt;
    private List<@Valid Attributt> attributter;
    private List<@Valid Dokumentasjon> dokumentasjon;
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
    public List<Link> getRelasjon() {
        return getLinks().getOrDefault("relasjon", Collections.emptyList()); 
    }
    public void addRelasjon(Link link) {
        addLink("relasjon", link);
    }
    @JsonIgnore
    public List<Link> getKontekst() {
        return getLinks().getOrDefault("kontekst", Collections.emptyList()); 
    }
    public void addKontekst(Link link) {
        addLink("kontekst", link);
    }
    @JsonIgnore
    public List<Link> getArver() {
        return getLinks().getOrDefault("arver", Collections.emptyList()); 
    }
    public void addArver(Link link) {
        addLink("arver", link);
    }
}
