package br.com.fundatec.carro.api.dto;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

public class ReservaInputDto {

    @NotBlank(message = "O campo nome é obrigatório!")
    private String nome;

    private LocalDate dataInicio;

    private LocalDate dataFim;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }
}
