package com.example.buscaFipe.services;

public interface IConversorDados {
    <t> t obterdados(String json, Class<t> classe);
}
