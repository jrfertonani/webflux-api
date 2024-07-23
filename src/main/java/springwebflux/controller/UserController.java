package springwebflux.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import springwebflux.model.request.UserRequest;
import springwebflux.model.response.UserResponse;

public interface UserController {

    @PostMapping
    ResponseEntity<Mono<Void>> save(@RequestBody UserRequest request);

    @GetMapping("/{id}")
    ResponseEntity<Mono<UserResponse>> findById(@PathVariable String id);

    @GetMapping
    ResponseEntity<Flux<UserResponse>> findAll();

    @PutMapping("/{id}")
    ResponseEntity<Mono<UserResponse>> update(@PathVariable String id,
                                              @RequestBody UserRequest request);

    @DeleteMapping("/{id}")
    ResponseEntity<Mono<Void>> delete(@PathVariable String id);

}
