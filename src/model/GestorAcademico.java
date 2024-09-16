package model;

import java.util.List;
import java.util.Map;

public class GestorAcademico {
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

}
