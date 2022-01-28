package pro.gsilva.catalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pro.gsilva.catalogo.model.Musica;

public interface CatalogoRepository extends JpaRepository<Musica, Long>  {
    
}
