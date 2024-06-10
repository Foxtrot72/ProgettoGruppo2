public class Cioccolatino extends Cioccolato{

    public String forma;
    public String ripieno;

    public Cioccolatino(String tipoCioccolato, float percentuale, int numeroCioccolato, String forma, String ripieno) {
        super(tipoCioccolato, percentuale, numeroCioccolato);
        this.forma=forma;
        this.ripieno=ripieno;
    }

    @Override
    public void produce(){

        this.numeroCioccolato-= 2;
        System.out.println("Numero di cioccolato rimanente: " + this.numeroCioccolato);
        this.numeroCioccolato-= 2;
        System.out.println("Numero di cioccolato rimanente: " + this.numeroCioccolato);

        this.numeroCioccolato-= 2;
        System.out.println("Numero di cioccolato rimanente: " + this.numeroCioccolato);

    }


}
