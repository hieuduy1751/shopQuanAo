/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

/**
 *
 * @author hieud
 */
public class GUI_GioHang extends javax.swing.JPanel {

    /**
     * Creates new form GUI_GioHang
     */
    public GUI_GioHang() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtThemSanPham = new javax.swing.JTextField();
        searchBox = new javax.swing.JLabel();
        lblThemSP = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTong3 = new javax.swing.JLabel();
        btnDatHang = new javax.swing.JButton();
        lblGioHang = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelGioHang = new javax.swing.JPanel();
        panelTitlle = new javax.swing.JPanel();
        lblCotTen = new javax.swing.JLabel();
        lblCotDG = new javax.swing.JLabel();
        lblTamTinh = new javax.swing.JLabel();
        lblCotSL = new javax.swing.JLabel();
        lblThaoTac = new javax.swing.JLabel();
        gUI_GioHangComponent1 = new gui.GUI_GioHangComponent();
        gUI_GioHangComponent2 = new gui.GUI_GioHangComponent();
        gUI_GioHangComponent3 = new gui.GUI_GioHangComponent();
        gUI_GioHangComponent4 = new gui.GUI_GioHangComponent();
        gUI_GioHangComponent5 = new gui.GUI_GioHangComponent();
        gUI_GioHangComponent6 = new gui.GUI_GioHangComponent();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1100, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtThemSanPham.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtThemSanPham.setText("Thêm sản phẩm");
        txtThemSanPham.setBorder(null);
        txtThemSanPham.setOpaque(false);
        add(txtThemSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 260, 50));

        searchBox.setIcon(new javax.swing.ImageIcon("C:\\Users\\hieud\\Documents\\NetBeansProjects\\ShopQuanAo\\resources\\search.png")); // NOI18N
        add(searchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        lblThemSP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblThemSP.setText("Thêm sản phẩm:");
        add(lblThemSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Tổng:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 580, -1, -1));

        lblTong3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTong3.setText("1.150.000đ");
        add(lblTong3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 580, -1, -1));

        btnDatHang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnDatHang.setText("ĐẶT HÀNG");
        btnDatHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatHangActionPerformed(evt);
            }
        });
        add(btnDatHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 640, -1, -1));

        lblGioHang.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblGioHang.setText("GIỎ HÀNG");
        add(lblGioHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        panelGioHang.setBackground(new java.awt.Color(255, 255, 255));
        panelGioHang.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        panelGioHang.setMaximumSize(new java.awt.Dimension(940, 32767));
        panelGioHang.setMinimumSize(new java.awt.Dimension(940, 44));
        panelGioHang.setPreferredSize(new java.awt.Dimension(940, 1000));

        panelTitlle.setBackground(new java.awt.Color(255, 255, 255));
        panelTitlle.setOpaque(false);
        panelTitlle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCotTen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCotTen.setText("Tên sản phẩm");
        panelTitlle.add(lblCotTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        lblCotDG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCotDG.setText("Đơn giá");
        panelTitlle.add(lblCotDG, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        lblTamTinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTamTinh.setText("Tạm tính");
        panelTitlle.add(lblTamTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        lblCotSL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCotSL.setText("Số lượng");
        panelTitlle.add(lblCotSL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        lblThaoTac.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblThaoTac.setText("Thao tác");
        panelTitlle.add(lblThaoTac, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, -1));

        panelGioHang.add(panelTitlle);
        panelGioHang.add(gUI_GioHangComponent1);
        panelGioHang.add(gUI_GioHangComponent2);
        panelGioHang.add(gUI_GioHangComponent3);
        panelGioHang.add(gUI_GioHangComponent4);
        panelGioHang.add(gUI_GioHangComponent5);
        panelGioHang.add(gUI_GioHangComponent6);

        jScrollPane1.setViewportView(panelGioHang);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 960, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDatHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDatHangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDatHang;
    private gui.GUI_GioHangComponent gUI_GioHangComponent1;
    private gui.GUI_GioHangComponent gUI_GioHangComponent2;
    private gui.GUI_GioHangComponent gUI_GioHangComponent3;
    private gui.GUI_GioHangComponent gUI_GioHangComponent4;
    private gui.GUI_GioHangComponent gUI_GioHangComponent5;
    private gui.GUI_GioHangComponent gUI_GioHangComponent6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCotDG;
    private javax.swing.JLabel lblCotSL;
    private javax.swing.JLabel lblCotTen;
    private javax.swing.JLabel lblGioHang;
    private javax.swing.JLabel lblTamTinh;
    private javax.swing.JLabel lblThaoTac;
    private javax.swing.JLabel lblThemSP;
    private javax.swing.JLabel lblTong3;
    private javax.swing.JPanel panelGioHang;
    private javax.swing.JPanel panelTitlle;
    private javax.swing.JLabel searchBox;
    private javax.swing.JTextField txtThemSanPham;
    // End of variables declaration//GEN-END:variables
}