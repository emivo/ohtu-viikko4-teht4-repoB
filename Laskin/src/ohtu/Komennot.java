/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author emivo
 */
public class Komennot {

    private Map<JButton, Komento> komennot;
    private JButton nollaa;
    private JButton undo;
    private Sovelluslogiikka sovellus;
    private Komento edellinen;

    public Komennot(Sovelluslogiikka sovellus, JTextField syotekentta, JButton plus, JButton miinus, JButton nollaa, JButton undo) {
        this.komennot = new HashMap<>();
        this.komennot.put(plus, new Plus(sovellus, syotekentta));
        this.komennot.put(miinus, new Miinus(sovellus, syotekentta));
        this.komennot.put(nollaa, new Nollaa(sovellus));
        this.nollaa = nollaa;
        this.undo = undo;
        undo.setEnabled(true);
        this.sovellus = sovellus;
        this.edellinen = null;
    }

    public void suoritaKomento(JButton nappi) {
        Komento komento = komennot.get(nappi);
        if (komento != null) {
            komento.suorita();
            edellinen = komento;
        } else {
            edellinen.peru();
            edellinen = null;
        }
        
        nollaa.setEnabled(sovellus.tulos() != 0);
        undo.setEnabled(edellinen!=null);
    }
}
