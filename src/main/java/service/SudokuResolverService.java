package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import dao.SudokuMatrixRepository;
import instance.ResponceObject;
import instance.SudokuMatrix;

@Service
public class SudokuResolverService {
	
	@Autowired
	SudokuMatrixRepository sudokuMatrixRepository;
	
	public ResponceObject sudokuResolve(Integer column, Integer row, String value, String userId) {
		//Validation of value inputed by user
		ResponceObject responceObject = new ResponceObject();
		responceObject.setErrorMessage(this.validateValue(value));	
		
		//Some resolving users value to persisted sudoku matrix
		responceObject.setResponce(resolving(value, userId));	
		
		return responceObject;
	}
	
	private String validateValue(String value) {
		//some validation 
		return value;
	}
	
	private Boolean resolving(String value, String userId) {
		//Get from Storage answers
		SudokuMatrix sudokuMatrix = sudokuMatrixRepository.getByUserId(userId)
		//Some Algorithm for defining user right or not
        String matrix = sudokuMatrix.getMatrix();
		Boolean answear = null;
	return answear;	
		
	}

}
