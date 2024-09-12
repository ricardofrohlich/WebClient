package info.frohlich.aulawebclient.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("fornecedores")
public class Fornecedor {
    @Id
    private Long id;
    private String nome;
}
