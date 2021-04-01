package DAO;

public interface IDAO <T> {
	//Typage Generique
	public void create(T object);
	public void read(T object);
	public void update(T object);
	public void delete(T object);
	public void findById(T object);
	
}
