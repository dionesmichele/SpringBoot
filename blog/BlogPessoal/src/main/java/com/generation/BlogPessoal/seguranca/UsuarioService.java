package com.generation.BlogPessoal.seguranca;

import java.nio.charset.Charset;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.generation.BlogPessoal.model.UserLogin;
import com.generation.BlogPessoal.model.Usuario;
import com.generation.BlogPessoal.repository.UsuarioRepository;

@Service
public class UsuarioService {

	private UsuarioRepository repository;

	@Autowired
	public Usuario CadastrarUsario(Usuario usuario) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		String senhaEncoder = encoder.encode(usuario.getSenha());
		usuario.setSenha(senhaEncoder);

		return repository.save(usuario);

	}

	public Optional <UserLogin> Logar (Optional <UserLogin> User){
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		//	Optional<UserLogin> user;
			Optional <Usuario> usuario = repository.findByUsuario(user.get().getUsuario());
			if(usuario.isPresent()) {
				if(encoder.matches(user.get().getSenha(), usuario.get().getSenha()));{
				
				String auth = user.get().getUsuario + ":"+ user.get().getSenha();
				byte encodedAuth = base64.encodeByte64(auth.getBytes(Charset.forName(US-ASCII)))
				String authHeader =	"Basic"	+ new String (encodedAuth);
				
				user.get(). setToken(authHeader);
				user.get(). setNome(usuario.get().getNome());
				
				return user;
						
						
			}
			
			
		}
			return null;

   }
}