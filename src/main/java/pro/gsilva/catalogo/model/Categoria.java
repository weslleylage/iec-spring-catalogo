package pro.gsilva.catalogo.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Table(name = "TB_CATEGORIA")
@Data
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    
    @Column(nullable = false, length = 30)
    @NotBlank
    @Size(min = 1, max = 30)
    private String nome;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "categoria")
    private Set<Musica> musica;

    public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
    public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
    public Set<Musica> getMusica() {
		return musica;
	}
	public void setMusica(Set<Musica> musica) {
		this.musica = musica;
	}
}