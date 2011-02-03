package br.com.caelum.example.model;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("sale")
public class Sale 
{

	private Integer id;
	
	private Double ammount;
	
	private List<Item> items;
	
}