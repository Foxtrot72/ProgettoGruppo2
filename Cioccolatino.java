public class Cioccolatino extends Cioccolato{

    public String forma;
    public String ripieno;

    public Cioccolatino(String forma, String ripieno) {
        super(forma, ripieno);
    }

    @Override
    public void produce(){
        String info=""+forma+ ""+ ripieno;
        System.out.println(info);
    }

}
