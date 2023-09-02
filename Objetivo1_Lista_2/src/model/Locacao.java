package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Locacao {

    private int id;
    private LocalDate dataLocacao;
    private LocalTime horaLocacao;
    private LocalDate DataDevolucao;
    private LocalTime horaDevolucao;
    private int quilometragem;
    private double valor_calcao;
    private double valor_locacao;
    private boolean devolvido;

    public Locacao() {
    }

    public Locacao(int id, LocalDate dataLocacao, LocalTime horaLocacao, LocalDate dataDevolucao, LocalTime horaDevolucao, int quilometragem, double valor_calcao, double valor_locacao, boolean devolvido) {
        this.id = id;
        this.dataLocacao = dataLocacao;
        this.horaLocacao = horaLocacao;
        DataDevolucao = dataDevolucao;
        this.horaDevolucao = horaDevolucao;
        this.quilometragem = quilometragem;
        this.valor_calcao = valor_calcao;
        this.valor_locacao = valor_locacao;
        this.devolvido = devolvido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LocalTime getHoraLocacao() {
        return horaLocacao;
    }

    public void setHoraLocacao(LocalTime horaLocacao) {
        this.horaLocacao = horaLocacao;
    }

    public LocalDate getDataDevolucao() {
        return DataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        DataDevolucao = dataDevolucao;
    }

    public LocalTime getHoraDevolucao() {
        return horaDevolucao;
    }

    public void setHoraDevolucao(LocalTime horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getValor_calcao() {
        return valor_calcao;
    }

    public void setValor_calcao(double valor_calcao) {
        this.valor_calcao = valor_calcao;
    }

    public double getValor_locacao() {
        return valor_locacao;
    }

    public void setValor_locacao(double valor_locacao) {
        this.valor_locacao = valor_locacao;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    @Override
    public String toString() {
        return "Locacao{" +
                "id=" + id +
                ", dataLocacao=" + dataLocacao +
                ", horaLocacao=" + horaLocacao +
                ", DataDevolucao=" + DataDevolucao +
                ", horaDevolucao=" + horaDevolucao +
                ", quilometragem=" + quilometragem +
                ", valor_calcao=" + valor_calcao +
                ", valor_locacao=" + valor_locacao +
                ", devolvido=" + devolvido +
                '}';
    }
}




