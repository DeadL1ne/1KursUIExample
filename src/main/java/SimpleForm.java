import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleForm extends JFrame {

    private JButton resultBtn;
    private JTextField sum1TF;
    private JTextField sum2TF;
    private JLabel resultLabel;

    public SimpleForm() {
        super("Сумматор");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
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
        resultLabel = new JLabel("Здесьь будет результат");
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(resultLabel, constraints);

        resultBtn.addActionListener(e -> {
            int summ1 = Integer.parseInt(sum1TF.getText());
            int summ2 = Integer.parseInt(sum2TF.getText());
            int result = summ1 + summ2;
            resultLabel.setText("Результат: " +  result);
        });

        this.pack();
        this.setVisible(true);
    }
}
