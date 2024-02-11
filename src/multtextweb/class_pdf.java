/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multtextweb;

import java.awt.Component;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.pdfbox.io.MemoryUsageSetting;
import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.multipdf.PageExtractor;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.bouncycastle.util.Times;


/**
 *
 * @author lu
 */
public class class_pdf {
  
   private  String string_formato=".png";
    private  static  File file;
     private static  File file2;
           private static  float FONT_SIZE = 12;
    private static final float LEADING = -1.5f * FONT_SIZE;
    private static final PDFont FONT = PDType1Font.HELVETICA;
 private    int numberDocPage1=1;
    private  int numberDocPage2=1;
 
    

    
    
    
  
    
    
    

    
    
    protected void radio_button( javax.swing.JComboBox<String> jComboBox2 ,javax.swing.JComboBox<String> jComboBox3, javax.swing.JRadioButton jRadioButton1,
     javax.swing.JRadioButton jRadioButton2
    , javax.swing.JRadioButton jRadioButton3){
        

     if (jRadioButton1.isSelected()==true){
         
  String str1=(String) jComboBox2.getSelectedItem();
  String str2=(String)jComboBox3.getSelectedItem();
  Integer number1=Integer.valueOf(str1);
  Integer number2=Integer.valueOf(str2);
  
numberDocPage1=number2;
numberDocPage2=number1;

    }else if(jRadioButton2.isSelected()==true){
                        
   String str1=(String) jComboBox2.getSelectedItem();

  Integer number1=Integer.valueOf(str1);

numberDocPage2=number1;
        
    }else if(jRadioButton3.isSelected()==true){
        PDDocument doc=null;
         try {
              doc=  PDDocument.load(file);
             numberDocPage1=   doc.getNumberOfPages();
         } catch (IOException ex) {
            Toolkit.getDefaultToolkit().beep();
         } 
         finally{
             try {
                 doc.close();
             } catch (IOException ex) {
               System.out.println("ciao");
             }
         }
    }

       
    }
    

    
protected void selected_formato(javax.swing.JComboBox<String> jComboBox7 ){
   String string_format = (String) jComboBox7.getSelectedItem();
   
   switch(string_format){
       
       
       case ".png":{
           string_formato=string_format;
              break; 
               }
       
        case ".jpeg":{
             string_formato=string_format;
               break;
               }
   }
   
   
}
  
    //convert_file_at_image
     protected void pdf_at_image(Component parent,javax.swing.JComboBox<String> jComboBox2 ,javax.swing.JComboBox<String> jComboBox3,
   javax.swing.JRadioButton jRadioButton1,javax.swing.JRadioButton jRadioButton2, javax.swing.JRadioButton jRadioButton3) {
    	 
    	
         
         
   	 radio_button (jComboBox2 ,jComboBox3, jRadioButton1,
     jRadioButton2
    ,jRadioButton3);
 PDDocument doc=null;
try{ 
    File file= getFile();
         	 File file2= getFile2();
    
   doc=  PDDocument.load(file);
    	 for( int i=0;i<=numberDocPage1-1;i++){
         	
        
     BufferedImage buffer=new PDFRenderer(doc).renderImageWithDPI(i, 1000);
         
         long t= Times.nanoTime();
        String hh=file2+String.valueOf(t)+string_formato;
    	 ImageIO.write(buffer, "JPEG", new File(hh));
       }   }catch(IOException e){
            Toolkit.getDefaultToolkit().beep();
                         JOptionPane.showMessageDialog(parent, "Load file o\n,File Daneggiato,  Grazie!!");

       }catch(NullPointerException  w){
            Toolkit.getDefaultToolkit().beep();
       }finally{
                try {
                    doc.close();
                } catch (IOException ex) {
                }
}
    	
     }
     //estrai pagine nel pdf in mod sequenziale.
     protected void text_extractor(int start_Page, int end_page,File saved_fie )throws IOException {
    	File file=class_pdf.getFile();
                 	
                         
   
 	  PDDocument doc=  PDDocument.load(file);
 		   
 		PageExtractor tex= new PageExtractor(doc);
 		tex.setStartPage( start_Page);
 		tex.	setEndPage( end_page);
 		
 		PDDocument  documenti= tex.extract();
 		
       documenti.save(saved_fie); 
                  doc.close();
 		documenti.close();
 		
     }
     
     
     
     
        protected   static void choisFile_merge(Component parent) throws IOException{

            
choisFile jFileChooser21 =new choisFile();
      FileFilter filter = new FileNameExtensionFilter(" File PDF", new String[] {"pdf"});
jFileChooser21.setFileFilter(filter);
jFileChooser21.addChoosableFileFilter(filter);
     jFileChooser21.setAccessory(new fileChooser_component(jFileChooser21));
     fileChooser_component componet= new fileChooser_component(jFileChooser21);
      DefaultListModel model = componet.getModel();
     
      int y=jFileChooser21.showSaveDialog(parent);
      
String [] u=new String [model.getSize()];
        
       
        
    
          if (y == JFileChooser.APPROVE_OPTION) {


          for (int i = 0; i <=model.getSize()-1; i++) {

    
    
     
 
 
  
   String hot= ((File) model.getElementAt(i)).getAbsolutePath();
  u[i]=hot;
                    
           }
          
           PDFMergerUtility pdfmerge = new PDFMergerUtility(); 
                   
       for(int h=0; h<=u.length-1; h++){
           
           pdfmerge.addSource(new File(u[h]));
           try{
           pdfmerge.setDestinationFileName(  ((File) model.lastElement()).getAbsolutePath()+".pdf");
pdfmerge.mergeDocuments(MemoryUsageSetting.setupMainMemoryOnly());
           }catch(IOException w){
               
           }
       }
         
          }
                   
           
    
   
  }
        
        
        
     protected static  void choisFile(Component parent,javax.swing.JFileChooser jFileChooser1, int returnVal){
        
          if (returnVal == JFileChooser.APPROVE_OPTION) {
      file = jFileChooser1.getSelectedFile();
         setFile(file);
   
   } 
  }
   
   private static  void setFile(File file){
        class_pdf.file=file;
 
   }
   
   protected  static File getFile(){
            return class_pdf.file;

   }  
     
   
   
     protected static  void choisFile2(Component parent,javax.swing.JFileChooser jFileChooser2){
         int returnVal = jFileChooser2.showSaveDialog(parent);
          if (returnVal == JFileChooser.APPROVE_OPTION) {
      file2 = jFileChooser2.getSelectedFile();
         setFile2(file2);
   } 
  }
   
   private static  void setFile2(File file2){
        class_pdf.file2=file2;
 
   }
   
   protected  static File getFile2(){
            return class_pdf.file2;

   }  
   
   
   
     
    
     public void  ctr(javax.swing.JComboBox<String> jComboBox5 ,javax.swing.JComboBox<String> jComboBox6,File file){
         PDDocument doc= null;
         try{
               
             doc=  PDDocument.load(file);
            
         int number_page=   doc.getNumberOfPages();
         int[] array = new int[number_page+2];
        for(int y=0;y<=number_page-1;y++){
        
              array[y]=y;

           }     
      
          String[] arraya = new String[number_page+2];
            for(int i=1;i<=number_page;i++){
                
        for(int j:array){
           
           arraya[i]=String.valueOf( array[i]);
        }
          

            }
                   
            jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(arraya));
                             jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(arraya));
           
          
                 
                 
         }catch(IOException to){
         }catch(Exception w){
                  

         }finally{
             try {
                 doc.close();
             } catch (IOException ex) {
             }
         }
         
     
             
         
     }

  
     
     
     
     
     protected PDFont pdf_arial(javax.swing.JLabel jLabel11,javax.swing.JComboBox<String> jComboBox8){
         
       var number_arial=  jComboBox8.getSelectedIndex();
         
         
         switch(number_arial){
             
             
             case 0->{
                        
            //BufferedImage u=ImageIO.read(new File("image_char\\imgdesk1.png"));
                   ImageIcon i= new ImageIcon("C:\\Users\\lu\\OneDrive\\Documenti\\NetBeansProjects\\multTextWeb\\src\\image_char\\imgechar1.png");

            jLabel11.setIcon(i);  
              return PDType1Font.COURIER;
             
             }
                case 1->{
                                  
         //   BufferedImage u=ImageIO.read(new File("image_char\\imgdesk2.png"));
           ImageIcon i= new ImageIcon("C:\\Users\\lu\\OneDrive\\Documenti\\NetBeansProjects\\multTextWeb\\src\\image_char\\imagechar2.png");
            jLabel11.setIcon(i);  
               return PDType1Font.COURIER_BOLD ;
             
             }
                case 2->{
                                        
           // BufferedImage u=ImageIO.read(new File("image_char\\imgdesk3.png"));
           ImageIcon i= new ImageIcon("C:\\Users\\lu\\OneDrive\\Documenti\\NetBeansProjects\\multTextWeb\\src\\image_char\\imagechar3.png");
            jLabel11.setIcon(i);
                return PDType1Font.COURIER_BOLD_OBLIQUE;
             }
                   case 3->{
                          ImageIcon i= new ImageIcon("C:\\Users\\lu\\OneDrive\\Documenti\\NetBeansProjects\\multTextWeb\\src\\image_char\\imagechar4.png");
            jLabel11.setIcon(i);
                return PDType1Font.HELVETICA ;
             }
                      case 4->{
                             ImageIcon i= new ImageIcon("C:\\Users\\lu\\OneDrive\\Documenti\\NetBeansProjects\\multTextWeb\\src\\image_char\\imagechar5.png");
            jLabel11.setIcon(i);
	  return PDType1Font.HELVETICA_BOLD;
             }
                         case 5->{
                               ImageIcon i= new ImageIcon("C:\\Users\\lu\\OneDrive\\Documenti\\NetBeansProjects\\multTextWeb\\src\\image_char\\imagechar6.png");
            jLabel11.setIcon(i);
                return PDType1Font.HELVETICA_BOLD_OBLIQUE;
             }
                            case 6 ->{
                                         ImageIcon i= new ImageIcon("C:\\Users\\lu\\OneDrive\\Documenti\\NetBeansProjects\\multTextWeb\\src\\image_char\\imagechar7.png");
            jLabel11.setIcon(i);
              return PDType1Font.HELVETICA_OBLIQUE ;
             }
                               case 7->{
                                    ImageIcon i= new ImageIcon("C:\\Users\\lu\\OneDrive\\Documenti\\NetBeansProjects\\multTextWeb\\src\\image_char\\imagechar8.png");
            jLabel11.setIcon(i);
                 return PDType1Font.SYMBOL ;
             }
                                  case 8->{
                                       ImageIcon i= new ImageIcon("C:\\Users\\lu\\OneDrive\\Documenti\\NetBeansProjects\\multTextWeb\\src\\image_char\\imagechar9.png");
            jLabel11.setIcon(i);
                   return PDType1Font.TIMES_BOLD;   
	
             }
                                     case 9->{
                                            ImageIcon i= new ImageIcon("C:\\Users\\lu\\OneDrive\\Documenti\\NetBeansProjects\\multTextWeb\\src\\image_char\\imagechar10.png");
            jLabel11.setIcon(i);
                  return PDType1Font.TIMES_BOLD_ITALIC ;
             }
                                        case 10->{
                                               ImageIcon i= new ImageIcon("C:\\Users\\lu\\OneDrive\\Documenti\\NetBeansProjects\\multTextWeb\\src\\image_char\\imagechar11.png");
            jLabel11.setIcon(i);
                    return PDType1Font.TIMES_ITALIC;
             }
                                           case 11->{
                                                          ImageIcon i= new ImageIcon("C:\\Users\\lu\\OneDrive\\Documenti\\NetBeansProjects\\multTextWeb\\src\\image_char\\imagechar12.png");
            jLabel11.setIcon(i);
                  return PDType1Font.TIMES_ROMAN;
             }
                                              case 12->{
                                                             ImageIcon i= new ImageIcon("C:\\Users\\lu\\OneDrive\\Documenti\\NetBeansProjects\\multTextWeb\\src\\image_char\\aa.png");
            jLabel11.setIcon(i);
                   return PDType1Font.ZAPF_DINGBATS;
             }
                   
                                              default ->{
                                                   ImageIcon i= new ImageIcon("C:\\Users\\lu\\OneDrive\\Documenti\\NetBeansProjects\\multTextWeb\\src\\image_char\\imagechar4.png");
            jLabel11.setIcon(i);
                                                  return PDType1Font.HELVETICA;
                                              }         
         }
         
         
      
         /*
         static PDType1Font
         
        COURIER 
	COURIER_BOLD 
	COURIER_BOLD_OBLIQUE 
	COURIER_OBLIQUE 
	HELVETICA 
	HELVETICA_BOLD 
	HELVETICA_BOLD_OBLIQUE 
	HELVETICA_OBLIQUE 
	SYMBOL 
	TIMES_BOLD 
	TIMES_BOLD_ITALIC 
	TIMES_ITALIC 
	TIMES_ROMAN 
	ZAPF_DINGBATS 
         
Campi ereditati dalla classe org.apache.pdfbox.pdm*/
         
         
         
         
         
         
         
     
     }
     
     
     
  


}
