public class Qqcoisa {

    private String descricao;
    private float peso,volume, valor;
    private boolean sensivel;

   

    public Qqcoisa(String descricao, float peso, float volume, float valor, boolean sensivel) {
        this.descricao = descricao;
        this.peso = peso;
        this.volume = volume;
        this.valor = valor;
        this.sensivel = sensivel;
    }



    @Override
    public String toString() {
        return "Qqcoisa [Descricao=" + descricao + ", Peso=" + peso + ", Volume=" + volume + ", Valor aproximado da carga=" + valor
                + ", Sensivel ao calor=" + sensivel + "]";
    }



    



   



    
}
