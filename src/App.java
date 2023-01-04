import java.io.File;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("==========================================");

    System.out.println("Digite um caminho de arquivo: ");
    String strPath = sc.nextLine();

    File path = new File(strPath);

    System.out.println("==========================================");
    //Suponha que eu quero assecar somente o nome do arquivo e nao p caminho completo
    System.out.println("getName: " + path.getName());
    //Esssa funçao get name ela pega somente o nome do arquivo e dispresa o caminho

    System.out.println("==========================================");
    //Aki eu quero so o caminho dispensando o nome
    System.out.println("getParent: " + path.getParent());

    System.out.println("==========================================");
    //Agora se eu quiser todo o caminho e so eu chamar o getPath
    System.out.println("getPath: " + path.getPath());
    System.out.println("==========================================");

    // esses sao algumas funcoes da class file mais temos muito mais essas foi so para ter uma ideia
    sc.close();
  }
}
