package br.com.teste.netshoes;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import br.com.teste.netshoes.entity.Pato;
import br.com.teste.netshoes.repository.PatoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TesteNetshoesApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class TestImportDataBase {
	private MockMvc mockMvc;
	@Autowired
	private WebApplicationContext wac;
	
	@Autowired
	PatoRepository repository;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}
	
	/**** Testes Para Inclusão ***/
	@Test
	 public void testVerificaCampoNaBase() throws Exception {
		List<Pato> result = repository.findAll();
		assertEquals(1, result.size());
		assertEquals("PATO_VEIO", ((Pato)result.get(0)).getNome());
	 }
	
	
}
