package com.example.proyectoMVC.controller;

import com.example.proyectoMVC.model.Estudiante;
import com.example.proyectoMVC.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/")

public class EstudianteController {

   private final  EstudianteService estudianteService;

    @Autowired // se puede omitir
    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @GetMapping("/estudiantes") //
    public Estudiante mostrarEstudiante(){
    return estudianteService.mostrarEstudiante();

}

    @GetMapping("/index")
    public String welcome(Model model) {
        model.addAttribute("nombre", "diez");
        return "index";
    }


    //eliminar

    // crear

}
