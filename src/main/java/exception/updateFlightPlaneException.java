package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(
		value = HttpStatus.BAD_REQUEST,
		reason = "Error when updating flight plane"
	)

public class updateFlightPlaneException extends RuntimeException{

}