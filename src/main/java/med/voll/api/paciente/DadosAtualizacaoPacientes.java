package med.voll.api.paciente;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;
import med.voll.api.endereco.Endereco;

public record DadosAtualizacaoPacientes(

        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
