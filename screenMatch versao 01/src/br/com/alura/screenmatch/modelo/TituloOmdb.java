package br.com.alura.screenmatch.modelo;

/*
Classe imutável, contendo apenas atributos, construtor e
métodos de leitura
Uma classe imutável significa que uma vez criado um objeto dessas classe,
não é possível modificar o seu estado.
Por debaixo dos panos esse Record já tem um contrutor padrão,
os getter e setter e métodos de leitura, só definindo os atributos da classe
 */
public record TituloOmdb(String title, String year, String runtime) {
}
