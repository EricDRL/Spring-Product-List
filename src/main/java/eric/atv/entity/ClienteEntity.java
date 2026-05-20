package eric.atv.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

        import java.util.List;

@Entity
@Table(name = "clientes")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<ProdutoEntity> products;

    public ClienteEntity() {
    }

    public ClienteEntity(Long id, String nome, List<ProdutoEntity> products) {
        this.id = id;
        this.nome = nome;
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ProdutoEntity> getProducts() {
        return products;
    }

    public void setProducts(List<ProdutoEntity> products) {
        this.products = products;
    }
}

