package message.rest.DTO;

import java.util.UUID;

import message.rest.Model.UserModel;

public record UserDTO( String nome, int cpf, int telefone, String email) {

	public UserDTO(UserModel u) {
		this( u.getNome(), u.getCpf(), u.getTelefone(), u.getEmail());
	}

}
