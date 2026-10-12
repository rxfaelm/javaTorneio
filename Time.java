package GerenciadorDeTorneios;

public class Time {
    private String nome;
    private int vitorias;
    private int derrotas;
    private int pontuacaoTotal;

    public Time(String nome) {
        this.nome = nome;
        this.vitorias = 0;
        this.derrotas = 0;
        this.pontuacaoTotal = 0;
    }

    public void registrarVitoria() {
        this.vitorias++;
        this.pontuacaoTotal += 3;
    }

    public void registrarDerrota() {
        this.derrotas++;
    }

    public String getNome() {
        return nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getPontuacaoTotal() {
        return pontuacaoTotal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Time: " + nome + " | Pontuação: " + pontuacaoTotal + " | Vitórias: " + vitorias + " | Derrotas: " + derrotas;
    }
}
