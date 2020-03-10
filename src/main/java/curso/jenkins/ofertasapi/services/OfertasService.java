package curso.jenkins.ofertasapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.jenkins.ofertasapi.entities.Oferta;
import curso.jenkins.ofertasapi.persistence.OfertaDAO;

@Service
public class OfertasService {
	
	@Autowired
	private OfertaDAO ofertaDao;

	
	public List<Oferta> getOfertas() {
		return ofertaDao.findAll();
	}
	
	public Oferta createOferta(Oferta oferta) {
		return ofertaDao.save(oferta);
	}
	
}
