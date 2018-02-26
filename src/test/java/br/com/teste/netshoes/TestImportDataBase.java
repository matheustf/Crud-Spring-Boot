package br.com.teste.netshoes;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.google.gson.Gson;

import br.com.teste.netshoes.entity.Endereco;
import br.com.teste.netshoes.repository.EnderecoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TesteNetshoesApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class TestImportDataBase {
	private MockMvc mockMvc;
	@Autowired
	private WebApplicationContext wac;
	
	@Autowired
	DinossauroRepository repository;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}
	
	/**** Testes Para Inclusão ***/
	@Test
	 public void testVerificaCampoNaBase() throws Exception {
		List<Dinossauro> result = repository.findAll();
		assertEquals(1, result.size());
		assertEquals("PATO_VEIO", ((Dinossauro)result.get(0)).getNome());
	 }
	
	
}
