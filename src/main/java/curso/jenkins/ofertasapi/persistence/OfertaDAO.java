package curso.jenkins.ofertasapi.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.jenkins.ofertasapi.entities.Oferta;

public interface OfertaDAO extends JpaRepository<Oferta, Integer> {

}
