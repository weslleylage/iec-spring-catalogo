package pro.gsilva.catalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import pro.gsilva.catalogo.model.Musica;

import java.util.List;

public interface CatalogoRepository extends JpaRepository<Musica, Long>, CustomCatalogoRepository {
    List<Musica> findAllByTitulo(String titulo);
    List<Musica> findAllByTituloIsLike(String titulo);

    @Query(value = "select mu.* from tb_musica mu JOIN FETCH tb_categoria ca on ca.id = mu.categoria_id where mu.titulo like :titulo", nativeQuery = true)
    List<Musica> findAllWithTituloLike(String titulo);

    @Query(value = "select mu.* from tb_musica mu JOIN tb_categoria ca on ca.id = mu.categoria_id where ca.id = :categoriaId", nativeQuery = true)
    List<Musica> findAllByCategoriaId(Integer categoriaId);
}
