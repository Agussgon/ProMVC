package com.example.proyectoMVC.services;

import com.example.proyectoMVC.model.Estudiante;
import org.springframework.stereotype.Service;


@Service
public class EstudianteService {

    private Estudiante estudiante= new Estudiante("Juan","Lopez");

    public Estudiante mostrarEstudiante (){

        return estudiante;
    }
}
