public class Cioccolato {
    public String tipoCioccolato;
    public  float percentuale;
    public Cioccolato(String tipoCioccolato,float percentuale){
        this.tipoCioccolato=tipoCioccolato;
        this.percentuale=percentuale;
    }

    public void produce(String tipoCioccolato, float percentuale ){
        String info=""+this.tipoCioccolato+ ""+this.percentuale;
        System.out.println(info);
    }

}
