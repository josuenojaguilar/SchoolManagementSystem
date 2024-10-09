import model.Curso;
import model.Estudiante;
import model.GestorAcademico;
import utils.Estado;
import java.util.List;

import java.time.LocalDate;

public class Main {
        public static void main(String[] args) throws Exception {
        //Instancias de cursos
        Curso matematicas = new Curso(1L, "Matematicas", "Curso de mate", 10, 1);
        Curso programacion = new Curso(2L, "Programacion 1", "Introducción a la programación", 15, 2);

        //Instancias de estudiantes
        Estudiante estudiante1 = new Estudiante(1L, "Juanito", "Perez", LocalDate.of(1998, 8, 9),  Estado.MATRICULADO);
        Estudiante estudiante2 = new Estudiante(2L, "Miguelin", "Noj", LocalDate.of(1990, 1, 31), Estado.GRADUADO);

        //Instancia de gestor académico
        GestorAcademico gestorAcademico = new GestorAcademico();

        //Agregar cursos
        gestorAcademico.agregarCurso(matematicas);
        gestorAcademico.agregarCurso(programacion);

        //Agregar estudiantes
        gestorAcademico.matricularEstudiante(estudiante1);
        gestorAcademico.matricularEstudiante(estudiante2);
        
        //Inscribir alumnos a mate
        gestorAcademico.inscribirEstudianteCurso(estudiante1, matematicas.getId());
        gestorAcademico.inscribirEstudianteCurso(estudiante2, matematicas.getId());

        //Inscribir alumnos a progra
        gestorAcademico.inscribirEstudianteCurso(estudiante1, programacion.getId());
        gestorAcademico.inscribirEstudianteCurso(estudiante2, programacion.getId());

        //Devolución de resultados:
        System.out.println("Curso: " + matematicas.getNombre() + ".");
        List<Estudiante> estudiantesMate = gestorAcademico.getEstudiantesInscritos().get(matematicas);
        estudiantesMate.forEach(e -> System.out.println(e));

        System.out.println("Curso: " + programacion.getNombre() + ".");
        List<Estudiante> estudiantesProgra = gestorAcademico.getEstudiantesInscritos().get(programacion);
        estudiantesProgra.forEach(e -> System.out.println(e));

        //Desmatricular:
        gestorAcademico.desinscribirEstudianteCurso(estudiante2.getId(), matematicas.getId());

        //Devolver nuevamente resultados
        System.out.println("Curso: " + matematicas.getNombre() + ".");
        estudiantesMate.forEach(e -> System.out.println(e));

        System.out.println("Curso: " + programacion.getNombre() + ".");
        estudiantesProgra.forEach(e -> System.out.println(e));

    }
}
