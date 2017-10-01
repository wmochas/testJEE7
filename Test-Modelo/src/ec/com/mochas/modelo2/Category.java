package ec.com.mochas.modelo2;

import java.util.HashSet;
import java.util.Set;

public class Category {
	private String name;
	private Category parentCategory;
	private Set<Category> childCategories = new HashSet<Category>();
	private Set<Item> items = new HashSet<Item>();

	public String getName() {
		return name;
	}

	public void addChildCategory(Category childCategory) {
		if (childCategory == null) {
			throw new IllegalArgumentException("Null child category!");
		}
		if (childCategory.getParentCategory() != null) {
			childCategory.getParentCategory().getChildCategories().remove(childCategory);
		}
		childCategory.setParentCategory(this);
		childCategories.add(childCategory);
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}

	public Set<Category> getChildCategories() {
		return childCategories;
	}

	public void setChildCategories(Set<Category> childCategories) {
		this.childCategories = childCategories;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

}
