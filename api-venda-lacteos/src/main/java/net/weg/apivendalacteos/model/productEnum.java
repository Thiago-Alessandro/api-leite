package net.weg.apivendalacteos.model;


import lombok.AllArgsConstructor;
import org.hibernate.dialect.unique.CreateTableUniqueDelegate;

@AllArgsConstructor
public enum productEnum {

    LEITE_UHT("LEITE UHT"),
    LEITE_INTEGRAL("LEITE INTEGRAL"),
    LEITE_DESNATADO("LEITE DESNATADO"),
    LEITE_SEMIDESNATADO("LEITE SEMIDESNATADO"),
    QUEIJO_PRATO("QUEIJO PRATO"),
    CREME_DE_LEITE("CREME DE LEITE"),
    IOGURTE("IOGURTE");

    private final String name;
}