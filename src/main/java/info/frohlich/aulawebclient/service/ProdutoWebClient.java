package info.frohlich.aulawebclient.service;

import info.frohlich.aulawebclient.model.Produto;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProdutoWebClient {

    private final WebClient webClient;

    public ProdutoWebClient(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8080/produtos").build();
    }

    public Flux<Produto> getAllProdutos() {
        return webClient.get()
                .retrieve()
                .bodyToFlux(Produto.class);
    }

    public Mono<Produto> getProdutoById(Long id) {
        return webClient.get()
                .uri("/{id}", id)
                .retrieve()
                .bodyToMono(Produto.class);
    }

    public Mono<Produto> createProduto(Produto produto) {
        return webClient.post()
                .bodyValue(produto)
                .retrieve()
                .bodyToMono(Produto.class);
    }

    public Mono<Void> deleteProduto(Long id) {
        return webClient.delete()
                .uri("/{id}", id)
                .retrieve()
                .bodyToMono(Void.class);
    }
}
