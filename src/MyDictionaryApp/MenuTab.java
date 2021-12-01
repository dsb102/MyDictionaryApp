package MyDictionaryApp;

import api_translate_text.Languages;
import api_translate_text.TranslateText;
import approximae_word.ApproximateWord;
import dictionaryVA.AddWordVA;
import dictionary_organization.EntityWord;
import handle.filejson.APIResponse;
import java.awt.Color;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import oxford_translate.OxfordTranslate;
import sqlserver.dung.ConnectToNoteSQL;
import sqlserver.dung.ConnectToSQL;
import texttospeech.TextToSpeech;
import dictionaryVA.Dictionary;
import java.io.FileNotFoundException;


public class MenuTab extends javax.swing.JFrame {

    ConnectToSQL con = new ConnectToSQL();
    ConnectToNoteSQL conNote = new ConnectToNoteSQL();
    private List<APIResponse> apiResponses;
    private List<EntityWord> notes;
    private AddWordFrame jframe;
    private DefaultTableModel defaultTableModel;
    private ShowNoteWord noteFrame;
    private AddWordVA addWordVA;
    private DefaultListModel mod;
    private DefaultListModel modVA;
    private ApproximateWord approximateWord;
    private List<String> listApproximate = con.findAllWord();
    private Dictionary dic = new Dictionary();

    public MenuTab() throws FileNotFoundException {
        initComponents();

        panelSlide.init(
                new PanelTesting("1"),
                new PanelTesting("2"),
                new PanelTesting("3"),
                new PanelTesting("4"),
                new PanelTesting("5"));
        panelSlide.setSpeed(5);

        translateVE.setVisible(false);
        oxfordMenu.setVisible(false);
        translateTextMenu.setVisible(false);
        translateEV.setVisible(false);
        notesMenu.setVisible(false);

        defaultTableModel = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Word", "Phonetic", "Meaning"
                }
        );
        wordTable.setModel(defaultTableModel);

        menuSearch.add(suggestSearch);
        mod = new DefaultListModel();
        listSuggestion.setModel(mod);
        menuVA.add(suggestSearchVA);
        modVA = new DefaultListModel();
        listVA.setModel(modVA);

        dic.loadWordFromFile();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame2 = new javax.swing.JFrame();
        suggestSearch = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listSuggestion = new javax.swing.JList<>();
        menuSearch = new javax.swing.JPopupMenu();
        suggestSearchVA = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        listVA = new javax.swing.JList<>();
        menuVA = new javax.swing.JPopupMenu();
        sidebar = new javax.swing.JPanel();
        buttonHome = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonTranslateText = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buttonIntroduce = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        oxfordTranslate = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        buttonDictionaryEV = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        buttonNotes = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        defaultMenu = new javax.swing.JPanel();
        translateVE = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        searchVA = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        saveVA = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        editVA = new javax.swing.JButton();
        addVA = new javax.swing.JButton();
        editVA1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        showInfoVA = new javax.swing.JTextArea();
        jPanel12 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        translateTextMenu = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        inputTranslateText = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        ouputTranslateText = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        speechTextInput = new javax.swing.JButton();
        speechTextInput1 = new javax.swing.JButton();
        introduceMenu = new javax.swing.JPanel();
        panelSlide = new MyDictionaryApp.PanelSlide();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        oxfordMenu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        wordTranslate = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        show = new javax.swing.JTextArea();
        notesMenu = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        wordTable = new javax.swing.JTable();
        btnRemove = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        translateEV = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        wordTranslateEV = new javax.swing.JTextField();
        buttonSearchEV = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        buttonAddToNote = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        addWord = new javax.swing.JButton();
        removeWord = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        textShowTranslateEV = new javax.swing.JTextArea();
        speechWordEV = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();

        jFrame2.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame2.setBackground(new java.awt.Color(255, 255, 255));
        jFrame2.setLocationByPlatform(true);
        jFrame2.setUndecorated(true);

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );

        suggestSearch.setBackground(new java.awt.Color(253, 200, 47));

        listSuggestion.setBackground(new java.awt.Color(253, 200, 47));
        listSuggestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listSuggestionMouseClicked(evt);
            }
        });
        listSuggestion.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listSuggestionValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(listSuggestion);

        javax.swing.GroupLayout suggestSearchLayout = new javax.swing.GroupLayout(suggestSearch);
        suggestSearch.setLayout(suggestSearchLayout);
        suggestSearchLayout.setHorizontalGroup(
            suggestSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );
        suggestSearchLayout.setVerticalGroup(
            suggestSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
        );

        menuSearch.setFocusable(false);

        listVA.setBackground(new java.awt.Color(80, 68, 68));
        listVA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        listVA.setForeground(new java.awt.Color(253, 200, 47));
        listVA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listVAMouseClicked(evt);
            }
        });
        listVA.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listVAValueChanged(evt);
            }
        });
        jScrollPane8.setViewportView(listVA);

        javax.swing.GroupLayout suggestSearchVALayout = new javax.swing.GroupLayout(suggestSearchVA);
        suggestSearchVA.setLayout(suggestSearchVALayout);
        suggestSearchVALayout.setHorizontalGroup(
            suggestSearchVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );
        suggestSearchVALayout.setVerticalGroup(
            suggestSearchVALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
        );

        menuVA.setFocusable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sidebar.setBackground(new java.awt.Color(54, 33, 89));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonHome.setBackground(new java.awt.Color(54, 33, 89));
        buttonHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonHomeMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_book_30px.png"))); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Dictionary VE");

        javax.swing.GroupLayout buttonHomeLayout = new javax.swing.GroupLayout(buttonHome);
        buttonHome.setLayout(buttonHomeLayout);
        buttonHomeLayout.setHorizontalGroup(
            buttonHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonHomeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonHomeLayout.setVerticalGroup(
            buttonHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        sidebar.add(buttonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 270, 60));

        buttonTranslateText.setBackground(new java.awt.Color(54, 33, 89));
        buttonTranslateText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonTranslateTextMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/translate-text.png"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Translate Text");

        javax.swing.GroupLayout buttonTranslateTextLayout = new javax.swing.GroupLayout(buttonTranslateText);
        buttonTranslateText.setLayout(buttonTranslateTextLayout);
        buttonTranslateTextLayout.setHorizontalGroup(
            buttonTranslateTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonTranslateTextLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonTranslateTextLayout.setVerticalGroup(
            buttonTranslateTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonTranslateTextLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        sidebar.add(buttonTranslateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 270, 60));

        buttonIntroduce.setBackground(new java.awt.Color(85, 65, 118));
        buttonIntroduce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonIntroduceMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/introduce.png"))); // NOI18N
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Introduce");

        javax.swing.GroupLayout buttonIntroduceLayout = new javax.swing.GroupLayout(buttonIntroduce);
        buttonIntroduce.setLayout(buttonIntroduceLayout);
        buttonIntroduceLayout.setHorizontalGroup(
            buttonIntroduceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonIntroduceLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        buttonIntroduceLayout.setVerticalGroup(
            buttonIntroduceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonIntroduceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        sidebar.add(buttonIntroduce, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 270, 60));

        oxfordTranslate.setBackground(new java.awt.Color(54, 33, 89));
        oxfordTranslate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oxfordTranslateMouseClicked(evt);
            }
        });
        oxfordTranslate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/translate.png"))); // NOI18N
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        oxfordTranslate.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 48, 60));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Oxford");
        oxfordTranslate.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 11, 106, 38));

        sidebar.add(oxfordTranslate, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 140, 270, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Dictionary");
        sidebar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 120, 60));
        sidebar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 200, 20));

        buttonDictionaryEV.setBackground(new java.awt.Color(54, 33, 89));
        buttonDictionaryEV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDictionaryEVMouseClicked(evt);
            }
        });
        buttonDictionaryEV.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_dictionary_32px.png"))); // NOI18N
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buttonDictionaryEV.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 48, 60));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Dictionary EV");
        buttonDictionaryEV.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 11, 110, 38));

        sidebar.add(buttonDictionaryEV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 270, 60));

        buttonNotes.setBackground(new java.awt.Color(54, 33, 89));
        buttonNotes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonNotesMouseClicked(evt);
            }
        });
        buttonNotes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/notes.png"))); // NOI18N
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buttonNotes.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 48, 60));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Notes");
        buttonNotes.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 11, 106, 38));

        sidebar.add(buttonNotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 270, 60));

        translateVE.setBackground(new java.awt.Color(36, 42, 46));

        jPanel9.setBackground(new java.awt.Color(80, 68, 68));

        searchVA.setBackground(new java.awt.Color(80, 68, 68));
        searchVA.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        searchVA.setForeground(new java.awt.Color(253, 200, 47));
        searchVA.setBorder(null);
        searchVA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchVAKeyReleased(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(47, 53, 57));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_search_80px.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchVA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchVA)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(36, 42, 46));

        saveVA.setBackground(new java.awt.Color(253, 200, 47));
        saveVA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_save_40px.png"))); // NOI18N
        saveVA.setBorder(null);
        saveVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveVAActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(253, 200, 47));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_remove_40px.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        editVA.setBackground(new java.awt.Color(253, 200, 47));
        editVA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_refresh_30px.png"))); // NOI18N
        editVA.setBorder(null);
        editVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editVAActionPerformed(evt);
            }
        });

        addVA.setBackground(new java.awt.Color(253, 200, 47));
        addVA.setForeground(new java.awt.Color(103, 149, 248));
        addVA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_add_40px.png"))); // NOI18N
        addVA.setBorder(null);
        addVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVAActionPerformed(evt);
            }
        });

        editVA1.setBackground(new java.awt.Color(253, 200, 47));
        editVA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_edit_40px.png"))); // NOI18N
        editVA1.setBorder(null);
        editVA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editVA1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editVA, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editVA1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveVA, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addVA, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(addVA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveVA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editVA1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editVA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        showInfoVA.setEditable(false);
        showInfoVA.setBackground(new java.awt.Color(36, 42, 46));
        showInfoVA.setColumns(20);
        showInfoVA.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        showInfoVA.setForeground(new java.awt.Color(253, 200, 47));
        showInfoVA.setRows(5);
        showInfoVA.setText("\n");
        showInfoVA.setBorder(null);
        jScrollPane6.setViewportView(showInfoVA);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(36, 42, 46));
        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 200, 47));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_books_50px_2.png"))); // NOI18N
        jLabel1.setText("Từ điển Việt-Anh");

        javax.swing.GroupLayout translateVELayout = new javax.swing.GroupLayout(translateVE);
        translateVE.setLayout(translateVELayout);
        translateVELayout.setHorizontalGroup(
            translateVELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(translateVELayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(translateVELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(translateVELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );
        translateVELayout.setVerticalGroup(
            translateVELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(translateVELayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(translateVELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(translateVELayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(translateVELayout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(410, 410, 410))
                    .addGroup(translateVELayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        translateTextMenu.setBackground(new java.awt.Color(36, 42, 46));

        jPanel3.setBackground(new java.awt.Color(36, 42, 46));

        inputTranslateText.setBackground(new java.awt.Color(36, 42, 46));
        inputTranslateText.setColumns(20);
        inputTranslateText.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        inputTranslateText.setForeground(new java.awt.Color(253, 200, 47));
        inputTranslateText.setRows(5);
        inputTranslateText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(inputTranslateText);
        inputTranslateText.setLineWrap(true);

        ouputTranslateText.setEditable(false);
        ouputTranslateText.setBackground(new java.awt.Color(36, 42, 46));
        ouputTranslateText.setColumns(20);
        ouputTranslateText.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        ouputTranslateText.setForeground(new java.awt.Color(253, 200, 47));
        ouputTranslateText.setRows(5);
        jScrollPane3.setViewportView(ouputTranslateText);
        ouputTranslateText.setLineWrap(true);

        jPanel4.setBackground(new java.awt.Color(253, 200, 47));

        jComboBox1.setBackground(new java.awt.Color(253, 200, 47));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(36, 42, 46));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vietnamese", "Afrikaans", "Albanian", "Amharic", "Arabic", "Armenian", "Azerbaijani", "Basque", "Belarusian", "Bengali", "Bosnian", "Bulgarian", "Catalan", "Cebuano", "Chinese_Simplified", "Chinese_Traditional", "Corsican", "Croatian", "Czech", "Danish", "Dutch", "English", "Esperanto", "Estonian", "Finnish", "French", "Frisian", "Galician", "Georgian", "German", "Greek", "Gujarati", "HaitianCreole", "Hausa", "Hawaiian", "Hebrew", "Hindi", "Hmong", "Hungarian", "Icelandic", "Igbo", "Indonesian", "Irish", "Italian", "Japanese", "Javanese", "Kannada", "Kazakh", "Khmer", "Kinyarwanda", "Korean", "Kurdish", "Kyrgyz", "Lao", "Latvian", "Lithuanian", "Luxembourgish", "Macedonian", "Malagasy", "Malay", "Malayalam", "Maltese", "Maori", "Marathi", "Mongolian", "Myanmar", "Nepali", "Norwegian", "Nyanja", "Odia", "Pashto", "Persian", "Polish", "Portuguese", "Punjabi", "Romanian", "Russian", "Samoan", "ScotsGaelic", "Serbian", "Sesotho", "Shona", "Sindhi", "Sinhala", "Slovak", "Slovenian", "Somali", "Spanish", "Sundanese", "Swahili", "Swedish", "Tagalog", "Tajik", "Tamil", "Tatar", "Telugu", "Thai", "Turkish", "Turkmen", "Ukrainian", "Urdu", "Uyghur", "Uzbek", "Welsh", "Xhosa", "Yiddish", "Yoruba", "Zulu" }));
        jComboBox1.setBorder(null);

        jComboBox2.setBackground(new java.awt.Color(253, 200, 47));
        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(36, 42, 46));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "Afrikaans", "Albanian", "Amharic", "Arabic", "Armenian", "Azerbaijani", "Basque", "Belarusian", "Bengali", "Bosnian", "Bulgarian", "Catalan", "Cebuano", "Chinese_Simplified", "Chinese_Traditional", "Corsican", "Croatian", "Czech", "Danish", "Dutch", "Esperanto", "Estonian", "Finnish", "French", "Frisian", "Galician", "Georgian", "German", "Greek", "Gujarati", "HaitianCreole", "Hausa", "Hawaiian", "Hebrew", "Hindi", "Hmong", "Hungarian", "Icelandic", "Igbo", "Indonesian", "Irish", "Italian", "Japanese", "Javanese", "Kannada", "Kazakh", "Khmer", "Kinyarwanda", "Korean", "Kurdish", "Kyrgyz", "Lao", "Latvian", "Lithuanian", "Luxembourgish", "Macedonian", "Malagasy", "Malay", "Malayalam", "Maltese", "Maori", "Marathi", "Mongolian", "Myanmar", "Nepali", "Norwegian", "Nyanja", "Odia", "Pashto", "Persian", "Polish", "Portuguese", "Punjabi", "Romanian", "Russian", "Samoan", "ScotsGaelic", "Serbian", "Sesotho", "Shona", "Sindhi", "Sinhala", "Slovak", "Slovenian", "Somali", "Spanish", "Sundanese", "Swahili", "Swedish", "Tagalog", "Tajik", "Tamil", "Tatar", "Telugu", "Thai", "Turkish", "Turkmen", "Ukrainian", "Urdu", "Uyghur", "Uzbek", "Vietnamese", "Welsh", "Xhosa", "Yiddish", "Yoruba", "Zulu" }));
        jComboBox2.setBorder(null);

        jLabel14.setBackground(new java.awt.Color(253, 200, 47));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(36, 42, 46));
        jLabel14.setText("    TO");
        jLabel14.setToolTipText("");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton1.setBackground(new java.awt.Color(253, 200, 47));
        jButton1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(36, 42, 46));
        jButton1.setText("Translate");
        jButton1.setToolTipText("Translate text");
        jButton1.setBorder(null);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jComboBox1)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jComboBox2)
        );

        speechTextInput.setBackground(new java.awt.Color(36, 42, 46));
        speechTextInput.setForeground(new java.awt.Color(253, 200, 47));
        speechTextInput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_speaker_high_volume_48px_1.png"))); // NOI18N
        speechTextInput.setToolTipText("Audio");
        speechTextInput.setBorder(null);
        speechTextInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                speechTextInputMouseClicked(evt);
            }
        });
        speechTextInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speechTextInputActionPerformed(evt);
            }
        });

        speechTextInput1.setBackground(new java.awt.Color(36, 42, 46));
        speechTextInput1.setForeground(new java.awt.Color(36, 42, 46));
        speechTextInput1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_speaker_high_volume_48px_1.png"))); // NOI18N
        speechTextInput1.setToolTipText("Audio");
        speechTextInput1.setBorder(null);
        speechTextInput1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                speechTextInput1MouseClicked(evt);
            }
        });
        speechTextInput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speechTextInput1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(speechTextInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(speechTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(speechTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(speechTextInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout translateTextMenuLayout = new javax.swing.GroupLayout(translateTextMenu);
        translateTextMenu.setLayout(translateTextMenuLayout);
        translateTextMenuLayout.setHorizontalGroup(
            translateTextMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(translateTextMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        translateTextMenuLayout.setVerticalGroup(
            translateTextMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(translateTextMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        introduceMenu.setBackground(new java.awt.Color(255, 255, 102));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_filled_circle_20px.png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_filled_circle_20px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_filled_circle_20px.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_filled_circle_20px.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_filled_circle_20px.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelSlideLayout = new javax.swing.GroupLayout(panelSlide);
        panelSlide.setLayout(panelSlideLayout);
        panelSlideLayout.setHorizontalGroup(
            panelSlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSlideLayout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(373, Short.MAX_VALUE))
        );
        panelSlideLayout.setVerticalGroup(
            panelSlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSlideLayout.createSequentialGroup()
                .addContainerGap(573, Short.MAX_VALUE)
                .addGroup(panelSlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout introduceMenuLayout = new javax.swing.GroupLayout(introduceMenu);
        introduceMenu.setLayout(introduceMenuLayout);
        introduceMenuLayout.setHorizontalGroup(
            introduceMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSlide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        introduceMenuLayout.setVerticalGroup(
            introduceMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSlide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        oxfordMenu.setBackground(new java.awt.Color(36, 42, 46));

        jPanel1.setBackground(new java.awt.Color(36, 42, 46));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        wordTranslate.setBackground(new java.awt.Color(253, 200, 47));
        wordTranslate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        wordTranslate.setText("       Search");
        wordTranslate.setToolTipText("Input one word");
        wordTranslate.setBorder(null);
        wordTranslate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wordTranslateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                wordTranslateMouseEntered(evt);
            }
        });
        wordTranslate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordTranslateActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(36, 42, 46));
        jButton2.setForeground(new java.awt.Color(253, 200, 47));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_speaker_high_volume_48px_1.png"))); // NOI18N
        jButton2.setToolTipText("Audio");
        jButton2.setBorder(null);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(253, 200, 47));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_search_30px_2.png"))); // NOI18N
        jButton3.setToolTipText("Search");
        jButton3.setBorder(null);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wordTranslate, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wordTranslate, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(36, 42, 46));

        show.setEditable(false);
        show.setBackground(new java.awt.Color(36, 42, 46));
        show.setColumns(20);
        show.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        show.setForeground(new java.awt.Color(253, 200, 47));
        show.setRows(5);
        show.setText("\t\t\n\n\n                                            \n\t            Please enter the word you are looking for");
        show.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jScrollPane1.setViewportView(show);
        show.setLineWrap(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1)
                .addGap(57, 57, 57))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout oxfordMenuLayout = new javax.swing.GroupLayout(oxfordMenu);
        oxfordMenu.setLayout(oxfordMenuLayout);
        oxfordMenuLayout.setHorizontalGroup(
            oxfordMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oxfordMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(oxfordMenuLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(66, 66, 66))
        );
        oxfordMenuLayout.setVerticalGroup(
            oxfordMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oxfordMenuLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        notesMenu.setBackground(new java.awt.Color(36, 42, 46));

        wordTable.setBackground(new java.awt.Color(253, 200, 47));
        wordTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, ""},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Word", "Phonetic", "Meaning"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        wordTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wordTableMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(wordTable);
        if (wordTable.getColumnModel().getColumnCount() > 0) {
            wordTable.getColumnModel().getColumn(0).setHeaderValue("Word");
            wordTable.getColumnModel().getColumn(1).setHeaderValue("Phonetic");
            wordTable.getColumnModel().getColumn(2).setHeaderValue("Meaning");
        }

        btnRemove.setBackground(new java.awt.Color(253, 200, 47));
        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_remove_35px_1.png"))); // NOI18N
        btnRemove.setToolTipText("Xóa Note");
        btnRemove.setBorder(null);
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        refresh.setBackground(new java.awt.Color(253, 200, 47));
        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_refresh_30px.png"))); // NOI18N
        refresh.setBorder(null);
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        btnShow.setBackground(new java.awt.Color(253, 200, 47));
        btnShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_eye_35px.png"))); // NOI18N
        btnShow.setToolTipText("Xem");
        btnShow.setBorder(null);
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(253, 200, 47));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_add_30px.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout notesMenuLayout = new javax.swing.GroupLayout(notesMenu);
        notesMenu.setLayout(notesMenuLayout);
        notesMenuLayout.setHorizontalGroup(
            notesMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notesMenuLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(notesMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                .addGap(116, 116, 116))
        );
        notesMenuLayout.setVerticalGroup(
            notesMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, notesMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(notesMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                    .addGroup(notesMenuLayout.createSequentialGroup()
                        .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        translateEV.setBackground(new java.awt.Color(36, 42, 46));
        translateEV.setPreferredSize(new java.awt.Dimension(667, 570));

        jPanel5.setBackground(new java.awt.Color(36, 42, 46));

        wordTranslateEV.setBackground(new java.awt.Color(253, 200, 47));
        wordTranslateEV.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        wordTranslateEV.setToolTipText("Nhập từ bạn muốn tìm");
        wordTranslateEV.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        wordTranslateEV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                wordTranslateEVKeyReleased(evt);
            }
        });

        buttonSearchEV.setBackground(new java.awt.Color(253, 200, 47));
        buttonSearchEV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_search_30px_2.png"))); // NOI18N
        buttonSearchEV.setToolTipText("Tìm kiếm");
        buttonSearchEV.setBorder(null);
        buttonSearchEV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchEVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wordTranslateEV, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSearchEV, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wordTranslateEV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(buttonSearchEV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(36, 42, 46));

        jPanel7.setBackground(new java.awt.Color(36, 42, 46));

        buttonAddToNote.setBackground(new java.awt.Color(253, 200, 47));
        buttonAddToNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_star_30px.png"))); // NOI18N
        buttonAddToNote.setToolTipText("Thêm vào Note");
        buttonAddToNote.setBorder(null);
        buttonAddToNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddToNoteActionPerformed(evt);
            }
        });

        buttonEdit.setBackground(new java.awt.Color(253, 200, 47));
        buttonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_edit_30px_1.png"))); // NOI18N
        buttonEdit.setToolTipText("Chỉnh sửa");
        buttonEdit.setBorder(null);
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        addWord.setBackground(new java.awt.Color(253, 200, 47));
        addWord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_add_30px.png"))); // NOI18N
        addWord.setToolTipText("Thêm từ");
        addWord.setBorder(null);
        addWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWordActionPerformed(evt);
            }
        });

        removeWord.setBackground(new java.awt.Color(253, 200, 47));
        removeWord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_remove_30px.png"))); // NOI18N
        removeWord.setToolTipText("Xóa từ");
        removeWord.setBorder(null);
        removeWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeWordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addWord, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeWord, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonAddToNote, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonAddToNote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(removeWord, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
            .addComponent(buttonEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(addWord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        textShowTranslateEV.setEditable(false);
        textShowTranslateEV.setBackground(new java.awt.Color(36, 42, 46));
        textShowTranslateEV.setColumns(20);
        textShowTranslateEV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textShowTranslateEV.setForeground(new java.awt.Color(253, 200, 47));
        textShowTranslateEV.setRows(5);
        jScrollPane4.setViewportView(textShowTranslateEV);
        textShowTranslateEV.setLineWrap(true);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
        );

        speechWordEV.setBackground(new java.awt.Color(36, 42, 46));
        speechWordEV.setForeground(new java.awt.Color(36, 42, 46));
        speechWordEV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_speaker_high_volume_48px_1.png"))); // NOI18N
        speechWordEV.setToolTipText("Audio");
        speechWordEV.setBorder(null);
        speechWordEV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speechWordEVActionPerformed(evt);
            }
        });

        buttonSave.setBackground(new java.awt.Color(253, 200, 47));
        buttonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_save_30px.png"))); // NOI18N
        buttonSave.setToolTipText("Lưu");
        buttonSave.setBorder(null);
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(speechWordEV, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(speechWordEV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout translateEVLayout = new javax.swing.GroupLayout(translateEV);
        translateEV.setLayout(translateEVLayout);
        translateEVLayout.setHorizontalGroup(
            translateEVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, translateEVLayout.createSequentialGroup()
                .addGroup(translateEVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(translateEVLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(93, 93, 93))
                    .addGroup(translateEVLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(56, 56, 56))
        );
        translateEVLayout.setVerticalGroup(
            translateEVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(translateEVLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout defaultMenuLayout = new javax.swing.GroupLayout(defaultMenu);
        defaultMenu.setLayout(defaultMenuLayout);
        defaultMenuLayout.setHorizontalGroup(
            defaultMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(translateVE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(defaultMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(translateTextMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(defaultMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(introduceMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(defaultMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(oxfordMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(defaultMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(notesMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(defaultMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(translateEV, javax.swing.GroupLayout.DEFAULT_SIZE, 1039, Short.MAX_VALUE))
        );
        defaultMenuLayout.setVerticalGroup(
            defaultMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(translateVE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(defaultMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(translateTextMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(defaultMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(introduceMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(defaultMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(oxfordMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(defaultMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(notesMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(defaultMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(translateEV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(defaultMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
            .addComponent(defaultMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    // hàm generic thêm data vào
    public <T> void showData(List<T> list, DefaultTableModel model) {
        model.setRowCount(0);
        for (T t : list) {
            EntityWord x = (EntityWord) t;
            defaultTableModel.addRow(new Object[]{x.getWord(), x.getPhonetic(), x.getMeans()});
        }
    }


    private void buttonHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHomeMouseClicked
        translateVE.setVisible(true);
        oxfordMenu.setVisible(false);
        translateTextMenu.setVisible(false);
        introduceMenu.setVisible(false);
        notesMenu.setVisible(false);
        translateEV.setVisible(false);
        buttonHome.setBackground(new Color(85, 65, 118));
        oxfordTranslate.setBackground(new Color(54, 33, 89));
        buttonTranslateText.setBackground(new Color(54, 33, 89));
        buttonIntroduce.setBackground(new Color(54, 33, 89));
        buttonNotes.setBackground(new Color(54, 33, 89));
        buttonDictionaryEV.setBackground(new Color(54, 33, 89));
    }//GEN-LAST:event_buttonHomeMouseClicked

    private void oxfordTranslateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oxfordTranslateMouseClicked
        translateVE.setVisible(false);
        oxfordMenu.setVisible(true);
        translateTextMenu.setVisible(false);
        introduceMenu.setVisible(false);
        notesMenu.setVisible(false);
        translateEV.setVisible(false);
        buttonHome.setBackground(new Color(54, 33, 89));
        oxfordTranslate.setBackground(new Color(85, 65, 118));
        buttonTranslateText.setBackground(new Color(54, 33, 89));
        buttonIntroduce.setBackground(new Color(54, 33, 89));
        buttonNotes.setBackground(new Color(54, 33, 89));
        buttonDictionaryEV.setBackground(new Color(54, 33, 89));
    }//GEN-LAST:event_oxfordTranslateMouseClicked

    private void buttonTranslateTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonTranslateTextMouseClicked
        translateVE.setVisible(false);
        oxfordMenu.setVisible(false);
        translateTextMenu.setVisible(true);
        introduceMenu.setVisible(false);
        notesMenu.setVisible(false);
        translateEV.setVisible(false);
        buttonHome.setBackground(new Color(54, 33, 89));
        oxfordTranslate.setBackground(new Color(54, 33, 89));
        buttonTranslateText.setBackground(new Color(85, 65, 118));
        buttonIntroduce.setBackground(new Color(54, 33, 89));
        buttonNotes.setBackground(new Color(54, 33, 89));
        buttonDictionaryEV.setBackground(new Color(54, 33, 89));
    }//GEN-LAST:event_buttonTranslateTextMouseClicked

    private void buttonIntroduceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonIntroduceMouseClicked
        translateVE.setVisible(false);
        oxfordMenu.setVisible(false);
        translateTextMenu.setVisible(false);
        introduceMenu.setVisible(true);
        notesMenu.setVisible(false);
        translateEV.setVisible(false);
        buttonHome.setBackground(new Color(54, 33, 89));
        oxfordTranslate.setBackground(new Color(54, 33, 89));
        buttonTranslateText.setBackground(new Color(54, 33, 89));
        buttonIntroduce.setBackground(new Color(85, 65, 118));
        buttonNotes.setBackground(new Color(54, 33, 89));
        buttonDictionaryEV.setBackground(new Color(54, 33, 89));
    }//GEN-LAST:event_buttonIntroduceMouseClicked

    private void buttonNotesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonNotesMouseClicked
        translateVE.setVisible(false);
        oxfordMenu.setVisible(false);
        translateTextMenu.setVisible(false);
        introduceMenu.setVisible(false);
        notesMenu.setVisible(true);
        translateEV.setVisible(false);
        buttonHome.setBackground(new Color(54, 33, 89));
        oxfordTranslate.setBackground(new Color(54, 33, 89));
        buttonTranslateText.setBackground(new Color(54, 33, 89));
        buttonIntroduce.setBackground(new Color(54, 33, 89));
        buttonNotes.setBackground(new Color(85, 65, 118));
        buttonDictionaryEV.setBackground(new Color(54, 33, 89));

        // hiển thị dữ liệu được cập nhật khi click vào tab Notes
        showData(conNote.findAllWord(), defaultTableModel);


    }//GEN-LAST:event_buttonNotesMouseClicked

    private void wordTranslateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordTranslateActionPerformed
    }//GEN-LAST:event_wordTranslateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String inputTextTranslate = inputTranslateText.getText();
        String langFrom = String.valueOf(jComboBox1.getSelectedItem());
        String langTo = String.valueOf(jComboBox2.getSelectedItem());
        TranslateText tranlateText = new TranslateText();
        try {
            String outputTextTranslate = tranlateText.translate(inputTextTranslate, Languages.valueOf(langTo), Languages.valueOf(langFrom));
            ouputTranslateText.setText(outputTextTranslate);
            inputTranslateText.setSelectionStart(0); // 2 dòng này đặt vị trị scroll lên đầu 
            inputTranslateText.setSelectionEnd(0);
            ouputTranslateText.setSelectionStart(0); // 2 dòng này đặt vị trị scroll lên đầu 
            ouputTranslateText.setSelectionEnd(0);
        } catch (MalformedURLException ex) {
            Logger.getLogger(MenuTab.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(MenuTab.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            ouputTranslateText.setText("Error");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void speechTextInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speechTextInputActionPerformed
        String inputTextTranslate = inputTranslateText.getText();
        TextToSpeech textToSpeech = new TextToSpeech();
        textToSpeech.getAudio(inputTextTranslate);
    }//GEN-LAST:event_speechTextInputActionPerformed

    private void speechTextInput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speechTextInput1ActionPerformed
        String outputTextTranslate = ouputTranslateText.getText();
        TextToSpeech.getAudio(outputTextTranslate);
    }//GEN-LAST:event_speechTextInput1ActionPerformed

    private void speechTextInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_speechTextInputMouseClicked
    }//GEN-LAST:event_speechTextInputMouseClicked

    private void speechTextInput1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_speechTextInput1MouseClicked
    }//GEN-LAST:event_speechTextInput1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String wordSearch = wordTranslate.getText();
        TextToSpeech.getAudio(wordSearch);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
    }//GEN-LAST:event_jButton2MouseClicked

    private void wordTranslateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wordTranslateMouseEntered

    }//GEN-LAST:event_wordTranslateMouseEntered

    private void wordTranslateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wordTranslateMouseClicked
    }//GEN-LAST:event_wordTranslateMouseClicked

    private void buttonDictionaryEVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDictionaryEVMouseClicked
        translateVE.setVisible(false);
        oxfordMenu.setVisible(false);
        translateTextMenu.setVisible(false);
        introduceMenu.setVisible(false);
        notesMenu.setVisible(false);
        translateEV.setVisible(true);
        buttonHome.setBackground(new Color(54, 33, 89));
        oxfordTranslate.setBackground(new Color(54, 33, 89));
        buttonTranslateText.setBackground(new Color(54, 33, 89));
        buttonIntroduce.setBackground(new Color(54, 33, 89));
        buttonNotes.setBackground(new Color(54, 33, 89));
        buttonDictionaryEV.setBackground(new Color(85, 65, 118));
    }//GEN-LAST:event_buttonDictionaryEVMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String str = wordTranslate.getText().toString();
        int len = str.split("\\s+").length;
        if (!str.equals("") || len == 1) {
            try {
                apiResponses = OxfordTranslate.getInfoWord(str);
                String showText = "";
                for (APIResponse apiResponse : apiResponses) {
                    showText += apiResponse.toString();
                }
                show.setText(showText);

            } catch (Exception e) {
                show.setText("\tInput one word valid");
            }
            show.setSelectionStart(0); // 2 dòng này đặt vị trị scroll lên đầu 
            show.setSelectionEnd(0);
        } else if (len != 1) {
            JOptionPane.showMessageDialog(this, "Input one word valid", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Not be empty", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void buttonSearchEVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchEVActionPerformed
        textShowTranslateEV.setEditable(false);
        try {
            ConnectToSQL con = new ConnectToSQL();
            EntityWord e = con.findWords(wordTranslateEV.getText().trim());
            if (e != null) {
                textShowTranslateEV.setText(e.toString());
                textShowTranslateEV.setSelectionStart(0);  // 2 dòng này đặt vị trị scroll lên đầu 
                textShowTranslateEV.setSelectionEnd(0);
            } else {
                textShowTranslateEV.setText("\tKhông tìm thấy từ bạn yêu cầu\n\tMời bạn một từ khác");
            }

        } catch (Exception e) {
            textShowTranslateEV.setText("\tKhông tìm thấy từ bạn yêu cầu\n\tMời bạn một từ khác");
            e.printStackTrace();
        }

    }//GEN-LAST:event_buttonSearchEVActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        textShowTranslateEV.setEditable(true);
    }//GEN-LAST:event_buttonEditActionPerformed

    private void addWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWordActionPerformed
        jframe = new AddWordFrame();
        jframe.setVisible(true);
    }//GEN-LAST:event_addWordActionPerformed

    private void wordTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wordTableMouseClicked

    }//GEN-LAST:event_wordTableMouseClicked

    private void buttonAddToNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddToNoteActionPerformed

        EntityWord eNote = conNote.findWords(wordTranslateEV.getText().trim().toLowerCase());
        EntityWord e = con.findWords(wordTranslateEV.getText().trim().toLowerCase());
        if (e != null && e.getWord().trim().length() != 0) {
            boolean xuathien = eNote != null;

            if (!xuathien) {
                conNote.insertWord(e);
                JOptionPane.showMessageDialog(this, "Đã thêm vào Notes", "Confirm", JOptionPane.DEFAULT_OPTION);
            } else {
                JOptionPane.showMessageDialog(this, "Từ này đã có trong Notes", "Thông báo", JOptionPane.WARNING_MESSAGE);
            }

        } else if (e == null && wordTranslateEV.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn phải cho biết thêm từ nào vào Notes?", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Chưa có từ này, hãy thêm vào từ điển trước", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonAddToNoteActionPerformed

    private void removeWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeWordActionPerformed
        String text = wordTranslateEV.getText().trim().toLowerCase();
        EntityWord e = con.findWords(text);
        if (e != null && text.length() != 0) {
            int x = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa không?", "Confirm?", JOptionPane.YES_NO_OPTION);
            if (x == JOptionPane.YES_OPTION) {
                con.removeWord(e.getWord()); // tạm comment
                JOptionPane.showMessageDialog(this, "Xóa từ thành công", "Thông báo", JOptionPane.DEFAULT_OPTION);
            }
        } else if (e == null && text.length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn phải nhập từ cần xóa", "Thông báo", JOptionPane.YES_OPTION);
        } else {
            JOptionPane.showMessageDialog(this, "Từ cần xóa không có trong từ điển", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removeWordActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        String s = textShowTranslateEV.getText();
        String word = "";
        String phonetic = "";
        String means = "";
        try {
            Scanner in = new Scanner(s);
            word = in.nextLine().trim().split("\\s+")[1];
            phonetic = in.nextLine().trim().split("\\s+")[1].toLowerCase();
            while (in.hasNextLine()) {
                means += in.nextLine();
            }
            EntityWord updateWord = new EntityWord(word, phonetic, means);
            EntityWord e = con.findWords(word);
            if (e != null && word.length() != 0) {
                int x = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn lưu không?", "Confirm?", JOptionPane.YES_NO_OPTION);
                if (x == JOptionPane.YES_OPTION) {
                    con.updateWord(updateWord); // comment lại tránh update nhầm từ lúc nào thật thì bỏ
                    JOptionPane.showMessageDialog(this, "Lưu từ thành công", "Thông báo", JOptionPane.DEFAULT_OPTION);
                }
            } else if (e == null && word.length() == 0) {
                JOptionPane.showMessageDialog(this, "Bạn phải nhập từ cần update", "Thông báo", JOptionPane.YES_OPTION);
            } else {
                JOptionPane.showMessageDialog(this, "Không có từ này để update bạn cần thêm vào trước", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lưu không thành công hãy lưu đúng định dạng", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_buttonSaveActionPerformed

    private void wordTranslateEVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wordTranslateEVKeyReleased
        String search = wordTranslateEV.getText().trim();
        if (search.length() != 0) {
            mod.removeAllElements();
            List<String> listSuggestion = con.findAllWordSuggestion(search); // cần cho thêm

            if (listSuggestion.size() == 0) {
                approximateWord = new ApproximateWord(search);
                int cnt = 0; // đếm từ thỏa mãn
                for (String string : listApproximate) {
                    if (approximateWord.compareTo(string)) {
                        mod.addElement(string);
                        if (cnt++ > 20) {
                            break;
                        }
                    }
                }
            }
            for (String word : listSuggestion) {
                mod.addElement(word);
            }
            menuSearch.show(wordTranslateEV, 0, wordTranslateEV.getHeight()); // hiển thị vị trí menuSuggest

        }
        // hiển thị những từ có từ đầy là key đang gõ
    }//GEN-LAST:event_wordTranslateEVKeyReleased

    private void listSuggestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listSuggestionMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            menuSearch.setVisible(false);
        }
        // nếu click 2 lần thì coi như chọn và ẩn menu
    }//GEN-LAST:event_listSuggestionMouseClicked

    private void listSuggestionValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listSuggestionValueChanged

        if (listSuggestion.getSelectedIndex() != -1) {
            wordTranslateEV.setText(listSuggestion.getSelectedValue());
        }
    }//GEN-LAST:event_listSuggestionValueChanged

    private void speechWordEVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speechWordEVActionPerformed
        String wordEV = wordTranslateEV.getText();
        TextToSpeech textToSpeech = new TextToSpeech();
        textToSpeech.getAudio(wordEV);
    }//GEN-LAST:event_speechWordEVActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        noteFrame = new ShowNoteWord();
        int index = wordTable.getSelectedRow();
        if (index != -1) {
            TableModel model = wordTable.getModel(); // chọn hàng
            String word = model.getValueAt(index, 0).toString(); // lấy từ trong hàng được chọn
            EntityWord e = conNote.findWords(word); // tìm từ đó trong note
            noteFrame.setText(e);
            noteFrame.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Chọn từ cần hiển thị", "Thông báo", JOptionPane.DEFAULT_OPTION);
        }

    }//GEN-LAST:event_btnShowActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int index = wordTable.getSelectedRow();
        if (index != -1) {
            TableModel model = wordTable.getModel(); // chọn hàng
            String word = model.getValueAt(index, 0).toString(); // lấy từ trong hàng được chọn
            int x = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa không?", "Confirm?", JOptionPane.YES_NO_OPTION);
            if (x == JOptionPane.YES_OPTION) {
                conNote.removeWord(word); // xóa từ
                defaultTableModel.removeRow(index);
                JOptionPane.showMessageDialog(this, "Xóa từ thành công", "Thông báo", JOptionPane.DEFAULT_OPTION);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Chọn từ cần xóa", "Thông báo", JOptionPane.DEFAULT_OPTION);
        }

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        showData(conNote.findAllWord(), defaultTableModel);
    }//GEN-LAST:event_refreshActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        noteFrame = new ShowNoteWord();
        noteFrame.settingAddWordToNote();
        noteFrame.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void searchVAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchVAKeyReleased
        String search = searchVA.getText().trim().toLowerCase();
        if (!search.equalsIgnoreCase("")) {
            modVA.removeAllElements();
            List<String> list = dic.findWordContain(search); // tìm từ chứa search
            if (list.size() == 0) {
                approximateWord = new ApproximateWord(search);
                for (String string : dic.Dic.keySet()) {
                    if (approximateWord.compareTo(string)) {
                        mod.addElement(string);
                    }
                }
            }

            for (String str : list) {
                modVA.addElement(str);
            }

            menuVA.show(jPanel9, 0, searchVA.getHeight());
            menuVA.setVisible(true);
        }

    }//GEN-LAST:event_searchVAKeyReleased

    public String format(String sour) {
        String des = "";
        String[] x = sour.split(";|\\+|\n");
        for (String string : x) {
            des += string + '\n';
        }

        return des;
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String txt = searchVA.getText().trim();
        if (dic.containWord(txt)) {
            showInfoVA.setText(format(dic.searchWord(txt)));
            showInfoVA.setSelectionStart(0);  // 2 dòng này đặt vị trị scroll lên đầu 
            showInfoVA.setSelectionEnd(0);
        } else if (txt.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Nhập từ cần tìm", "Thông báo", JOptionPane.DEFAULT_OPTION);
        } else {
            JOptionPane.showMessageDialog(this, "Từ này không có trong từ điển", "Thông báo", JOptionPane.DEFAULT_OPTION);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void listVAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listVAMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            menuVA.setVisible(false);
        }
    }//GEN-LAST:event_listVAMouseClicked

    private void listVAValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listVAValueChanged
        if (listVA.getSelectedIndex() != -1) {
            searchVA.setText(listVA.getSelectedValue());
        }
    }//GEN-LAST:event_listVAValueChanged

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String txtDelete = searchVA.getText().trim();
        if (dic.containWord(txtDelete)) {
            int x = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa không?", "Confirm?", JOptionPane.YES_NO_OPTION);
            if (x == JOptionPane.YES_OPTION) {
                dic.deleteWord(txtDelete);
                try {
                    dic.importWordFromDicToFile();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MenuTab.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(this, "Xóa từ thành công", "Thông báo", JOptionPane.DEFAULT_OPTION);
            }
        } else if (txtDelete.length() == 0) {
            JOptionPane.showMessageDialog(this, "Nhập từ cần xóa", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Từ này không có trong từ điển", "Thông báo", JOptionPane.DEFAULT_OPTION);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void saveVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveVAActionPerformed
        String txt = searchVA.getText().trim().toLowerCase();
        if (dic.containWord(txt)) {
            dic.addWord(txt, showInfoVA.getText());
            try {
                dic.importWordFromDicToFile();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MenuTab.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Lưu thành công", "Thông báo", JOptionPane.DEFAULT_OPTION);
        } else {
            JOptionPane.showMessageDialog(this, "Không có từ cần sửa, hãy thêm vào trước", "Thông báo", JOptionPane.DEFAULT_OPTION);
        }
    }//GEN-LAST:event_saveVAActionPerformed

    private void editVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editVAActionPerformed
        try {
            dic.loadWordFromFile();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MenuTab.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editVAActionPerformed

    private void editVA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editVA1ActionPerformed
        showInfoVA.setEditable(true);
    }//GEN-LAST:event_editVA1ActionPerformed

    private void addVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVAActionPerformed
        addWordVA = new AddWordVA();
        addWordVA.setVisible(true);
    }//GEN-LAST:event_addVAActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        panelSlide.show(0);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        panelSlide.show(1);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        panelSlide.show(2);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        panelSlide.show(3);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        panelSlide.show(4);
    }//GEN-LAST:event_jLabel20MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MenuTab().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MenuTab.class.getName()).log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVA;
    private javax.swing.JButton addWord;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton buttonAddToNote;
    private javax.swing.JPanel buttonDictionaryEV;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JPanel buttonHome;
    private javax.swing.JPanel buttonIntroduce;
    private javax.swing.JPanel buttonNotes;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonSearchEV;
    private javax.swing.JPanel buttonTranslateText;
    private javax.swing.JPanel defaultMenu;
    private javax.swing.JButton editVA;
    private javax.swing.JButton editVA1;
    private javax.swing.JTextArea inputTranslateText;
    private javax.swing.JPanel introduceMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> listSuggestion;
    private javax.swing.JList<String> listVA;
    private javax.swing.JPopupMenu menuSearch;
    private javax.swing.JPopupMenu menuVA;
    private javax.swing.JPanel notesMenu;
    private javax.swing.JTextArea ouputTranslateText;
    private javax.swing.JPanel oxfordMenu;
    private javax.swing.JPanel oxfordTranslate;
    private MyDictionaryApp.PanelSlide panelSlide;
    private javax.swing.JButton refresh;
    private javax.swing.JButton removeWord;
    private javax.swing.JButton saveVA;
    private javax.swing.JTextField searchVA;
    private javax.swing.JTextArea show;
    private javax.swing.JTextArea showInfoVA;
    private javax.swing.JPanel sidebar;
    private javax.swing.JButton speechTextInput;
    private javax.swing.JButton speechTextInput1;
    private javax.swing.JButton speechWordEV;
    private javax.swing.JPanel suggestSearch;
    private javax.swing.JPanel suggestSearchVA;
    private javax.swing.JTextArea textShowTranslateEV;
    private javax.swing.JPanel translateEV;
    private javax.swing.JPanel translateTextMenu;
    private javax.swing.JPanel translateVE;
    private javax.swing.JTable wordTable;
    private javax.swing.JTextField wordTranslate;
    private javax.swing.JTextField wordTranslateEV;
    // End of variables declaration//GEN-END:variables
}
