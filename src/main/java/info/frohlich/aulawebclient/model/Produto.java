package info.frohlich.aulawebclient.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("produtos")
public class Produto {
    @Id
    private Long id;
    private String nome;
    private Double preco;
}
