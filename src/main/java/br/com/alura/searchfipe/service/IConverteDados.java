package br.com.alura.searchfipe.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
