package lambdas_secao;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
  public static void main(String[] args) {
    
    Function<Produto, Double> precoFinal = prod -> prod.preco * (1 - prod.desconto); 
		UnaryOperator<Double> impostoMunicipal = 
				valor -> valor >= 2500 ? valor *1.085 : valor;
		UnaryOperator<Double> frete = valor -> valor >= 3000 ? valor + 100 : valor + 50;
		
		UnaryOperator<Double> arredonda = valor -> Double.parseDouble(String.format("%.2f", valor));
		
		Function<Double, String> precoFormat = valor -> ("R$"+valor);
		
    Produto p = new Produto("iPad", 3235.89, 0.13);
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredonda)
				.andThen(precoFormat)
				.apply(p);
		System.out.println(preco);
		
		Function<Double, String> arredondar = precoTeste -> String
				.valueOf(String.format("%.2f", precoTeste))
				.replace(".", ",");
		UnaryOperator<String> formatar = precoTeste -> "R$" + precoTeste;
		
		String preco2 = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		System.out.println(preco2);
  }
}
