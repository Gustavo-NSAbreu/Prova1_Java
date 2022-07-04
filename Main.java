public class Main {
    public static void main(String[] args) throws Exception {
        
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Leia");
        pessoa1.setSobrenome("Organa");
        pessoa1.setSexo("Feminino");

        Pessoa pessoa2 = new Pessoa("Luke", "Skywalker", "Masculino");
    
        Jedi jedi1 = new Jedi("Obi-Wan Kenbi", "Grand Master");

        Sith sith1 = new Sith("Darth Vader", "Lord");

        jedi1.mindControl();
        sith1.levitation();

        Saber sAzul = new Saber();
        Saber sVermelho = new Saber();
        Blast lazer = new Blast();

        sAzul.setDescricao("Sabre de luz azul.");
        sVermelho.setDescricao("Sabre de luz vermelho.");

        System.out.println("----------------------------------");

        sith1.pickUp(sVermelho);
        jedi1.pickUp(sAzul);
        jedi1.pickUp(lazer);
        System.out.println("----------------------------------");

        ((Saber) sith1.weapon.get(0)).slash();
        ((Blast) jedi1.weapon.get(1)).shot();

        jedi1.drop(lazer);
        System.out.println("----------------------------------");
        for(Weapon arma : sith1.getWeapons()){
            System.out.println("Armas de Vader: " + arma.getDescricao());
        }
        
        for(Weapon arma : jedi1.getWeapons()){
            System.out.println("Armas de Obi-Wan: " + arma.getDescricao());
        }
    }
}
