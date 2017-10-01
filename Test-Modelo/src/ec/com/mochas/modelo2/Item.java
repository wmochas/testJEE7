package ec.com.mochas.modelo2;

import java.util.HashSet;
import java.util.Set;

public class Item {

	private String name;
	private String description;
	private Set<Category> categories = new HashSet<Category>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Category> getCategories() {
		return categories;
	}
	
	//para validar y 
	public void addCategory(Category category){
		if(category==null){
			throw new IllegalArgumentException("Null category");
		}
		category.getItems().add(this);
		categories.add(category);		
	}

}
