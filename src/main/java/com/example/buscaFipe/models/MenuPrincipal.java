package com.example.buscaFipe.models;

import com.example.buscaFipe.services.ConsumoApi;
import com.example.buscaFipe.services.ConversorDados;

import java.util.*;

public class MenuPrincipal {
    //Variaveis
    private final String ENDERECO = "https://parallelum.com.br/fipe/api/v1/"; //Endereço fixo do site da FIPE
    private ConsumoApi consumoAPI = new ConsumoApi(); //Instância da classe ConsumoApi
    public Scanner scanner = new Scanner(System.in); //Leitor
    public String categoriaVeic;
    public String nomeVeic;
    public String modeloVeic;
    String tipo;
    public ConversorDados conversorDados = new ConversorDados();
    //Código
    public void exibirMenu(){
        System.out.print
                ("""
                        ===============================================
                                         Busca na FIPE \n
                        1. Carros
                        2. Motos
                        3. Caminhões
                                       \n       
                        ===============================================                                                                     
                        """);
        categoriaVeic = scanner.next();
        var json = consumoAPI.devolverDados(ENDERECO + (categoriaVeic.replace(" ", "+").toLowerCase() + "/marcas"));
        var infoVeiculos = conversorDados.obterdados(json, InfoVeiculos[].class);
        Arrays.stream(infoVeiculos)
                .sorted(Comparator.comparing(InfoVeiculos::nome))
                .forEach(marca -> System.out.println(
                        "Cód: " + marca.codigo() + " | Nome: " + marca.nome()
                ));

    }
}
