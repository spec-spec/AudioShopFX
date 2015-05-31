package ua.oa.taras.audio;

import java.util.List;

import ua.oa.taras.audio.dao.DaoFacade;
import ua.oa.taras.audio.data.Album;

public class AudioShopJDBC {

	public static void main(String[] args) {
		DaoFacade facade = new DaoFacade();

		Album item = new Album(1, "TTT1", 1999);
		facade.getAlbumDaoSql().add(item);
		List<Album> albums = facade.getAlbumDaoSql().loadAll();
		for (Album album : albums) {
			System.out.println(album);
		}

		//
		// System.out.println("-->" +facade.getAlbumDao().findById(4));
		//
		// facade.getAlbumDao().addAll(albumsNEW);
		// for (Album album : albumsNEW) {
		// System.out.println(album);
		// }
		//
		// List<Album> albumsNEW = facade.getAlbumDao().loadAll();
		// for (Album album : albumsNEW) {
		// System.out.println(album);
		// }
		//
		// List<Album> albums = facade.getAlbumDao().loadAll();
		// for (Album album : albums) {
		// System.out.println(album);
		// }
		// System.out.println("--------------");
		// Album changed = albums.get(0);
		// changed.setName("NEW NAME");
		// changed.setYear(21982127);
		//
		// facade.getAlbumDao().update(changed);
		//
		//

		facade.closeSqlConnection();

	}

}
