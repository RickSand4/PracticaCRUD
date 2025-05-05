package com.upiiz.Practica_IV.Controllers;

import com.upiiz.Practica_IV.Models.LibroModel;
import com.upiiz.Practica_IV.Services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Controller
public class LibrosController {
    @Autowired
    private LibroService libroService;

    @GetMapping("/libros")
    public String Libros(Model model) {
        List<LibroModel> libros = libroService.findAll();
        model.addAttribute("libros", libros);
        return "listado-libros";
    }

    @GetMapping("/libros/new")
    public String newLibro(Model model) {
        model.addAttribute("libro", new LibroModel());
        return "agregar-libro";
    }

    @PostMapping("/libros/guardar")
    public String guardarLibro(@ModelAttribute("libro") LibroModel libro) {
        libroService.save(libro);
        return "redirect:/libros";
    }

    @GetMapping("/libros/delete/{id_libro}")
    public String deletelibro(@PathVariable("id_libro") int id_libro, Model model) {
        LibroModel libro = libroService.findById(id_libro);
        model.addAttribute("libro", libro);
        return "eliminar-libro";
    }

    @PostMapping("/libros/delete")
    public String eliminarLibro(@ModelAttribute LibroModel libro) {
        libroService.delete(libro.getId_libro());
        return "redirect:/libros";
    }

    @GetMapping("/libros/edit/{id_libro}")
    public String editlibro(@PathVariable("id_libro") int id_libro, Model model) {
        LibroModel libro = libroService.findById(id_libro);
        model.addAttribute("libro", libro);
        return "editar-libro";
    }

    @PostMapping("/libros/edit")
    public String editarlibro(@ModelAttribute LibroModel libro) {
        libroService.update(libro);
        return "redirect:/libros";
    }
}
