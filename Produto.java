public class Produto {

    private String descricao;
    private float peso,volume, valor;
    private boolean sensivel,urgente;


    public Produto(String descricao, float peso, float volume, float valor, boolean sensivel,boolean urgente) {
        this.descricao = descricao;
        this.peso = peso;
        this.volume = volume;
        this.valor = valor;
        this.sensivel = sensivel;
        this.urgente=urgente;
    }



    @Override
    public String toString() {
        return "Qqcoisa [Descricao=" + descricao + ", Peso=" + peso + ", Volume=" + volume + ", Valor=" + valor
                + ", Sensivel=" + sensivel + ", Urgente=" + urgente + "]";
    }

}
