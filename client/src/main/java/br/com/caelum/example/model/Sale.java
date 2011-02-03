package br.com.caelum.example.model;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("sale")
public class Sale
{
       private Integer id;
       private Double ammount = new Double(0.0);
       private List<Item> items;

       public void sellItem(Item item)
       {
               getItems().add(item);
               ammount += item.getPrice();
       }
       private List<Item> getItems() {
           if(items==null) items = new ArrayList<Item>();
           return items;
       }

}