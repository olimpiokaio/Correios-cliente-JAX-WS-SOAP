package br.com.correios.soap;

import java.math.BigDecimal;
import java.util.List;

public class TesteClienteCorreios {
	
	public static void main (String args[]) {
		CalcPrecoPrazoWSSoap cliente = new CalcPrecoPrazoWS().getCalcPrecoPrazoWSSoap();
		
		String codigoSedex = "40010";
		String cepOrigemCaelumSP = "04101300"; // Caelum SP
		String cepDestino = "72236800"; // Ceilândia DF
		String peso3kg = "3";
		BigDecimal comprimento20cm = new BigDecimal(20);
		BigDecimal altura10cm = new BigDecimal(10);
		BigDecimal largura15cm = new BigDecimal(15);
		BigDecimal diametro10cm = new BigDecimal(10);
		int formatoEncomendaCaixa = 1; // 1 é caixa ou pacote
		BigDecimal semValorDeclarado = BigDecimal.ZERO;
		String semEntregueEmMaos = "N";
		String semAvisoRecebimento = "N";
		String semCodigoEmpresa = "";
		String semSenhaEmpresa = "";
		
		// fazendo a chamado do serviço
		CResultado resultado = cliente.calcPrecoPrazo(
				semCodigoEmpresa, semSenhaEmpresa, codigoSedex, cepOrigemCaelumSP, 
				cepDestino, peso3kg, formatoEncomendaCaixa, comprimento20cm, 
				altura10cm, largura15cm, diametro10cm, semEntregueEmMaos, 
				semValorDeclarado, semAvisoRecebimento);
		
		// recuperando resultado
		List<CServico> servicosPesquisados = resultado.getServicos().getCServico();
		String valorFrete = servicosPesquisados.get(0).getValor();
		
		System.out.printf("Frete para %s é de %s %n", cepDestino, valorFrete);
		
	}
	
}











