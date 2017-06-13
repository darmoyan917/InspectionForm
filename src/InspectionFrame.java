
import java.awt.Toolkit;
import java.awt.Color;
import static java.awt.Color.GREEN;
import static java.awt.Color.WHITE;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.io.File;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.filechooser.FileNameExtensionFilter;

final class InspectionFrame extends javax.swing.JFrame  {
    
    private static ModelDAO modelDAO = null;
    private static SetupDAO setupDAO = null;
    private static PrinterInterface printerint = null;
    private static SavedInspectionsDAO saveInspectDAO = null;
    private static saveFileDAO savefileDAO = null;
    public InspectionFrame() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        AboutFrame = new javax.swing.JFrame();
        AboutLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        OpenFileChooser = new javax.swing.JFileChooser();
        PrintFrame = new javax.swing.JFrame();
        ShopNamePrintLabel = new javax.swing.JLabel();
        ShopAddressPrintLabel = new javax.swing.JLabel();
        PrintTitleLabel = new javax.swing.JLabel();
        ShopCityPrintLabel = new javax.swing.JLabel();
        ShopPhonePrintLabel = new javax.swing.JLabel();
        ShopEmailPrintLabel = new javax.swing.JLabel();
        ShopWebsitePrintLabel = new javax.swing.JLabel();
        TirePrintPanel = new javax.swing.JPanel();
        TireDepthPrintPanel = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        spareTirePrintText = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        lfTirePrintText = new javax.swing.JTextField();
        rrTirePrintText = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        rfTirePrintText = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        lrTirePrintText = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        TireDepthMeasurementLabel = new javax.swing.JLabel();
        VehicleInfoPanelPrint = new javax.swing.JPanel();
        VinLabel1 = new javax.swing.JLabel();
        MileageLabel1 = new javax.swing.JLabel();
        yearLabel1 = new javax.swing.JLabel();
        TechnicianLabel1 = new javax.swing.JLabel();
        DateLabel1 = new javax.swing.JLabel();
        MakeLabel1 = new javax.swing.JLabel();
        ModelLabel1 = new javax.swing.JLabel();
        technicianPrintText = new javax.swing.JTextField();
        vinPrintText = new javax.swing.JTextField();
        yearPrintText = new javax.swing.JTextField();
        datePrintText = new javax.swing.JTextField();
        ModelPrintText = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        ColorPrintText = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        mileagePrintText = new javax.swing.JTextField();
        ColorLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MakePrintText = new javax.swing.JTextPane();
        SetupFrame = new javax.swing.JFrame();
        ShopNameLabel = new javax.swing.JLabel();
        ShopAddressLabel = new javax.swing.JLabel();
        ShopCityLabel = new javax.swing.JLabel();
        ShopPhoneLabel = new javax.swing.JLabel();
        ShopEmailLabel = new javax.swing.JLabel();
        ShopWebsiteLabel = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        ToolIcon = new javax.swing.JLabel();
        SaveSetup = new javax.swing.JButton();
        CancelSetup = new javax.swing.JButton();
        ShopNameField = new javax.swing.JTextField();
        ShopAddressField = new javax.swing.JTextField();
        ShopCityField = new javax.swing.JTextField();
        ShopPhoneField = new javax.swing.JTextField();
        EmailSetupField = new javax.swing.JTextField();
        WebsiteSetupField = new javax.swing.JTextField();
        SaveFileChooser = new javax.swing.JFileChooser();
        titleLabel = new javax.swing.JLabel();
        InspectionScrollPanel = new javax.swing.JScrollPane();
        inspectionItemPanel = new javax.swing.JPanel();
        brakeFluid = new javax.swing.JToggleButton();
        coolant = new javax.swing.JToggleButton();
        belts = new javax.swing.JToggleButton();
        airFilter = new javax.swing.JToggleButton();
        oilCondition = new javax.swing.JToggleButton();
        transmissionFluid = new javax.swing.JToggleButton();
        batteryCondition = new javax.swing.JToggleButton();
        washerFluid = new javax.swing.JToggleButton();
        motormounts = new javax.swing.JToggleButton();
        starter = new javax.swing.JToggleButton();
        chargingSystem = new javax.swing.JToggleButton();
        seatBelts = new javax.swing.JToggleButton();
        doorLocks = new javax.swing.JToggleButton();
        climateControl = new javax.swing.JToggleButton();
        instrumentCluster = new javax.swing.JToggleButton();
        milLight = new javax.swing.JToggleButton();
        absBrakeAirbag = new javax.swing.JToggleButton();
        windshield = new javax.swing.JToggleButton();
        Mirrors = new javax.swing.JToggleButton();
        powerWindows = new javax.swing.JToggleButton();
        stereo = new javax.swing.JToggleButton();
        doorHandles = new javax.swing.JToggleButton();
        horn = new javax.swing.JToggleButton();
        wipers = new javax.swing.JToggleButton();
        lowBeams = new javax.swing.JToggleButton();
        highBeams = new javax.swing.JToggleButton();
        fogLights = new javax.swing.JToggleButton();
        turnSignalsF = new javax.swing.JToggleButton();
        turnSignalsR = new javax.swing.JToggleButton();
        runningLights = new javax.swing.JToggleButton();
        brakeLights = new javax.swing.JToggleButton();
        licensePlateLights = new javax.swing.JToggleButton();
        reverse = new javax.swing.JToggleButton();
        suspensionComponents = new javax.swing.JToggleButton();
        wheelBearings = new javax.swing.JToggleButton();
        rotorsAndPadsF = new javax.swing.JToggleButton();
        rotorsAndPadsR = new javax.swing.JToggleButton();
        spareJackTools = new javax.swing.JToggleButton();
        exhaustSystem = new javax.swing.JToggleButton();
        cvJointsAxlesSeals = new javax.swing.JToggleButton();
        brakeFluidText = new javax.swing.JTextField();
        coolantText = new javax.swing.JTextField();
        beltsText = new javax.swing.JTextField();
        cvJointsAxlesSealsText = new javax.swing.JTextField();
        airFilterText = new javax.swing.JTextField();
        oilConditionText = new javax.swing.JTextField();
        transmissionFluidText = new javax.swing.JTextField();
        batteryConditionText = new javax.swing.JTextField();
        washerFluidText = new javax.swing.JTextField();
        motorMountsText = new javax.swing.JTextField();
        starterText = new javax.swing.JTextField();
        chargingSystemText = new javax.swing.JTextField();
        seatBeltsText = new javax.swing.JTextField();
        doorLocksText = new javax.swing.JTextField();
        climateControlText = new javax.swing.JTextField();
        instrumentClusterText = new javax.swing.JTextField();
        milLightText = new javax.swing.JTextField();
        absBrakeAirbagText = new javax.swing.JTextField();
        windshieldText = new javax.swing.JTextField();
        mirrorsText = new javax.swing.JTextField();
        powerWindowsText = new javax.swing.JTextField();
        stereoText = new javax.swing.JTextField();
        doorHandlesText = new javax.swing.JTextField();
        hornText = new javax.swing.JTextField();
        wipersText = new javax.swing.JTextField();
        lowBeamsText = new javax.swing.JTextField();
        highBeamsText = new javax.swing.JTextField();
        fogLightsText = new javax.swing.JTextField();
        turnSignalsFText = new javax.swing.JTextField();
        turnSignalsRText = new javax.swing.JTextField();
        runningLightsText = new javax.swing.JTextField();
        brakeLightsText = new javax.swing.JTextField();
        licensePlateLightsText = new javax.swing.JTextField();
        reverseText = new javax.swing.JTextField();
        suspensionComponentsText = new javax.swing.JTextField();
        wheelBearingsText = new javax.swing.JTextField();
        rotorsAndPadsFText = new javax.swing.JTextField();
        rotorsAndPadsRText = new javax.swing.JTextField();
        spareJackToolsText = new javax.swing.JTextField();
        exhaustSystemText = new javax.swing.JTextField();
        TirePanel = new javax.swing.JPanel();
        spareTire = new javax.swing.JToggleButton();
        lrTire = new javax.swing.JToggleButton();
        lfTire = new javax.swing.JToggleButton();
        rrTire = new javax.swing.JToggleButton();
        rfTire = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        TireDepthPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spareTireText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lfTireText = new javax.swing.JTextField();
        rrTireText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rfTireText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lrTireText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        InfoPanel = new javax.swing.JPanel();
        VinLabel = new javax.swing.JLabel();
        MileageLabel = new javax.swing.JLabel();
        yearText = new javax.swing.JTextField();
        yearLabel = new javax.swing.JLabel();
        TechnicianLabel = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        MakeLabel = new javax.swing.JLabel();
        ModelLabel = new javax.swing.JLabel();
        technicianText = new javax.swing.JTextField();
        ColorLabel = new javax.swing.JLabel();
        mileageText = new javax.swing.JTextField();
        vinText = new javax.swing.JTextField();
        String[] color = {"","RED", "YELLOW", "GREEN", "PURPLE", "BLACK", "WHITE","SLIVER",
            "GREY", "BROWN", "GOLD" , "PINK", "BLUE", "DARK BLUE" };
        ColorComboBox = new javax.swing.JComboBox(color);
        String[] Make = { "", "ACURA", "ASTON MARTIN" ,"AUDI" ,"BENTLEY" ,"BMW" ,"BUGATTI" ,"BUICK" ,"CADILLAC" ,"CHEVROLET" ,"CHRYSLER" ,"DODGE","FERRARI" ,"FIAT" ,
            "FORD" ,"GMC","HONDA" ,"HYUNDAI" ,"INFINITI" ,"ISUZU" ,"JAGUAR" ,"JEEP" ,"KIA" ,"LAMBORGHINI" ,"LAND ROVER" ,"LEXUS" ,"LINCOLN",
            "LOTUS" ,"MASERATI" ,"MAYBACH" ,"MAZDA" ,"MCLAREN" ,"MERCEDES BENZ" ,"MERCURY" ,"MINI" ,"MITSUBISHI" ,"NISSAN" ,"OLDSMOBILE" ,"PLYMOUTH" ,
            "PONTIAC", "PORSCHE","RANGE ROVER" ,"ROLLS ROYCE" ,"SAAB" ,"SATURN" ,"SCION" ,"SHELBY" ,"SMART CARS" ,"SUBARU" ,"SUZUKI" ,"TESLA",
            "TOYOTA" ,"VOLKSWAGEN" ,"VOLVO" };
        MakeComboBox = new javax.swing.JComboBox(Make);
        ModelComboBox = new javax.swing.JComboBox();
        DateTextField = new javax.swing.JTextField();
        FilePickerPanel = new javax.swing.JPanel();
        SavedInspectionsLabel = new javax.swing.JLabel();
        SavedFileListPane = new javax.swing.JScrollPane();
        SavedFileList = new javax.swing.JList<>();
        MainMenuBar = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        NewItem = new javax.swing.JMenuItem();
        SaveItem = new javax.swing.JMenuItem();
        OpenItem = new javax.swing.JMenuItem();
        PrintItem = new javax.swing.JMenuItem();
        CloseItem = new javax.swing.JMenuItem();
        EditMenu = new javax.swing.JMenu();
        ClearForm = new javax.swing.JMenuItem();
        SetupItem = new javax.swing.JMenuItem();
        HelpMenu = new javax.swing.JMenu();
        AboutItem = new javax.swing.JMenuItem();

        AboutFrame.setTitle("About");
        AboutFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(InspectionFrame.class.getResource("images/icon.png")));
        AboutFrame.setResizable(false);
        AboutFrame.setSize(new java.awt.Dimension(719, 477));
        Dimension abtdim = Toolkit.getDefaultToolkit().getScreenSize();
        AboutFrame.setLocation(abtdim.width/2-AboutFrame.getSize().width/2, abtdim.height/2-AboutFrame.getSize().height/2);

        AboutLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AboutLabel.setText("Beta Version ");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html>\nInspection Form is developed for Unique Auto\n<br>\n<br>\n<br>\n<center>11395 Pyrites way #G<center/>\n<center>Rancho Cordova, CA 95670<center/>");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unique_logo_rollover.jpg"))); // NOI18N

        javax.swing.GroupLayout AboutFrameLayout = new javax.swing.GroupLayout(AboutFrame.getContentPane());
        AboutFrame.getContentPane().setLayout(AboutFrameLayout);
        AboutFrameLayout.setHorizontalGroup(
            AboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutFrameLayout.createSequentialGroup()
                .addGroup(AboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AboutFrameLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AboutFrameLayout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(AboutLabel)))
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AboutFrameLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(83, 83, 83)
                .addComponent(jLabel15)
                .addGap(157, 157, 157))
        );
        AboutFrameLayout.setVerticalGroup(
            AboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AboutFrameLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(AboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(AboutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        OpenFileChooser.setCurrentDirectory(new java.io.File("C:\\Users\\Karo\\Documents\\NetBeansProjects\\InspectionForm\\Inspections"));
        OpenFileChooser.setMinimumSize(new java.awt.Dimension(582, 487));
        OpenFileChooser.setPreferredSize(new java.awt.Dimension(582, 487));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        OpenFileChooser.setFileFilter(filter);
        OpenFileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenFileChooserActionPerformed(evt);
            }
        });

        PrintFrame.setBackground(new java.awt.Color(255, 255, 255));
        PrintFrame.setForeground(java.awt.Color.white);
        PrintFrame.setResizable(false);
        PrintFrame.setSize(new java.awt.Dimension(826, 1169));

        ShopNamePrintLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ShopNamePrintLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShopNamePrintLabel.setText("Shop Name");

        ShopAddressPrintLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ShopAddressPrintLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShopAddressPrintLabel.setText("Shop Address");

        PrintTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        PrintTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PrintTitleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon.png"))); // NOI18N
        PrintTitleLabel.setText("Inspection Report");

        ShopCityPrintLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ShopCityPrintLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShopCityPrintLabel.setText("Shop City");

        ShopPhonePrintLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ShopPhonePrintLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShopPhonePrintLabel.setText("Shop Phone");

        ShopEmailPrintLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ShopEmailPrintLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShopEmailPrintLabel.setText("Shop Email");

        ShopWebsitePrintLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ShopWebsitePrintLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShopWebsitePrintLabel.setText("Shop Website");

        TirePrintPanel.setBackground(new java.awt.Color(255, 255, 255));
        TirePrintPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));

        TireDepthPrintPanel.setBackground(new java.awt.Color(255, 255, 255));
        TireDepthPrintPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("/ 32nds");
        TireDepthPrintPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 50, -1, 31));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("/ 32nds");
        TireDepthPrintPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 89, -1, 31));

        spareTireText.setVisible(false);
        spareTirePrintText.setEditable(false);
        spareTirePrintText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        spareTirePrintText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TireDepthPrintPanel.add(spareTirePrintText, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 169, 60, 31));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("/ 32nds");
        TireDepthPrintPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 11, -1, 31));

        lfTireText.setVisible(false);
        lfTirePrintText.setEditable(false);
        lfTirePrintText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lfTirePrintText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TireDepthPrintPanel.add(lfTirePrintText, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 13, 60, 31));

        rrTireText.setVisible(false);
        rrTirePrintText.setEditable(false);
        rrTirePrintText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rrTirePrintText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TireDepthPrintPanel.add(rrTirePrintText, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 130, 60, 31));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("/ 32nds");
        TireDepthPrintPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 167, -1, 31));

        rfTireText.setVisible(false);
        rfTirePrintText.setEditable(false);
        rfTirePrintText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rfTirePrintText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TireDepthPrintPanel.add(rfTirePrintText, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 52, 60, 31));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("/ 32nds");
        TireDepthPrintPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 128, -1, 31));

        lrTireText.setVisible(false);
        lrTirePrintText.setEditable(false);
        lrTirePrintText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lrTirePrintText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TireDepthPrintPanel.add(lrTirePrintText, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 91, 60, 31));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Left Front Tire :");
        TireDepthPrintPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 141, 31));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Right Front Tire :");
        TireDepthPrintPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 31));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Left Rear Tire :");
        TireDepthPrintPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 141, 31));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Right Rear Tire :");
        TireDepthPrintPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 141, 31));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Spare Tire :");
        TireDepthPrintPanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 140, 31));

        TireDepthMeasurementLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TireDepthMeasurementLabel.setText("Tire Depth Measurement");

        javax.swing.GroupLayout TirePrintPanelLayout = new javax.swing.GroupLayout(TirePrintPanel);
        TirePrintPanel.setLayout(TirePrintPanelLayout);
        TirePrintPanelLayout.setHorizontalGroup(
            TirePrintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TirePrintPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(TireDepthMeasurementLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TirePrintPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TireDepthPrintPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        TirePrintPanelLayout.setVerticalGroup(
            TirePrintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TirePrintPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TireDepthMeasurementLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TireDepthPrintPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        VehicleInfoPanelPrint.setBackground(new java.awt.Color(255, 255, 255));
        VehicleInfoPanelPrint.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.darkGray, java.awt.Color.darkGray));
        VehicleInfoPanelPrint.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VinLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        VinLabel1.setText("VIN #: ");
        VehicleInfoPanelPrint.add(VinLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 105, -1, -1));

        MileageLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MileageLabel1.setText("MILEAGE: ");
        VehicleInfoPanelPrint.add(MileageLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, -1, -1));

        yearLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        yearLabel1.setText("YEAR: ");
        VehicleInfoPanelPrint.add(yearLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 46, -1, -1));

        TechnicianLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TechnicianLabel1.setText("TECHNICIAN: ");
        VehicleInfoPanelPrint.add(TechnicianLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, -1, -1));

        DateLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DateLabel1.setText("DATE: ");
        VehicleInfoPanelPrint.add(DateLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, -1, -1));

        MakeLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MakeLabel1.setText("MAKE:");
        VehicleInfoPanelPrint.add(MakeLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 46, -1, -1));

        ModelLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ModelLabel1.setText("MODEL:");
        VehicleInfoPanelPrint.add(ModelLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 72, -1, 20));

        technicianPrintText.setEditable(false);
        technicianPrintText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VehicleInfoPanelPrint.add(technicianPrintText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 60, -1));

        vinPrintText.setEditable(false);
        vinPrintText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VehicleInfoPanelPrint.add(vinPrintText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 250, -1));

        yearPrintText.setEditable(false);
        yearPrintText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VehicleInfoPanelPrint.add(yearPrintText, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 80, -1));

        datePrintText.setEditable(false);
        datePrintText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VehicleInfoPanelPrint.add(datePrintText, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 280, -1));

        jTextPane1.setEditable(false);
        ModelPrintText.setViewportView(jTextPane1);

        VehicleInfoPanelPrint.add(ModelPrintText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 130, -1));

        jTextPane2.setEditable(false);
        ColorPrintText.setViewportView(jTextPane2);

        VehicleInfoPanelPrint.add(ColorPrintText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 170, -1));

        mileagePrintText.setEditable(false);
        mileagePrintText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mileagePrintText.setPreferredSize(new java.awt.Dimension(6, 20));
        VehicleInfoPanelPrint.add(mileagePrintText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 100, 28));

        ColorLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ColorLabel1.setText("COLOR: ");
        VehicleInfoPanelPrint.add(ColorLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 15, -1, -1));

        MakePrintText.setEditable(false);
        jScrollPane1.setViewportView(MakePrintText);

        VehicleInfoPanelPrint.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 130, -1));

        javax.swing.GroupLayout PrintFrameLayout = new javax.swing.GroupLayout(PrintFrame.getContentPane());
        PrintFrame.getContentPane().setLayout(PrintFrameLayout);
        PrintFrameLayout.setHorizontalGroup(
            PrintFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrintFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrintFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrintFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ShopWebsitePrintLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                        .addComponent(ShopEmailPrintLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                        .addComponent(ShopPhonePrintLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                        .addComponent(ShopCityPrintLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                        .addComponent(ShopAddressPrintLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ShopNamePrintLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
                    .addComponent(VehicleInfoPanelPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PrintFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PrintTitleLabel)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrintFrameLayout.createSequentialGroup()
                        .addComponent(TirePrintPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        PrintFrameLayout.setVerticalGroup(
            PrintFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrintFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrintFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PrintFrameLayout.createSequentialGroup()
                        .addComponent(ShopNamePrintLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ShopAddressPrintLabel))
                    .addComponent(PrintTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ShopCityPrintLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrintFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PrintFrameLayout.createSequentialGroup()
                        .addComponent(ShopPhonePrintLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ShopEmailPrintLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ShopWebsitePrintLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VehicleInfoPanelPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TirePrintPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(821, Short.MAX_VALUE))
        );

        SetupFrame.setTitle("Setup Shop Information");
        SetupFrame.setName("Setup"); // NOI18N
        SetupFrame.setResizable(false);
        SetupFrame.setSize(new java.awt.Dimension(898, 551));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        SetupFrame.setLocation(dim.width/2-SetupFrame.getSize().width/2, dim.height/2-SetupFrame.getSize().height/2);

        ShopNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShopNameLabel.setText("Shop Name:");

        ShopAddressLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShopAddressLabel.setText(" Address:");

        ShopCityLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShopCityLabel.setText("City State Zip:");

        ShopPhoneLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShopPhoneLabel.setText("Shop Phone:");

        ShopEmailLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShopEmailLabel.setText("Email:");

        ShopWebsiteLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShopWebsiteLabel.setText("Website:");

        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Fill out the Shop information and press SAVE to setup \nyour shop info and print customized reports.");
        TitleLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ToolIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Shop Setup.png"))); // NOI18N

        SaveSetup.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SaveSetup.setText("SAVE");
        SaveSetup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveSetupActionPerformed(evt);
            }
        });

        CancelSetup.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CancelSetup.setText("Cancel");
        CancelSetup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelSetupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SetupFrameLayout = new javax.swing.GroupLayout(SetupFrame.getContentPane());
        SetupFrame.getContentPane().setLayout(SetupFrameLayout);
        SetupFrameLayout.setHorizontalGroup(
            SetupFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SetupFrameLayout.createSequentialGroup()
                .addGroup(SetupFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SetupFrameLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(SetupFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(SetupFrameLayout.createSequentialGroup()
                                .addComponent(ShopCityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ShopCityField))
                            .addGroup(SetupFrameLayout.createSequentialGroup()
                                .addComponent(ShopAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ShopAddressField))
                            .addGroup(SetupFrameLayout.createSequentialGroup()
                                .addComponent(ShopNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ShopNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SetupFrameLayout.createSequentialGroup()
                                .addComponent(ShopPhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ShopPhoneField))
                            .addGroup(SetupFrameLayout.createSequentialGroup()
                                .addComponent(ShopEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(EmailSetupField))
                            .addGroup(SetupFrameLayout.createSequentialGroup()
                                .addComponent(ShopWebsiteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(WebsiteSetupField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(SetupFrameLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(ToolIcon)
                        .addGap(66, 66, 66)
                        .addGroup(SetupFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SetupFrameLayout.createSequentialGroup()
                                .addComponent(SaveSetup, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(214, 214, 214)
                                .addComponent(CancelSetup, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        SetupFrameLayout.setVerticalGroup(
            SetupFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SetupFrameLayout.createSequentialGroup()
                .addGroup(SetupFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SetupFrameLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SetupFrameLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(ToolIcon)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(SetupFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SetupFrameLayout.createSequentialGroup()
                        .addGroup(SetupFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(SetupFrameLayout.createSequentialGroup()
                                .addGroup(SetupFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ShopNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ShopNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ShopAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ShopAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ShopCityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ShopCityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(SetupFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShopPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShopPhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SetupFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailSetupField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShopEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SetupFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShopWebsiteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WebsiteSetupField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(SetupFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveSetup)
                    .addComponent(CancelSetup))
                .addGap(39, 39, 39))
        );

        SaveFileChooser.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        SaveFileChooser.setApproveButtonText("Save");
        SaveFileChooser.setCurrentDirectory(new java.io.File("C:\\Users\\Karo\\Documents\\NetBeansProjects\\InspectionForm\\Inspections"));
        SaveFileChooser.setDialogTitle("");
        SaveFileChooser.setToolTipText("");
        SaveFileChooser.setFileFilter(filter);
        SaveFileChooser.setMinimumSize(new java.awt.Dimension(582, 487));
        SaveFileChooser.setPreferredSize(new java.awt.Dimension(582, 487));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inspection Form");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(Toolkit.getDefaultToolkit().getImage(InspectionFrame.class.getResource("images/icon.png")));

        titleLabel.setBackground(new java.awt.Color(102, 204, 255));
        titleLabel.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Inspection Form");
        titleLabel.setOpaque(true);

        InspectionScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        InspectionScrollPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        InspectionScrollPanel.setName(""); // NOI18N
        InspectionScrollPanel.setPreferredSize(new java.awt.Dimension(682, 2592));
        InspectionScrollPanel.getVerticalScrollBar().setUnitIncrement(20);

        inspectionItemPanel.setAutoscrolls(true);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, brakeFluid, org.jdesktop.beansbinding.ELProperty.create("${selected}"), inspectionItemPanel, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        inspectionItemPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        brakeFluid.setBackground(new java.awt.Color(0, 255, 51));
        brakeFluid.setText("Brake Fluid");
        brakeFluid.setBorder(null);
        brakeFluid.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                brakeFluidStateChanged(evt);
            }
        });
        brakeFluid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brakeFluidActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(brakeFluid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 149, 30));

        coolant.setBackground(new java.awt.Color(0, 255, 51));
        coolant.setText("Coolant");
        coolant.setBorder(null);
        coolant.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                coolantStateChanged(evt);
            }
        });
        coolant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coolantActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(coolant, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 47, 149, 30));

        belts.setBackground(new java.awt.Color(0, 255, 51));
        belts.setText("Belts");
        belts.setAutoscrolls(true);
        belts.setBorder(null);
        belts.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                beltsStateChanged(evt);
            }
        });
        belts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beltsActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(belts, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 83, 149, 30));

        airFilter.setBackground(new java.awt.Color(0, 255, 51));
        airFilter.setText("Air Filter");
        airFilter.setBorder(null);
        airFilter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                airFilterStateChanged(evt);
            }
        });
        airFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airFilterActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(airFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 119, 149, 30));

        oilCondition.setBackground(new java.awt.Color(0, 255, 51));
        oilCondition.setText("Oil Condition");
        oilCondition.setBackground(new java.awt.Color(0, 255, 51));
        oilCondition.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                oilConditionStateChanged(evt);
            }
        });
        oilCondition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oilConditionActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(oilCondition, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 149, 30));

        transmissionFluid.setBackground(new java.awt.Color(0, 255, 51));
        transmissionFluid.setText("Trans Fluid");
        transmissionFluid.setBackground(new java.awt.Color(0, 255, 51));
        transmissionFluid.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                transmissionFluidStateChanged(evt);
            }
        });
        transmissionFluid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transmissionFluidActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(transmissionFluid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 149, 30));

        batteryCondition.setBackground(new java.awt.Color(0, 255, 51));
        batteryCondition.setText("Battery Condition");
        batteryCondition.setActionCommand("");
        batteryCondition.setIconTextGap(0);
        batteryCondition.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                batteryConditionStateChanged(evt);
            }
        });
        batteryCondition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batteryConditionActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(batteryCondition, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 149, 30));

        washerFluid.setBackground(new java.awt.Color(0, 255, 51));
        washerFluid.setText("Washer Fluid");
        washerFluid.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                washerFluidStateChanged(evt);
            }
        });
        washerFluid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                washerFluidActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(washerFluid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 149, 30));

        motormounts.setBackground(new java.awt.Color(0, 255, 51));
        motormounts.setText("Motor Mounts");
        motormounts.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                motormountsStateChanged(evt);
            }
        });
        motormounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motormountsActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(motormounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 149, 30));

        starter.setBackground(new java.awt.Color(0, 255, 51));
        starter.setText("Starter");
        starter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                starterStateChanged(evt);
            }
        });
        starter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                starterActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(starter, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 149, 30));

        chargingSystem.setBackground(new java.awt.Color(0, 255, 51));
        chargingSystem.setText("Charging System");
        chargingSystem.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chargingSystemStateChanged(evt);
            }
        });
        chargingSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chargingSystemActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(chargingSystem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 149, 30));

        seatBelts.setBackground(new java.awt.Color(0, 255, 51));
        seatBelts.setText("Seat Belts");
        seatBelts.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                seatBeltsStateChanged(evt);
            }
        });
        seatBelts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatBeltsActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(seatBelts, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 149, 30));

        doorLocks.setBackground(new java.awt.Color(0, 255, 51));
        doorLocks.setText("Door Locks");
        doorLocks.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                doorLocksStateChanged(evt);
            }
        });
        doorLocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doorLocksActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(doorLocks, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 149, 30));

        climateControl.setBackground(new java.awt.Color(0, 255, 51));
        climateControl.setText("Climate Control");
        climateControl.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                climateControlStateChanged(evt);
            }
        });
        climateControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                climateControlActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(climateControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 149, 30));

        instrumentCluster.setBackground(new java.awt.Color(0, 255, 51));
        instrumentCluster.setText("Instrument Cluster");
        instrumentCluster.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                instrumentClusterStateChanged(evt);
            }
        });
        instrumentCluster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instrumentClusterActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(instrumentCluster, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 149, 30));

        milLight.setBackground(new java.awt.Color(0, 255, 51));
        milLight.setText("MIL Light");
        milLight.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                milLightStateChanged(evt);
            }
        });
        milLight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                milLightActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(milLight, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 149, 30));

        absBrakeAirbag.setBackground(new java.awt.Color(0, 255, 51));
        absBrakeAirbag.setText("ABS/Brake/Airbag");
        absBrakeAirbag.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                absBrakeAirbagStateChanged(evt);
            }
        });
        absBrakeAirbag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absBrakeAirbagActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(absBrakeAirbag, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 149, 30));

        windshield.setBackground(new java.awt.Color(0, 255, 51));
        windshield.setText("Windshield");
        windshield.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                windshieldStateChanged(evt);
            }
        });
        windshield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                windshieldActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(windshield, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, 149, 30));

        Mirrors.setBackground(new java.awt.Color(0, 255, 51));
        Mirrors.setText("Mirrors");
        Mirrors.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                MirrorsStateChanged(evt);
            }
        });
        Mirrors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MirrorsActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(Mirrors, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 720, 149, 30));

        powerWindows.setBackground(new java.awt.Color(0, 255, 51));
        powerWindows.setText("Power Windows");
        powerWindows.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                powerWindowsStateChanged(evt);
            }
        });
        powerWindows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerWindowsActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(powerWindows, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 760, 149, 30));

        stereo.setBackground(new java.awt.Color(0, 255, 51));
        stereo.setText("Stereo");
        stereo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                stereoStateChanged(evt);
            }
        });
        stereo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stereoActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(stereo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 800, 149, 30));

        doorHandles.setBackground(new java.awt.Color(0, 255, 51));
        doorHandles.setText("Door Handles");
        doorHandles.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                doorHandlesStateChanged(evt);
            }
        });
        doorHandles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doorHandlesActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(doorHandles, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 840, 149, 30));

        horn.setBackground(new java.awt.Color(0, 255, 51));
        horn.setText("Horn");
        horn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                hornStateChanged(evt);
            }
        });
        horn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hornActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(horn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 880, 149, 30));

        wipers.setBackground(new java.awt.Color(0, 255, 51));
        wipers.setText("Wipers");
        wipers.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                wipersStateChanged(evt);
            }
        });
        wipers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wipersActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(wipers, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 920, 149, 30));

        lowBeams.setBackground(new java.awt.Color(0, 255, 51));
        lowBeams.setText("Low Beams");
        lowBeams.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                lowBeamsStateChanged(evt);
            }
        });
        lowBeams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowBeamsActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(lowBeams, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 960, 149, 30));

        highBeams.setBackground(new java.awt.Color(0, 255, 51));
        highBeams.setText("High Beams");
        highBeams.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                highBeamsStateChanged(evt);
            }
        });
        highBeams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highBeamsActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(highBeams, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1000, 149, 30));

        fogLights.setBackground(new java.awt.Color(0, 255, 51));
        fogLights.setText("Fog Lights");
        fogLights.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                fogLightsStateChanged(evt);
            }
        });
        fogLights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fogLightsActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(fogLights, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1040, 149, 30));

        turnSignalsF.setBackground(new java.awt.Color(0, 255, 51));
        turnSignalsF.setText("Turn Signals (F)");
        turnSignalsF.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                turnSignalsFStateChanged(evt);
            }
        });
        turnSignalsF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnSignalsFActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(turnSignalsF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1080, 149, 30));

        turnSignalsR.setBackground(new java.awt.Color(0, 255, 51));
        turnSignalsR.setText("Turn Signals (R)");
        turnSignalsR.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                turnSignalsRStateChanged(evt);
            }
        });
        turnSignalsR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnSignalsRActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(turnSignalsR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1120, 149, 30));

        runningLights.setBackground(new java.awt.Color(0, 255, 51));
        runningLights.setText("Running Lights");
        runningLights.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                runningLightsStateChanged(evt);
            }
        });
        runningLights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runningLightsActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(runningLights, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1160, 149, 30));

        brakeLights.setBackground(new java.awt.Color(0, 255, 51));
        brakeLights.setText("Brake Lights");
        brakeLights.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                brakeLightsStateChanged(evt);
            }
        });
        brakeLights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brakeLightsActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(brakeLights, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1200, 149, 30));

        licensePlateLights.setBackground(new java.awt.Color(0, 255, 51));
        licensePlateLights.setText("License Plate Lights");
        licensePlateLights.setToolTipText("");
        licensePlateLights.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                licensePlateLightsStateChanged(evt);
            }
        });
        licensePlateLights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licensePlateLightsActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(licensePlateLights, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1240, 149, 30));

        reverse.setBackground(new java.awt.Color(0, 255, 51));
        reverse.setText("Reverse");
        reverse.setToolTipText("");
        reverse.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                reverseStateChanged(evt);
            }
        });
        reverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reverseActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(reverse, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1280, 149, 30));

        suspensionComponents.setBackground(new java.awt.Color(0, 255, 51));
        suspensionComponents.setText("Suspension Components");
        suspensionComponents.setToolTipText("");
        suspensionComponents.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                suspensionComponentsStateChanged(evt);
            }
        });
        suspensionComponents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suspensionComponentsActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(suspensionComponents, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1320, 149, 30));

        wheelBearings.setBackground(new java.awt.Color(0, 255, 51));
        wheelBearings.setText("Wheel Bearings");
        wheelBearings.setToolTipText("");
        wheelBearings.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                wheelBearingsStateChanged(evt);
            }
        });
        wheelBearings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wheelBearingsActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(wheelBearings, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1360, 149, 30));

        rotorsAndPadsF.setBackground(new java.awt.Color(0, 255, 51));
        rotorsAndPadsF.setText("Front Rotors & Pads");
        rotorsAndPadsF.setToolTipText("");
        rotorsAndPadsF.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rotorsAndPadsFStateChanged(evt);
            }
        });
        rotorsAndPadsF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotorsAndPadsFActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(rotorsAndPadsF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1400, 149, 30));

        rotorsAndPadsR.setBackground(new java.awt.Color(0, 255, 51));
        rotorsAndPadsR.setText("Rear Rotors & Pads");
        rotorsAndPadsR.setToolTipText("");
        rotorsAndPadsR.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rotorsAndPadsRStateChanged(evt);
            }
        });
        rotorsAndPadsR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotorsAndPadsRActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(rotorsAndPadsR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1440, 149, 30));

        spareJackTools.setBackground(new java.awt.Color(0, 255, 51));
        spareJackTools.setText("Spare, Jack, & Tools");
        spareJackTools.setToolTipText("");
        spareJackTools.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spareJackToolsStateChanged(evt);
            }
        });
        spareJackTools.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spareJackToolsActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(spareJackTools, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1480, 149, 30));

        exhaustSystem.setBackground(new java.awt.Color(0, 255, 51));
        exhaustSystem.setText("Exhaust System");
        exhaustSystem.setToolTipText("");
        exhaustSystem.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                exhaustSystemStateChanged(evt);
            }
        });
        exhaustSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exhaustSystemActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(exhaustSystem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1520, 149, 30));

        cvJointsAxlesSeals.setBackground(new java.awt.Color(0, 255, 51));
        cvJointsAxlesSeals.setText("CV Joints, Axles, Seals");
        cvJointsAxlesSeals.setToolTipText("");
        cvJointsAxlesSeals.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cvJointsAxlesSealsStateChanged(evt);
            }
        });
        cvJointsAxlesSeals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvJointsAxlesSealsActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(cvJointsAxlesSeals, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1560, 149, 30));

        brakeFluidText.setToolTipText("Brake Fluid Condition");
        brakeFluidText.setBorder(null);
        brakeFluidText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        brakeFluidText.setVisible(false);
        brakeFluidText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        brakeFluidText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brakeFluidTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(brakeFluidText, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 11, 349, 30));

        coolantText.setToolTipText("Brake Fluid Condition");
        coolantText.setBorder(null);
        coolantText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        coolantText.setVisible(false);
        coolantText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        coolantText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coolantTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(coolantText, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 47, 349, 30));

        beltsText.setToolTipText("Brake Fluid Condition");
        beltsText.setBorder(null);
        beltsText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        beltsText.setVisible(false);
        beltsText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        beltsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beltsTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(beltsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 83, 349, 30));

        cvJointsAxlesSealsText.setToolTipText("Brake Fluid Condition");
        cvJointsAxlesSealsText.setBorder(null);
        cvJointsAxlesSealsText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        cvJointsAxlesSealsText.setVisible(false);
        cvJointsAxlesSealsText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        cvJointsAxlesSealsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvJointsAxlesSealsTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(cvJointsAxlesSealsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1560, 349, 30));

        airFilterText.setToolTipText("Brake Fluid Condition");
        airFilterText.setBorder(null);
        airFilterText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        airFilterText.setVisible(false);
        airFilterText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        airFilterText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airFilterTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(airFilterText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 349, 30));

        oilConditionText.setToolTipText("Brake Fluid Condition");
        oilConditionText.setBorder(null);
        oilConditionText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        oilConditionText.setVisible(false);
        oilConditionText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        oilConditionText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oilConditionTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(oilConditionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 349, 30));

        transmissionFluidText.setToolTipText("Brake Fluid Condition");
        transmissionFluidText.setBorder(null);
        transmissionFluidText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        transmissionFluidText.setVisible(false);
        transmissionFluidText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        transmissionFluidText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transmissionFluidTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(transmissionFluidText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 349, 30));

        batteryConditionText.setToolTipText("Brake Fluid Condition");
        batteryConditionText.setBorder(null);
        batteryConditionText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        batteryConditionText.setVisible(false);
        batteryConditionText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        batteryConditionText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batteryConditionTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(batteryConditionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 349, 30));

        washerFluidText.setToolTipText("Brake Fluid Condition");
        washerFluidText.setBorder(null);
        washerFluidText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        washerFluidText.setVisible(false);
        washerFluidText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        washerFluidText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                washerFluidTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(washerFluidText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 349, 30));

        motorMountsText.setToolTipText("Brake Fluid Condition");
        motorMountsText.setBorder(null);
        motorMountsText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        motorMountsText.setVisible(false);
        motorMountsText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        motorMountsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorMountsTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(motorMountsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 349, 30));

        starterText.setToolTipText("Brake Fluid Condition");
        starterText.setBorder(null);
        starterText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        starterText.setVisible(false);
        starterText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        starterText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                starterTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(starterText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 349, 30));

        chargingSystemText.setToolTipText("Brake Fluid Condition");
        chargingSystemText.setBorder(null);
        chargingSystemText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        chargingSystemText.setVisible(false);
        chargingSystemText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        chargingSystemText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chargingSystemTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(chargingSystemText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 349, 30));

        seatBeltsText.setToolTipText("Brake Fluid Condition");
        seatBeltsText.setBorder(null);
        seatBeltsText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        seatBeltsText.setVisible(false);
        seatBeltsText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        seatBeltsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatBeltsTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(seatBeltsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 349, 30));

        doorLocksText.setToolTipText("Brake Fluid Condition");
        doorLocksText.setBorder(null);
        doorLocksText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        doorLocksText.setVisible(false);
        doorLocksText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        doorLocksText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doorLocksTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(doorLocksText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 349, 30));

        climateControlText.setToolTipText("Brake Fluid Condition");
        climateControlText.setBorder(null);
        climateControlText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        climateControlText.setVisible(false);
        climateControlText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        climateControlText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                climateControlTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(climateControlText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 349, 30));

        instrumentClusterText.setToolTipText("Brake Fluid Condition");
        instrumentClusterText.setBorder(null);
        instrumentClusterText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        instrumentClusterText.setVisible(false);
        instrumentClusterText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        instrumentClusterText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instrumentClusterTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(instrumentClusterText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 349, 30));

        milLightText.setToolTipText("Brake Fluid Condition");
        milLightText.setBorder(null);
        milLightText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        milLightText.setVisible(false);
        milLightText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        milLightText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                milLightTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(milLightText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, 349, 30));

        absBrakeAirbagText.setToolTipText("Brake Fluid Condition");
        absBrakeAirbagText.setBorder(null);
        absBrakeAirbagText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        absBrakeAirbagText.setVisible(false);
        absBrakeAirbagText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        absBrakeAirbagText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absBrakeAirbagTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(absBrakeAirbagText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 640, 349, 30));

        windshieldText.setToolTipText("Brake Fluid Condition");
        windshieldText.setBorder(null);
        windshieldText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        windshieldText.setVisible(false);
        windshieldText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        windshieldText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                windshieldTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(windshieldText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 680, 349, 30));

        mirrorsText.setToolTipText("Brake Fluid Condition");
        mirrorsText.setBorder(null);
        mirrorsText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        mirrorsText.setVisible(false);
        mirrorsText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        mirrorsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mirrorsTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(mirrorsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 720, 349, 30));

        powerWindowsText.setToolTipText("Brake Fluid Condition");
        powerWindowsText.setBorder(null);
        powerWindowsText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        powerWindowsText.setVisible(false);
        powerWindowsText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        powerWindowsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerWindowsTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(powerWindowsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 760, 349, 30));

        stereoText.setToolTipText("Brake Fluid Condition");
        stereoText.setBorder(null);
        stereoText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        stereoText.setVisible(false);
        stereoText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        stereoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stereoTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(stereoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 800, 349, 30));

        doorHandlesText.setToolTipText("Brake Fluid Condition");
        doorHandlesText.setBorder(null);
        doorHandlesText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        doorHandlesText.setVisible(false);
        doorHandlesText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        doorHandlesText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doorHandlesTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(doorHandlesText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 840, 349, 30));

        hornText.setToolTipText("Brake Fluid Condition");
        hornText.setBorder(null);
        hornText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        hornText.setVisible(false);
        hornText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        hornText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hornTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(hornText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 880, 349, 30));

        wipersText.setToolTipText("Brake Fluid Condition");
        wipersText.setBorder(null);
        wipersText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        wipersText.setVisible(false);
        wipersText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        wipersText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wipersTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(wipersText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 920, 349, 30));

        lowBeamsText.setToolTipText("Brake Fluid Condition");
        lowBeamsText.setBorder(null);
        lowBeamsText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        lowBeamsText.setVisible(false);
        lowBeamsText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        lowBeamsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowBeamsTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(lowBeamsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 960, 349, 30));

        highBeamsText.setToolTipText("Brake Fluid Condition");
        highBeamsText.setBorder(null);
        highBeamsText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        highBeamsText.setVisible(false);
        highBeamsText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        highBeamsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highBeamsTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(highBeamsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1000, 349, 30));

        fogLightsText.setToolTipText("Brake Fluid Condition");
        fogLightsText.setBorder(null);
        fogLightsText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        fogLightsText.setVisible(false);
        fogLightsText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        fogLightsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fogLightsTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(fogLightsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1040, 349, 30));

        turnSignalsFText.setToolTipText("Brake Fluid Condition");
        turnSignalsFText.setBorder(null);
        turnSignalsFText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        turnSignalsFText.setVisible(false);
        turnSignalsFText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        turnSignalsFText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnSignalsFTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(turnSignalsFText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1080, 349, 30));

        turnSignalsRText.setToolTipText("Brake Fluid Condition");
        turnSignalsRText.setBorder(null);
        turnSignalsRText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        turnSignalsRText.setVisible(false);
        turnSignalsRText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        turnSignalsRText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnSignalsRTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(turnSignalsRText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1120, 349, 30));

        runningLightsText.setToolTipText("Brake Fluid Condition");
        runningLightsText.setBorder(null);
        runningLightsText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        runningLightsText.setVisible(false);
        runningLightsText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        runningLightsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runningLightsTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(runningLightsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1160, 349, 30));

        brakeLightsText.setToolTipText("Brake Fluid Condition");
        brakeLightsText.setBorder(null);
        brakeLightsText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        brakeLightsText.setVisible(false);
        brakeLightsText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        brakeLightsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brakeLightsTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(brakeLightsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1200, 349, 30));

        licensePlateLightsText.setToolTipText("Brake Fluid Condition");
        licensePlateLightsText.setBorder(null);
        licensePlateLightsText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        licensePlateLightsText.setVisible(false);
        licensePlateLightsText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        licensePlateLightsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licensePlateLightsTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(licensePlateLightsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1240, 349, 30));

        reverseText.setToolTipText("Brake Fluid Condition");
        reverseText.setBorder(null);
        reverseText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        reverseText.setVisible(false);
        reverseText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        reverseText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reverseTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(reverseText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1280, 349, 30));

        suspensionComponentsText.setToolTipText("Brake Fluid Condition");
        suspensionComponentsText.setBorder(null);
        suspensionComponentsText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        suspensionComponentsText.setVisible(false);
        suspensionComponentsText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        suspensionComponentsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suspensionComponentsTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(suspensionComponentsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1320, 349, 30));

        wheelBearingsText.setToolTipText("Brake Fluid Condition");
        wheelBearingsText.setBorder(null);
        wheelBearingsText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        wheelBearingsText.setVisible(false);
        wheelBearingsText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        wheelBearingsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wheelBearingsTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(wheelBearingsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1360, 349, 30));

        rotorsAndPadsFText.setToolTipText("Brake Fluid Condition");
        rotorsAndPadsFText.setBorder(null);
        rotorsAndPadsFText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        rotorsAndPadsFText.setVisible(false);
        rotorsAndPadsFText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        rotorsAndPadsFText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotorsAndPadsFTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(rotorsAndPadsFText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1400, 349, 30));

        rotorsAndPadsRText.setToolTipText("Brake Fluid Condition");
        rotorsAndPadsRText.setBorder(null);
        rotorsAndPadsRText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        rotorsAndPadsRText.setVisible(false);
        rotorsAndPadsRText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        rotorsAndPadsRText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotorsAndPadsRTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(rotorsAndPadsRText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1440, 349, 30));

        spareJackToolsText.setToolTipText("Brake Fluid Condition");
        spareJackToolsText.setBorder(null);
        spareJackToolsText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        spareJackToolsText.setVisible(false);
        spareJackToolsText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        spareJackToolsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spareJackToolsTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(spareJackToolsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1480, 349, 30));

        exhaustSystemText.setToolTipText("Brake Fluid Condition");
        exhaustSystemText.setBorder(null);
        exhaustSystemText.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        exhaustSystemText.setVisible(false);
        exhaustSystemText.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        exhaustSystemText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exhaustSystemTextActionPerformed(evt);
            }
        });
        inspectionItemPanel.add(exhaustSystemText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1520, 349, 30));

        InspectionScrollPanel.setViewportView(inspectionItemPanel);

        TirePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 255, 204), null, null));

        spareTire.setBackground(new java.awt.Color(0, 255, 51));
        spareTire.setText("Spare Tire");
        spareTire.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spareTireStateChanged(evt);
            }
        });
        spareTire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spareTireActionPerformed(evt);
            }
        });

        lrTire.setBackground(new java.awt.Color(0, 255, 51));
        lrTire.setText("LR Tire");
        lrTire.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                lrTireStateChanged(evt);
            }
        });
        lrTire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lrTireActionPerformed(evt);
            }
        });

        lfTire.setBackground(new java.awt.Color(0, 255, 51));
        lfTire.setText("LF Tire");
        lfTire.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                lfTireStateChanged(evt);
            }
        });
        lfTire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lfTireActionPerformed(evt);
            }
        });

        rrTire.setBackground(new java.awt.Color(0, 255, 51));
        rrTire.setText("RR Tire");
        rrTire.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rrTireStateChanged(evt);
            }
        });
        rrTire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rrTireActionPerformed(evt);
            }
        });

        rfTire.setBackground(new java.awt.Color(0, 255, 51));
        rfTire.setText("RF Tire");
        rfTire.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rfTireStateChanged(evt);
            }
        });
        rfTire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfTireActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Tire Inspection.jpg"))); // NOI18N

        TireDepthPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("/ 32nds");
        TireDepthPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 50, -1, 31));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("/ 32nds");
        TireDepthPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 89, -1, 31));

        spareTireText.setVisible(false);
        spareTireText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        spareTireText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        spareTireText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                spareTireTextFocusLost(evt);
            }
        });
        TireDepthPanel.add(spareTireText, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 169, 60, 31));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("/ 32nds");
        TireDepthPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 11, -1, 31));

        lfTireText.setVisible(false);
        lfTireText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lfTireText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lfTireText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lfTireTextFocusLost(evt);
            }
        });
        TireDepthPanel.add(lfTireText, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 13, 60, 31));

        rrTireText.setVisible(false);
        rrTireText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rrTireText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rrTireText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                rrTireTextFocusLost(evt);
            }
        });
        TireDepthPanel.add(rrTireText, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 130, 60, 31));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("/ 32nds");
        TireDepthPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 167, -1, 31));

        rfTireText.setVisible(false);
        rfTireText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rfTireText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rfTireText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                rfTireTextFocusLost(evt);
            }
        });
        TireDepthPanel.add(rfTireText, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 52, 60, 31));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("/ 32nds");
        TireDepthPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 128, -1, 31));

        lrTireText.setVisible(false);
        lrTireText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lrTireText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lrTireText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lrTireTextFocusLost(evt);
            }
        });
        TireDepthPanel.add(lrTireText, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 91, 60, 31));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Left Front Tire :");
        TireDepthPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 141, 31));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Right Front Tire :");
        TireDepthPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 31));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Left Rear Tire :");
        TireDepthPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 141, 31));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Right Rear Tire :");
        TireDepthPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 141, 31));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Spare Tire :");
        TireDepthPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 140, 31));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Tire Depth Measurement");

        javax.swing.GroupLayout TirePanelLayout = new javax.swing.GroupLayout(TirePanel);
        TirePanel.setLayout(TirePanelLayout);
        TirePanelLayout.setHorizontalGroup(
            TirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TirePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(TirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TirePanelLayout.createSequentialGroup()
                        .addGroup(TirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lfTire, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lrTire, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rfTire)
                            .addComponent(rrTire)))
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TirePanelLayout.createSequentialGroup()
                        .addComponent(spareTire)
                        .addGap(105, 105, 105)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TirePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TireDepthPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        TirePanelLayout.setVerticalGroup(
            TirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TirePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(TirePanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(rfTire, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(rrTire, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TirePanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lfTire, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(lrTire, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spareTire, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TireDepthPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        InfoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VinLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        VinLabel.setText("VIN #: ");
        InfoPanel.add(VinLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, -1, -1));

        MileageLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MileageLabel.setText("MILEAGE: ");
        InfoPanel.add(MileageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 76, -1, -1));

        yearText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        InfoPanel.add(yearText, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 86, 30));

        yearLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yearLabel.setText("YEAR: ");
        InfoPanel.add(yearLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 28, -1, -1));

        TechnicianLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TechnicianLabel.setText("TECHNICIAN: ");
        InfoPanel.add(TechnicianLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        DateLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DateLabel.setText("DATE: ");
        InfoPanel.add(DateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, -1, -1));

        MakeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MakeLabel.setText("MAKE:");
        InfoPanel.add(MakeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 28, -1, -1));

        ModelLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ModelLabel.setText("MODEL:");
        InfoPanel.add(ModelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, 30));
        InfoPanel.add(technicianText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 188, 30));

        ColorLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ColorLabel.setText("COLOR: ");
        InfoPanel.add(ColorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 28, -1, -1));

        mileageText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        InfoPanel.add(mileageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 69, 190, 30));

        vinText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        InfoPanel.add(vinText, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 69, 240, 30));

        ColorComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        InfoPanel.add(ColorComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 140, 30));

        MakeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MakeComboBoxActionPerformed(evt);
            }
        });
        InfoPanel.add(MakeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 210, 30));

        InfoPanel.add(ModelComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 210, 30));
        InfoPanel.add(DateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, 210, 30));

        FilePickerPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.lightGray));
        FilePickerPanel.setPreferredSize(new java.awt.Dimension(244, 1045));

        SavedInspectionsLabel.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        SavedInspectionsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SavedInspectionsLabel.setText("Saved Inspections");
        SavedInspectionsLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        SavedInspectionsLabel.setMaximumSize(new java.awt.Dimension(220, 27));
        SavedInspectionsLabel.setMinimumSize(new java.awt.Dimension(220, 27));
        SavedInspectionsLabel.setPreferredSize(new java.awt.Dimension(240, 27));
        SavedInspectionsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SavedInspectionsLabelMouseClicked(evt);
            }
        });

        SavedFileList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SavedFileList.setMaximumSize(new java.awt.Dimension(33, 80));
        SavedFileList.setMinimumSize(new java.awt.Dimension(33, 80));
        SavedFileList.setPreferredSize(new java.awt.Dimension(33, 80));
        SavedFileList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SavedFileListMouseClicked(evt);
            }
        });
        SavedFileListPane.setViewportView(SavedFileList);

        javax.swing.GroupLayout FilePickerPanelLayout = new javax.swing.GroupLayout(FilePickerPanel);
        FilePickerPanel.setLayout(FilePickerPanelLayout);
        FilePickerPanelLayout.setHorizontalGroup(
            FilePickerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FilePickerPanelLayout.createSequentialGroup()
                .addGroup(FilePickerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(SavedFileListPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(SavedInspectionsLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FilePickerPanelLayout.setVerticalGroup(
            FilePickerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FilePickerPanelLayout.createSequentialGroup()
                .addComponent(SavedInspectionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SavedFileListPane))
        );

        MainMenuBar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        FileMenu.setText("File");

        NewItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        NewItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new icon.png"))); // NOI18N
        NewItem.setText("New");
        NewItem.setIconTextGap(15);
        NewItem.setPreferredSize(new java.awt.Dimension(90, 22));
        NewItem.setRequestFocusEnabled(false);
        FileMenu.add(NewItem);

        SaveItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        SaveItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save icon.png"))); // NOI18N
        SaveItem.setText("Save");
        SaveItem.setIconTextGap(15);
        SaveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveItemActionPerformed(evt);
            }
        });
        FileMenu.add(SaveItem);

        OpenItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        OpenItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/open icon.png"))); // NOI18N
        OpenItem.setText("Open");
        OpenItem.setIconTextGap(15);
        OpenItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenItemActionPerformed(evt);
            }
        });
        FileMenu.add(OpenItem);

        PrintItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        PrintItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print icon.png"))); // NOI18N
        PrintItem.setText("Print");
        PrintItem.setIconTextGap(15);
        PrintItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintItemActionPerformed(evt);
            }
        });
        FileMenu.add(PrintItem);

        CloseItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        CloseItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit icon.png"))); // NOI18N
        CloseItem.setText("Exit");
        CloseItem.setIconTextGap(15);
        CloseItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseItemActionPerformed(evt);
            }
        });
        FileMenu.add(CloseItem);

        MainMenuBar.add(FileMenu);

        EditMenu.setText("Edit");

        ClearForm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        ClearForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clear icon.png"))); // NOI18N
        ClearForm.setText("Clear Form");
        ClearForm.setIconTextGap(15);
        ClearForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearFormActionPerformed(evt);
            }
        });
        EditMenu.add(ClearForm);

        SetupItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        SetupItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/setup icon.png"))); // NOI18N
        SetupItem.setText("Setup Shop Info");
        SetupItem.setIconTextGap(15);
        SetupItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetupItemActionPerformed(evt);
            }
        });
        EditMenu.add(SetupItem);

        MainMenuBar.add(EditMenu);

        HelpMenu.setText("Help");
        HelpMenu.setPreferredSize(new java.awt.Dimension(50, 19));

        AboutItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        AboutItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about icon.png"))); // NOI18N
        AboutItem.setText("About");
        AboutItem.setIconTextGap(15);
        AboutItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutItemActionPerformed(evt);
            }
        });
        HelpMenu.add(AboutItem);

        MainMenuBar.add(HelpMenu);

        setJMenuBar(MainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FilePickerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 1026, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TirePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(InspectionScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FilePickerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(InfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TirePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InspectionScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 75, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void beltsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beltsActionPerformed
        if (belts.isSelected()) {
            beltsText.setVisible(true);
            beltsText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            beltsText.setVisible(false);
            beltsText.setBorder(null);
            
        }
        

    }//GEN-LAST:event_beltsActionPerformed

    private void beltsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_beltsStateChanged
        
        if (belts.isSelected()) {
            belts.setBackground(Color.RED);
        } else {
            belts.setBackground(Color.GREEN);
        }
        

    }//GEN-LAST:event_beltsStateChanged

    private void coolantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coolantActionPerformed
        if (coolant.isSelected()) {
            coolantText.setVisible(true);
            coolantText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            coolantText.setVisible(false);
            coolantText.setBorder(null);
            
        }
    }//GEN-LAST:event_coolantActionPerformed

    private void coolantStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_coolantStateChanged
        if (coolant.isSelected()) {
            coolant.setBackground(Color.RED);
        } else {
            coolant.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_coolantStateChanged

    private void brakeFluidStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_brakeFluidStateChanged
        if (brakeFluid.isSelected()) {
            brakeFluid.setBackground(Color.RED);
        } else {
            brakeFluid.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_brakeFluidStateChanged

    private void airFilterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_airFilterStateChanged
        if (airFilter.isSelected()) {
            airFilter.setBackground(Color.RED);
        } else {
            airFilter.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_airFilterStateChanged

    private void oilConditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oilConditionActionPerformed
        if (oilCondition.isSelected()) {
            oilConditionText.setVisible(true);
            oilConditionText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            oilConditionText.setVisible(false);
            oilConditionText.setBorder(null);
            
        }
    }//GEN-LAST:event_oilConditionActionPerformed

    private void transmissionFluidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transmissionFluidActionPerformed
        if (transmissionFluid.isSelected()) {
            transmissionFluidText.setVisible(true);
            transmissionFluidText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            transmissionFluidText.setVisible(false);
            transmissionFluidText.setBorder(null);
            
        }
    }//GEN-LAST:event_transmissionFluidActionPerformed

    private void batteryConditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batteryConditionActionPerformed
        if (batteryCondition.isSelected()) {
            batteryConditionText.setVisible(true);
            batteryConditionText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            batteryConditionText.setVisible(false);
            batteryConditionText.setBorder(null);
            
        }
    }//GEN-LAST:event_batteryConditionActionPerformed

    private void washerFluidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_washerFluidActionPerformed
        if (washerFluid.isSelected()) {
            washerFluidText.setVisible(true);
            washerFluidText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            washerFluidText.setVisible(false);
            washerFluidText.setBorder(null);
            
        }
    }//GEN-LAST:event_washerFluidActionPerformed

    private void motormountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motormountsActionPerformed
        if (motormounts.isSelected()) {
            motorMountsText.setVisible(true);
            motorMountsText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            motorMountsText.setVisible(false);
            motorMountsText.setBorder(null);
            
        }
    }//GEN-LAST:event_motormountsActionPerformed

    private void starterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_starterActionPerformed
        if (starter.isSelected()) {
            starterText.setVisible(true);
            starterText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            starterText.setVisible(false);
            starterText.setBorder(null);
            
        }
    }//GEN-LAST:event_starterActionPerformed

    private void chargingSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chargingSystemActionPerformed
        if (chargingSystem.isSelected()) {
            chargingSystemText.setVisible(true);
            chargingSystemText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            chargingSystemText.setVisible(false);
            chargingSystemText.setBorder(null);
            
        }
    }//GEN-LAST:event_chargingSystemActionPerformed

    private void seatBeltsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatBeltsActionPerformed
        if (seatBelts.isSelected()) {
            seatBeltsText.setVisible(true);
            seatBeltsText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            seatBeltsText.setVisible(false);
            seatBeltsText.setBorder(null);
            
        }
    }//GEN-LAST:event_seatBeltsActionPerformed

    private void doorLocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doorLocksActionPerformed
        if (doorLocks.isSelected()) {
            doorLocksText.setVisible(true);
            doorLocksText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            doorLocksText.setVisible(false);
            doorLocksText.setBorder(null);
            
        }
    }//GEN-LAST:event_doorLocksActionPerformed

    private void climateControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_climateControlActionPerformed
        if (climateControl.isSelected()) {
            climateControlText.setVisible(true);
            climateControlText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            climateControlText.setVisible(false);
            climateControlText.setBorder(null);
            
        }
    }//GEN-LAST:event_climateControlActionPerformed

    private void instrumentClusterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrumentClusterActionPerformed
        if (instrumentCluster.isSelected()) {
            instrumentClusterText.setVisible(true);
            instrumentClusterText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            instrumentClusterText.setVisible(false);
            instrumentClusterText.setBorder(null);
            
        }
    }//GEN-LAST:event_instrumentClusterActionPerformed

    private void milLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_milLightActionPerformed
        if (milLight.isSelected()) {
            milLightText.setVisible(true);
            milLightText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            milLightText.setVisible(false);
            milLightText.setBorder(null);
            
        }
    }//GEN-LAST:event_milLightActionPerformed

    private void absBrakeAirbagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absBrakeAirbagActionPerformed
        if (absBrakeAirbag.isSelected()) {
            absBrakeAirbagText.setVisible(true);
            absBrakeAirbagText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            absBrakeAirbagText.setVisible(false);
            absBrakeAirbagText.setBorder(null);
            
        }
    }//GEN-LAST:event_absBrakeAirbagActionPerformed

    private void windshieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_windshieldActionPerformed
        if (windshield.isSelected()) {
            windshieldText.setVisible(true);
            windshieldText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            windshieldText.setVisible(false);
            windshieldText.setBorder(null);
            
        }
    }//GEN-LAST:event_windshieldActionPerformed

    private void MirrorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MirrorsActionPerformed
        if (Mirrors.isSelected()) {
            mirrorsText.setVisible(true);
            mirrorsText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            mirrorsText.setVisible(false);
            mirrorsText.setBorder(null);
            
        }
    }//GEN-LAST:event_MirrorsActionPerformed

    private void powerWindowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerWindowsActionPerformed
        if (powerWindows.isSelected()) {
            powerWindowsText.setVisible(true);
            powerWindowsText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            powerWindowsText.setVisible(false);
            powerWindowsText.setBorder(null);
            
        }
    }//GEN-LAST:event_powerWindowsActionPerformed

    private void stereoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stereoActionPerformed
        if (stereo.isSelected()) {
            stereoText.setVisible(true);
            stereoText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            stereoText.setVisible(false);
            stereoText.setBorder(null);
            
        }
    }//GEN-LAST:event_stereoActionPerformed

    private void doorHandlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doorHandlesActionPerformed
        if (doorHandles.isSelected()) {
            doorHandlesText.setVisible(true);
            doorHandlesText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            doorHandlesText.setVisible(false);
            doorHandlesText.setBorder(null);
            
        }
    }//GEN-LAST:event_doorHandlesActionPerformed

    private void hornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hornActionPerformed
        if (horn.isSelected()) {
            hornText.setVisible(true);
            hornText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            hornText.setVisible(false);
            hornText.setBorder(null);
            
        }
    }//GEN-LAST:event_hornActionPerformed

    private void wipersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wipersActionPerformed
        if (wipers.isSelected()) {
            wipersText.setVisible(true);
            wipersText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            wipersText.setVisible(false);
            wipersText.setBorder(null);
            
        }
    }//GEN-LAST:event_wipersActionPerformed

    private void lowBeamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowBeamsActionPerformed
        if (lowBeams.isSelected()) {
            lowBeamsText.setVisible(true);
            lowBeamsText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            lowBeamsText.setVisible(false);
            lowBeamsText.setBorder(null);
            
        }
    }//GEN-LAST:event_lowBeamsActionPerformed

    private void highBeamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highBeamsActionPerformed
        if (highBeams.isSelected()) {
            highBeamsText.setVisible(true);
            highBeamsText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            highBeamsText.setVisible(false);
            highBeamsText.setBorder(null);
            
        }
    }//GEN-LAST:event_highBeamsActionPerformed

    private void fogLightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fogLightsActionPerformed
        if (fogLights.isSelected()) {
            fogLightsText.setVisible(true);
            fogLightsText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            fogLightsText.setVisible(false);
            fogLightsText.setBorder(null);
            
        }
    }//GEN-LAST:event_fogLightsActionPerformed

    private void turnSignalsFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnSignalsFActionPerformed
        if (turnSignalsF.isSelected()) {
            turnSignalsFText.setVisible(true);
            turnSignalsFText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            turnSignalsFText.setVisible(false);
            turnSignalsFText.setBorder(null);
            
        }
    }//GEN-LAST:event_turnSignalsFActionPerformed

    private void turnSignalsRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnSignalsRActionPerformed
        if (turnSignalsR.isSelected()) {
            turnSignalsRText.setVisible(true);
            turnSignalsRText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            turnSignalsRText.setVisible(false);
            turnSignalsRText.setBorder(null);
            
        }
    }//GEN-LAST:event_turnSignalsRActionPerformed

    private void runningLightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runningLightsActionPerformed
        if (runningLights.isSelected()) {
            runningLightsText.setVisible(true);
            runningLightsText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            runningLightsText.setVisible(false);
            runningLightsText.setBorder(null);
            
        }
    }//GEN-LAST:event_runningLightsActionPerformed

    private void brakeLightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brakeLightsActionPerformed
        if (brakeLights.isSelected()) {
            brakeLightsText.setVisible(true);
            brakeLightsText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            brakeLightsText.setVisible(false);
            brakeLightsText.setBorder(null);
            
        }
    }//GEN-LAST:event_brakeLightsActionPerformed

    private void licensePlateLightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licensePlateLightsActionPerformed
        if (licensePlateLights.isSelected()) {
            licensePlateLightsText.setVisible(true);
            licensePlateLightsText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            licensePlateLightsText.setVisible(false);
            licensePlateLightsText.setBorder(null);
            
        }
    }//GEN-LAST:event_licensePlateLightsActionPerformed

    private void reverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reverseActionPerformed
        if (reverse.isSelected()) {
            reverseText.setVisible(true);
            reverseText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            reverseText.setVisible(false);
            reverseText.setBorder(null);
            
        }
    }//GEN-LAST:event_reverseActionPerformed

    private void suspensionComponentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suspensionComponentsActionPerformed
        if (suspensionComponents.isSelected()) {
            suspensionComponentsText.setVisible(true);
            suspensionComponentsText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            suspensionComponentsText.setVisible(false);
            suspensionComponentsText.setBorder(null);
            
        }
    }//GEN-LAST:event_suspensionComponentsActionPerformed

    private void wheelBearingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wheelBearingsActionPerformed
        if (wheelBearings.isSelected()) {
            wheelBearingsText.setVisible(true);
            wheelBearingsText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            wheelBearingsText.setVisible(false);
            wheelBearingsText.setBorder(null);
            
        }
    }//GEN-LAST:event_wheelBearingsActionPerformed

    private void rotorsAndPadsFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotorsAndPadsFActionPerformed
        if (rotorsAndPadsF.isSelected()) {
            rotorsAndPadsFText.setVisible(true);
            rotorsAndPadsFText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            rotorsAndPadsFText.setVisible(false);
            rotorsAndPadsFText.setBorder(null);
            
        }
    }//GEN-LAST:event_rotorsAndPadsFActionPerformed

    private void rotorsAndPadsRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotorsAndPadsRActionPerformed
        if (rotorsAndPadsR.isSelected()) {
            rotorsAndPadsRText.setVisible(true);
            rotorsAndPadsRText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            rotorsAndPadsRText.setVisible(false);
            rotorsAndPadsRText.setBorder(null);
            
        }
    }//GEN-LAST:event_rotorsAndPadsRActionPerformed

    private void spareJackToolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spareJackToolsActionPerformed
        if (spareJackTools.isSelected()) {
            spareJackToolsText.setVisible(true);
            spareJackToolsText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            spareJackToolsText.setVisible(false);
            spareJackToolsText.setBorder(null);
            
        }
    }//GEN-LAST:event_spareJackToolsActionPerformed

    private void exhaustSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exhaustSystemActionPerformed
        if (exhaustSystem.isSelected()) {
            exhaustSystemText.setVisible(true);
            exhaustSystemText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            exhaustSystemText.setVisible(false);
            exhaustSystemText.setBorder(null);
            
        }
    }//GEN-LAST:event_exhaustSystemActionPerformed

    private void cvJointsAxlesSealsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvJointsAxlesSealsActionPerformed
        if (cvJointsAxlesSeals.isSelected()) {
            cvJointsAxlesSealsText.setVisible(true);
            cvJointsAxlesSealsText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            cvJointsAxlesSealsText.setVisible(false);
            cvJointsAxlesSealsText.setBorder(null);
            
        }
    }//GEN-LAST:event_cvJointsAxlesSealsActionPerformed

    private void brakeFluidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brakeFluidActionPerformed
        if (brakeFluid.isSelected()) {
            brakeFluidText.setVisible(true);
            brakeFluidText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            brakeFluidText.setVisible(false);
            brakeFluidText.setBorder(null);
            
        }
        
    }//GEN-LAST:event_brakeFluidActionPerformed

    private void brakeFluidTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brakeFluidTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brakeFluidTextActionPerformed

    private void coolantTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coolantTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coolantTextActionPerformed

    private void beltsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beltsTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beltsTextActionPerformed

    private void airFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airFilterActionPerformed
        if (airFilter.isSelected()) {
            airFilterText.setVisible(true);
            airFilterText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            inspectionItemPanel.revalidate();
            inspectionItemPanel.repaint();
        } else {
            airFilterText.setVisible(false);
            airFilterText.setBorder(null);
            
        }
    }//GEN-LAST:event_airFilterActionPerformed

    private void oilConditionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_oilConditionStateChanged
        if (oilCondition.isSelected()) {
            oilCondition.setBackground(Color.RED);
        } else {
            oilCondition.setBackground(Color.GREEN);
        }
        
    }//GEN-LAST:event_oilConditionStateChanged

    private void transmissionFluidStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_transmissionFluidStateChanged
        if (transmissionFluid.isSelected()) {
            transmissionFluid.setBackground(Color.RED);
        } else {
            transmissionFluid.setBackground(Color.GREEN);
        }
        
    }//GEN-LAST:event_transmissionFluidStateChanged

    private void batteryConditionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_batteryConditionStateChanged
        if (batteryCondition.isSelected()) {
            batteryCondition.setBackground(Color.RED);
        } else {
            batteryCondition.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_batteryConditionStateChanged

    private void washerFluidStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_washerFluidStateChanged
        if (washerFluid.isSelected()) {
            washerFluid.setBackground(Color.RED);
        } else {
            washerFluid.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_washerFluidStateChanged

    private void motormountsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_motormountsStateChanged
        if (motormounts.isSelected()) {
            motormounts.setBackground(Color.RED);
        } else {
            motormounts.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_motormountsStateChanged

    private void starterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_starterStateChanged
        if (starter.isSelected()) {
            starter.setBackground(Color.RED);
        } else {
            starter.setBackground(Color.GREEN);
        }    }//GEN-LAST:event_starterStateChanged

    private void chargingSystemStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chargingSystemStateChanged
        if (chargingSystem.isSelected()) {
            chargingSystem.setBackground(Color.RED);
        } else {
            chargingSystem.setBackground(Color.GREEN);
        }    }//GEN-LAST:event_chargingSystemStateChanged

    private void seatBeltsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_seatBeltsStateChanged
        if (seatBelts.isSelected()) {
            seatBelts.setBackground(Color.RED);
        } else {
            seatBelts.setBackground(Color.GREEN);
        }    }//GEN-LAST:event_seatBeltsStateChanged

    private void doorLocksStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_doorLocksStateChanged
        if (doorLocks.isSelected()) {
            doorLocks.setBackground(Color.RED);
        } else {
            doorLocks.setBackground(Color.GREEN);
        }    }//GEN-LAST:event_doorLocksStateChanged

    private void climateControlStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_climateControlStateChanged
        if (climateControl.isSelected()) {
            climateControl.setBackground(Color.RED);
        } else {
            climateControl.setBackground(Color.GREEN);
        }    }//GEN-LAST:event_climateControlStateChanged

    private void instrumentClusterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_instrumentClusterStateChanged
        if (instrumentCluster.isSelected()) {
            instrumentCluster.setBackground(Color.RED);
        } else {
            instrumentCluster.setBackground(Color.GREEN);
        }    }//GEN-LAST:event_instrumentClusterStateChanged

    private void milLightStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_milLightStateChanged
        if (milLight.isSelected()) {
            milLight.setBackground(Color.RED);
        } else {
            milLight.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_milLightStateChanged

    private void absBrakeAirbagStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_absBrakeAirbagStateChanged
        if (absBrakeAirbag.isSelected()) {
            absBrakeAirbag.setBackground(Color.RED);
        } else {
            absBrakeAirbag.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_absBrakeAirbagStateChanged

    private void windshieldStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_windshieldStateChanged
        if (windshield.isSelected()) {
            windshield.setBackground(Color.RED);
        } else {
            windshield.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_windshieldStateChanged

    private void MirrorsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_MirrorsStateChanged
        if (Mirrors.isSelected()) {
            Mirrors.setBackground(Color.RED);
        } else {
            Mirrors.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_MirrorsStateChanged

    private void powerWindowsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_powerWindowsStateChanged
        if (powerWindows.isSelected()) {
            powerWindows.setBackground(Color.RED);
        } else {
            powerWindows.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_powerWindowsStateChanged

    private void stereoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_stereoStateChanged
        if (stereo.isSelected()) {
            stereo.setBackground(Color.RED);
        } else {
            stereo.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_stereoStateChanged

    private void doorHandlesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_doorHandlesStateChanged
        if (doorHandles.isSelected()) {
            doorHandles.setBackground(Color.RED);
        } else {
            doorHandles.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_doorHandlesStateChanged

    private void hornStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_hornStateChanged
        if (horn.isSelected()) {
            horn.setBackground(Color.RED);
        } else {
            horn.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_hornStateChanged

    private void wipersStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_wipersStateChanged
        if (wipers.isSelected()) {
            wipers.setBackground(Color.RED);
        } else {
            wipers.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_wipersStateChanged

    private void lowBeamsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_lowBeamsStateChanged
        if (lowBeams.isSelected()) {
            lowBeams.setBackground(Color.RED);
        } else {
            lowBeams.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_lowBeamsStateChanged

    private void highBeamsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_highBeamsStateChanged
        if (highBeams.isSelected()) {
            highBeams.setBackground(Color.RED);
        } else {
            highBeams.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_highBeamsStateChanged

    private void fogLightsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_fogLightsStateChanged
        if (fogLights.isSelected()) {
            fogLights.setBackground(Color.RED);
        } else {
            fogLights.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_fogLightsStateChanged

    private void turnSignalsFStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_turnSignalsFStateChanged
        if (turnSignalsF.isSelected()) {
            turnSignalsF.setBackground(Color.RED);
        } else {
            turnSignalsF.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_turnSignalsFStateChanged

    private void turnSignalsRStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_turnSignalsRStateChanged
        if (turnSignalsR.isSelected()) {
            turnSignalsR.setBackground(Color.RED);
        } else {
            turnSignalsR.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_turnSignalsRStateChanged

    private void runningLightsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_runningLightsStateChanged
        if (runningLights.isSelected()) {
            runningLights.setBackground(Color.RED);
        } else {
            runningLights.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_runningLightsStateChanged

    private void brakeLightsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_brakeLightsStateChanged
        if (brakeLights.isSelected()) {
            brakeLights.setBackground(Color.RED);
        } else {
            brakeLights.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_brakeLightsStateChanged

    private void licensePlateLightsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_licensePlateLightsStateChanged
        if (licensePlateLights.isSelected()) {
            licensePlateLights.setBackground(Color.RED);
        } else {
            licensePlateLights.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_licensePlateLightsStateChanged

    private void reverseStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_reverseStateChanged
        if (reverse.isSelected()) {
            reverse.setBackground(Color.RED);
        } else {
            reverse.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_reverseStateChanged

    private void suspensionComponentsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_suspensionComponentsStateChanged
        if (suspensionComponents.isSelected()) {
            suspensionComponents.setBackground(Color.RED);
        } else {
            suspensionComponents.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_suspensionComponentsStateChanged

    private void wheelBearingsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_wheelBearingsStateChanged
        if (wheelBearings.isSelected()) {
            wheelBearings.setBackground(Color.RED);
        } else {
            wheelBearings.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_wheelBearingsStateChanged

    private void rotorsAndPadsFStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rotorsAndPadsFStateChanged
        if (rotorsAndPadsF.isSelected()) {
            rotorsAndPadsF.setBackground(Color.RED);
        } else {
            rotorsAndPadsF.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_rotorsAndPadsFStateChanged

    private void rotorsAndPadsRStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rotorsAndPadsRStateChanged
        if (rotorsAndPadsR.isSelected()) {
            rotorsAndPadsR.setBackground(Color.RED);
        } else {
            rotorsAndPadsR.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_rotorsAndPadsRStateChanged

    private void spareJackToolsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spareJackToolsStateChanged
        if (spareJackTools.isSelected()) {
            spareJackTools.setBackground(Color.RED);
        } else {
            spareJackTools.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_spareJackToolsStateChanged

    private void exhaustSystemStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_exhaustSystemStateChanged
        if (exhaustSystem.isSelected()) {
            exhaustSystem.setBackground(Color.RED);
        } else {
            exhaustSystem.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_exhaustSystemStateChanged

    private void cvJointsAxlesSealsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cvJointsAxlesSealsStateChanged
        if (cvJointsAxlesSeals.isSelected()) {
            cvJointsAxlesSeals.setBackground(Color.RED);
        } else {
            cvJointsAxlesSeals.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_cvJointsAxlesSealsStateChanged

    private void cvJointsAxlesSealsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvJointsAxlesSealsTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvJointsAxlesSealsTextActionPerformed

    private void airFilterTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airFilterTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airFilterTextActionPerformed

    private void oilConditionTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oilConditionTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oilConditionTextActionPerformed

    private void transmissionFluidTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transmissionFluidTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transmissionFluidTextActionPerformed

    private void batteryConditionTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batteryConditionTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_batteryConditionTextActionPerformed

    private void washerFluidTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_washerFluidTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_washerFluidTextActionPerformed

    private void motorMountsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorMountsTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_motorMountsTextActionPerformed

    private void starterTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_starterTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_starterTextActionPerformed

    private void chargingSystemTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chargingSystemTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chargingSystemTextActionPerformed

    private void seatBeltsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatBeltsTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatBeltsTextActionPerformed

    private void climateControlTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_climateControlTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_climateControlTextActionPerformed

    private void instrumentClusterTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrumentClusterTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_instrumentClusterTextActionPerformed

    private void milLightTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_milLightTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_milLightTextActionPerformed

    private void absBrakeAirbagTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absBrakeAirbagTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_absBrakeAirbagTextActionPerformed

    private void windshieldTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_windshieldTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_windshieldTextActionPerformed

    private void mirrorsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mirrorsTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mirrorsTextActionPerformed

    private void powerWindowsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerWindowsTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_powerWindowsTextActionPerformed

    private void stereoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stereoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stereoTextActionPerformed

    private void doorHandlesTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doorHandlesTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doorHandlesTextActionPerformed

    private void hornTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hornTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hornTextActionPerformed

    private void wipersTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wipersTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wipersTextActionPerformed

    private void lowBeamsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowBeamsTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lowBeamsTextActionPerformed

    private void highBeamsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highBeamsTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_highBeamsTextActionPerformed

    private void fogLightsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fogLightsTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fogLightsTextActionPerformed

    private void turnSignalsFTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnSignalsFTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_turnSignalsFTextActionPerformed

    private void turnSignalsRTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnSignalsRTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_turnSignalsRTextActionPerformed

    private void runningLightsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runningLightsTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_runningLightsTextActionPerformed

    private void brakeLightsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brakeLightsTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brakeLightsTextActionPerformed

    private void licensePlateLightsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licensePlateLightsTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_licensePlateLightsTextActionPerformed

    private void reverseTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reverseTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reverseTextActionPerformed

    private void suspensionComponentsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suspensionComponentsTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suspensionComponentsTextActionPerformed

    private void wheelBearingsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wheelBearingsTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wheelBearingsTextActionPerformed

    private void rotorsAndPadsFTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotorsAndPadsFTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rotorsAndPadsFTextActionPerformed

    private void rotorsAndPadsRTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotorsAndPadsRTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rotorsAndPadsRTextActionPerformed

    private void spareJackToolsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spareJackToolsTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spareJackToolsTextActionPerformed

    private void exhaustSystemTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exhaustSystemTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exhaustSystemTextActionPerformed

    private void doorLocksTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doorLocksTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doorLocksTextActionPerformed

    private void rfTireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfTireActionPerformed
        if (rfTire.isSelected()) {
            rfTireText.setVisible(true);
            rfTireText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            TirePanel.revalidate();
            TirePanel.repaint();
        } else {
            rfTireText.setVisible(false);
            rfTireText.setBorder(null);
            
        }
    }//GEN-LAST:event_rfTireActionPerformed

    private void lfTireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lfTireActionPerformed
        if (lfTire.isSelected()) {
            lfTireText.setVisible(true);
            lfTireText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            TirePanel.revalidate();
            TirePanel.repaint();
        } else {
            lfTireText.setVisible(false);
            lfTireText.setBorder(null);
            
        }
    }//GEN-LAST:event_lfTireActionPerformed

    private void rfTireStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rfTireStateChanged
        if (rfTire.isSelected()) {
            rfTire.setBackground(Color.RED);
        } else {
            rfTire.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_rfTireStateChanged

    private void rrTireStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rrTireStateChanged
        if (rrTire.isSelected()) {
            rrTire.setBackground(Color.RED);
        } else {
            rrTire.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_rrTireStateChanged

    private void lrTireStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_lrTireStateChanged
        if (lrTire.isSelected()) {
            lrTire.setBackground(Color.RED);
        } else {
            lrTire.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_lrTireStateChanged

    private void lfTireStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_lfTireStateChanged
        if (lfTire.isSelected()) {
            lfTire.setBackground(Color.RED);
        } else {
            lfTire.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_lfTireStateChanged

    private void spareTireStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spareTireStateChanged
        if (spareTire.isSelected()) {
            spareTire.setBackground(Color.RED);
        } else {
            spareTire.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_spareTireStateChanged

    private void lrTireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lrTireActionPerformed
        if (lrTire.isSelected()) {
            lrTireText.setVisible(true);
            lrTireText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            TirePanel.revalidate();
            TirePanel.repaint();
        } else {
            lrTireText.setVisible(false);
            lrTireText.setBorder(null);
            
        }
    }//GEN-LAST:event_lrTireActionPerformed

    private void spareTireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spareTireActionPerformed
        if (spareTire.isSelected()) {
            spareTireText.setVisible(true);
            spareTireText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            TirePanel.revalidate();
            TirePanel.repaint();
        } else {
            spareTireText.setVisible(false);
            spareTireText.setBorder(null);
            
        }
    }//GEN-LAST:event_spareTireActionPerformed

    private void rrTireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rrTireActionPerformed
        if (rrTire.isSelected()) {
            rrTireText.setVisible(true);
            rrTireText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            TirePanel.revalidate();
            TirePanel.repaint();
        } else {
            rrTireText.setVisible(false);
            rrTireText.setBorder(null);
            
        }
    }//GEN-LAST:event_rrTireActionPerformed

    private void lfTireTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lfTireTextFocusLost
        String lfTire1;
        lfTire1 = lfTireText.getText();
        if (!lfTire1.equals("")&& !lfTire1.equals(" ")){
        int lfTire = Integer.parseInt(lfTire1);
        if (lfTire <= 5) {
            lfTireText.setBackground(Color.RED);
        } else if (lfTire <= 10) {
            lfTireText.setBackground(Color.YELLOW);
        } else if (lfTire > 10) {
            lfTireText.setBackground(Color.GREEN);
        }
        }
    }//GEN-LAST:event_lfTireTextFocusLost

    private void rfTireTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rfTireTextFocusLost
        String rfTire1;
        rfTire1 = rfTireText.getText();
        if (!rfTire1.equals("")&& !rfTire1.equals(" ")){
        int rfTire = Integer.parseInt(rfTire1);
        if (rfTire <= 5) {
            rfTireText.setBackground(Color.RED);
        } else if (rfTire <= 10) {
            rfTireText.setBackground(Color.YELLOW);
        } else if (rfTire > 10) {
            rfTireText.setBackground(Color.GREEN);
        }
        }
    }//GEN-LAST:event_rfTireTextFocusLost

    private void lrTireTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lrTireTextFocusLost
        String lrTire1;
        lrTire1 = lrTireText.getText();
        if (!lrTire1.equals("")&& !lrTire1.equals(" ")){
        int lrTire = Integer.parseInt(lrTire1);
        if (lrTire <= 5) {
            lrTireText.setBackground(Color.RED);
        } else if (lrTire <= 10) {
            lrTireText.setBackground(Color.YELLOW);
        } else if (lrTire > 10) {
            lrTireText.setBackground(Color.GREEN);
        }
        }
    }//GEN-LAST:event_lrTireTextFocusLost

    private void rrTireTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rrTireTextFocusLost
        String rrTire1;
        rrTire1 = rrTireText.getText();
        if (!rrTire1.equals("")&& !rrTire1.equals(" ")){
        int rrTire = Integer.parseInt(rrTire1);
        if (rrTire <= 5) {
            rrTireText.setBackground(Color.RED);
        } else if (rrTire <= 10) {
            rrTireText.setBackground(Color.YELLOW);
        } else if (rrTire > 10) {
            rrTireText.setBackground(Color.GREEN);
        }
        }
    }//GEN-LAST:event_rrTireTextFocusLost

    private void spareTireTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_spareTireTextFocusLost
        String spareTire1;
        spareTire1 = spareTireText.getText();
        if (!spareTire1.equals("")&& !spareTire1.equals(" ")){
        int spareTire = Integer.parseInt(spareTire1);
        if (spareTire <= 5) {
            spareTireText.setBackground(Color.RED);
        } else if (spareTire <= 10) {
            spareTireText.setBackground(Color.YELLOW);
        } else if (spareTire > 10) {
            spareTireText.setBackground(Color.GREEN);
        }
        }
    }//GEN-LAST:event_spareTireTextFocusLost

       String [] ReadField = new String [80];
       String [] selected = new String [80];
       int i =0, s = 0, k =0,j =0;
    public boolean GetPrintComponents (Container container) {
       
        boolean isfilled=true;
        for (Component c : container.getComponents()) {
            
            if (c instanceof JTextField) {
                JTextField f = (JTextField) c;
                ReadField[i] = f.getText();
                System.out.println(ReadField[i]);
                
                i++;
            } else if (c instanceof JComboBox){
                if(((JComboBox) c).getSelectedIndex()>=0){
                selected[s] = ((JComboBox) c).getSelectedItem().toString();
                System.out.println(selected[s]);
                s++;
                }
                else {
                    JOptionPane.showMessageDialog(new javax.swing.JWindow(), "Please select Color, Make, and Model before printing.");
                    isfilled = false;
                    break;
                     }
                } else if (c instanceof Container) {
                GetPrintComponents((Container) c);
            }
            
        }
        return isfilled;
    }
    public void FillPrintComponents(Container printContainer){
        
        
        for (Component f : printContainer.getComponents()) {
            
            if (f instanceof JTextField) {
                ((JTextField) f).setText(ReadField[j].toUpperCase());
                j++;
            } else if (f instanceof JTextPane) {
                ((JTextPane) f).setText(selected[k].toUpperCase());
                k++;
            } else if (f instanceof Container) {
                FillPrintComponents( (Container) f);
            
            }
           
        }
    }
    public boolean setupFrameToPrint(){
        boolean isfilled;
        setupDAO = DAOFactory.getSetupDAO();
        int numOfLines = setupDAO.LineNumber();
        String[] SetupInfoRead = setupDAO.getSetupInfo(numOfLines);
        ShopNamePrintLabel.setText(SetupInfoRead[0]);
        ShopAddressPrintLabel.setText(SetupInfoRead[1]);
        ShopCityPrintLabel.setText(SetupInfoRead[2]);
        ShopPhonePrintLabel.setText(SetupInfoRead[3]);
        ShopEmailPrintLabel.setText(SetupInfoRead[4]);
        ShopWebsitePrintLabel.setText(SetupInfoRead[5]);
        GetPrintComponents(this.TireDepthPanel);
        FillPrintComponents(this.TireDepthPrintPanel);
        isfilled = GetPrintComponents(this.InfoPanel);
        if(isfilled)
        FillPrintComponents(this.VehicleInfoPanelPrint);
        i =0; s = 0; k =0;j =0;
        return isfilled;
        }
    private void PrintItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintItemActionPerformed
        printerint = DAOFactory.getPrintInt();
        boolean isfilled = setupFrameToPrint();
        if(isfilled){
        PrintFrame.setVisible(true);
        printerint.PrintPage(PrintFrame);
        }
    }//GEN-LAST:event_PrintItemActionPerformed
    public void clearTextFields(Container container) {
        
        for (Component c : container.getComponents()) {
            if (c instanceof JTextField) {
                JTextField f = (JTextField) c;
                f.setText("");
            } else if (c instanceof Container) {
                clearTextFields((Container) c);
            } 
        }
    }

    public void clearSelectedButtons(Container container) {
        for (Component c : container.getComponents()) {
            if (c instanceof JTextField) {
                JTextField f = (JTextField) c;
                f.setVisible(false);
                f.setBackground(WHITE);
            } else if (c instanceof JToggleButton) {
                JToggleButton j = (JToggleButton) c;
                j.setSelected(false);
                j.setBackground(GREEN);
            }
        }
    }
    private void ClearFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearFormActionPerformed
        clearTextFields(this.getContentPane());
        clearSelectedButtons(this.inspectionItemPanel);
        clearSelectedButtons(this.TirePanel);
        clearSelectedButtons(this.TireDepthPanel);
    }//GEN-LAST:event_ClearFormActionPerformed
    
    private void SaveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveItemActionPerformed
        savefileDAO = DAOFactory.getSaveFileDAO();
        int ArraySize = savefileDAO.getComponentSize(InfoPanel);
        String [] component1 = savefileDAO.getComponenets(InfoPanel,ArraySize , 0);
        int save = savefileDAO.setComponentsToNewFile(yearText, MakeComboBox, ModelComboBox, vinText, SaveFileChooser, this, component1);
        if(save == JFileChooser.APPROVE_OPTION){
        ArraySize = savefileDAO.getComponentSize(TireDepthPanel);
        String [] component2 = savefileDAO.getComponenets(TireDepthPanel, ArraySize,0);
        savefileDAO.setComponentsToFile(component2, SaveFileChooser);
        ArraySize = savefileDAO.getComponentSize(inspectionItemPanel);
        String [] component3 = savefileDAO.getComponenets(inspectionItemPanel, ArraySize,0);
        savefileDAO.setComponentsToFile(component3, SaveFileChooser);
        }
    }//GEN-LAST:event_SaveItemActionPerformed

    private void AboutItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutItemActionPerformed
        AboutFrame.setVisible(true);
    }//GEN-LAST:event_AboutItemActionPerformed

    private void MakeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MakeComboBoxActionPerformed
        int MakeIndex = MakeComboBox.getSelectedIndex();
        if(MakeIndex > 0){
        String SelectedMake = MakeComboBox.getItemAt(MakeIndex).toString();
        modelDAO = DAOFactory.getModelDAO(SelectedMake);
        String[] ModelCombo = modelDAO.SetModelCombo();
        ModelComboBox.removeAllItems();
        for (int i = 0; i < ModelCombo.length; i++) {
            if (ModelCombo[i] != null) {
                String Combo = ModelCombo[i];
                ModelComboBox.addItem(Combo);
            }
        }
        }
    }//GEN-LAST:event_MakeComboBoxActionPerformed

    private void OpenItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenItemActionPerformed
        OpenFileChooser.showOpenDialog(this);
    }//GEN-LAST:event_OpenItemActionPerformed
    
    private void OpenFileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenFileChooserActionPerformed
        File Openfile = OpenFileChooser.getSelectedFile();
        
    }//GEN-LAST:event_OpenFileChooserActionPerformed

    private void CloseItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CloseItemActionPerformed

    private void SetupItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetupItemActionPerformed
        SetupFrame.setVisible(true);
    }//GEN-LAST:event_SetupItemActionPerformed

    private void CancelSetupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelSetupActionPerformed
        SetupFrame.setVisible(false);
    }//GEN-LAST:event_CancelSetupActionPerformed

    private void SaveSetupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveSetupActionPerformed
        setupDAO = DAOFactory.getSetupDAO();
        if (!ShopNameField.getText().equals("")) {
            setupDAO.UpdateSetupFile(ShopNameField.getText(), ShopAddressField.getText(), ShopCityField.getText(), ShopPhoneField.getText(), EmailSetupField.getText(), WebsiteSetupField.getText());
            SetupFrame.setVisible(false);
    }//GEN-LAST:event_SaveSetupActionPerformed
    }    
    private void SavedFileListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SavedFileListMouseClicked
    String selection = SavedFileList.getSelectedValue() + ".txt";
    int numOfLines = saveInspectDAO.GetLineNumber(selection);
    String [] readFileValues = saveInspectDAO.setSavedInspections(numOfLines, selection);
    for (int i = 0; i < readFileValues.length; i++) {
            if (readFileValues[i] != null) {
                System.out.println(readFileValues[i]);
            }
    }//GEN-LAST:event_SavedFileListMouseClicked
    }
    
    private void SavedInspectionsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SavedInspectionsLabelMouseClicked
        DefaultListModel saveList = new DefaultListModel();
        saveInspectDAO = DAOFactory.getInspectionsDAO();
        saveInspectDAO.getSavedInspections(SavedFileList, saveList);
    }//GEN-LAST:event_SavedInspectionsLabelMouseClicked
  

    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {                    
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    //javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InspectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InspectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InspectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InspectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InspectionFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JFrame AboutFrame;
    javax.swing.JMenuItem AboutItem;
    javax.swing.JLabel AboutLabel;
    javax.swing.JButton CancelSetup;
    javax.swing.JMenuItem ClearForm;
    javax.swing.JMenuItem CloseItem;
    javax.swing.JComboBox ColorComboBox;
    javax.swing.JLabel ColorLabel;
    javax.swing.JLabel ColorLabel1;
    javax.swing.JScrollPane ColorPrintText;
    javax.swing.JLabel DateLabel;
    javax.swing.JLabel DateLabel1;
    javax.swing.JTextField DateTextField;
    javax.swing.JMenu EditMenu;
    javax.swing.JTextField EmailSetupField;
    javax.swing.JMenu FileMenu;
    javax.swing.JPanel FilePickerPanel;
    javax.swing.JMenu HelpMenu;
    javax.swing.JPanel InfoPanel;
    javax.swing.JScrollPane InspectionScrollPanel;
    javax.swing.JMenuBar MainMenuBar;
    javax.swing.JComboBox MakeComboBox;
    javax.swing.JLabel MakeLabel;
    javax.swing.JLabel MakeLabel1;
    javax.swing.JTextPane MakePrintText;
    javax.swing.JLabel MileageLabel;
    javax.swing.JLabel MileageLabel1;
    javax.swing.JToggleButton Mirrors;
    javax.swing.JComboBox ModelComboBox;
    javax.swing.JLabel ModelLabel;
    javax.swing.JLabel ModelLabel1;
    javax.swing.JScrollPane ModelPrintText;
    javax.swing.JMenuItem NewItem;
    javax.swing.JFileChooser OpenFileChooser;
    javax.swing.JMenuItem OpenItem;
    javax.swing.JFrame PrintFrame;
    javax.swing.JMenuItem PrintItem;
    javax.swing.JLabel PrintTitleLabel;
    javax.swing.JFileChooser SaveFileChooser;
    javax.swing.JMenuItem SaveItem;
    javax.swing.JButton SaveSetup;
    javax.swing.JList<String> SavedFileList;
    javax.swing.JScrollPane SavedFileListPane;
    javax.swing.JLabel SavedInspectionsLabel;
    javax.swing.JFrame SetupFrame;
    javax.swing.JMenuItem SetupItem;
    javax.swing.JTextField ShopAddressField;
    javax.swing.JLabel ShopAddressLabel;
    javax.swing.JLabel ShopAddressPrintLabel;
    javax.swing.JTextField ShopCityField;
    javax.swing.JLabel ShopCityLabel;
    javax.swing.JLabel ShopCityPrintLabel;
    javax.swing.JLabel ShopEmailLabel;
    javax.swing.JLabel ShopEmailPrintLabel;
    javax.swing.JTextField ShopNameField;
    javax.swing.JLabel ShopNameLabel;
    javax.swing.JLabel ShopNamePrintLabel;
    javax.swing.JTextField ShopPhoneField;
    javax.swing.JLabel ShopPhoneLabel;
    javax.swing.JLabel ShopPhonePrintLabel;
    javax.swing.JLabel ShopWebsiteLabel;
    javax.swing.JLabel ShopWebsitePrintLabel;
    javax.swing.JLabel TechnicianLabel;
    javax.swing.JLabel TechnicianLabel1;
    javax.swing.JLabel TireDepthMeasurementLabel;
    javax.swing.JPanel TireDepthPanel;
    javax.swing.JPanel TireDepthPrintPanel;
    javax.swing.JPanel TirePanel;
    javax.swing.JPanel TirePrintPanel;
    javax.swing.JLabel TitleLabel;
    javax.swing.JLabel ToolIcon;
    javax.swing.JPanel VehicleInfoPanelPrint;
    javax.swing.JLabel VinLabel;
    javax.swing.JLabel VinLabel1;
    javax.swing.JTextField WebsiteSetupField;
    javax.swing.JToggleButton absBrakeAirbag;
    javax.swing.JTextField absBrakeAirbagText;
    javax.swing.JToggleButton airFilter;
    javax.swing.JTextField airFilterText;
    javax.swing.JToggleButton batteryCondition;
    javax.swing.JTextField batteryConditionText;
    javax.swing.JToggleButton belts;
    javax.swing.JTextField beltsText;
    javax.swing.JToggleButton brakeFluid;
    javax.swing.JTextField brakeFluidText;
    javax.swing.JToggleButton brakeLights;
    javax.swing.JTextField brakeLightsText;
    javax.swing.JToggleButton chargingSystem;
    javax.swing.JTextField chargingSystemText;
    javax.swing.JToggleButton climateControl;
    javax.swing.JTextField climateControlText;
    javax.swing.JToggleButton coolant;
    javax.swing.JTextField coolantText;
    javax.swing.JToggleButton cvJointsAxlesSeals;
    javax.swing.JTextField cvJointsAxlesSealsText;
    javax.swing.JTextField datePrintText;
    javax.swing.JToggleButton doorHandles;
    javax.swing.JTextField doorHandlesText;
    javax.swing.JToggleButton doorLocks;
    javax.swing.JTextField doorLocksText;
    javax.swing.JToggleButton exhaustSystem;
    javax.swing.JTextField exhaustSystemText;
    javax.swing.JToggleButton fogLights;
    javax.swing.JTextField fogLightsText;
    javax.swing.JToggleButton highBeams;
    javax.swing.JTextField highBeamsText;
    javax.swing.JToggleButton horn;
    javax.swing.JTextField hornText;
    javax.swing.JPanel inspectionItemPanel;
    javax.swing.JToggleButton instrumentCluster;
    javax.swing.JTextField instrumentClusterText;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel10;
    javax.swing.JLabel jLabel11;
    javax.swing.JLabel jLabel12;
    javax.swing.JLabel jLabel13;
    javax.swing.JLabel jLabel14;
    javax.swing.JLabel jLabel15;
    javax.swing.JLabel jLabel18;
    javax.swing.JLabel jLabel19;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel20;
    javax.swing.JLabel jLabel21;
    javax.swing.JLabel jLabel22;
    javax.swing.JLabel jLabel23;
    javax.swing.JLabel jLabel24;
    javax.swing.JLabel jLabel25;
    javax.swing.JLabel jLabel26;
    javax.swing.JLabel jLabel27;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    javax.swing.JLabel jLabel7;
    javax.swing.JLabel jLabel8;
    javax.swing.JLabel jLabel9;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JTextPane jTextPane1;
    javax.swing.JTextPane jTextPane2;
    javax.swing.JToggleButton lfTire;
    javax.swing.JTextField lfTirePrintText;
    javax.swing.JTextField lfTireText;
    javax.swing.JToggleButton licensePlateLights;
    javax.swing.JTextField licensePlateLightsText;
    javax.swing.JToggleButton lowBeams;
    javax.swing.JTextField lowBeamsText;
    javax.swing.JToggleButton lrTire;
    javax.swing.JTextField lrTirePrintText;
    javax.swing.JTextField lrTireText;
    javax.swing.JToggleButton milLight;
    javax.swing.JTextField milLightText;
    javax.swing.JTextField mileagePrintText;
    javax.swing.JTextField mileageText;
    javax.swing.JTextField mirrorsText;
    javax.swing.JTextField motorMountsText;
    javax.swing.JToggleButton motormounts;
    javax.swing.JToggleButton oilCondition;
    javax.swing.JTextField oilConditionText;
    javax.swing.JToggleButton powerWindows;
    javax.swing.JTextField powerWindowsText;
    javax.swing.JToggleButton reverse;
    javax.swing.JTextField reverseText;
    javax.swing.JToggleButton rfTire;
    javax.swing.JTextField rfTirePrintText;
    javax.swing.JTextField rfTireText;
    javax.swing.JToggleButton rotorsAndPadsF;
    javax.swing.JTextField rotorsAndPadsFText;
    javax.swing.JToggleButton rotorsAndPadsR;
    javax.swing.JTextField rotorsAndPadsRText;
    javax.swing.JToggleButton rrTire;
    javax.swing.JTextField rrTirePrintText;
    javax.swing.JTextField rrTireText;
    javax.swing.JToggleButton runningLights;
    javax.swing.JTextField runningLightsText;
    javax.swing.JToggleButton seatBelts;
    javax.swing.JTextField seatBeltsText;
    javax.swing.JToggleButton spareJackTools;
    javax.swing.JTextField spareJackToolsText;
    javax.swing.JToggleButton spareTire;
    javax.swing.JTextField spareTirePrintText;
    javax.swing.JTextField spareTireText;
    javax.swing.JToggleButton starter;
    javax.swing.JTextField starterText;
    javax.swing.JToggleButton stereo;
    javax.swing.JTextField stereoText;
    javax.swing.JToggleButton suspensionComponents;
    javax.swing.JTextField suspensionComponentsText;
    javax.swing.JTextField technicianPrintText;
    javax.swing.JTextField technicianText;
    javax.swing.JLabel titleLabel;
    javax.swing.JToggleButton transmissionFluid;
    javax.swing.JTextField transmissionFluidText;
    javax.swing.JToggleButton turnSignalsF;
    javax.swing.JTextField turnSignalsFText;
    javax.swing.JToggleButton turnSignalsR;
    javax.swing.JTextField turnSignalsRText;
    javax.swing.JTextField vinPrintText;
    javax.swing.JTextField vinText;
    javax.swing.JToggleButton washerFluid;
    javax.swing.JTextField washerFluidText;
    javax.swing.JToggleButton wheelBearings;
    javax.swing.JTextField wheelBearingsText;
    javax.swing.JToggleButton windshield;
    javax.swing.JTextField windshieldText;
    javax.swing.JToggleButton wipers;
    javax.swing.JTextField wipersText;
    javax.swing.JLabel yearLabel;
    javax.swing.JLabel yearLabel1;
    javax.swing.JTextField yearPrintText;
    javax.swing.JTextField yearText;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}
