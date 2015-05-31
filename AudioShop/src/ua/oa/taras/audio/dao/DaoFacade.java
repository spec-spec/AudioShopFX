package ua.oa.taras.audio.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import ua.oa.taras.audio.data.Album;
import ua.oa.taras.audio.data.Genre;

public class DaoFacade {

	
	private Connection connection;
	private AlbumDao albumDao;
	private AlbumDaoSql albumDaoSql;
	private GenreDao genreDao = new GenreDao();
	private Statement statement;


	public DaoFacade() {
		try {
//	        connection = DriverManager.getConnection("jdbc:sqlite:test.db");
	        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/audio","root","toor");
		} catch (SQLException e) {
				e.printStackTrace();
			}
		if(connection==null){
			System.exit(1);
		}
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
//		albumDao = new AlbumDao(statement, connection);
		albumDaoSql = new AlbumDaoSql(statement, connection);
		
	}
	public AbstractDao<Album> getAlbumDao() {
		return albumDao;
	}

	public AbstractDao<Genre> getGenreDao() {
		return genreDao;
	}
	public AlbumDaoSql getAlbumDaoSql() {
		return albumDaoSql;
	}
	public void closeSqlConnection(){
		if(statement!=null){
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(connection!= null){
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
