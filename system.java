import java.util.Scanner;

import java.util.Date;

class Veiculo {
    private String placa;
    private String modelo;
    private String cor;
    private Date dataEntrada;
    private Date horaEntrada;

    public Veiculo(String placa, String modelo, String cor, Date dataEntrada, Date horaEntrada) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.dataEntrada = dataEntrada;
        this.horaEntrada = horaEntrada;
    }

    // Getters e Setters

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
}

public class Main {
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		String placa =sc.next();
		
		System.out.println();
		String modelo =sc.next();

		System.out.println();
		String cor =sc.next();

		System.out.println("Placa:" + placa);
		System.out.println("Modelo:" + modelo);
		System.out.println("Cor:" + cor);

        Date dataEntrada = new Date();
        Date horaEntrada = new Date();

        Veiculo veiculo = new Veiculo("placa", "modelo", "cor", dataEntrada, horaEntrada);

        System.out.println("Veículo de placa " + placa + " entrou no estacionamento às " + veiculo.getHoraEntrada());
   
	}

}
