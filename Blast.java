public class Blast extends Weapon{

    private String descricao;
    private int dano;

    public void shot(){
        System.out.println("Atirou!!");
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