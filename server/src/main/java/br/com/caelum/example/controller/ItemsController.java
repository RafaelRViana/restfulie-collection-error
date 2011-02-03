package br.com.caelum.example.controller;

import static br.com.caelum.vraptor.view.Results.representation;
import static br.com.caelum.vraptor.view.Results.status;

import java.util.List;

import br.com.caelum.example.infra.Database;
import br.com.caelum.example.model.Item;
import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class ItemsController {

	private final Database database;
	private final Result result;

	public ItemsController(Database database, Result result) {
		this.database = database;
		this.result = result;
	}

	@Get
	@Path("/items")
	public void list() {
		List<Item> list = database.lista();
		result.use(representation()).from(list, "items").serialize();
	}

	@Get
	@Path("/items/{id}")
	public void show(int id) {
		Item item = database.get(id);
		result.use(representation()).from(item).serialize();
	}

	@Post
	@Consumes
	@Path("/items")
	public void create(Item item) 
	{
		result.use(representation()).from(item).serialize();
	}
}
