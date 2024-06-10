public class Cioccolato {
    public String tipoCioccolato;
    public  float percentuale;
    public int numerocioccolatini;
    public Cioccolato(String tipoCioccolato,float percentuale){
        this.tipoCioccolato=tipoCioccolato;
        this.percentuale=percentuale;
        this.numerocioccolatini=100;
    }

    public void produce(String tipoCioccolato, float percentuale ){
        String info=""+this.tipoCioccolato+ ""+this.percentuale;
        System.out.println(info);
    }

}
