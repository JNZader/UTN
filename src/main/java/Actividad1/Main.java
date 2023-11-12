package Actividad1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // crear un alumno
        Alumno alumno = new Alumno("Juan", "12345");

        // crear 5 materias
        Materia materia1 = new Materia("Matemáticas");
        Materia materia2 = new Materia("Física");
        Materia materia3 = new Materia("Química");
        Materia materia4 = new Materia("Programación");
        Materia materia5 = new Materia("Historia");

        // establece correlativas
        materia4.getCorrelativas().add(materia1);
        materia4.getCorrelativas().add(materia2);
        materia5.getCorrelativas().add(materia3);

        // agregar materias al listado de materias aprobadas del alumno
        alumno.getMateriasAprobadas().add(materia1);
        alumno.getMateriasAprobadas().add(materia2);

        // Caso 1: Inscripcion en una materia que no tiene correlativas
        Inscripcion inscripcion1 = new Inscripcion(alumno, materia5, LocalDate.now());
        System.out.println("Caso 1 - ¿Puede inscribirse en "+inscripcion1.getMateria()+"? " + (inscripcion1.aprobado() ? "Si" : "No"));

        // Caso 2: Insc en una materia con correlativas aprobadas
        Inscripcion inscripcion2 = new Inscripcion(alumno, materia4, LocalDate.now());
        System.out.println("Caso 2 - ¿Puede inscribirse en "+inscripcion2.getMateria()+"? " + (inscripcion2.aprobado() ? "Si" : "No"));

        // Caso 3: Insc en una materia con correlativas no aprobadas
        Inscripcion inscripcion3 = new Inscripcion(alumno, materia3, LocalDate.now());
        System.out.println("Caso 3 - ¿Puede inscribirse en "+inscripcion3.getMateria()+"? " + (inscripcion3.aprobado() ? "Si" : "No"));

        // Caso 4: Insc en una materia con una correlativa aprobada y otra no aprobada
        alumno.getMateriasAprobadas().add(materia3);
        Inscripcion inscripcion4 = new Inscripcion(alumno, materia4, LocalDate.now());
        System.out.println("Caso 4 - ¿Puede inscribirse en "+inscripcion4.getMateria()+"? " + (inscripcion4.aprobado() ? "Si" : "No"));

        // Caso 5: Insc en una materia con todas las correlativas aprobadas
        alumno.getMateriasAprobadas().add(materia4);
        Inscripcion inscripcion5 = new Inscripcion(alumno, materia5, LocalDate.now());
        System.out.println("Caso 5 - ¿Puede inscribirse en "+inscripcion5.getMateria()+"? " + (inscripcion5.aprobado() ? "Si" : "No"));
    }
}