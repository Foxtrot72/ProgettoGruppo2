public class Cioccolatino extends Cioccolato{

    public String forma;
    public String ripieno;

    public Cioccolatino(String tipoCioccolato, float percentuale, int numeroCioccolatini, String forma, String ripieno) {
        super(tipoCioccolato, percentuale, numeroCioccolatini);
        this.forma=forma;
        this.ripieno=ripieno;
    }



}
