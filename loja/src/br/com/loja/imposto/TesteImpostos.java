package br.com.loja.imposto;

import java.math.BigDecimal;

import br.com.loja.Orcamento;

public class TesteImpostos {

    public static void main(String[] args) {

	BigDecimal valor = new BigDecimal(100);
	CalculadoraDeImpostos calc = new CalculadoraDeImpostos();
	Orcamento o = new Orcamento(valor);
	
	System.out.println(calc.calcular(o, new ISS()));

    }

}
