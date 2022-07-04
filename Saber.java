public class Saber extends Weapon{
    private String descricao;
    private int dano;

    public void slash(){
        System.out.println("Cortou!!");
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

}
