# FINT metamodell informasjonsmodeller for Java

[ ![Download](https://api.bintray.com/packages/fint/maven/fint-metamodell-model-java/images/download.svg) ](https://bintray.com/fint/maven/fint-metamodell-model-java/_latestVersion)

Inneholder metamodell informasjonsmodeller

Se informasjonsmodell dokumentasjonen for mer informasjon: [https://informasjonsmodell.felleskomponent.no](https://informasjonsmodell.felleskomponent.no)


## Snapshot tester

Testene er tilgjengelig i `ModelSpec`. De genererte json-filene vil lagres i `src/test/resources/snapshots`, disse skal sjekkes inn i git.

1. Kjør testen `Matches snapshots` for å verifisere at modellene fungerer med snapshot filene.
2. Kjør `Create snapshots` for å regenerere snapshot json-filene. Denne testen må kjøres med system property `CREATE_SNAPSHOTS=true`.