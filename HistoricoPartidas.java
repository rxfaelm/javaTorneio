package GerenciadorDeTorneios;

public class HistoricoPartidas {
    private Partida[] partidas;
    private int totalPartidas;
    private int capacidade;

    public HistoricoPartidas(int capacidade) {
        this.capacidade = capacidade;
        this.partidas = new Partida[capacidade];
        this.totalPartidas = 0;
    }

    public void adicionarPartida(Partida partida) {
        if (totalPartidas < capacidade) {
            partidas[totalPartidas] = partida;
            totalPartidas++;
        } else {
            System.out.println("Total de partidas incompatível.");
        }
    }

    public Partida[] buscarPartidasPorTime(String nomeTime) {
        int count = 0;
        for (int i = 0; i < totalPartidas; i++) {
            if (partidas[i].getTimeA().getNome().equalsIgnoreCase(nomeTime) || partidas[i].getTimeB().getNome().equalsIgnoreCase(nomeTime)) {
                count++;
            }
        }

        Partida[] resultado = new Partida[count];
        int idx = 0;
        for (int i = 0; i < totalPartidas; i++) {
            if (partidas[i].getTimeA().getNome().equalsIgnoreCase(nomeTime) || partidas[i].getTimeB().getNome().equalsIgnoreCase(nomeTime)) {
                resultado[idx] = partidas[i];
                idx++;
            }
        }
        return resultado;
    }

    public void exibirHistorico() {
        System.out.println("HISTÓRICO DE PARTIDAS");
        if (totalPartidas == 0) {
            System.out.println("Nenhuma partida encontrada.");
        } else {
            for (int i = 0; i < totalPartidas; i++) {
                System.out.println((i+1) + "."+partidas[i]);
            }
        }
    }
}