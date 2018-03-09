package mglowinski.library.services;

import java.util.List;

import mglowinski.library.model.Borrow;

public interface BorrowService {

	List<Borrow> findAll();
	
	Borrow create(Borrow borrow);
	
	void deleteById(String borrowId);
}
