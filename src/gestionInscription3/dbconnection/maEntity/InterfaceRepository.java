package gestionInscription3.dbconnection.maEntity;

import java.sql.SQLException;
import java.util.List;

public interface InterfaceRepository <T> {

	public T create(T a) throws SQLException;
	public void delete(T a) throws SQLException;
	public List<T> findAll() throws SQLException;
	public T findOne(T a) throws SQLException;
	public boolean update(T a) throws SQLException;
}
