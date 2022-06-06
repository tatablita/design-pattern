package loja;

import java.math.BigDecimal;

public class TesteImpostos {

    public static void main(String[] args) {

	BigDecimal valor = new BigDecimal(100);
	CalculadoraDeImpostos calc = new CalculadoraDeImpostos();
	Orcamento o = new Orcamento(valor);
	
	System.out.println(calc.calcular(o, Tipo.ISS));

    }

}
