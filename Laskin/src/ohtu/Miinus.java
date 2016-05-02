
package ohtu;

import javax.swing.JTextField;

/**
 *
 * @author emivo
 */
public class Miinus extends KaksipaikkainenOperaatio {

    public Miinus(Sovelluslogiikka sovellus, JTextField syotekentta) {
        super(sovellus, syotekentta);
    }
    
    @Override
    void laske(int arvo) {
        sovellus.miinus(arvo);
    }
}
