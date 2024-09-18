package fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import dominio.SubclasseProduto;

public class SubclasseProdutoFakeDB extends BaseFakeDB<SubclasseProduto> {

    @Override
    public void preencherDados() {
        if (this.tabela == null){
            this.tabela = new ArrayList<>();
        }
        this.tabela.add(new SubclasseProduto(1, "Carnes",LocalDate.now(), 2));
       
    }
}
