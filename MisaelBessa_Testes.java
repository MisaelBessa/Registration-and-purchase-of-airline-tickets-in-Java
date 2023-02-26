import java.util.Scanner;

public class MisaelBessa_Testes {
    static int a=0;
    static int b=0;
    static MisaelBessa_Subclasse1[] viagensAV1 = new MisaelBessa_Subclasse1[554];
    static MisaelBessa_Subclasse2[] viagensExe = new MisaelBessa_Subclasse2[15];
    
    static Scanner atributos = new Scanner(System.in);
    static Scanner scan = new Scanner(System.in);
    static int horario=0, dia=0, mes=0, ano=0, tipo_de_voo=0, destino = 0;
    
    static MisaelBessa_Subclasse1 convencional = new MisaelBessa_Subclasse1();
    static MisaelBessa_Subclasse2 executivo = new MisaelBessa_Subclasse2();

    public static void main(String[] args) throws Exception {

        for(b=0; b<554; b++){
            viagensAV1[b]= new MisaelBessa_Subclasse1();
        }
        for(b=0; b<15; b++){
            viagensExe[b]= new MisaelBessa_Subclasse2();
        }
        
        
        do{
            
            System.out.println("\nBEM VINDO AO MENU DE SELEÇÃO DE VOOS\n");
         
            System.out.println("\nDestinos disponíveis:");
            System.out.println("\n1-São Paulo   2-Rio de Janeiro ");
            System.out.println("\n3-Rio grande do sul   4-Brasília\n\n5-Sair");
            System.out.println("\nDigite o destino da sua viagem:");
            destino = atributos.nextInt();

            if(destino!=5){
                System.out.println("\nDigite a data da sua viagem:");
                System.out.println("\nDia: ");
                dia = atributos.nextInt();
                System.out.println("\nMes: ");
                mes = atributos.nextInt();
                System.out.println("\nAno: ");
                ano = atributos.nextInt();
    
    
                if(destino==1){
                    System.out.println("\nHorários disponíveis:");
                    System.out.println("\n1-6:30   2-12:30   3- 18:30");
                    horario = atributos.nextInt();
                }
                if(destino==2){
                    System.out.println("\nHorários disponíveis:");
                    System.out.println("\n1-8:30   2-14:30   3- 20:30");
                    horario = atributos.nextInt();
                }
                if(destino==3){
                    System.out.println("\nHorários disponíveis:");
                    System.out.println("\n1-10:30   2-16:30   3- 22:30");
                    horario = atributos.nextInt();
                }
                if(destino==4){
                    System.out.println("\nHorários disponíveis:");
                    System.out.println("\n1-12:30   2-18:30   3- 00:30");
                    horario = atributos.nextInt();
                }
                
                System.out.println("Selecione o tipo de voo: \n1-Convencional\n2-Executivo");
                tipo_de_voo = atributos.nextInt();
    
                if(tipo_de_voo==1){
                    int o=0;
                    do{ int milhas=0;
                        System.out.print("\n*******************************************\n");
                        System.out.println("\n1-Iniciar compra de passagem\n2-Cancelar compra\n3-SAC - Serviço de Atendimento ao Cliente\n4-Sair");
                        System.out.print("\n*******************************************\n");
                        System.out.println("\nDigite oque deseja fazer: ");
                        o = atributos.nextInt();
    
                        if(o==1){
                            convencional.cadastro();
                            System.out.print("\n*******************************************\n");
                            System.out.println("\nDeseja resgatar milhas cadastradas no seu CPF?\n1-SIM\n2-NÃO\n");
                            milhas = atributos.nextInt();
                            System.out.print("\n*******************************************\n");
                            if(milhas == 1){
                            convencional.resgatar_milhas();
                            }
        
                            convencional.compra_de_passagem();
                        }
                        if(o==2){
                            convencional.cancelamento();
                            o=4;
                        } 
                        if(o==3){
                            convencional.Servico_de_atendimento();
                        }
                        
                    }while(o!=4);
                    
                }
                if(tipo_de_voo==2){
                    int o=0;
                    do{ 
                        int milhas=0;
                        System.out.print("\n*******************************************\n");
                        System.out.println("\n1-Iniciar compra de passagem\n2-Cancelar compra\n3-SAC - Serviço de Atendimento ao Cliente\n4-Sair");
                        System.out.print("\n*******************************************\n");
                        System.out.println("\nDigite oque deseja fazer: ");
                        o = atributos.nextInt();
    
                        if(o==1){
                            executivo.cadastro();
                            System.out.print("\n*******************************************\n");
                            System.out.println("\nDeseja resgatar milhas cadastradas no seu CPF?\n1-SIM\n2-NÃO\n");
                            System.out.print("\n*******************************************\n");
                            milhas = atributos.nextInt();
        
                            if(milhas == 1){
                            executivo.resgatar_milhas();
                            }
        
                            executivo.compra_de_passagem();
                        }
                        if(o==2){
                            executivo.cancelamento();
                            o=4;
                        } 
                        if(o==3){
                            executivo.Servico_de_atendimento();
                        }
                    }while(o!=4);
                    
                }
                
            }
           
           

        }while(destino!=5);
    }
}
