package br.com.loja.imposto;

import java.math.BigDecimal;

import br.com.loja.Orcamento;

public interface Imposto {
    
    BigDecimal calcular(Orcamento orcamento);

}
