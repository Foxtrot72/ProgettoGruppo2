public class Cioccolato {
    public String tipoCioccolato;
    public float percentuale;
    public int numeroCioccolato;

    public Cioccolato(String tipoCioccolato, float percentuale, int numeroCioccolato) {
        this.tipoCioccolato = tipoCioccolato;
        this.percentuale = percentuale;
        this.numeroCioccolato = 100;
    }

    public void produce() {
        String info = "" + this.tipoCioccolato + "" + this.percentuale;
        System.out.println(info);
    }

}
