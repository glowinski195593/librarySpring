package mglowinski.library.api;

import java.util.List;

import mglowinski.library.model.Borrow;

public interface IBorrow {

	List<Borrow> findAll();
	
	Borrow create(Borrow borrow);
	
	void deleteById(String borrowId);
}
