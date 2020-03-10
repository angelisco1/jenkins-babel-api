package curso.jenkins.ofertasapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import curso.jenkins.ofertasapi.entities.Oferta;
import curso.jenkins.ofertasapi.services.OfertasService;

@RestController
public class OfertasController {

	
	@Autowired
	private OfertasService ofertasService;
	
	@GetMapping(path="/ofertas", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Oferta>> getOfertas() {
		return new ResponseEntity<List<Oferta>>(ofertasService.getOfertas(), HttpStatus.OK);
	}
	
	@PostMapping(
		path="/ofertas",
		consumes=MediaType.APPLICATION_JSON_VALUE,
		produces=MediaType.APPLICATION_JSON_VALUE
	)
	public ResponseEntity<Oferta> createOferta(@RequestBody Oferta ofertaNueva) {
		Oferta oferta = ofertasService.createOferta(ofertaNueva);
		System.out.println(oferta);
		return new ResponseEntity<Oferta>(oferta, HttpStatus.OK);
	}
	
}
