public abstract class MisaelBessa_Superclasse {


    private String nome = new String();
    
    private String cpf = new String(); 
    private int idade = 0;
    private int numero_telefone = 0;
    private int destino_de_voo = 0;
    private int tipo_de_classe = 0;
    private String sexo = new String();
    private int horario = 0;
    private int dia = 0;
    private int mes = 0;
    private int ano = 0;

    private String empresa = new String();
    private String cargo = new String();
    
    public MisaelBessa_Superclasse(String nome, String cpf, int idade, int numero_telefone, int destino_de_voo,
            int tipo_de_classe, int dia, int mes, int ano, String sexo, String empresa, String cargo, int horario) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.numero_telefone = numero_telefone;
        this.destino_de_voo = destino_de_voo;
        this.tipo_de_classe = tipo_de_classe;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.sexo = sexo;
        this.empresa = empresa;
        this.cargo = cargo;
        this.horario = horario;
    }


    
    public int getHorario() {
        return horario;
    }



    public void setHorario(int horario) {
        this.horario = horario;
    }



    public String getCargo() {
        return cargo;
    }



    public void setCargo(String cargo) {
        this.cargo = cargo;
    }



    public String getEmpresa() {
        return empresa;
    }



    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }



    public String getSexo() {
        return sexo;
    }



    public void setSexo(String string) {
        this.sexo = string;
    }



    public MisaelBessa_Superclasse() {
    }



    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getTipo_de_classe() {
        return tipo_de_classe;
    }
    public void setTipo_de_classe(int tipo_de_classe) {
        this.tipo_de_classe = tipo_de_classe;
    }
    public int getDestino_de_voo() {
        return destino_de_voo;
    }
    public void setDestino_de_voo(int destino_de_voo) {
        this.destino_de_voo = destino_de_voo;
    }
    public int getNumero_telefone() {
        return numero_telefone;
    }
    public void setNumero_telefone(long l) {
        this.numero_telefone = (int) l;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void cadastro();
    public abstract void compra_de_passagem();
    public abstract void cancelamento();
    public abstract void resgatar_milhas();
    public abstract void Servico_de_atendimento();
}
