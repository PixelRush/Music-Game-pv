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
    
    ALT UNDER ER SKREVET AV KI.
    Det er bare for at folk skal forstå hva
    faen som skjer i programmet.
    
    -----------------------------------------
    🎧 LATENCY (FORSINKELSE)
    -----------------------------------------
    Hvis du spiller med headset (særlig trådløse), 
    kan det oppstå en forsinkelse mellom lyden 
    og det du ser på skjermen.
    
    VIKTIG: 
    Du kan justere dette manuelt i koden. Gå til 
    klassen 'GameStateData' og finn det statiske 
    feltet for latency. 
    
    * Negative verdier: Notene kommer tidligere.
    * Positive verdier: Notene kommer senere.
    * Høyttalere: Anbefales -100 på mine nivåer.
    * Egne nivåer: Sett til 0 hvis du bruker 
      samme lydkilde som da du lagde nivået.
    
    Beklager for at det er sånn, men jeg orker 
    ikke å lage et system for det.
    
    -----------------------------------------
    ⌨️ KEYBINDS
    -----------------------------------------
    Høyre hånd:  Q, W, E, R, V
    Venstre hånd: B, U, I, O, P
    
    -----------------------------------------
    🎮 OM SPILLET
    -----------------------------------------
    Dette er et musikk‑rytmespill inspirert av 
    Guitar Hero og Osu. Du kan legge til egne 
    sanger i MP3‑format og lage egne nivåer.
    
    * Kuler faller i takt med musikken.
    * Trykk på riktig tast når kulen treffer 
      linjen (gitarbåndet).
    * Poeng gis basert på timing og farge.
    
    -----------------------------------------
    🎹 LAGE EGNE NIVÅER
    -----------------------------------------
    Spill en sang og trykk på tastene mens 
    musikken går for å lage et nivå:
    
    1. Tastetrykk lagres automatisk i en .txt-fil.
    2. VIKTIG: Lag en ny .txt-fil manuelt hvis du 
       ikke vil overskrive tidligere nivåer.
    3. Filene kan importeres senere for å 
       generere nivået automatisk.
    
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