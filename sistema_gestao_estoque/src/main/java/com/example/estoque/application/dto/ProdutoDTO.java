package com.example.estoque.application.dto;

import jakarta.validation.constraints.*;

public record ProdutoDTO(

    @NotBlank(message = "Nome é obrigatório")
    String nome,

    @NotNull
    @Min(value = 0, message = "Quantidade não pode ser negativa")
    Integer quantidade,

    @NotNull
    @Positive(message = "Preço deve ser positivo")
    Double preco
) {}
