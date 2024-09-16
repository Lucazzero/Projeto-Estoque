package visao;

import java.util.ArrayList;

import dominio.ClasseProduto;

import servico.ClasseProdutoServico;

public class ClasseProdutoVisao {
    public void Exibir(){
        ClasseProdutoServico srv = new ClasseProdutoServico();
        ArrayList<ClasseProduto> lista = srv.Navegar();
        System.out.println("=========================================");
        for (ClasseProduto cp : lista) {
            this.Imprimir(cp);
        }
    }
    
    private void Imprimir(ClasseProduto alvo){
        System.out.println("Classe de Produto:");
        System.out.println("Codigo:" + alvo.getCodigo());
        System.out.println("Descrição: "+ alvo.getDescricao());
        System.out.println("Data de Inclusao: " + alvo.getDataDeInclusao());
    } 
}
