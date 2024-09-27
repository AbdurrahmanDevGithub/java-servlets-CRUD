package services;

import java.util.List;

public interface Service<T> {
	public boolean create(T t);
	public boolean update(int id,T t);
	public boolean delete(int id);
	public List<T> getAll();
	public T findById(int id);
}
