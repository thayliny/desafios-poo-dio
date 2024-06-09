package br.com.dio.desafio.dominio;
import java.time.LocalDate;

public class Mentorias extends Conteudo {

    LocalDate data; // Classe importante conhecer

    @Override
    public double caucularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentorias(){

    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentorias{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
