import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

    // Criação dos cursos e mentorias
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Java Básico");
        cursoJava.setDescricao("Conceitos inciais do Java.");
        cursoJava.setCargaHoraria(11);

        Curso cursoSpring = new Curso();
        cursoSpring.setTitulo("Spring Framework");
        cursoSpring.setDescricao("Desenvolvimento de APIs com Spring.");
        cursoSpring.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Carreira");
        mentoria.setDescricao("Orientações para o mercado de trabalho.");
        mentoria.setData(LocalDate.of(2025, 9, 12));

    // Criação dos Bootcamps
        LocalDate dataInicioBootcamp = LocalDate.of(2025, 9, 1);
        Bootcamp bootcampJava = new Bootcamp(dataInicioBootcamp);
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Aprenda a desenvolver Java do zero!");

        bootcampJava.getConteudos().add(cursoJava);
        bootcampJava.getConteudos().add(cursoSpring);
        bootcampJava.getConteudos().add(mentoria);

    //  Criação dev e adição do dev ao bootcamp
        Dev devJoao = new Dev();
        devJoao.setNome("João Silva");
        devJoao.inscreverBootcamp(bootcampJava);

        System.out.println("--- DEV JOÃO ---");
        System.out.println("Inscrito em: " + devJoao.getConteudosInscritos());
        System.out.println("XP atual: " + devJoao.calcularXp());
        System.out.println("-------------------------\n");

    //  Dev assistindo completando os cursos
        System.out.println("--- PROGRESO DE JOÃO ---");
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("Conteúdos restantes: " + devJoao.getConteudosInscritos());
        System.out.println("Novo XP: " + devJoao.calcularXp());
        System.out.println("-------------------------\n");
    }
}