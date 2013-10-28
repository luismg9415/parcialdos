/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FHM
 */
public class semestre extends javax.swing.JFrame {

    profesores eva = new profesores();
    profesores carlos = new profesores();
    profesores pedro = new profesores();
    
    materias fundamentosi = new materias();
    materias fundamentosl = new materias();
    materias lya = new materias();
    
    /* semestre II */
    
    profesores jorge= new profesores();
    profesores jose = new profesores();
   
    materias seminarioi = new materias();
    materias fundamentosp = new materias();
    
    /* Semestre III */
    
    profesores wilson = new profesores();
    profesores joaquin = new profesores();
    profesores fernando = new profesores();
    profesores fernando1 = new profesores();
      
    materias prog1 = new materias();
    materias elementosc= new materias();
    materias estructurasi= new materias();
    materias prog11 = new materias();
    
    /* Semestre IV */
    
    profesores fernando2 = new profesores();
    profesores joaquin2 = new profesores();
    profesores eva2 = new profesores();
    
    materias prog2 = new materias();
    materias tgs = new materias();
    materias micropro = new materias();
    
    /* Semestre V */
    
    profesores esau = new profesores();
    profesores wilson2 = new profesores();
    profesores jose2 = new profesores();
    
    materias computaciong = new materias();
    materias sistemaso = new materias();
    materias sistemasi = new materias();
   
    /* Semestre VI */
    
    profesores esau1 = new profesores();
    profesores fernando3 = new profesores();
    profesores jose3 = new profesores();
    profesores carlos2 = new profesores();
    
    materias teoriac = new materias();
    materias basesd1 = new materias();
    materias comunicaciond1 = new materias();
    materias ingenieriasoft = new materias();
     
    /* Semestre VII */
    
    profesores esperanza = new profesores();
    profesores duban = new profesores();
    profesores jose4 = new profesores();
    profesores wilson3 = new profesores();
    profesores carlos3 = new profesores();
  
    materias basesd2= new materias();
    materias opti1 = new materias();
    materias ingenieriasoft2 = new materias();
    materias comunicaciond2 = new materias();
    materias electbi1 = new materias();
    
    /* Semestre VIII */
    
    profesores oscar = new profesores();
    profesores duban2 = new profesores();
    profesores pedro2 = new profesores();
    
    materias opti2= new materias();
    materias ingenieriaart = new materias();
    materias electbi2 = new materias();
  
    /* Semestre IX */
    
    profesores duban3 = new profesores();
    profesores joaquin3 = new profesores();
    profesores carlos4 = new profesores();
  
    materias modelacion = new materias();
    materias auditorias = new materias();
    materias gerenciai = new materias();  
    
    /* Semestre X*/
    
    profesores jose5 = new profesores();
    profesores eva3 = new profesores();
    profesores jorge2 = new profesores();
  
    
    materias gestiont = new materias();
    materias eticai = new materias();
    materias legislacioni = new materias();
    
    
    public semestre() {
        
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Semestres de la carrera");
        
      /* Semestre I */  
      carlos.nombre="Carlos Vargas"; carlos.materias.nombremat="Fundamentos de Ingenieria"; carlos.materias.dia="Lunes; 9:00am A 12:00am"; carlos.materias.sem="Primero"; carlos.materias.grup="101";
      fundamentosi.profe=carlos;
      eva.nombre="Eva Patricia Vasquez"; eva.materias.nombremat="logica y algoritmia"; eva.materias.dia="Martes y Viernes; 7:00 am A 9:00am";  eva.materias.sem="Primero"; eva.materias.grup="101";
      lya.profe=eva;
      pedro.nombre="Pedro Melendez"; pedro.materias.nombremat="Fundamentos de Logica"; pedro.materias.dia="Miercoles y Viernes; 2:00pm A 4:00pm"; pedro.materias.sem="Primero"; pedro.materias.grup="103";
      fundamentosl.profe=pedro;
      
      /* Semestre II */
      jorge.nombre="Jorge Reyes"; jorge.materias.nombremat="Seminario de Ingenieria"; jorge.materias.dia="Lunes; 9:00am A 12:00am"; jorge.materias.sem="Segundo"; jorge.materias.grup="201";
      seminarioi.profe=jorge;
      jose.nombre="Jose Miguel Ojeda"; jose.materias.nombremat="Fundamentos de Programacion"; jose.materias.dia="Martes y Jueves; 8:00 am A 10:00am";  jose.materias.sem="Segundo"; jose.materias.grup="201";
      fundamentosp.profe=jose;
      
      /* Semestre III */
      wilson.nombre="Wilson Gordillo"; wilson.materias.nombremat="Programacion I"; wilson.materias.dia="Lunes y Miercoles; 9:00am A 11:00am"; wilson.materias.sem="Tercero"; wilson.materias.grup="301";
      prog1.profe=wilson;
      joaquin.nombre="Joaquin Ariza"; joaquin.materias.nombremat="Elementos de Computadores"; joaquin.materias.dia="Martes; 7:00am A 10:00am"; joaquin.materias.sem="Tercero"; joaquin.materias.grup="301";
      elementosc.profe=joaquin;
      fernando.nombre="Fernando Sotello"; fernando.materias.nombremat="Estructura de Informacion"; fernando.materias.dia="Miercoles 11:00 am A 1:00pm y Jueves 9:00am A 11:00am" ;  fernando.materias.sem="Tercero"; fernando.materias.grup="301";
      estructurasi.profe=fernando;
      fernando.nombre="Fernando Sotello"; fernando.materias.xnombremat="Programacion I"; fernando.materias.xdia="Lunes y Martes; 8:00 am A 10:00am";  fernando.materias.xsem="Tercero"; fernando.materias.xgrup="302";
      prog1.profe=fernando;
      
      /* Semestre IV */
      fernando2.nombre="Fernando Sotello"; fernando2.materias.nombremat="Programacion II"; fernando2.materias.dia="Lunes y Martes; 11:00am A 1:00pm"; fernando2.materias.sem="Cuarto"; fernando2.materias.grup="401";
      prog2.profe=fernando2;
      joaquin2.nombre="Joaquin Ariza"; joaquin2.materias.nombremat="Microprocesadores"; joaquin2.materias.dia="Jueves 10:00am A 12:00pm y Viernes 7:00am A 9.00am"; joaquin2.materias.sem="Cuarto"; joaquin2.materias.grup="401";
      micropro.profe=joaquin2;
      eva2.nombre="Eva Patricia Vasquez"; eva2.materias.nombremat="Teoria General de Sistemas"; eva2.materias.dia="Viernes; 9:00 am A 12:00pm";  eva2.materias.sem="Cuarto"; eva2.materias.grup="401";
      tgs.profe=eva2;
      fernando2.nombre="Fernando Sotello"; fernando2.materias.xnombremat="Programacion II"; fernando2.materias.xdia="Jueves y Viernes; 11:00am A 1:00pm"; fernando2.materias.xsem="Cuarto"; fernando2.materias.xgrup="402";
      prog2.profe=fernando2;
      
      /* Semestre V */
      esau.nombre="Esau Paloma"; esau.materias.nombremat="Computacion Grafica"; esau.materias.dia="Lunes 7:00am A 9:00am y Viernes 12:00pm A 2:00pm"; esau.materias.sem="Quinto"; esau.materias.grup="501";
      computaciong.profe=esau;
      wilson2.nombre="Wilson Gordillo"; wilson2.materias.nombremat="Sistemas Operativos"; wilson2.materias.dia="Lunes y Jueves; 2:00pm A 4:00pm"; wilson2.materias.sem="Quinto"; wilson2.materias.grup="501";
      sistemaso.profe=wilson2;
      jose2.nombre="Jose Miguel Ojeda"; jose2.materias.nombremat="Sistemas de Informacion"; jose2.materias.dia="Martes 2:00 pm A 4:00pm y Jueves 10:00am A 12:00pm"; jose2.materias.sem="Quinto"; jose2.materias.grup="501";
      sistemasi.profe=jose2;
      esau.nombre="Esau Paloma"; esau.materias.xnombremat="Computacion Grafica"; esau.materias.xdia="Martes 11:00am A 1:00pm y Miercoles 7:00am A 9:00am"; esau.materias.xsem="Quinto"; esau.materias.xgrup="502";
      computaciong.profe=esau;
      
      /* Semestre VI */
      esau1.nombre="Esau Paloma"; esau1.materias.nombremat="Teoria de Control"; esau1.materias.dia="Lunes 11:00am A 1:00pm y Miercoles 9:00am A 11:00am"; esau1.materias.sem="Sexto"; esau1.materias.grup="601";
      teoriac.profe=esau1;
      fernando3.nombre="Fernando Sotello"; fernando3.materias.nombremat="Bases de Datos I"; fernando3.materias.dia="Miercoles 7:00am A 9:00am y Viernes 9:00am A 11:00am"; fernando3.materias.sem="Sexto"; fernando3.materias.grup="601";
      basesd1.profe=fernando3;
      jose3.nombre="Jose Miguel Ojeda"; jose3.materias.nombremat="Ingenieria del Software"; jose3.materias.dia="Miercoles 11:00am A 1:00pm y Jueves 12:00am A 2:00pm";  jose3.materias.sem="Sexto"; jose3.materias.grup="601";
      ingenieriasoft.profe=jose3;
      carlos2.nombre="Carlos Vargas"; carlos2.materias.nombremat="Comunicacon de Datos I"; carlos2.materias.dia="Martes y Jueves; 7:00 am A 9:00am";  carlos2.materias.sem="Sexto"; carlos2.materias.grup="601";
      comunicaciond1.profe=carlos2;
      esau1.nombre="Esau Paloma"; esau1.materias.xnombremat="Teoria de Control"; esau1.materias.xdia="Lunes 9:00am A 11:00am y Viernes 10:00am A 12:00pm"; esau1.materias.xsem="Sexto"; esau1.materias.xgrup="602";
      teoriac.profe=esau1;
      
      /* Semestre VII */
      esperanza.nombre="Esperanza Merchan"; esperanza.materias.nombremat="Bases de Datos II"; esperanza.materias.dia="Lunes y Martes; 7:00am A 9:00am"; esperanza.materias.sem="Septimo"; esperanza.materias.grup="701";
      basesd2.profe=esperanza;
      duban.nombre="Duban Ordoñez"; duban.materias.nombremat="Optimizacion I"; duban.materias.dia="Miercoles y Jueves; 7:00am A 9:00am"; duban.materias.sem="Septimo"; duban.materias.grup="701";
      opti1.profe=duban;
      jose4.nombre="Jose Miguel Ojeda"; jose4.materias.nombremat="Ingenieria de Software II"; jose4.materias.dia="Miercoles 9:00am A 11:00am y Jueves 2:00am A 4:00am";  jose4.materias.sem="Septimo";jose4.materias.grup="701";
      ingenieriasoft2.profe=jose4;
      wilson3.nombre="Wilson Gordillo"; wilson3.materias.nombremat="Comunicacion de Datos II"; wilson3.materias.dia="Miercoles 12:00pm A 2:00pm y Jueves 9:00am A 11:00am";  wilson3.materias.sem="Septimo"; wilson3.materias.grup="701";
      comunicaciond2.profe=wilson3;
      carlos3.nombre="Carlos Vargas"; carlos3.materias.nombremat="Electiva Basica de Ingenieria I"; carlos3.materias.dia="Viernes; 7:00am A 10:00am";  carlos3.materias.sem="Septimo"; carlos3.materias.grup="701";
      electbi1.profe=carlos3;
      esperanza.nombre="Esperanza Merchan"; esperanza.materias.xnombremat="Bases de Datos II"; esperanza.materias.xdia="Juenes y Viernes; 2:00pm A 4:00pm "; esperanza.materias.xsem="Septimo"; esperanza.materias.xgrup="702";
      basesd2.profe=esperanza;
      
      /* Semestre VIII */
      oscar.nombre="Oscar Bachiller"; oscar.materias.nombremat="Inteligencia Artificial"; oscar.materias.dia="Lunes y Miercoles; 7:00am A 9:00am"; oscar.materias.sem="Octavo"; oscar.materias.grup="801";
      ingenieriaart.profe=oscar;
      duban2.nombre="Duban Ordoñez"; duban2.materias.nombremat="Optimizacion II"; duban2.materias.dia="Martes 11:00am A 1:00pm y Miercoles 9:00am A 11:00am"; duban2.materias.sem="Octavo"; duban2.materias.grup="801";
      opti2.profe=duban2;
      pedro2.nombre="Pedro Melendez"; pedro2.materias.nombremat="Electiva Basica de Ingenieria II"; pedro2.materias.dia="Martes 2:00pm A 5:00pm";  pedro2.materias.sem="Octavo"; pedro2.materias.grup="801";
      electbi2.profe=pedro2;
      
      /* Semestre IX */
      duban3.nombre="Duban Ordoñez"; duban3.materias.nombremat="Modelacion"; duban3.materias.dia="Lunes 4:00pm A 6:00pm y Miercoles 11:00am A 1:00pm"; duban3.materias.sem="Noveno"; duban3.materias.grup="901";
      modelacion.profe=duban3;
      joaquin3.nombre="Joaquin Ariza"; joaquin3.materias.nombremat="Auditoria de Sistemas"; joaquin3.materias.dia="Martes 10:00am A 1:00pm"; joaquin3.materias.sem="Noveno"; joaquin3.materias.grup="901";
      auditorias.profe=joaquin3;
      carlos4.nombre="Carlos Vargas"; carlos4.materias.nombremat="Gerencia Informatica"; carlos4.materias.dia="Viernes 10:00am A 1:00pm";  carlos4.materias.sem="Noveno"; carlos4.materias.grup="901";
      gerenciai.profe=carlos4;
      
      /* Semestre X */
      jose5.nombre="Pedro Melendez"; jose5.materias.nombremat="Gestion Tecnologica"; jose5.materias.dia="Martes 10:00am A 1:00pm"; jose5.materias.sem="Decimo"; jose5.materias.grup="1001";
      gestiont.profe=jose5;
      eva3.nombre="Eva Patricia Vasquez"; eva3.materias.nombremat="Etica para Ingenieros"; eva3.materias.dia="Miercoles 7:00am A 10:00am"; eva3.materias.sem="Decimo"; eva3.materias.grup="1001";
      eticai.profe=eva3;
      jorge2.nombre="Jorge Reyes"; jorge2.materias.nombremat="Legislacion de Ingenieria"; jorge2.materias.dia="Viernes 10:00 am A 1:00pm";  jorge2.materias.sem="Decimo"; jorge2.materias.grup="1001";
      legislacioni.profe=jorge2;
      
     
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        impresion = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu16 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenu18 = new javax.swing.JMenu();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu19 = new javax.swing.JMenu();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenu20 = new javax.swing.JMenu();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu21 = new javax.swing.JMenu();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenu22 = new javax.swing.JMenu();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenu23 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu24 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenu25 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem39 = new javax.swing.JMenuItem();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenu26 = new javax.swing.JMenu();
        jMenuItem42 = new javax.swing.JMenuItem();
        jMenuItem43 = new javax.swing.JMenuItem();
        jMenuItem44 = new javax.swing.JMenuItem();
        jMenuItem45 = new javax.swing.JMenuItem();
        jMenuItem46 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenu27 = new javax.swing.JMenu();
        jMenuItem47 = new javax.swing.JMenuItem();
        jMenuItem48 = new javax.swing.JMenuItem();
        jMenuItem49 = new javax.swing.JMenuItem();
        jMenu28 = new javax.swing.JMenu();
        jMenuItem50 = new javax.swing.JMenuItem();
        jMenuItem51 = new javax.swing.JMenuItem();
        jMenuItem52 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenu29 = new javax.swing.JMenu();
        jMenuItem53 = new javax.swing.JMenuItem();
        jMenuItem54 = new javax.swing.JMenuItem();
        jMenuItem55 = new javax.swing.JMenuItem();
        jMenu30 = new javax.swing.JMenu();
        jMenuItem56 = new javax.swing.JMenuItem();
        jMenuItem57 = new javax.swing.JMenuItem();
        jMenuItem58 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenu31 = new javax.swing.JMenu();
        jMenuItem59 = new javax.swing.JMenuItem();
        jMenuItem60 = new javax.swing.JMenuItem();
        jMenuItem61 = new javax.swing.JMenuItem();
        jMenu32 = new javax.swing.JMenu();
        jMenuItem62 = new javax.swing.JMenuItem();
        jMenuItem63 = new javax.swing.JMenuItem();
        jMenuItem64 = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToggleButton1.setText("Vista Principal");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        impresion.setColumns(20);
        impresion.setRows(5);
        jScrollPane1.setViewportView(impresion);

        jMenu1.setText("PULSE AQUI PARA VER EL LISTADO DE SEMESTRES");

        jMenu3.setText("Semestre I");

        jMenu13.setText("Materia");

        jMenuItem11.setText("Fundamentos de Ingenieria");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem11);

        jMenuItem13.setText("Fundamentos de Logica");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem13);

        jMenuItem12.setText("Logica y Algoritmia");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem12);

        jMenu3.add(jMenu13);

        jMenu14.setText("Profesor");

        jMenuItem14.setText("Eva Patricia Vasquez");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem14);

        jMenuItem15.setText("Carlos Vargas");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem15);

        jMenuItem16.setText("Pedro Melendez");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem16);

        jMenu3.add(jMenu14);

        jMenu1.add(jMenu3);

        jMenu4.setText("Semestre II");

        jMenu15.setText("Materia");

        jMenuItem17.setText("Seminario de Ingenieria");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem17);

        jMenuItem18.setText("Fundamentos de Programacion");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem18);

        jMenu4.add(jMenu15);

        jMenu16.setText("Profesor");

        jMenuItem19.setText("Jorge Reyes");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuItem19);

        jMenuItem20.setText("Jose Miguel Ojeda");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuItem20);

        jMenu4.add(jMenu16);

        jMenu1.add(jMenu4);

        jMenu5.setText("Semestre III");

        jMenu17.setText("Materia");

        jMenuItem21.setText("Programacion I");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu17.add(jMenuItem21);

        jMenuItem22.setText("Elementos de Computadores");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu17.add(jMenuItem22);

        jMenuItem23.setText("Estructuras de Informacion");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu17.add(jMenuItem23);

        jMenu5.add(jMenu17);

        jMenu18.setText("Profesor");

        jMenuItem24.setText("Wilson Gordillo");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu18.add(jMenuItem24);

        jMenuItem25.setText("Joaquin Ariza");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu18.add(jMenuItem25);

        jMenuItem26.setText("Fernando Sotello");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu18.add(jMenuItem26);

        jMenu5.add(jMenu18);

        jMenu1.add(jMenu5);

        jMenu6.setText("Semestre IV");

        jMenu19.setText("Materia");

        jMenuItem27.setText("Programacion II");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu19.add(jMenuItem27);

        jMenuItem28.setText("Teoria General de Sistemas");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu19.add(jMenuItem28);

        jMenuItem29.setText("Microprocesadores");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu19.add(jMenuItem29);

        jMenu6.add(jMenu19);

        jMenu20.setText("Profesor");

        jMenuItem30.setText("Fernando Sotello");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem30);

        jMenuItem31.setText("Joaquin Ariza");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem31);

        jMenuItem32.setText("Eva Patricia Vaesquez");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem32);

        jMenu6.add(jMenu20);

        jMenu1.add(jMenu6);

        jMenu7.setText("Semestre V");

        jMenu21.setText("Materia");

        jMenuItem33.setText("Computacion Grafica");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu21.add(jMenuItem33);

        jMenuItem34.setText("Sistemas Operativos");
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        jMenu21.add(jMenuItem34);

        jMenuItem35.setText("Sistemas de Informacion");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenu21.add(jMenuItem35);

        jMenu7.add(jMenu21);

        jMenu22.setText("Profesor");

        jMenuItem36.setText("Esau Paloma");
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem36ActionPerformed(evt);
            }
        });
        jMenu22.add(jMenuItem36);

        jMenuItem37.setText("Wilson Gordillo");
        jMenuItem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem37ActionPerformed(evt);
            }
        });
        jMenu22.add(jMenuItem37);

        jMenuItem38.setText("Jose Miguel Ojeda");
        jMenuItem38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem38ActionPerformed(evt);
            }
        });
        jMenu22.add(jMenuItem38);

        jMenu7.add(jMenu22);

        jMenu1.add(jMenu7);

        jMenu8.setText("Semestre VI");

        jMenu23.setText("Materia");

        jMenuItem1.setText("Teoria de Control");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu23.add(jMenuItem1);

        jMenuItem2.setText("Bases de Datos I");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu23.add(jMenuItem2);

        jMenuItem3.setText("Comunicacion de Datos I");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu23.add(jMenuItem3);

        jMenuItem4.setText("Ingenieria del Software");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu23.add(jMenuItem4);

        jMenu8.add(jMenu23);

        jMenu24.setText("Profesor");

        jMenuItem5.setText("Esau Paloma");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu24.add(jMenuItem5);

        jMenuItem6.setText("Fernando Sotello");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu24.add(jMenuItem6);

        jMenuItem7.setText("Jose Miguel Ojeda");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu24.add(jMenuItem7);

        jMenuItem8.setText("Carlos Vargas");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu24.add(jMenuItem8);

        jMenu8.add(jMenu24);

        jMenu1.add(jMenu8);

        jMenu9.setText("Semestre VII");

        jMenu25.setText("Materia");

        jMenuItem9.setText("Bases de Datos II");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu25.add(jMenuItem9);

        jMenuItem10.setText("Optimizacion I");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu25.add(jMenuItem10);

        jMenuItem39.setText("Ingenieria del Software II");
        jMenuItem39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem39ActionPerformed(evt);
            }
        });
        jMenu25.add(jMenuItem39);

        jMenuItem40.setText("Comunicacion de Datos II");
        jMenuItem40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem40ActionPerformed(evt);
            }
        });
        jMenu25.add(jMenuItem40);

        jMenuItem41.setText("Electiva Basica de Ingenieria I");
        jMenuItem41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem41ActionPerformed(evt);
            }
        });
        jMenu25.add(jMenuItem41);

        jMenu9.add(jMenu25);

        jMenu26.setText("Profesor");

        jMenuItem42.setText("Esperanza Merchan");
        jMenuItem42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem42ActionPerformed(evt);
            }
        });
        jMenu26.add(jMenuItem42);

        jMenuItem43.setText("Duvan Ordoñez");
        jMenuItem43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem43ActionPerformed(evt);
            }
        });
        jMenu26.add(jMenuItem43);

        jMenuItem44.setText("Jose Miguel Ojeda");
        jMenuItem44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem44ActionPerformed(evt);
            }
        });
        jMenu26.add(jMenuItem44);

        jMenuItem45.setText("Wilson Gordillo");
        jMenuItem45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem45ActionPerformed(evt);
            }
        });
        jMenu26.add(jMenuItem45);

        jMenuItem46.setText("Carlos Vargas");
        jMenuItem46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem46ActionPerformed(evt);
            }
        });
        jMenu26.add(jMenuItem46);

        jMenu9.add(jMenu26);

        jMenu1.add(jMenu9);

        jMenu10.setText("Semestre VIII");

        jMenu27.setText("Materia");

        jMenuItem47.setText("Optimizacion II");
        jMenuItem47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem47ActionPerformed(evt);
            }
        });
        jMenu27.add(jMenuItem47);

        jMenuItem48.setText("Inteligencia Artificial");
        jMenuItem48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem48ActionPerformed(evt);
            }
        });
        jMenu27.add(jMenuItem48);

        jMenuItem49.setText("Electiva Basica de Ingenieria II");
        jMenuItem49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem49ActionPerformed(evt);
            }
        });
        jMenu27.add(jMenuItem49);

        jMenu10.add(jMenu27);

        jMenu28.setText("Profesor");

        jMenuItem50.setText("Oscar Bachiller");
        jMenuItem50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem50ActionPerformed(evt);
            }
        });
        jMenu28.add(jMenuItem50);

        jMenuItem51.setText("Duban Ordoñez");
        jMenuItem51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem51ActionPerformed(evt);
            }
        });
        jMenu28.add(jMenuItem51);

        jMenuItem52.setText("Pedro Melendez");
        jMenuItem52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem52ActionPerformed(evt);
            }
        });
        jMenu28.add(jMenuItem52);

        jMenu10.add(jMenu28);

        jMenu1.add(jMenu10);

        jMenu11.setText("Semestre IX");

        jMenu29.setText("Materia");

        jMenuItem53.setText("Modelacion");
        jMenuItem53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem53ActionPerformed(evt);
            }
        });
        jMenu29.add(jMenuItem53);

        jMenuItem54.setText("Auditoria de Sistemas");
        jMenuItem54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem54ActionPerformed(evt);
            }
        });
        jMenu29.add(jMenuItem54);

        jMenuItem55.setText("Gerencia Informatica");
        jMenuItem55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem55ActionPerformed(evt);
            }
        });
        jMenu29.add(jMenuItem55);

        jMenu11.add(jMenu29);

        jMenu30.setText("Profesor");

        jMenuItem56.setText("Duban Ordoñez");
        jMenuItem56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem56ActionPerformed(evt);
            }
        });
        jMenu30.add(jMenuItem56);

        jMenuItem57.setText("Joaquin Ariza");
        jMenuItem57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem57ActionPerformed(evt);
            }
        });
        jMenu30.add(jMenuItem57);

        jMenuItem58.setText("Carlos Vargas");
        jMenuItem58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem58ActionPerformed(evt);
            }
        });
        jMenu30.add(jMenuItem58);

        jMenu11.add(jMenu30);

        jMenu1.add(jMenu11);

        jMenu12.setText("Semestre X");

        jMenu31.setText("Materia");

        jMenuItem59.setText("Gestion Tecnologica");
        jMenuItem59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem59ActionPerformed(evt);
            }
        });
        jMenu31.add(jMenuItem59);

        jMenuItem60.setText("Etica para Ingenieros");
        jMenuItem60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem60ActionPerformed(evt);
            }
        });
        jMenu31.add(jMenuItem60);

        jMenuItem61.setText("Legislacion de Ingenieria");
        jMenuItem61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem61ActionPerformed(evt);
            }
        });
        jMenu31.add(jMenuItem61);

        jMenu12.add(jMenu31);

        jMenu32.setText("Profesor");

        jMenuItem62.setText("Jose Miguel Ojeda");
        jMenuItem62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem62ActionPerformed(evt);
            }
        });
        jMenu32.add(jMenuItem62);

        jMenuItem63.setText("Eva Patricia Vasquez");
        jMenuItem63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem63ActionPerformed(evt);
            }
        });
        jMenu32.add(jMenuItem63);

        jMenuItem64.setText("Jorge Reyes");
        jMenuItem64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem64ActionPerformed(evt);
            }
        });
        jMenu32.add(jMenuItem64);

        jMenu12.add(jMenu32);

        jMenu1.add(jMenu12);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addGap(151, 151, 151))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton1)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
      horarios obj=new horarios();
      obj.setVisible(true);
      dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jMenuItem38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem38ActionPerformed
        impresion.setText("");
        impresion.append("MATERIA: "+jose2.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+jose2.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+jose2.materias.grup);
    }//GEN-LAST:event_jMenuItem38ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+carlos2.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+carlos2.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+carlos2.materias.grup);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+esau1.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+esau1.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+esau1.materias.grup);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+esau1.materias.xdia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+esau1.materias.xgrup);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem61ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+jorge2.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+jorge2.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+jorge2.materias.grup);
    }//GEN-LAST:event_jMenuItem61ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        impresion.setText("");
        impresion.append("MATERIA: "+carlos.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+carlos.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+carlos.materias.grup);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        impresion.setText("");
        impresion.append("MATERIA: "+eva.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+eva.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+eva.materias.grup);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        impresion.setText("");
        impresion.append("MATERIA: "+pedro.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+pedro.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+pedro.materias.grup);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        impresion.setText("");
        impresion.append("MATERIA: "+jorge.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+jorge.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+jorge.materias.grup);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        impresion.setText("");
        impresion.append("MATERIA: "+jose.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+jose.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+jose.materias.grup);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        impresion.setText("");
        impresion.append("MATERIA: "+fernando.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+fernando.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+fernando.materias.grup);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("MATERIA: "+fernando.materias.xnombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+fernando.materias.xdia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+fernando.materias.xgrup);
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+carlos.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+carlos.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+carlos.materias.grup);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
       impresion.setText("");
        impresion.append("NOMBRE: "+pedro.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+pedro.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+pedro.materias.grup);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+eva.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+eva.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+eva.materias.grup);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+jorge.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+jorge.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+jorge.materias.grup);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+jose.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+jose.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+jose.materias.grup);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        impresion.setText("");
        impresion.append("MATERIA: "+wilson.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+wilson.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+wilson.materias.grup);
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+wilson.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+wilson.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+wilson.materias.grup);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("NOMBRE: "+fernando.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+fernando.materias.xdia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+fernando.materias.xgrup);
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+joaquin.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+joaquin.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+joaquin.materias.grup);
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+fernando.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+fernando.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+fernando.materias.grup);
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        impresion.setText("");
        impresion.append("MATERIA: "+joaquin.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+joaquin.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+joaquin.materias.grup);
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
       impresion.setText("");
        impresion.append("MATERIA: "+fernando2.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+fernando2.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+fernando2.materias.grup);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+fernando2.materias.xdia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+fernando2.materias.xgrup);
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        impresion.setText("");
        impresion.append("MATERIA: "+joaquin2.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+joaquin2.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+joaquin2.materias.grup);
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
        impresion.setText("");
        impresion.append("MATERIA: "+eva2.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+eva2.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+eva2.materias.grup);
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+fernando2.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+fernando2.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+fernando2.materias.grup);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+fernando2.materias.xdia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+fernando2.materias.xgrup);
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+esau.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+esau.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+esau.materias.grup);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+esau.materias.xdia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+esau.materias.xgrup);
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+wilson2.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+wilson2.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+wilson2.materias.grup);
    }//GEN-LAST:event_jMenuItem34ActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
       impresion.setText("");
        impresion.append("NOMBRE: "+jose2.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+jose2.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+jose2.materias.grup);
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenuItem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem36ActionPerformed
        impresion.setText("");
        impresion.append("MATERIA: "+esau.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+esau.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+esau.materias.grup);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("MATERIA: "+esau.materias.xnombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+esau.materias.xdia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+esau.materias.xgrup);
    }//GEN-LAST:event_jMenuItem36ActionPerformed

    private void jMenuItem37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem37ActionPerformed
        impresion.setText("");
        impresion.append("MATERIA: "+wilson2.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+wilson2.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+wilson2.materias.grup);
    }//GEN-LAST:event_jMenuItem37ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       impresion.setText("");
        impresion.append("MATERIA: "+esau1.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+esau1.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+esau1.materias.grup);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+esau1.materias.xdia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+esau1.materias.xgrup);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        impresion.setText("");
        impresion.append("MATERIA: "+fernando3.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+fernando3.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+fernando3.materias.grup);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        impresion.setText("");
        impresion.append("MATERIA: "+jose3.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+jose3.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+jose3.materias.grup);
  
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        impresion.setText("");
        impresion.append("MATERIA: "+carlos2.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+carlos2.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+carlos2.materias.grup);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+fernando3.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+fernando3.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+fernando3.materias.grup);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+jose3.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+jose3.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+jose3.materias.grup);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+esperanza.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+esperanza.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+esperanza.materias.grup);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+esperanza.materias.xdia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+esperanza.materias.xgrup);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+duban.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+duban.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+duban.materias.grup);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem39ActionPerformed
       impresion.setText("");
        impresion.append("NOMBRE: "+jose4.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+jose4.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+jose4.materias.grup);
    }//GEN-LAST:event_jMenuItem39ActionPerformed

    private void jMenuItem40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem40ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+wilson3.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+wilson3.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+wilson3.materias.grup);
    }//GEN-LAST:event_jMenuItem40ActionPerformed

    private void jMenuItem41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem41ActionPerformed
       impresion.setText("");
        impresion.append("NOMBRE: "+carlos3.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+carlos3.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+carlos3.materias.grup);
    }//GEN-LAST:event_jMenuItem41ActionPerformed

    private void jMenuItem42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem42ActionPerformed
        impresion.setText("");
        impresion.append("MATERIA: "+esperanza.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+esperanza.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+esperanza.materias.grup);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+esperanza.materias.xdia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+esperanza.materias.xgrup);
    }//GEN-LAST:event_jMenuItem42ActionPerformed

    private void jMenuItem43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem43ActionPerformed
         impresion.setText("");
        impresion.append("MATERIA: "+duban.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+duban.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+duban.materias.grup);
    }//GEN-LAST:event_jMenuItem43ActionPerformed

    private void jMenuItem44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem44ActionPerformed
         impresion.setText("");
        impresion.append("MATERIA: "+jose4.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+jose4.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+jose4.materias.grup);
    }//GEN-LAST:event_jMenuItem44ActionPerformed

    private void jMenuItem45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem45ActionPerformed
         impresion.setText("");
        impresion.append("MATERIA: "+wilson3.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+wilson3.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+wilson3.materias.grup);
    }//GEN-LAST:event_jMenuItem45ActionPerformed

    private void jMenuItem46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem46ActionPerformed
        impresion.setText("");
        impresion.append("MATERIA: "+carlos3.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+carlos3.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+carlos3.materias.grup);
    }//GEN-LAST:event_jMenuItem46ActionPerformed

    private void jMenuItem50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem50ActionPerformed
        impresion.setText("");
        impresion.append("MATERIA: "+oscar.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+oscar.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+oscar.materias.grup);
    }//GEN-LAST:event_jMenuItem50ActionPerformed

    private void jMenuItem51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem51ActionPerformed
         impresion.setText("");
        impresion.append("MATERIA: "+duban2.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+duban2.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+duban2.materias.grup);
    }//GEN-LAST:event_jMenuItem51ActionPerformed

    private void jMenuItem52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem52ActionPerformed
         impresion.setText("");
        impresion.append("MATERIA: "+pedro2.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+pedro2.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+pedro2.materias.grup);
    }//GEN-LAST:event_jMenuItem52ActionPerformed

    private void jMenuItem47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem47ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+duban2.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+duban2.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+duban2.materias.grup);
    }//GEN-LAST:event_jMenuItem47ActionPerformed

    private void jMenuItem48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem48ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+oscar.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+oscar.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+oscar.materias.grup);
    }//GEN-LAST:event_jMenuItem48ActionPerformed

    private void jMenuItem49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem49ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+pedro2.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+pedro2.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+pedro2.materias.grup);
    }//GEN-LAST:event_jMenuItem49ActionPerformed

    private void jMenuItem53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem53ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+duban3.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+duban3.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+duban3.materias.grup);
    }//GEN-LAST:event_jMenuItem53ActionPerformed

    private void jMenuItem54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem54ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+joaquin3.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+joaquin3.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+joaquin3.materias.grup);
    }//GEN-LAST:event_jMenuItem54ActionPerformed

    private void jMenuItem55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem55ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+carlos4.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+carlos4.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+carlos4.materias.grup);
    }//GEN-LAST:event_jMenuItem55ActionPerformed

    private void jMenuItem56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem56ActionPerformed
        impresion.setText("");
        impresion.append("MATERIA: "+duban3.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+duban3.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+duban3.materias.grup);
    }//GEN-LAST:event_jMenuItem56ActionPerformed

    private void jMenuItem57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem57ActionPerformed
        impresion.setText("");
        impresion.append("MATERIA: "+joaquin3.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+joaquin3.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+joaquin3.materias.grup);
    }//GEN-LAST:event_jMenuItem57ActionPerformed

    private void jMenuItem58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem58ActionPerformed
        impresion.setText("");
        impresion.append("MATERIA: "+carlos4.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+carlos4.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+carlos4.materias.grup);
    }//GEN-LAST:event_jMenuItem58ActionPerformed

    private void jMenuItem62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem62ActionPerformed
        impresion.setText("");
        impresion.append("MATERIA: "+jose5.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+jose5.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+jose5.materias.grup);
    }//GEN-LAST:event_jMenuItem62ActionPerformed

    private void jMenuItem59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem59ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+jose5.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+jose5.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+jose5.materias.grup);
    }//GEN-LAST:event_jMenuItem59ActionPerformed

    private void jMenuItem63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem63ActionPerformed
        impresion.setText("");
        impresion.append("MATERIA: "+eva3.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+eva3.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+eva3.materias.grup);
    }//GEN-LAST:event_jMenuItem63ActionPerformed

    private void jMenuItem64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem64ActionPerformed
        impresion.setText("");
        impresion.append("MATERIA: "+jorge2.materias.nombremat);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+jorge2.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+jorge2.materias.grup);
    }//GEN-LAST:event_jMenuItem64ActionPerformed

    private void jMenuItem60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem60ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+eva3.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+eva3.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+eva3.materias.grup);
    }//GEN-LAST:event_jMenuItem60ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+eva2.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+eva2.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+eva2.materias.grup);
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        impresion.setText("");
        impresion.append("NOMBRE: "+joaquin2.nombre);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("DIA: "+joaquin2.materias.dia);
        impresion.append(System.getProperty("line.separator"));
        impresion.append("GRUPO: "+joaquin2.materias.grup);
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(semestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(semestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(semestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(semestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new semestre().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea impresion;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu22;
    private javax.swing.JMenu jMenu23;
    private javax.swing.JMenu jMenu24;
    private javax.swing.JMenu jMenu25;
    private javax.swing.JMenu jMenu26;
    private javax.swing.JMenu jMenu27;
    private javax.swing.JMenu jMenu28;
    private javax.swing.JMenu jMenu29;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu30;
    private javax.swing.JMenu jMenu31;
    private javax.swing.JMenu jMenu32;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem47;
    private javax.swing.JMenuItem jMenuItem48;
    private javax.swing.JMenuItem jMenuItem49;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem50;
    private javax.swing.JMenuItem jMenuItem51;
    private javax.swing.JMenuItem jMenuItem52;
    private javax.swing.JMenuItem jMenuItem53;
    private javax.swing.JMenuItem jMenuItem54;
    private javax.swing.JMenuItem jMenuItem55;
    private javax.swing.JMenuItem jMenuItem56;
    private javax.swing.JMenuItem jMenuItem57;
    private javax.swing.JMenuItem jMenuItem58;
    private javax.swing.JMenuItem jMenuItem59;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem60;
    private javax.swing.JMenuItem jMenuItem61;
    private javax.swing.JMenuItem jMenuItem62;
    private javax.swing.JMenuItem jMenuItem63;
    private javax.swing.JMenuItem jMenuItem64;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
