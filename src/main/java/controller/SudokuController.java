package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import instance.ResponceObject;
import service.SudokuResolverService;

@RestController("/sudoku")
public class SudokuController {
	
	@Autowired
	private SudokuResolverService resolver;
	
	@GetMapping
	public ResponceObject resolver(
			@NonNull @RequestParam Integer column,
			@NonNull @RequestParam Integer row,
			@NonNull @RequestParam String value,
			@NonNull @RequestParam String userId) 
	{
		
		return resolver.sudokuResolve(column, row, value, userId);
		
	}

}
