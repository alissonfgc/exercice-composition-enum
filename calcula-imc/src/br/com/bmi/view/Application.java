package br.com.bmi.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.com.bmi.controller.PersonController;

public class Application {

	public static void main(String[] args) {
		int option = 1;

		while (option == 1) {
			String name = JOptionPane.showInputDialog("Digite o nome: ");
			Double weight = Double.valueOf(JOptionPane.showInputDialog("Digite o peso: "));
			Double height = Double.valueOf(JOptionPane.showInputDialog("Digite a altura: "));
			JOptionPane.showMessageDialog(null, "Nome: " + name + "\n" + new PersonController().init(name, weight, height));

			int res = JOptionPane.showOptionDialog(new JFrame(), "Você quer calcular outro IMC?", "IMC",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Sim", "Não" },
					JOptionPane.YES_OPTION);

			if (res == JOptionPane.YES_OPTION) {
				option = 1;
			} else if (res == JOptionPane.NO_OPTION) {
				option = 0;
			} else if (res == JOptionPane.CLOSED_OPTION) {
				option = 0;
			}

		}

	}

}
