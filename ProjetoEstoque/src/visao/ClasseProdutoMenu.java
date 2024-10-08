package visao;

public class ClasseProdutoMenu extends BaseMenu {

    public ClasseProdutoMenu(){

    }


    
    @Override
    public void ExibirMenu() {
        int opcao = 0;
        while(opcao != 9){
            Util.LimparConsole();
            System.out.println("Cadastro de Classes de Produto");
            System.out.println("1 - Listar");
            System.out.println("2 - Localizar");
            System.out.println("3 - Adicionar");
            System.out.println("4 - Atualizar");
            System.out.println("5 - Remover");
            System.out.println("9 - Sair");
            System.out.print("Selecione uma opção:  ");
            opcao = this.scanner.nextInt();
            switch (opcao) {
                case 1:
                    this.Listar();
                    break;
                case 2:
                    this.Localizar();
                    break;
                    case 3:
                    this.Adicionar();
                    break;
                    case 4:
                    this.Alterar();
                    break;
                    case 5:
                    this.Remover();
                    case 9:
                    System.out.println("Saindo");
                    default:
                    System.out.println("Opcao Invalida");
                    break;
            }
            
        }
    }

    @Override
    public void Listar() {
        Util.LimparConsole();
        System.out.println("Listando");
        System.out.println("Clique <ENTER> para continuar");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Localizar() {
        Util.LimparConsole();
        System.out.println("Localizando");
        System.out.println("Clique <ENTER> para continuar");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Adicionar() {
        Util.LimparConsole();
        System.out.println("Adicionando");
        System.out.println("Clique <ENTER> para continuar");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Alterar() {
        Util.LimparConsole();
        System.out.println("Alterando");
        System.out.println("Clique <ENTER> para continuar");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Remover() {
        Util.LimparConsole();
        System.out.println("Removendo");
        System.out.println("Clique <ENTER> para continuar");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }
    
}
