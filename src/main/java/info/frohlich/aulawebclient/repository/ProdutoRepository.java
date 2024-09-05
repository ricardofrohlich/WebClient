package info.frohlich.aulawebclient.repository;

import info.frohlich.aulawebclient.model.Produto;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface ProdutoRepository extends ReactiveCrudRepository<Produto, Long> {
    Flux<Produto> findByNomeContaining(String nome);
}

