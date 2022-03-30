import javax.swing.*;

class MyWindow extends JFrame {
    MyWindow() {
        super("Math function");
        this.setSize(500, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        JLabel l1 = new JLabel("Linear function: f(x) = mx + b");
        l1.setBounds(200, 10, 200, 40);
        
        JLabel linear = new JLabel("f(x) = 2x + 1");
        linear.setBounds(200, 30, 200, 40);
        
        JLabel x = new JLabel("X");
        x.setBounds(250, 100, 20, 20);
        
        JLabel y = new JLabel("Y");
        y.setBounds(430, 280, 20, 20);
        
        JLabel zero = new JLabel("0");
        zero.setBounds(230, 300, 20, 20);

        MyPanel panel = new MyPanel();
        panel.setBounds(40, 100, 500, 500);

        Net net = new Net();
        net.setBounds(40, 100, 500, 500);

        FunctionLine fn = new FunctionLine();
        fn.setBounds(40, 100, 500, 500);

        this.add(l1);
        this.add(linear);
        this.add(x);
        this.add(y);
        this.add(zero);
        this.add(panel);
        this.add(net);
        this.add(fn);
    }
}