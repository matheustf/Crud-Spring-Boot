package br.com.teste.netshoes;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.google.gson.Gson;

import br.com.teste.netshoes.entity.Endereco;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TesteNetshoesApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class TestBuscaCep {
	private MockMvc mockMvc;
	@Autowired
	private WebApplicationContext wac;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	@Test
	 public void testBuscarCepDePrimeira() throws Exception {
	        Endereco vo = new Endereco();
	        vo.setCep("09951380");
	        Gson gson = new Gson();
	        String json = gson.toJson(vo);
	        
	        this.mockMvc.perform(get("/buscarCepJson")
	        		.contentType(MediaType.APPLICATION_JSON)
	        		.content(json))
	            .andExpect(status().isOk())
	            .andExpect(jsonPath("$.cep", is("09951380")));
	 }
	
	@Test
	 public void testBuscarCepVariasTentativasColocando0ECepNaoEncontrado() throws Exception {
	        Endereco vo = new Endereco();
	        vo.setCep("11111111");
	        Gson gson = new Gson();
	        String json = gson.toJson(vo);
	        
	        this.mockMvc.perform(get("/buscarCepJson")
	        		.contentType(MediaType.APPLICATION_JSON)
	        		.content(json))
	            .andExpect(status().isInternalServerError());
	    }
	
	@Test
	 public void testBuscarCepVariasTentativasColocando0() throws Exception {
	        Endereco vo = new Endereco();
	        vo.setCep("09951385");
	        Gson gson = new Gson();
	        String json = gson.toJson(vo);
	        
	        this.mockMvc.perform(get("/buscarCepJson")
	        		.contentType(MediaType.APPLICATION_JSON)
	        		.content(json))
	            .andExpect(status().isOk())
	            .andExpect(jsonPath("$.cep" , is("09951380")));
	    }
	
	@Test
	 public void testBuscarCepInvalidoException() throws Exception {
	        Endereco vo = new Endereco();
	        vo.setCep("023");
	        Gson gson = new Gson();
	        String json = gson.toJson(vo);
	        
	        this.mockMvc.perform(get("/buscarCepJson")
	        		.contentType(MediaType.APPLICATION_JSON)
	        		.content(json))
	            	.andExpect(status().isInternalServerError());
	 }
	
	@Test
	 public void testBuscarCepVazioException() throws Exception {
	        Endereco vo = new Endereco();
	        vo.setCep("");
	        Gson gson = new Gson();
	        String json = gson.toJson(vo);
	        
	        this.mockMvc.perform(get("/buscarCepJson")
	        		.contentType(MediaType.APPLICATION_JSON)
	        		.content(json))
	            .andExpect(status().isInternalServerError());
	    }
}
