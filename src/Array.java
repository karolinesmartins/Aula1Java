import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args){
        List<String> nomesAlunos = new ArrayList<>();
        String nome1 = "Jessica";
        nomesAlunos.add(nome1);
        String nome2 = "Karoline";
        nomesAlunos.add(nome2);
        String nome3 = "João";
        nomesAlunos.add(nome3);
        String nome4 = "Marcelo";
        nomesAlunos.add(nome4);
        System.out.println(nomesAlunos.get(1));

        for (int i=0; i < nomesAlunos.size(); i++){
            System.out.println(nomesAlunos.get(i));
        }
    }
}
