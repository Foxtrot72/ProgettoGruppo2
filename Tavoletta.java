public class Tavoletta extends Cioccolato {
    private int peso;
    private boolean aggiunte;
    private String extra;

    public Tavoletta(int peso, boolean aggiunte) {
        this.peso = peso;
        this.aggiunte = aggiunte;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isAggiunte() {
        return aggiunte;
    }

    public void setAggiunte(boolean aggiunte) {
        this.aggiunte = aggiunte;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

}
