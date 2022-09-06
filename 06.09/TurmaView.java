import java.util.ArrayList;
import java.util.List;

public class TurmaView{
    public static void main(String[] args){
        
        List<Aluno> alunos = new ArrayList<Aluno>(3);
        
        alunos.add(new Aluno(new Prova(3.0, 3.5), new Prova(4.0, 4.0)));
        alunos.add(new Aluno(new Prova(5.0, 4.5), new Prova(1.0, 2.0)));
        alunos.add(new Aluno(new Prova(3.5, 4.0), new Prova(4.5, 4.5)));

        Turma tr = new Turma(alunos.get(0), alunos.get(1), alunos.get(2));

        System.out.println("###############  MEDIA DOS ALUNOS ###############");
        System.out.println("Media do aluno 1: " + alunos.get(0).calcularMedia());
        System.out.println("Media do aluno 2: " + alunos.get(1).calcularMedia());
        System.out.println("Media do aluno 3: " + alunos.get(2).calcularMedia());
        System.out.println("");

        System.out.println("###############  MEDIA DA TURMA ###############");
        System.out.println("Media da turma: " + tr.calcularMedia());
    }
}