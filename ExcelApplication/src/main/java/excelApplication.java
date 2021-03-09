import com.alibaba.excel.EasyExcel;
import model.Commodity;
import model.Information;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
/*
 * Created by JFormDesigner on Thu Mar 04 11:32:25 CST 2021
 */


/**
 * @author unknown
 */
public class excelApplication extends JFrame {
    private Information information;
    private Commodity commodity;
    private String commodityList;
    private java.util.List<Information> informationList;

    public excelApplication() {
        //初始化组件
        initComponents();
        informationList = new ArrayList<Information>();
        //设置按钮点击事件
        Action action_tx_add = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                information = new Information();
                information = message(tx_message.getText(), (String) cb_name.getSelectedItem());
                tx_look.setText(information.toString());
            }
        };
        Action action_tx_shopAdd = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                commodity = new Commodity();
                if (tx_shop.getText().equals("") || tx_number.getText().equals("")) {
                    return;
                } else {
                    commodity.setName(tx_shop.getText());
                    commodity.setNumber(tx_number.getText());
                    if (commodityList == null) {
                        commodityList = commodity.getName() + "###" + commodity.getNumber() + "@@@";
                    } else {
                        commodityList = commodityList + commodity.getName() + "###" + commodity.getNumber() + "@@@";
                    }
                    information.setCommodities(commodityList);
                }
                tx_look.setText(information.toString());
            }
        };
        Action action1_excel = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                String fileName = "D:/01.xlsx";
                EasyExcel.write(fileName,Information.class).sheet("模板").doWrite(informationList);
            }
        };
        Action action_tx_in = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                informationList.add(information);
                information = new Information();
                commodityList = new String();
                commodity = new Commodity();
            }
        };
        button_message.addActionListener(action_tx_add);
        button_add.addActionListener(action_tx_shopAdd);
        button_in.addActionListener(action_tx_in);
        button1.addActionListener(action1_excel);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        cb_name = new JComboBox();
        panel2 = new JPanel();
        button_message = new JButton();
        scrollPane1 = new JScrollPane();
        tx_message = new JTextArea();
        panel5 = new JPanel();
        panel3 = new JPanel();
        label2 = new JLabel();
        tx_shop = new JTextField();
        panel4 = new JPanel();
        label3 = new JLabel();
        tx_number = new JTextField();
        button_add = new JButton();
        tx_look = new JTextField();
        button_in = new JButton();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setLayout(new FlowLayout());

            //---- label1 ----
            label1.setText("\u5e73\u53f0");
            panel1.add(label1);

            //---- cb_name ----
            cb_name.setModel(new DefaultComboBoxModel(new String[] {
                "\u4eac\u4e1c",
                "\u62fc\u591a\u591a"
            }));
            panel1.add(cb_name);
        }
        contentPane.add(panel1);
        panel1.setBounds(new Rectangle(new Point(20, 10), panel1.getPreferredSize()));

        //======== panel2 ========
        {
            panel2.setLayout(new BorderLayout());

            //---- button_message ----
            button_message.setText("\u6dfb\u52a0");
            button_message.setMinimumSize(new Dimension(100, 30));
            panel2.add(button_message, BorderLayout.SOUTH);

            //======== scrollPane1 ========
            {
                scrollPane1.setEnabled(false);
                scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
                scrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

                //---- tx_message ----
                tx_message.setRows(20);
                tx_message.setMaximumSize(new Dimension(250, 2147483647));
                scrollPane1.setViewportView(tx_message);
            }
            panel2.add(scrollPane1, BorderLayout.CENTER);
        }
        contentPane.add(panel2);
        panel2.setBounds(25, 55, 350, 130);

        //======== panel5 ========
        {
            panel5.setLayout(new FlowLayout());

            //======== panel3 ========
            {
                panel3.setLayout(new FlowLayout());

                //---- label2 ----
                label2.setText("\u5546\u54c1    ");
                panel3.add(label2);

                //---- tx_shop ----
                tx_shop.setPreferredSize(new Dimension(100, 25));
                panel3.add(tx_shop);
            }
            panel5.add(panel3);

            //======== panel4 ========
            {
                panel4.setLayout(new FlowLayout());

                //---- label3 ----
                label3.setText("\u5546\u54c1\u6570\u91cf");
                panel4.add(label3);

                //---- tx_number ----
                tx_number.setPreferredSize(new Dimension(100, 25));
                panel4.add(tx_number);
            }
            panel5.add(panel4);

            //---- button_add ----
            button_add.setText("\u6dfb\u52a0");
            button_add.setMinimumSize(new Dimension(100, 30));
            panel5.add(button_add);
        }
        contentPane.add(panel5);
        panel5.setBounds(380, 55, 195, 130);
        contentPane.add(tx_look);
        tx_look.setBounds(20, 195, 655, tx_look.getPreferredSize().height);

        //---- button_in ----
        button_in.setText("\u5f55\u5165");
        contentPane.add(button_in);
        button_in.setBounds(new Rectangle(new Point(310, 235), button_in.getPreferredSize()));

        //---- button1 ----
        button1.setText("\u5bfc\u51faexcel");
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(495, 235), button1.getPreferredSize()));

        //---- button2 ----
        button2.setText("\u8f6c\u51fa");
        contentPane.add(button2);
        button2.setBounds(new Rectangle(new Point(590, 235), button2.getPreferredSize()));

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel label1;
    private JComboBox cb_name;
    private JPanel panel2;
    private JButton button_message;
    private JScrollPane scrollPane1;
    private JTextArea tx_message;
    private JPanel panel5;
    private JPanel panel3;
    private JLabel label2;
    private JTextField tx_shop;
    private JPanel panel4;
    private JLabel label3;
    private JTextField tx_number;
    private JButton button_add;
    private JTextField tx_look;
    private JButton button_in;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public Information message(String message, String shop_name) {
        Information information = new Information();
        if (shop_name.equals("拼多多")) {
            String[] message_split = message.split(" ");
            //录入姓名和电话
            information.setName(message_split[0]);
            information.setPhone(message_split[1]);
            //录入省份
            information.setProvince(message_split[2]);
            //录入城市
            information.setCity(message_split[3]);
            //录入地区
            information.setRegion(message_split[4]);
            //录入地址
            information.setDetailAddr(message_split[5]);
            System.out.println(information.toString());
        } else {
            String replace = message.replace(" ", "");
            String[] message_split = replace.split(",");
            //录入姓名
            String[] name = message_split[0].split(":");
            information.setName(name[1]);
            //录入电话
            String[] phone = message_split[1].split(":");
            information.setPhone(phone[1]);
            //录入省份
            String[] addr = message_split[2].split(":");
            String provice_maybe = addr[1].substring(0, 3);
            int begin_num = 0;
            if (provice_maybe.equals("黑龙江") || provice_maybe.equals("内蒙古")) {
                provice_maybe = provice_maybe + "省";
                information.setProvince(provice_maybe);
                begin_num = 3;
            } else {
                String provice = addr[1].substring(0, 2) + "省";
                information.setProvince(provice);
                begin_num = 2;
            }
            //录入市级
            int city_index = addr[1].indexOf("市");
            String city = addr[1].substring(begin_num, city_index + 1);
            information.setCity(city);
            System.out.println(information.toString());
            //录入区级
            int region_index = addr[1].indexOf("区");
            if (region_index != 0) {
                String region = addr[1].substring(city_index + 1, region_index + 1);
                information.setRegion(region);
                String addrDetail = addr[1].substring(region_index + 1);
                information.setDetailAddr(addrDetail);
            }
            System.out.println(information.toString());
        }
        return information;
    }
}
