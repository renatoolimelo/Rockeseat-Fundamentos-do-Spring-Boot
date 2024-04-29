package br.com.renatomelo.iocDi;

import org.springframework.stereotype.Service;

@Service
public class MeuComponent {
	
	public String chamarMeuComponent() {
		return "Chamando meu component";
	}

}
