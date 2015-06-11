package client;

/**
 * Created by michael on 6/11/15.
 */
public class SparKonto extends Konto {

    public SparKonto(int kNr, Person inh){
        kontoNr = kNr;
        kontoStand = 0;
        inhaber = inh;
    }

}
