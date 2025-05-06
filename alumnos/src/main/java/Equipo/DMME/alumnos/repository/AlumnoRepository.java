package Equipo.DMME.alumnos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Equipo.DMME.alumnos.model.AlumnoModel;

public interface AlumnoRepository extends JpaRepository<AlumnoModel, Long> {

}
