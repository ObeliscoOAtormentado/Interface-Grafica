public class Qqcoisa {

    private String ID, Nome;
    private float Salario;
    private boolean Sensivel;

    public Qqcoisa(String id, String nome, float salario, boolean sensivel){
        this.ID=id;
        this.Nome=nome;
        this.Salario=salario;
        this.Sensivel=sensivel;
    }

    public String toString(){
        return "{ ID="+this.ID+"; Nome=" +this.Nome+"; Salario="+this.Salario+"; Sensivel="+this.Sensivel+"}\n";
    }

}
