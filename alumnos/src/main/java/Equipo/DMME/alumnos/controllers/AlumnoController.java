package Equipo.DMME.alumnos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Equipo.DMME.alumnos.model.AlumnoModel;
import Equipo.DMME.alumnos.repository.AlumnoRepository;

@RestController
@RequestMapping("/alumnos")

public class AlumnoController {

    @Autowired
    private AlumnoRepository alumnoRepository;
    //Metodo get para traer todos los alumnos de la base de datos 
    @GetMapping ("/traer-alumnos")
    public List <AlumnoModel> TraerAlumnos(){
        return alumnoRepository.findAll();

    }
    //Metodo para insertar un alumno a la base de datos 
    @PostMapping("/insertar-alumnos")
    public AlumnoModel insertarAlumnos ( @RequestBody AlumnoModel AlumnoModel){
        return alumnoRepository.save(AlumnoModel);

    }

    //Metodo para editar un alumno en la base de datos 
    @PutMapping ("/editar-alumno/{id}")
    public ResponseEntity <AlumnoModel> actualizarAlumno (@PathVariable Long id, @RequestBody AlumnoModel alumnoModel){
        return alumnoRepository.findById(id).map(alumnoExistente ->{
            alumnoExistente.setNombre(alumnoModel.getNombre());
            alumnoExistente.setApellido(alumnoModel.getApellido());
            alumnoExistente.setEmail(alumnoModel.getEmail());
            alumnoExistente.setNumeroControl(alumnoModel.getNumeroControl());
            alumnoExistente.setTelefono(alumnoModel.getTelefono());
            alumnoExistente.setCarrera(alumnoModel.getCarrera());
            alumnoExistente.setImagenURL(alumnoModel.getImagenURL());
            AlumnoModel actualizado = alumnoRepository.save(alumnoExistente);
            return ResponseEntity.ok(actualizado);
        }).orElse(ResponseEntity.notFound().build());
    }
    //Metodo para eliminar un alumno de la base de datos 
    @DeleteMapping("/eliminar-alumno/{id}")
    public void eliminarAlumnoModel (@PathVariable Long id){
        alumnoRepository.deleteById(id);

    }

}

