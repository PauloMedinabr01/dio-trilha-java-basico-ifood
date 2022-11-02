class RodarAplicacao {

    /**
     * Classe de exemplo para o exercicio da Aula 4 de Orientação a Objetos.
     */

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(); // Objeto Funcionario instanciado na classe Funcionario

        Funcionario gerente = new Gerente(); // Upcast da classe funcionario
        Funcionario vendedor = new Vendedor(); // Upcast da classe funcionario
        Funcionario faxineiro = new Faxineiro(); // Upcast da classe funcionario

        // Gerente gerente = new Funcionario(); Downcast de forma explicita
        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }

}