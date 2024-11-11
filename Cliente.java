
public class Cliente {
    private String nome;
    private int nroContato;
    private Produto item;
    private boolean veiculo;

    public Cliente(String nome, int nroContato, Produto item, boolean veiculo) {
        this.nome = nome;
        this.nroContato = nroContato;
        this.item = item;
        this.veiculo= veiculo;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", nroContato=" + nroContato + ", item=" + item + "]";
    }

}
