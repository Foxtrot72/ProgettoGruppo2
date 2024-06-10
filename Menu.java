public class Menu{
    int scelta;
    public Menu(int scelta){
        this.scelta=scelta;
    }
    public String sceltaMenu(){
        switch (this.scelta) {
            case 1:
                System.out.println("Cioccolatino");
                Cioccolatino cioccolatino=new Cioccolatino("",10 , 100, "Culo", "Nero");
                cioccolatino.tipoCioccolato="banana";
                cioccolatino.produce();
                System.out.println();

                break;
        
            case 2:

                break;

            case 3:

                break;
        }
        return "Ciao";
    }
}
