package service;

import exception.EstudianteNoInscritoEnCursoException;
import exception.EstudianteYaInscritoException;
import model.Curso;
import model.Estudiante;

public interface ServiciosAcademicosI {
    public void matricularEstudiante(Estudiante estudiante);

    public void agregarCurso(Curso curso);

    public void inscribirEstudianteCurso(Estudiante estudiante, Integer idCurso) throws EstudianteYaInscritoException;

    public void desinscribirEstudianteCurso(Integer idEstudiante, Integer idCurso) throws EstudianteNoInscritoEnCursoException;
}
