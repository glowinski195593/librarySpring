package mglowinski.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mglowinski.library.model.Borrow;
import mglowinski.library.services.BorrowService;

@RestController
@RequestMapping("/api")
public class BorrowController {

	private final BorrowService borrowService;
	
	@Autowired
	public BorrowController(BorrowService borrowService) {
		this.borrowService = borrowService;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/borrows")
	public List<Borrow> findAllBorrows() {
	    return borrowService.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/borrows/createBorrow")
	public Borrow saveBorrow(@RequestBody Borrow borrow) {
		return borrowService.create(borrow);
	}
	
}
