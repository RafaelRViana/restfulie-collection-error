package br.com.caelum.example.controller;

import br.com.caelum.example.model.Sale;
import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import static br.com.caelum.vraptor.view.Results.representation;

@Resource
public class SalesController {

	private final Result result;
	
	public SalesController(Result result)
	{
		this.result = result;
	}
	
	@Post
	@Consumes
	@Path("/sales")
	public void create(Sale sale) 
	{
		System.out.println(sale);
		result.use(representation()).from(sale).serialize(); 
	}
}