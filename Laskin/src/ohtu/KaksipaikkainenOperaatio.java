/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import javax.swing.JTextField;

/**
 *
 * @author emivo
 */
public abstract class KaksipaikkainenOperaatio extends Komento {

    protected JTextField syotekentta;

    public KaksipaikkainenOperaatio(Sovelluslogiikka sovellus, JTextField syotekentta) {
        super(sovellus);
        this.syotekentta = syotekentta;
    }

    @Override
    public void suorita() {
        super.suorita();
        int arvo = 0;
        try {
            arvo = Integer.parseInt(syotekentta.getText());
        } catch (Exception e) {
        }
        laske(arvo);
    }

    abstract void laske(int arvo);
}
