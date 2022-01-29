package be.ce.wcaquino.servicos;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.servicos.LocacaoService;
import br.ce.wcaquino.utils.DataUtils;

public class LocacaoServiceTest {
	@Test
	public void testLocacao() {
		LocacaoService locacaoService = new LocacaoService();
		Usuario usuario = new Usuario("Gabriel");
		Filme filme = new Filme("A busca dos que nunca foram", 2, 5.0);

		Locacao locacao = locacaoService.alugarFilme(usuario, filme);

		Assert.assertFalse(locacao.getValor() == 4);
		Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
		Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));
	}
	
	@Test
	public void test() {
		LocacaoService locacaoService = new LocacaoService();
		Usuario usuario = new Usuario("Gabriel");
		Filme filme = new Filme("As longas transas de um careca", 3, 6.0);

		Locacao locacao = locacaoService.alugarFilme(usuario, filme);

		Assert.assertNotNull(locacao.getValor() == 4);
		Assert.assertNotEquals(locacao.getValor(), 4, 0.01);
		Assert.assertEquals(locacao.getValor(), 6, 0.01);
	}
}
