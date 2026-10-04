package don.vo;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class TutorialController {
    private final String helpText = """
    =========================================
                 DONS MUSIKKSPILL :)
    =========================================
    
    Her er en liten guide delvis skrevet med KI. Hovedfokuset har vært på å lage fungerende kode og lære JavaFX. 
    Beklager for noe mangelfullt/dårlig UI!
    
    VIKTIG:
      - Keybinds finner du under og kan endres dersom du har tilgang til koden.
      - Dersom du bruker Linux, må du kanskje laste ned ekstra ting
        for at JavaFX MediaPlayer skal fungere.
      - Ikke alle nivåer har blitt laget enda. Noen sanger har derfor ingen 
        noter som går nedover skjermen.

    EKSEMPLER PÅ SANGER MED FORHÅNDSLAGDE NIVÅER:
    - APT
    - Level Complete
    - Super Mario Bros
    - Gravity Falls

    -----------------------------------------
    ⌨️ KEYBINDS
    -----------------------------------------
    Venstre hånd:  Q, W, E, R, V
    Høyre hånd  :  B, U, I, O, P

    Tips: Posisjonen på tastaturet speiler rekkefølgen på skjermen:
    Q – W – E – R – V  |  B – U – I – O – P
    (Venstre mot høyre: Spor/Kule 0 til 9)

    -----------------------------------------
    🎮 OM SPILLET
    -----------------------------------------
    Dette er et musikk‑rytmespill inspirert av Guitar Hero og Osu. Du kan legge til egne sanger i MP3‑format og lage egne nivåer.
    
    * Kuler faller i takt med musikken.
    * Trykk på riktig tast når kulen treffer linjen (gitarbåndet).
    * Poeng gis basert på timing og farge.

    1. For å velge sang må du trykke på sangtittelen. Sangen du nå har valgt står til høyre.
    2. Trykk "Play" dersom du skal spille sangen, eller "Record" dersom du skal lage et nivå knyttet til sangen.
    3. Velg et nivå knyttet til sangen og deretter "Play". Trykket du på "Record", overskriver du nivået dersom det ikke er tomt.
    4. Trykk på "Play" igjen for å begynne.
    5. Husk å åpne vinduet i fullskjerm!

    -----------------------------------------
    🎧 LATENCY (FORSINKELSE)
    -----------------------------------------
    Hvis du spiller med headset (særlig trådløse), kan det oppstå en forsinkelse mellom lyden og skjermen.
    
    Hvis du har tilgang til koden, kan du justere dette i klassen 'GameStateData' (statisk felt for latency):
    * Negative verdier: Notene kommer tidligere.
    * Positive verdier: Notene kommer senere.
    * Høyttalere: Anbefales -100 på mine nivåer.
    * Egne nivåer: Sett til 0 hvis du bruker samme lydkilde som da du lagde nivået.

    -----------------------------------------
    🎹 LAGE EGNE NIVÅER
    -----------------------------------------
    Spill en sang og trykk på tastene mens musikken går for å lage et nivå:
    
    1. Tastetrykk lagres automatisk i en .txt-fil.
    2. VIKTIG: Du må manuelt opprette en ny .txt-fil hvis du ikke vil overskrive tidligere nivåer.
    3. Filnavnet MÅ inneholde sangtittelen (f.eks. for sangen "Baby", kan filen hete "Baby 1.txt").

    =========================================
    Lykke til!
    """;

    @FXML private TextArea helpTextArea;

    @FXML
    public void initialize() {
        helpTextArea.setText(helpText);
        helpTextArea.setStyle("-fx-font-family: 'Consolas'; -fx-font-size: 18px;");    }

    @FXML
    private void handleBack(ActionEvent event) throws IOException {
        App.setRoot("lobby");
    }
}