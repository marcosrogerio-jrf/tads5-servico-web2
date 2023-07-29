package br.com.anpede.resources;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.anpede.entities.Associado;

@RestController
@RequestMapping(value = "/associados")
public class AssociadoResource {

	@GetMapping
	public ResponseEntity<List<Associado>> findAll(){
		List<Associado> list = new ArrayList<>();
		list.add(new Associado(1L, "Angela Maria", "123.456.789-89", LocalDate.parse("2018-07-22", DateTimeFormatter.ofPattern("yyyy-MM-dd")), "(67) 98888-5555", "agenla@gmail.com", "Av. Acacio Nunes, 123, Centro"));
		return ResponseEntity.ok().body(list);
	}
}
