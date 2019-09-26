// Built from tag master

package no.fint.model.resource.metamodell;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import no.fint.model.FintMainObject;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;
import no.fint.model.metamodell.kompleksedatatyper.Dokumentasjon;
import no.fint.model.metamodell.kompleksedatatyper.Identifikator;
import no.fint.model.metamodell.kompleksedatatyper.Multiplisitet;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class RelasjonResource implements FintMainObject, FintLinks {
    // Attributes
    @NonNull
    private List<Dokumentasjon> dokumentasjon;
    @NonNull
    private Identifikator id;
    @NonNull
    private List<Multiplisitet> multiplisitet;
    @NonNull
    private String navn;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    @JsonIgnore
    public List<Link> getKilde() {
        return getLinks().getOrDefault("kilde", Collections.emptyList()); 
    }
    public void addKilde(Link link) {
        addLink("kilde", link);
    }
    @JsonIgnore
    public List<Link> getMal() {
        return getLinks().getOrDefault("mal", Collections.emptyList()); 
    }
    public void addMal(Link link) {
        addLink("mal", link);
    }
}
