package com.github.beltraliny.classes;/*
    Uma classe record é imutável, disponível a partir do Java 16 (17 lts)
*/

// Os atributos vão no cabeçalho
public record ClasseRecord(String stringType, int intType) {

    // Caso seja necessário a validação de algum parametro, o construtor é declarado de forma simplificada:
    public ClasseRecord {
        if (intType < 0) throw new IllegalArgumentException("Negative numbers are not allowed");
        // Não é necessário atribuir os parâmetros às variáveis de instância: this.intType = intType
    }

    // É possível implementar qualquer método de instância desde que ele não altere os valores iniciais
    public String format() {
        // Os getters são gerados automaticamente, mas perdem o prefixo get
        return String.format("%s : %d", stringType(), intType());
    }
}
