package br.com.fundatec.carro.mapper;

import br.com.fundatec.carro.api.dto.ReservaOutputDto;
import br.com.fundatec.carro.model.Reserva;
import org.springframework.stereotype.Component;

@Component
public class ReservaMapper {

    public ReservaOutputDto mapear(Reserva reserva) {
        ReservaOutputDto reservaOutputDto = new ReservaOutputDto();
        reservaOutputDto.setNome(reserva.getNome());
        reservaOutputDto.setDataInicio(reserva.getDataInicio());
        reservaOutputDto.setDataFim(reserva.getDataFim());


        return reservaOutputDto;
    }


}
