package br.com.fundatec.carro.service;

import br.com.fundatec.carro.model.Carro;
import br.com.fundatec.carro.repository.CarroRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CarroService {

    private final CarroRepository carroRepository;

    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    public List<Carro> listarCarros(String nome) {
        return carroRepository.listarCarros(nome);
    }

    public Carro consultur(Long id) {
        return carroRepository.consultar(id);
    }

    public Carro incluir(Carro carro) {

        validar(carro);
        return carroRepository.incluir(carro);
    }

    private void validar(Carro carro) {
        if (carro.getDataFabricacao().isAfter(carro.getDataModelo())) {
            throw new RuntimeException("Data de fabricação não pode" + "ser maior do que o modelo");

        }

        List<String> marcasValidas = Arrays.asList("Fiat", "Ford", "VolksWagen", "Renault", "JackMotors");
        if (!marcasValidas.contains(carro.getMarca())) {
            throw new RuntimeException("A Marca " + carro.getMarca() + " é inválida.");
        }
    }
    }