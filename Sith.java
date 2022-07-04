import java.util.ArrayList;

public class Sith implements Force{
    private String nome;
    private String titulo;
    ArrayList<Weapon> weapon = new ArrayList<>(); 


    public Sith(){}

    public Sith(String nome, String titulo) {
        this.nome = nome;
        this.titulo = titulo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
 
    public ArrayList<Weapon> getWeapons() {
        return weapon;
    }

    public void setWeapons(ArrayList<Weapon> weapon) {
        this.weapon = weapon;
    }


    public void drop(Weapon arma){
        this.weapon.remove(arma);
    }

    public void pickUp(Weapon arma){
        this.weapon.add(arma);
    }

    @Override
    public void mindControl() {
        
    }
    @Override
    public void farseeing() {
        
    }
    @Override
    public void telepathy() {
      
    }
    @Override
    public void levitation() {
       System.out.println("Levitating Something");
    }
  
}
