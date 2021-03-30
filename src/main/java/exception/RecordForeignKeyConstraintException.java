package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(
			value = HttpStatus.CONFLICT,
			reason = "ERROR: Foreign Key Constraint"
		)

public class RecordForeignKeyConstraintException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6661624113756943136L;

}