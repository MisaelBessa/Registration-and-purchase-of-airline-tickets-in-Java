
public class MisaelBessa_Subclasse1 extends MisaelBessa_Superclasse {

    public MisaelBessa_Subclasse1(){
        super();
    }//todos os atributos passados como herança.
    
//Métodos:
 

        @Override
        public void cadastro() {
            MisaelBessa_Testes.viagensAV1[MisaelBessa_Testes.a] = new MisaelBessa_Subclasse1();
            System.out.println("\nDigite suas informações:\n");
            System.out.println("\nNome: ");
            MisaelBessa_Testes.viagensAV1[MisaelBessa_Testes.a].setNome(MisaelBessa_Testes.scan.nextLine());
            System.out.println("\nCPF: ");
            MisaelBessa_Testes.viagensAV1[MisaelBessa_Testes.a].setCpf(MisaelBessa_Testes.scan.nextLine());
            System.out.println("\nIdade: ");
            MisaelBessa_Testes.viagensAV1[MisaelBessa_Testes.a].setIdade(MisaelBessa_Testes.atributos.nextInt());
            System.out.println("\nNumero do telefone(com DDD): ");
            MisaelBessa_Testes.viagensAV1[MisaelBessa_Testes.a].setNumero_telefone(MisaelBessa_Testes.atributos.nextLong());     
            System.out.println("\nSexo: ");
            MisaelBessa_Testes.viagensAV1[MisaelBessa_Testes.a].setSexo(MisaelBessa_Testes.scan.nextLine());  

            MisaelBessa_Testes.viagensAV1[MisaelBessa_Testes.a].setHorario(MisaelBessa_Testes.horario);
            MisaelBessa_Testes.viagensAV1[MisaelBessa_Testes.a].setDia(MisaelBessa_Testes.dia);
            MisaelBessa_Testes.viagensAV1[MisaelBessa_Testes.a].setMes(MisaelBessa_Testes.mes);
            MisaelBessa_Testes.viagensAV1[MisaelBessa_Testes.a].setAno(MisaelBessa_Testes.ano);
            MisaelBessa_Testes.viagensAV1[MisaelBessa_Testes.a].setDestino_de_voo(MisaelBessa_Testes.destino);
            MisaelBessa_Testes.viagensAV1[MisaelBessa_Testes.a].setTipo_de_classe(MisaelBessa_Testes.tipo_de_voo);
            MisaelBessa_Testes.a++;
        }

        @Override
        public void compra_de_passagem() {
            int opcao=0, cdg=0;
            long cartao=0;
            if(MisaelBessa_Testes.destino==1){
                System.out.println("O valor da passagem é R$ 844,00 destino fortaleza-são paulo");
            }
            if(MisaelBessa_Testes.viagensAV1[MisaelBessa_Testes.a].getDestino_de_voo()==2){
                System.out.println("O valor da passagem é R$ 882,00 destino fortaleza-Rio de janeiro");
            }
            if(MisaelBessa_Testes.viagensAV1[MisaelBessa_Testes.a].getDestino_de_voo()==3){
                System.out.println("O valor da passagem é R$ 1064,00 destino fortaleza-Rio Grande do Sul");
            }
            if(MisaelBessa_Testes.viagensAV1[MisaelBessa_Testes.a].getDestino_de_voo()==4){
                System.out.println("O valor da passagem é R$ 950,00 destino fortaleza-Brasília");
            }
            System.out.println("\nComo deseja pagar? \n1-Crédito\n2-Débito\n");
            opcao=MisaelBessa_Testes.atributos.nextInt();
            System.out.println("\nInsira o número do cartão: ");
            cartao = MisaelBessa_Testes.atributos.nextLong();
            System.out.println("\nInsira o codigo de segurança do cartão: ");
            cdg = MisaelBessa_Testes.atributos.nextInt();
            System.out.println("\nPagamento realizado com sucesso!\n\n\n");

        }

        @Override
        public void cancelamento() {
            System.out.println("\nCompra cancelada! O dinheiro será devolvido o mais breve possível\n");
        }

        @Override
        public void resgatar_milhas() {
            System.out.println("Milhas resgatadas!\no desconto será aplicado no valor de pagamento.");
        }

        @Override
        public void Servico_de_atendimento() {
            System.out.println("\nOs meios de comunicação do SAC são os seguintes:\nemail: SACempresa@gmail.com\ntelefone: (85) 3303-3030\n");
        }
    
}
