package com.biolab.ecommerce.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagamentoDTO {
    private Instant momento;
    private Long idPedido;

    public PagamentoDTO(Long idPedido) {
        this.idPedido = idPedido;
        this.momento = Instant.now();
    }
}
