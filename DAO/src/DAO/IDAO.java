package DAO;

import java.util.List;


public interface IDAO <T> {
	//Typage Generique
	
	public void create(T object);
	public List<T> read();
	public void update(T object);
	public void delete(T object);
	public void findById(T object);
	
}
