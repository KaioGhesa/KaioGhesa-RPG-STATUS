package game;

public class Player {
private String nome;
private int maxEnergia;
private int energia;
private int maxFome;
private int fome;
private int maxSono;
private int sono;
private int comida;
private int xp;
private int maxXp;

public Player(String nome, int maxEnergia, int maxFome, int maxSono,int maxXP) {
    this.nome = nome;
    this.maxEnergia = maxEnergia;
    this.energia = maxEnergia;
    this.maxFome = maxFome;
    this.fome = 0;
    this.maxSono = maxSono;
    this.sono = 0;
    this.comida = 0;
    this.maxXp = maxXP;
    this.xp = 0;
}

public int getEnergia() {
    return energia;
}

public void setEnergia(int energia) {
    this.energia = energia;
}

public int getFome() {
    return fome;
}

public void setFome(int fome) {
    this.fome = fome;
}

public int getSono() {
    return sono;
}

 public void setSono(int sono) {
    this.sono = sono;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getComida() {
    return comida;
}

public void setComida(int comida) {
    this.comida = comida;
}


public int getxp(){
return xp;
}

public void setxp(int xp){
    this.xp = xp;
}

public void cacar(){
    double roll;
    roll = Math.floor(Math.random() * (10 + 1)) % 2;
    System.out.println("Voce saiu para lanchar!");
    if(roll == 0){
        System.out.println("Infelizmente voce apenas se cansou e nao achou nada!");
        this.fome = fome - 4;
        this.sono = sono + 5;
        this.energia = energia - 10;
        this.xp = xp + 5;
    } else{
        System.out.println("PARABENS!! voce conseguiu comida!");
        this.fome = fome - 4;
        this.sono = sono + 5;
        this.energia = energia - 10;
        this.comida = comida + 1;
        this.xp = xp + 10;
    }
mostrar();
}

public void dormir(int horas){
    double roll;
    roll = Math.floor(Math.random() * (10 + 1)) % 2;
    System.out.println("Voce foi de nanar");
    if (roll == 0){
        System.out.println("Voce teve pesadelo e nao nanou direito");
        this.sono = sono - (horas *3);
        this.energia = energia - (horas * 10);
    } else {
        System.out.println("Voce nanou bem");
        this.sono = sono - (horas *8);
        this.energia = energia - (horas * 8);
    }
mostrar();
}
public void comer(int qttComida){
    double roll;
    roll = Math.floor(Math.random() * (10 + 1)) % 2;
    System.out.println("Voce esta comendo! ");
    if (roll == 0){
        System.out.println("Deu caganeira :( ");
        this.fome = fome + (qttComida *2);
        this.energia = energia - (qttComida *4);
        this.sono = sono + (qttComida *10);
        this.xp = xp + (qttComida * 10);
    }
    else{
        System.out.println("Voce encheu o bucho :D ");
        this.fome = fome - (qttComida * 2);
        this.energia = energia + (qttComida *4);
        this.sono = sono + (qttComida *3);
        this.xp = xp + (qttComida * 90);
    }
mostrar();
}
public void mostrar(){
    System.out.println("---Dados Do Player---");
    System.out.println("Nome: " + this.nome);
    System.out.println("Energia: " + this.energia +"/"+ this.maxEnergia);
    System.out.println("Fome: " + this.fome +"/"+ this.maxFome);
    System.out.println("Sono: "+ this.sono +"/"+ this.maxSono);
    System.out.println("XP: " + this.xp + "/" + this.maxXp);
    System.out.println("------------------");
}
}
