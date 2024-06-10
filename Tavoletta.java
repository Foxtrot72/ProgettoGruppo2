// ciao
public class Tavoletta extends Cioccolato {

    public double peso;
    public String aggiunte;

    public Tavoletta(String tipoCioccolato, float percentuale, int numeroCioccolato, double peso, String aggiunte) {
        super(tipoCioccolato, percentuale, numeroCioccolato);
        this.peso = peso;
        this.aggiunte = aggiunte;
    }

    @Override
    public void produce() {

    }

    public void produce(int scelta){

        switch (scelta) {
            case 1:
                System.out.println("Hai scelto la tavoletta composta da 4 cioccolatini");
                break;
        
            case 2:
                System.out.println("Hai scelto la tavoletta composta da 16 cioccolatini");
                break;

            case 3:
                System.out.println("Hai scelto la tavoletta composta da 24 cioccolatini");
                break;

            default:
                break;
        }
    }
    
}
