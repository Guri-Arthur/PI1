package com.example.PI2.Controller;
import ch.qos.logback.core.model.Model;
import com.example.PI2.Data.CADASTRO;
import com.example.PI2.Data.COMPRA;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controller {
     @GetMapping("/CADASTRO")
   public String mostraCadastro(Model model, String nome, float valor, String cpf){ 
        CADASTRO c = new CADASTRO(); 
            c.setNome(nome);
            c.setValor(valor);
            c.setCPF(cpf);
            model.addAttribute("CADASTRO", c); 
        return "CADASTRO"; 
    } 
    
   @PostMapping("/cadastro")
   public String Cadastrar(Model model, @ModelAttribute CADASTRO c){
    model.addAttribute("CADASTRO", c); 
    return "CADASTRO"; 
   }
   
   @GetMapping("/cadastro") 
    public String mostraCadastro(Model model){ 
    model.addAttribute("CADASTRO", new CADASTRO()); 
    return "cadastro"; 
    } 
    
   @GetMapping("/COMPRA")
   public String mostraCompra(Model model, String nome, String pagamento, float valor, int desconto){ 
        COMPRA c = new COMPRA(); 
            c.setNome(nome);
            c.setFpagamento(pagamento);
            c.setValor(valor);
            c.setDesconto(desconto);
            model.addAttribute("COMPRA", c); 
        return "COMPRA"; 
    } 
    
   @PostMapping("/cadastro")
   public String cadastrarCompra(Model model, @ModelAttribute COMPRA c){
    model.addAttribute("COMPRA", c); 
    return "COMPRA"; 
   }
   
   @GetMapping("/cadastro") 
    public String mostraCadastroCompra(Model model){ 
    model.addAttribute("COMPRA", new COMPRA()); 
    return "cadastro"; 
    } 
    
}
