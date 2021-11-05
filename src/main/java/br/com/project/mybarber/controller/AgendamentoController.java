package br.com.project.mybarber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.project.mybarber.model.repositoy.AgendamentoRepository;
import br.com.project.mybarber.model.repositoy.BarbeiroRepository;
import br.com.project.mybarber.model.repositoy.ClienteRepository;
import br.com.project.mybarber.model.repositoy.ServicoRepository;


@Controller
public class AgendamentoController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private BarbeiroRepository barbeiroRepository;
	
	@Autowired
	private ServicoRepository servicoRepository;
	
	@Autowired
	private AgendamentoRepository agendamentoRepository;
	
	
	
	
//	
//	public AgendamentoController(ClienteRepository clienteRepository) {
//	this.clienteRepository = clienteRepository;
//	}
//	
	
//	@RequestMapping(value = "/{id}" ,method=RequestMethod.GET)
//	public ModelAndView listaAgendamentos() {
//		ModelAndView mv = new ModelAndView ("listaAgendamentos");
//		Iteable
//		
//		
//		
//		
//		
//	}
	
	
	
	
	
	
	
	
//	@GetMapping("/clientes")
//	public String clientesAgendados(Model model) {
//		model.addAttribute("listaClientes" , clienteRepository.findAll());
//		return "clientes/agendados";
//		

	//}
	
	
	@RequestMapping(value ="/clientes/agendar", method= RequestMethod.GET)
	public String agendarCliente() {
		return "clientes/formInt";
		
	}
	
	
	
	
//	
//	@GetMapping("clientes/obrigado")
//	public String obrigado() {
//		
//		return "clientes/obrigado";}
	
	
//	@PostMapping("/clientes/salvar")
//	public String salvarAgendamento(@ModelAttribute("cliente") Cliente cliente) {
//		
//		clienteRepository.save(cliente);
//		return "redirect:obrigado";
//		
//	}

}
//