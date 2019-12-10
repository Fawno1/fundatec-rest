package br.com.fundatec.carro.api.dto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservaApi {

    @PostMapping("/carros/{id}/reservas")
    public ResponseEntity<?> incluirReserva() {

    }
}
