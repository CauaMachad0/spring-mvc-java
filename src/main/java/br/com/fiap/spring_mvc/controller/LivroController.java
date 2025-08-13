package br.com.fiap.spring_mvc.controller;

import br.com.fiap.spring_mvc.entity.Livro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/livros")
public class LivroController {
    @GetMapping("/lista")
    public String listarLivros(Model model) {
        Livro livro1 = new Livro();
        livro1.setId(1L);
        livro1.setTitulo("Harry Potter");
        Livro livro2 = new Livro();
        livro1.setId(2L);
        livro1.setTitulo("Percy Jackson");
        Livro livro3 = new Livro();
        livro1.setId(3L);
        livro1.setTitulo("Diário de Um Banana");
        List<Livro> livros = List.of(livro1, livro2, livro3);
        model.addAttribute("livros", livros);
        return "livroLista";
    }
}
