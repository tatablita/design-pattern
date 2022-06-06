package loja;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, Tipo tipoImposto) {

	switch (tipoImposto) {
	case ICMS:
	    return orcamento.getValor().multiply(new BigDecimal("0.1"));
	case ISS:
	    return orcamento.getValor().multiply(new BigDecimal("0.06"));
	default:
	    return BigDecimal.ZERO;
	}
    }

}
