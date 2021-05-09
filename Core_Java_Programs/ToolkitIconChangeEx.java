//Java AWT Toolkit Example: Change TitleBar Icon

import java.awt.*;
public class ToolkitIconChangeEx {
    ToolkitIconChangeEx(){
        Frame f=new Frame();
        Image icon=Toolkit.getDefaultToolkit().getImage("H:\\harsh.jpeg");
        f.setIconImage(icon);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        ToolkitIconChangeEx t=new ToolkitIconChangeEx();
    }
}
