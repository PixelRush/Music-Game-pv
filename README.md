# Dons musikkspill :)

> **Merk:** Denne readme-filen ble lagt til etter at prosjektet var ferdig og fungerer som en rask guide slik at andre kan prøve spillet. Teksten på readme-filen er derfor formatert med KI. Kontrollene kan være noe knotete da fokuset har vært på å lage et fungerende program og å lære JavaFX. Beklager for noe mangelfullt/dårlig UI!
> 
> For å kjøre koden kan du kjøre `mvn javafx:run` i terminalen fra rotmappen til prosjektet.

---

## ⚠️ Viktige merknader

* **Linux-brukere:** Dersom du kjører spillet på Linux, må du muligens installere ekstra mediepakker (som gstreamer/libav) for at `JavaFX MediaPlayer` skal fungere og avspille lyd.
* **Mangel på noter på enkelte sanger:** Ikke alle nivåer er ferdigprodusert ennå. Noen sanger vil derfor ikke ha noen fallende noter på skjermen.

---

## 🎧 Latency (Forsinkelse)

> [!IMPORTANT]
> Hvis du spiller med headset (særlig trådløse), kan det oppstå en forsinkelse mellom lyden og det du ser på skjermen. Det anbefales å bruke **høyttalere eller headset med lav latency**.
> 
> Du kan eventuelt justere dette manuelt i koden: Gå til klassen `GameStateData` og finn det statiske feltet for **latency**. Endre verdien her for å synkronisere lyden:
> 
> * **Negative verdier:** Notene kommer tidligere.
> * **Positive verdier:** Notene kommer senere.
> * **Høyttalere:** Det anbefales **-100** på nivåene som er forhåndslaget av meg.
> * **Egne nivåer:** Du kan sette latency til **0** dersom du bruker samme lydkilde når du spiller som da du lagde nivået.

---

## ⌨️ Keybinds

Keybinds finner du i tabellen under. Disse kan også endres direkte i kildekoden, men jeg har ikke testet dette enda. 

| Hånd | Taster |
| :--- | :--- |
| **Venstre hånd** | `Q`, `W`, `E`, `R`, `V` |
| **Høyre hånd** | `B`, `U`, `I`, `O`, `P` |

> **Tips:** Posisjonen på tastaturet speiler rekkefølgen på skjermen:  
> `Q` – `W` – `E` – `R` – `V`  |  `B` – `U` – `I` – `O` – `P`  
> *(Venstre mot høyre: Spor 0 til 9)*

---

## 🎮 Om spillet

Dette er et musikk‑rytmespill inspirert av **Guitar Hero** og **Osu**. Brukeren kan legge til egne sanger i **MP3‑format** og lage nivåer basert på disse. 

* Under spillingen faller kuler i ulike farger nedover skjermen i takt med musikken. 
* For å få poeng må spilleren trykke på riktig tast til riktig tid, avhengig av kulens farge og posisjon.
* Kulene beveger seg ned mot en linje med fargede, statiske kuler som representerer et gitarbånd. 
* Når en fallende kule ligger over riktig posisjon på båndet, må spilleren trykke på tilsvarende tast.

### Hvordan starte et spill:
1. Trykk på sangtittelen for å velge sang (valgt sang vises til høyre). 
2. Trykk **Play** dersom du skal spille sangen, eller **Record** dersom du skal lage et nivå knyttet til sangen du har valgt. 
3. Velg et nivå knyttet til sangen og trykk deretter **Play**. (Trykket du på **Record** i forrige trinn, vil du overskrive nivået du har valgt dersom det ikke er tomt). 
4. Trykk på **Play** igjen for å begynne. 
5. Husk å åpne vinduet i fullskjerm!

### 🎵 Sanger med forhåndslagde nivåer:
Siden ikke alle sanger har ferdige nivåer ennå, kan du prøve en av disse som har fungerende noter:
* **APT**
* **Level Complete**
* **Super Mario Bros**
* **Gravity Falls**

---

## 🎹 Lage egne nivåer

Spilleren kan lage egne nivåer ved å trykke på **Record** i stedet for **Play** når en sang har blitt valgt. 

* Programmet registrerer tastetrykkene og lagrer dem i en tekstfil. 
* **Viktig:** Du må manuelt opprette en ny `.txt`-fil dersom du ikke ønsker å overskrive et nivå du allerede har mappet tidligere. Denne tekstfilen må inneholde tittelen på sangen i filnavnet. For eksempel: Hvis sangen heter "Baby", må `.txt`-filen inneholde strengen "Baby" (f.eks. `Baby 1.txt`).