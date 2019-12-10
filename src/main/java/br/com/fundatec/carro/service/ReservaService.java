package br.com.fundatec.carro.service;

import br.com.fundatec.carro.model.Reserva;
import br.com.fundatec.carro.repository.ReservaRepository;
import org.springframework.stereotype.Service;

@Service
public class ReservaService {

    private final CarroService carroService;
    private final ReservaRepository reservaRepository;

    public ReservaService(CarroService carroService, ReservaRepository reservaRepository) {
        this.carroService = carroService;
        this.reservaRepository = reservaRepository;
    }

    private void validar (Reserva reserva) {
        if (reserva.getDataFim().isBefore(reserva.getDataInicio())) {
            throw new RuntimeException("Data do fim da reserva não pode ser antes da de início");
        }
    }

   {

    }
}
