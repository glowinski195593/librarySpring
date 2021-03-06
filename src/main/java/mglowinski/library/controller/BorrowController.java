package mglowinski.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mglowinski.library.api.IBorrow;
import mglowinski.library.model.Borrow;

@RestController
@RequestMapping("/api")
public class BorrowController {

	private final IBorrow borrowService;
	
	@Autowired
	public BorrowController(IBorrow borrowService) {
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
	
	@RequestMapping(value = "/borrows/{borrowId}", method=RequestMethod.GET)
	public @ResponseBody void deleteById(@PathVariable("borrowId") String borrowId){
	    borrowService.deleteById(borrowId);
	}
}
