package model;

import java.util.List;
import java.util.Map;

import exception.EstudianteNoInscritoEnCursoException;
import exception.EstudianteYaInscritoException;
import service.ServiciosAcademicosI;

public class GestorAcademico implements ServiciosAcademicosI {
    private List<Estudiante> estudiantes;
    private List<Curso> cursos;
    private Map<Curso, List<Estudiante>> estudiantesInscritos;
    
    public GestorAcademico() {
    }

    public GestorAcademico(List<Estudiante> estudiantes, List<Curso> cursos,
            Map<Curso, List<Estudiante>> estudiantesInscritos) {
        this.estudiantes = estudiantes;
        this.cursos = cursos;
        this.estudiantesInscritos = estudiantesInscritos;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public Map<Curso, List<Estudiante>> getEstudiantesInscritos() {
        return estudiantesInscritos;
    }

    public void setEstudiantesInscritos(Map<Curso, List<Estudiante>> estudiantesInscritos) {
        this.estudiantesInscritos = estudiantesInscritos;
    }

    @Override
    public String toString() {
        return "GestorAcademico [estudiantes=" + estudiantes + ", cursos=" + cursos + ", estudiantesInscritos="
                + estudiantesInscritos + "]";
    }

    @Override
    public void matricularEstudiante(Estudiante estudiante) {
        if(!estudiantes.contains(estudiante)){
            estudiantes.add(estudiante);
        }else{
            System.out.println("Estudiante ya existente");
        }
    }

    @Override
    public void agregarCurso(Curso curso) {
        if(!cursos.contains(curso)){
            cursos.add(curso);
        }else{
            System.out.println("Curso ya existente");
        }
    }

    @Override
    public void inscribirEstudianteCurso(Estudiante estudiante, Integer idCurso) throws EstudianteYaInscritoException {
        Curso curso = cursos.get(idCurso);
        if(curso == null || !estudiantesInscritos.get(curso).contains(estudiante)){
            estudiantesInscritos.get(curso).add(estudiante);
        }else{
            throw new EstudianteYaInscritoException("El estudiante ya se encuentra registrado en este curso");
        }
    }

    @Override
    public void desinscribirEstudianteCurso(Integer idEstudiante, Integer idCurso) throws EstudianteNoInscritoEnCursoException {
        Curso curso = cursos.get(idCurso);
        Estudiante estudiante = estudiantes.get(idEstudiante);
        if(estudiantesInscritos.get(curso).contains(estudiante)){
            estudiantesInscritos.get(curso).remove(estudiante);
        }else{
            throw new EstudianteNoInscritoEnCursoException("Estudiante no está inscrito o el curso no existe");
        }
    }

}
