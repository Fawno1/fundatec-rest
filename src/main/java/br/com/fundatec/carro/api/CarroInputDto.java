package br.com.fundatec.carro.api;

import javax.validation.constraints.*;
import java.time.LocalDate;

public class CarroInputDto {

    @NotBlank(message = "O campo nome é obrigatório, gurizão.")
    private String nome;
    @Pattern(regexp = "^[A-Z]{3}[0-9]{4}$", message = "Placa inválida")
    @NotBlank(message = "O campo placa é obrigatório, meu confederado.")
    private String placa;

    @Past(message = "Data de fabricação deve ser no passado!")
    @NotNull(message = "O campo data de fabricação é obrigatório!")
    private LocalDate dataFabricacao;

    private LocalDate dataModelo;

    @NotEmpty(message = "O campo de marca é obrigatório!")
    private String marca;

    private LocalDate dataInicio;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataModelo() {
        return dataModelo;
    }

    public void setDataModelo(LocalDate dataModelo) {
        this.dataModelo = dataModelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
