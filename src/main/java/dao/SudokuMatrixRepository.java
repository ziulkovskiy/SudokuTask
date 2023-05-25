package dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eclipsesp.eis.programmanager.ProgramManager;

import instance.SudokuMatrix;

@Repository
public interface SudokuMatrixRepository extends CrudRepository<SudokuMatrix, Long>{
	
	SudokuMatrix getByUserId(String userId);

}
