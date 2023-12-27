public class Heranca_Modulo_13_Aula4 {

    public static void main(String[] args) {
        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setNome(" Alexandre ");
        pessoa.setSobreNome(" Ferreira de Lima ");
        pessoa.setCpf("xxx.xxx.xxx-xx");
        System.out.println(" Nome:      " + pessoa.getNome() + "\n"+ " Sobrenome: " + pessoa.getSobreNome()+ "\n" + " CPF:        " + pessoa.getCpf()+"\n*****************************************");


        PessoaJuridica pessoa2 = new PessoaJuridica();
        pessoa2.setNome(" Alexandre ");
        pessoa2.setSobreNome(" Ferreira de Lima ");
        pessoa2.setCnpj("xx.xxx.xxx/xxxx-xx");
        System.out.println(" Nome:      " + pessoa2.getNome() + "\n"+ " Sobrenome: " + pessoa2.getSobreNome()+ "\n" + " Cnpj:        " + pessoa2.getCnpj());
    }


}