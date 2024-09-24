import javax.swing.*;

import java.awt.*;

public class VeiculoGUI {
	private JFrame frame;
	private JLabel tipoLabel, placaLabel, modeloLabel, corLabel;
	private JTextField tipoField, placaField, modeloField, corField;
	private JButton salvarButton;

public VeiculoGUI() {
	frame = new JFrame("Cadastro de Veículo");
	frame.setLayout(new GridLayout(5, 2));

	tipoLabel = new JLabel("Tipo:");
	tipoField = new JTextField();
	placaLabel = new JLabel("Placa:");
	placaField = new JTextField();
	modeloLabel = new JLabel("Modelo:");
	modeloField = new JTextField();
	corLabel = new JLabel("Cor:");
	corField = new JTextField();

	salvarButton = new JButton("Salvar");

	frame.add(tipoLabel);
	frame.add(tipoField);
	frame.add(placaLabel);
	frame.add(placaField);
	frame.add(modeloLabel);
	frame.add(modeloField);
	frame.add(corLabel);
	frame.add(corField);
	frame.add(salvarButton);

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300, 200);
	frame.setVisible(true);

}

public static void main(String[] args) {

SwingUtilities.invokeLater(() -> new VeiculoGUI());

}
}
