package client;

/**
 * Created by michael on 6/11/15.
 */
public class GiroKonto extends Konto {

    public GiroKonto(int kNr, Person inh){
        kontoNr = kNr;
        kontoStand = 0;
        inhaber = inh;
    }

}
