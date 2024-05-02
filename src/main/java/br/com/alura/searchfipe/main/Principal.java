package br.com.alura.searchfipe.main;

import br.com.alura.searchfipe.model.DadosMarcas;
import br.com.alura.searchfipe.service.ConsumoApi;
import br.com.alura.searchfipe.service.ConverteDados;

import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();

    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";

    public void exibeMenu(){
        System.out.println("Aplicação consulta tabela Fipe iniciando !!!");
        var menu = """
            *** OPÇÕES ***
            Carro
            Moto
            Caminhão
            
            Digite uma das opções para consulta:
            
            """;

        System.out.println(menu);
        var opcao = leitura.nextLine();
        String endereco;

        if (opcao.toLowerCase().contains("carr")) {
            endereco = URL_BASE + "carros/marcas";
        } else if (opcao.toLowerCase().contains("mot")) {
            endereco = URL_BASE + "motos/marcas";
        } else if (opcao.toLowerCase().contains("cami")){
            endereco = URL_BASE + "caminhoes/marcas";
        } else {
            endereco = URL_BASE;
            System.out.println("Por favor digite uma opção valida.");
        }

        var json = consumo.obterDados(endereco);
        System.out.println(json);

    }
}
