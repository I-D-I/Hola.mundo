/**
 * 
 */
package es.gincol.hola.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ginescolladonavarro
 *
 */
@RestController
@RequestMapping("/hola-mundo")
public class HolaMuntoController {
	
	@GetMapping
	public ResponseEntity<String> holaMundo(){
		return new ResponseEntity<String>("Hola Mundo", HttpStatus.OK);
	}

}
