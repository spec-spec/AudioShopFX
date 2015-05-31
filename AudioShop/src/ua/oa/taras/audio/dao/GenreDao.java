package ua.oa.taras.audio.dao;

import java.util.Collection;
import java.util.List;

import ua.oa.taras.audio.data.Genre;

class GenreDao implements AbstractDao<Genre> {

	@Override
	public List<Genre> loadAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Genre findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Genre changed) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(Genre item) {
		// TODO Auto-generated method stub
		return false;
	}

	
	@Override
	public boolean addAll(Collection<Genre> collection) {
		// TODO Auto-generated method stub
		return false;
	}

}
