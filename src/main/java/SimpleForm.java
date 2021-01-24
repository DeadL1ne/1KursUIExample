import javax.swing.*;
import java.awt.*;

public class SimpleForm {

    private JButton resultBtn;
    private JTextField sum1TF;
    private JTextField sum2TF;
    private JLabel resultLabel;

    public SimpleForm() {
        JFrame frame = new JFrame("Сумматор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container =  frame.getContentPane();
        container.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        container.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 2.0;
        constraints.gridy = 0 ;

        constraints.gridx = 0;
        sum1TF = new JTextField("Первое слагаемое");
        container.add(sum1TF, constraints);

        constraints.gridx = 1;
        JLabel plusLabel = new JLabel("+");
        plusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(plusLabel, constraints);

        constraints.gridx = 2;
        sum2TF = new JTextField("Второе слагаемое");
        container.add(sum2TF, constraints);

        constraints.gridy = 1;
        constraints.gridx = 1;
        resultBtn = new JButton("Подсчитать");
        container.add(resultBtn, constraints);

        constraints.gridy = 2;
        constraints.gridx = 1;
        resultLabel = new JLabel("Здесь будет результат");
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(resultLabel, constraints);

        resultBtn.addActionListener(e -> {
            int summ1 = Integer.parseInt(sum1TF.getText());
            int summ2 = Integer.parseInt(sum2TF.getText());
            int result = summ1 + summ2;
            resultLabel.setText("Результат: " +  result);
        });

        frame.pack();
        frame.setVisible(true);
    }
}
