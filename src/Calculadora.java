import javax.swing.*;


public class Calculadora extends JFrame {
    private double numero1 = 0;
    private String operador = "";

    public Calculadora() {
        JFrame janela = new JFrame();
//      Arrumando janela da calculadora
        janela.setTitle("Minha Calculadora");
        janela.setSize(300, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//      Arrumando os botões

        JTextField visor = new JTextField(10);
        visor.setEditable(false);
        JButton igual = new JButton("=");
        JButton adicao = new JButton("+");
        JButton subtracao = new JButton("-");
        JButton multiplicacao = new JButton("*");
        JButton divisao = new JButton("/");

        int[] numeros = new int[10];

        janela.setLayout(null);

        visor.setBounds(10, 30, 265, 70);
        igual.setBounds(210, 300, 60, 40);
        adicao.setBounds(210, 260, 60, 40);
        subtracao.setBounds(210, 220, 60, 40);
        multiplicacao.setBounds(210, 180, 60, 40);
        divisao.setBounds(210, 140, 60, 40);

//      botões dos numeros

        JButton botao0 = new JButton("0");
        botao0.addActionListener(e -> visor.setText(visor.getText() + "0"));
        JButton botao1 = new JButton("1");
        botao1.addActionListener(e -> visor.setText(visor.getText() + "1"));
        JButton botao2 = new JButton("2");
        botao2.addActionListener(e -> visor.setText(visor.getText() + "2"));
        JButton botao3 = new JButton("3");
        botao3.addActionListener(e -> visor.setText(visor.getText() + "3"));
        JButton botao4 = new JButton("4");
        botao4.addActionListener(e -> visor.setText(visor.getText() + "4"));
        JButton botao5 = new JButton("5");
        botao5.addActionListener(e -> visor.setText(visor.getText() + "5"));
        JButton botao6 = new JButton("6");
        botao6.addActionListener(e -> visor.setText(visor.getText() + "6"));
        JButton botao7 = new JButton("7");
        botao7.addActionListener(e -> visor.setText(visor.getText() + "7"));
        JButton botao8 = new JButton("8");
        botao8.addActionListener(e -> visor.setText(visor.getText() + "8"));
        JButton botao9 = new JButton("9");
        botao9.addActionListener(e -> visor.setText(visor.getText() + "9"));
        JButton limpar = new JButton("C");
        limpar.addActionListener(e -> visor.setText(""));
        JButton apagar = new JButton("X");
        apagar.addActionListener(e -> {
            String texto = visor.getText();
            if (!texto.isEmpty()) {
                visor.setText(texto.substring(0, texto.length() - 1));
            }
        });


        botao0.setBounds(75, 300, 60, 40);
        botao1.setBounds(15, 260, 60, 40);
        botao2.setBounds(75, 260, 60, 40);
        botao3.setBounds(135, 260, 60, 40);
        botao4.setBounds(15, 220, 60, 40);
        botao5.setBounds(75, 220, 60, 40);
        botao6.setBounds(135, 220, 60, 40);
        botao7.setBounds(15, 180, 60, 40);
        botao8.setBounds(75, 180, 60, 40);
        botao9.setBounds(135, 180, 60, 40);
        limpar.setBounds(15, 140, 60, 40);
        apagar.setBounds(135, 140, 60, 40);

//        operações matematicas


        adicao.addActionListener(e -> {
            numero1 = Double.parseDouble(visor.getText());
            operador = "+";
            visor.setText("");
        });

        subtracao.addActionListener(e -> {
            numero1 = Double.parseDouble(visor.getText());
            operador = "-";
            visor.setText("");
        });

        multiplicacao.addActionListener(e -> {
            numero1 = Double.parseDouble(visor.getText());
            operador = "*";
            visor.setText("");
        });

        divisao.addActionListener(e -> {
            numero1 = Double.parseDouble(visor.getText());
            operador = "/";
            visor.setText("");
        });

        igual.addActionListener(e -> {
            double numero2 = Double.parseDouble(visor.getText());
            double resultado = 0;

            switch (operador) {
                case "+": resultado = numero1 + numero2; break;
                case "-": resultado = numero1 - numero2; break;
                case "*": resultado = numero1 * numero2; break;
                case "/":
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        visor.setText("Erro");
                        return;
                    }
                    break;
            }

            visor.setText(String.valueOf(resultado));
        });


//      adicionar na janela os botões

        janela.add(botao0);
        janela.add(botao1);
        janela.add(botao2);
        janela.add(botao3);
        janela.add(botao4);
        janela.add(botao5);
        janela.add(botao6);
        janela.add(botao7);
        janela.add(botao8);
        janela.add(botao9);
        janela.add(limpar);
        janela.add(apagar);
        janela.add(adicao);
        janela.add(subtracao);
        janela.add(multiplicacao);
        janela.add(divisao);
        janela.add(visor);
        janela.add(igual);

        janela.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}