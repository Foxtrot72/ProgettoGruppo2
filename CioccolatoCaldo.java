public class CioccolatoCaldo extends Cioccolato {
    public float temperatura;
    public String densità;

    public CioccolatoCaldo(String tipoCioccolato, float percentuale, int numeroCioccolato) {
        super(tipoCioccolato, percentuale, numeroCioccolato);
        this.densità = "Molto denso";
        this.temperatura = 69;
        System.out.println("" + this.densità + "" + this.temperatura);
    }

}