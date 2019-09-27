// Built from tag v1.0.0-rc-2

package no.fint.model.metamodell;

import java.util.Arrays;
import java.util.List;

public enum MetamodellActions {
	
	GET_KLASSE,
	GET_ALL_KLASSE,
	UPDATE_KLASSE,
	GET_KONTEKST,
	GET_ALL_KONTEKST,
	UPDATE_KONTEKST,
	GET_RELASJON,
	GET_ALL_RELASJON,
	UPDATE_RELASJON
	;


    /**
     * Gets a list of all enums as string
     *
     * @return A string list of all enums
     */
    public static List<String> getActions() {
        return Arrays.asList(
                Arrays.stream(MetamodellActions.class.getEnumConstants()).map(Enum::name).toArray(String[]::new)
        );
    }

}

