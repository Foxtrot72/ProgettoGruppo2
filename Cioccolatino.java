public class Cioccolatino extends Cioccolato{

    public String forma;
    public String ripieno;

    public Cioccolatino(String tipoCioccolato, float percentuale, int numerocioccolato, String forma, String ripieno) {
        super(tipoCioccolato, percentuale, numerocioccolato);
        this.forma=forma;
        this.ripieno=ripieno;
    }

    @Override
    public void produce(){
        this.numerocioccolatini-= 2;
        System.out.println("Numero di cioccolato rimanente: " + this.numerocioccolatini);
    }


}
