import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BayesCalculatorGUI extends JFrame {

    private JTextArea resultArea;

    public BayesCalculatorGUI() {
        // Configurações da janela principal
        setTitle("Calculadora de Probabilidade - Teorema de Bayes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Layout
        setLayout(new BorderLayout());

        // Título
        JLabel titleLabel = new JLabel("Escolha um Cenário de Probabilidade", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(titleLabel, BorderLayout.NORTH);

        // Área de resultados
        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        add(scrollPane, BorderLayout.CENTER);

        // Botões de exemplo
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 2));

        JButton emailButton = new JButton("Classificação de Emails");
        JButton diseaseButton = new JButton("Detecção de Doença");
        JButton fraudButton = new JButton("Fraude Bancária");
        JButton lotteryButton = new JButton("Sorteio na Loteria");

        emailButton.addActionListener(new ExampleActionListener("email"));
        diseaseButton.addActionListener(new ExampleActionListener("disease"));
        fraudButton.addActionListener(new ExampleActionListener("fraud"));
        lotteryButton.addActionListener(new ExampleActionListener("lottery"));

        buttonPanel.add(emailButton);
        buttonPanel.add(diseaseButton);
        buttonPanel.add(fraudButton);
        buttonPanel.add(lotteryButton);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    private class ExampleActionListener implements ActionListener {
        private String exampleType;

        public ExampleActionListener(String exampleType) {
            this.exampleType = exampleType;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            switch (exampleType) {
                case "email":
                    calculateEmailSpam();
                    break;
                case "disease":
                    calculateDiseaseDetection();
                    break;
                case "fraud":
                    calculateFraudDetection();
                    break;
                case "lottery":
                    calculateLottery();
                    break;
            }
        }
    }

    private void calculateEmailSpam() {
        double probSpam = 0.4;
        double probPromoGivenSpam = 0.7;
        double probPromo = 0.5;
        double result = (probPromoGivenSpam * probSpam) / probPromo;
        resultArea.setText("Probabilidade de ser spam dado que o email contém 'promoção': "
                + (result * 100) + "%");
    }

    private void calculateDiseaseDetection() {
        double probDisease = 0.01;
        double probPositiveGivenDisease = 0.9;
        double probPositive = 0.05;
        double result = (probPositiveGivenDisease * probDisease) / probPositive;
        resultArea.setText("Probabilidade de estar doente dado o teste positivo: "
                + (result * 100) + "%");
    }

    private void calculateFraudDetection() {
        double probFraud = 0.02;
        double probAlertGivenFraud = 0.85;
        double probAlert = 0.1;
        double result = (probAlertGivenFraud * probFraud) / probAlert;
        resultArea.setText("Probabilidade de fraude dado o alerta: "
                + (result * 100) + "%");
    }

    private void calculateLottery() {
        double probWinning = 0.000001;
        double probTicketGivenWinning = 1.0;
        double probTicket = 0.01;
        double result = (probTicketGivenWinning * probWinning) / probTicket;
        resultArea.setText("Probabilidade de ganhar dado que você comprou um bilhete: "
                + (result * 100) + "%");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BayesCalculatorGUI gui = new BayesCalculatorGUI();
            gui.setVisible(true);
        });
    }
}