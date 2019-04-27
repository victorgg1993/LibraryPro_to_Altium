package com.victorgomez.conversor;

//import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FinestraPrincipal extends javax.swing.JFrame
{
    JFileChooser finestra_buscar_arxiu = new JFileChooser();

    public static boolean estat_canvi_creu = true;
    public static boolean estat_canvi_text = true;
    public static boolean estat_canvi_cantonades = true;
    public static boolean estat_treure_paste = true;
    public boolean pots_convertir = true;
    
    public FinestraPrincipal()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        CheckBoxCreu = new java.awt.Checkbox();
        CheckBoxText = new java.awt.Checkbox();
        boto_conversio = new javax.swing.JButton();
        CheckBoxCanviCantonades = new java.awt.Checkbox();
        CheckBoxTreurePaste = new java.awt.Checkbox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setText("Buscar arxiu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        CheckBoxCreu.setLabel("Canviar tamany creu");
        CheckBoxCreu.setName(""); // NOI18N
        CheckBoxCreu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CheckBoxCreuItemStateChanged(evt);
            }
        });

        CheckBoxText.setLabel("Canviar tamany text");
        CheckBoxText.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CheckBoxTextItemStateChanged(evt);
            }
        });

        boto_conversio.setText("Convertir");
        boto_conversio.setActionCommand("action_conversio");
        boto_conversio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boto_conversioMouseClicked(evt);
            }
        });

        CheckBoxCanviCantonades.setLabel("Canvi angle cantonades pads");
        CheckBoxCanviCantonades.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CheckBoxCanviCantonadesItemStateChanged(evt);
            }
        });

        CheckBoxTreurePaste.setLabel("Treure paste excepte pad 1");
        CheckBoxTreurePaste.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CheckBoxTreurePasteItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckBoxCreu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CheckBoxText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CheckBoxCanviCantonades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boto_conversio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CheckBoxTreurePaste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CheckBoxCreu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CheckBoxText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boto_conversio)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBoxCanviCantonades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBoxTreurePaste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        boto_conversio.getAccessibleContext().setAccessibleName("button_conversio");
        boto_conversio.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arxius .pas", "pas");
        finestra_buscar_arxiu.setFileFilter(filter);

        int returnVal = finestra_buscar_arxiu.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            boto_conversio.setEnabled(true);
            pots_convertir = true;

        }
        else
        {
            boto_conversio.setEnabled(false);
            //log.append("Open command cancelled by user." + newline);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // handler canvi tamany creu
    private void CheckBoxCreuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CheckBoxCreuItemStateChanged
        estat_canvi_creu ^= true;
    }//GEN-LAST:event_CheckBoxCreuItemStateChanged

    private void CheckBoxTextItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CheckBoxTextItemStateChanged
        estat_canvi_text ^= true;
    }//GEN-LAST:event_CheckBoxTextItemStateChanged

    private void boto_conversioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boto_conversioMouseClicked
            
            if( pots_convertir )
            {
                Processar_arxiu( finestra_buscar_arxiu );
                pots_convertir = false;
            }
            
            boto_conversio.setEnabled(false);
            
    }//GEN-LAST:event_boto_conversioMouseClicked

    private void CheckBoxCanviCantonadesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CheckBoxCanviCantonadesItemStateChanged
        estat_canvi_cantonades ^= true;
    }//GEN-LAST:event_CheckBoxCanviCantonadesItemStateChanged

    private void CheckBoxTreurePasteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CheckBoxTreurePasteItemStateChanged
        estat_treure_paste ^= true;
    }//GEN-LAST:event_CheckBoxTreurePasteItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(FinestraPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FinestraPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FinestraPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FinestraPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new FinestraPrincipal().setVisible(true);
                
                CheckBoxCreu.setState(estat_canvi_creu);
                CheckBoxText.setState(estat_canvi_text);
                CheckBoxCanviCantonades.setState(estat_canvi_cantonades);
                CheckBoxTreurePaste.setState(estat_treure_paste);
                
                boto_conversio.setEnabled(false);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static java.awt.Checkbox CheckBoxCanviCantonades;
    private static java.awt.Checkbox CheckBoxCreu;
    private static java.awt.Checkbox CheckBoxText;
    private static java.awt.Checkbox CheckBoxTreurePaste;
    private static javax.swing.JButton boto_conversio;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables


    
    
    
    
    public String Llegir_buffer_arxiu( String path_arxiu )
    {
        String content = null;
        File file = new File( path_arxiu );
        FileReader reader = null;
        
        try
        {
            reader = new FileReader(file);
            char[] chars = new char[(int) file.length()];
            reader.read(chars);
            content = new String(chars);
            reader.close();
        }
        catch (IOException e)
        {
            //e.printStackTrace();
        }
        finally
        {
            if(reader != null)
            {
                try
                {
                    reader.close();
                }
                catch( IOException en)
                {
                
                }
            }
        }
        
        content = content.trim();
        content = content.replaceAll("null", "");
        content = content.replaceAll("\t", "");
        
        return content;
    }
    
    public void Escriure_buffer_arxiu( String nom, String buffer )
    {
        try
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter(nom));
            writer.write(buffer);
            writer.close();
        }
        catch( IOException e )
        {
        
        }
    }
    
    public void Processar_arxiu( JFileChooser finestra_buscar_arxiu ) // aqui passa la màgia
    {
        File arxiu = finestra_buscar_arxiu.getSelectedFile();
        String buffer = Llegir_buffer_arxiu( arxiu.getPath());
        
        if( estat_canvi_creu )
        {
            buffer = Canviar_tamany_creu( buffer );
        }
        
        if( estat_canvi_text )
        {
            buffer = Canviar_tamany_designator( buffer );
        }
        
        if( estat_canvi_cantonades )
        {
            buffer = Canviar_cantonada( buffer );
        }
        
        if( estat_treure_paste )
        {
            buffer = Treure_paste_excepte_pin_1( buffer );
        }
        
        Escriure_buffer_arxiu( arxiu.getPath(), buffer );
    }
    
    
    
    
    public String Canviar_tamany_creu( String buffer )
    {
        buffer = buffer.trim();
        buffer = buffer.replaceAll("\t", " ");
        
        String linia[] = buffer.split( "\\r?\\n" );
              
        for(int j = 0; j < linia.length; j++ )
        {            
            if( linia[j].contains("CreateComponentTrack(NewPCBLibComp,") )
            {
                linia[j] = linia[j].trim();
                String parametres[] = linia[j].split(",");

                String parametre_5 = parametres[5].trim();
                
                if( parametre_5.equals("ILayer.MechanicalLayer(18)") )
                {
                    String parametre_1 = parametres[1].trim();
                    String parametre_2 = parametres[2].trim();
                    String parametre_3 = parametres[3].trim();
                    String parametre_4 = parametres[4].trim();
                    
                    float param_1 = Float.parseFloat(parametre_1);
                    float param_2 = Float.parseFloat(parametre_2);
                    float param_3 = Float.parseFloat(parametre_3);
                    float param_4 = Float.parseFloat(parametre_4);
                    
                    // part positiva
                    if( param_1 > 0 )
                    {
                        parametres[1] = "0.25";
                    }
                    if( param_2 > 0 )
                    {
                        parametres[2] = "0.25";
                    }

                    // part negativa
                    if( param_3 < 0 )
                    {
                        parametres[3] = "-0.25";
                    }
                    if( param_4 < 0 )
                    {
                        parametres[4] = "-0.25";
                    }
                }
                
                linia[j] = "           ";
                linia[j] += Convertir_doble_string_to_string( parametres, ' ' );
                
            }
            linia[j] += "\n";
        }
        
        return  Convertir_doble_string_to_string( linia, ' ' );
        //return buffer;
    }
    
    public String Canviar_tamany_designator( String buffer )
    {
        buffer = buffer.trim();
        buffer = buffer.replaceAll("\t", " ");
        
        String linia[] = buffer.split( "\\r?\\n" );
              
        for(int j = 0; j < linia.length; j++ )
        {            
            if( linia[j].contains("TextObj.Size := MMsToCoord(1.2);") )
            {
                linia[j] = linia[j].replace("TextObj.Size := MMsToCoord(1.2);", "TextObj.Size := MMsToCoord(0.25);\n             TextObj.Width := MMsToCoord(0.025);");
            }
            linia[j] += "\n";
        }
        
    return  Convertir_doble_string_to_string( linia, ' ' );
    //return buffer;
    }
    
    public String Canviar_cantonada( String buffer )
    {
        buffer = buffer.trim();
        buffer = buffer.replaceAll("\t", " ");
        
        String linia[] = buffer.split( "\\r?\\n" );
              
        for(int j = 0; j < linia.length; j++ )
        {
            if( Es_el_parametre( linia[j], "CreateSMDComponentPad" ) ) // parametre ok
            {
                String parametres[] = linia[j].split(",");
                parametres[11] = " 25";
                linia[j] = "           ";
                linia[j] += Convertir_doble_string_to_string( parametres, ',' );
            }
            linia[j] += "\n";
        }
        
        return  Convertir_doble_string_to_string( linia, ' ' );
    }
    
    public String Treure_paste_excepte_pin_1( String buffer )
    {
        buffer = buffer.trim();
        buffer = buffer.replaceAll("\t", " ");
        
        String linia[] = buffer.split( "\\r?\\n" );
              
        for(int j = 0; j < linia.length; j++ )
        {
            if( Es_el_parametre( linia[j], "CreateSMDComponentPad" ) ) // parametre ok
            {
                String parametres[] = linia[j].split(",");
                                    
                if( !parametres[1].contains("'1'") )
                {
                    parametres[12] = " -0.5";
                    linia[j] = "           ";
                    
                    linia[j] += Convertir_doble_string_to_string( parametres, ',' );
                }
            }
            linia[j] += "\n";
        }
        
        return  Convertir_doble_string_to_string( linia, ' ' );
    }
    
    
    
    
    
    
    private boolean Es_el_parametre(  String linia, String parametre )
    {
        linia = linia.trim();

        if( linia.length() > 0 )
        {
            if( parametre.charAt(0) == linia.charAt(0)   ) // si son el mateix char en la posició 0
            {
                if( linia.contains("("))
                {
                    String chunk = linia.substring(0, linia.indexOf("(") );
                    
                    if( chunk.contains(parametre) ) // el paràmetre és el bo
                    {
                        return true;
                    }
                }
                
            }

        }
        return false;
    }
    
    private String Convertir_doble_string_to_string( String[] doble, char caracter )
    {
        String simple = "";
    
        for(int i = 0; i < doble.length; i++ )
        {
            if( i != (doble.length-1) )
            {
                simple += (doble[i] + caracter);
            }
            else // si és la ultima linia, no posem el char final
            {
                simple += doble[i];
            }
        }
        
        return simple;
    }
}

