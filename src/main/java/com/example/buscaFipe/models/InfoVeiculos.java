package com.example.buscaFipe.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public record InfoVeiculos(@JsonAlias("codigo") String codigo,
                           @JsonAlias("nome") String nome,
                           @JsonAlias("marca") String marca,
                           @JsonAlias("modelo") String modelo,
                           @JsonAlias("ano") Integer AnoModelo) {
}
