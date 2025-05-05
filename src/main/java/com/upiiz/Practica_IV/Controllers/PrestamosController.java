package com.upiiz.Practica_IV.Controllers;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.ui.Model;
import com.upiiz.Practica_IV.Models.PrestamoModel;
import com.upiiz.Practica_IV.Services.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller

public class PrestamosController {
    @Autowired
    private PrestamoService prestamoService;

    @GetMapping("/Prestamos")
    public String prestamos(Model model) {
        List<PrestamoModel> prestamos = prestamoService.findAll();
        model.addAttribute("prestamos", prestamos);
        return "listado-prestamo";
    }
    @GetMapping("Prestamos/new")
    public String newPrestamo(Model model) {
        PrestamoModel prestamo = new PrestamoModel();
        model.addAttribute("prestamo", prestamo);
        return "agregar-prestamo";
    }
    @PostMapping("/Prestamos/guardar")
    public String guardarPrestamo(PrestamoModel prestamo) {
        prestamoService.save(prestamo);
        return "redirect:/Prestamos";
    }
    @GetMapping("/Prestamos/delete/{id_prestamo}")
    public String mostrarformularioeliminarPrestamo(@PathVariable int id_prestamo, Model model) {
        PrestamoModel prestamo = prestamoService.findById(id_prestamo);
        if (prestamo == null) {
            // Si no se encuentra el préstamo, redirigir a la lista
            return "redirect:/Prestamos";
        }
        model.addAttribute("prestamo", prestamo);
        return "eliminar-prestamo"; // Asegúrate de que el nombre del archivo sea correcto
    }

    @PostMapping("/Prestamos/delete")
    public String eliminarPrestamo(@ModelAttribute PrestamoModel prestamo) {
        prestamoService.delete(prestamo.getId_prestamo());
        return "redirect:/Prestamos"; // Redirige a la lista de préstamos después de la eliminación
    }


    @GetMapping("/Prestamos/edit/{id_prestamo}")
    public String editarPrestamo(@PathVariable int id_prestamo, Model model) {
        PrestamoModel prestamo = prestamoService.findById(id_prestamo);
        model.addAttribute("prestamo", prestamo);
        return "editar-prestamo";
    }
    @PostMapping("/Prestamos/edit")
    public String editarPrestamo(@ModelAttribute PrestamoModel prestamo) {
        prestamoService.update(prestamo);
        return "redirect:/Prestamos";
    }
}
