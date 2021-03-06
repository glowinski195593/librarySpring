package mglowinski.library.mongoServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mglowinski.library.api.IBorrow;
import mglowinski.library.model.Borrow;
import mglowinski.library.repository.BorrowRepository;

@Service
public class MongoDBBorrowService implements IBorrow {

	private final BorrowRepository borrowRepository;
	
	@Autowired
	public MongoDBBorrowService(BorrowRepository borrowRepository) {
		this.borrowRepository = borrowRepository;
	}

	@Override
	public List<Borrow> findAll() {
		List<Borrow> listBorrows = borrowRepository.findAll();
		return listBorrows;
	}

	@Override
	public Borrow create(Borrow borrow) {
		Borrow createdBorrow = borrowRepository.save(borrow);
		return createdBorrow;
	}
	
	@Override
	public void deleteById(String borrowId) {
		borrowRepository.delete(borrowId);
	}
}
