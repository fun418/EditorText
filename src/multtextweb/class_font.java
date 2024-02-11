/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multtextweb;

import java.awt.Color;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;




/**
 *
 * @author lu
 */
public class class_font {

  private int positionText=0;
private int  numberslider=2;


       SimpleAttributeSet center = new SimpleAttributeSet();

      
        protected  void  setStrikeThrough(javax.swing.JTextPane jTextPane1, boolean t){
            
      StyleContext snc=euro();
      //   attivo = !attivo;
     AttributeSet aset  = snc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.StrikeThrough, t);
  
  jTextPane1.setCharacterAttributes(aset, false);    
 
        }

        
    
       
        
        
    protected void getTextSlider2(javax.swing.JTextPane jTextPane1,javax.swing.JSlider jSlider2) {
       
        //48 95 143
      numberslider=  Integer.valueOf(jSlider2.getValue());
      
      switch(numberslider){
          
          case 0:{
                  
          
         
       
                          StyledDocument dock = jTextPane1.getStyledDocument();

               StyleConstants.		setLeftIndent(center, -4);
dock.setParagraphAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectionEnd(), center, false);
   Toolkit.getDefaultToolkit().beep();
           positionText = 0;
              break;
          }
           case 1:{
                          StyledDocument dock = jTextPane1.getStyledDocument();

               StyleConstants.		setLeftIndent(center, 41);
dock.setParagraphAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectionEnd(), center, false);

positionText = 48;
              break;
          }
            case 2:{
                StyledDocument dock = jTextPane1.getStyledDocument();

               StyleConstants.setLeftIndent(center, 98);
dock.setParagraphAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectionEnd(),  center, false);

positionText = 95;
              break;
          }
             case 3:{
                 StyledDocument dock = jTextPane1.getStyledDocument();

               StyleConstants.		setLeftIndent(center, -4);
dock.setParagraphAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectionEnd(), center, false);

positionText = 140;
              break;
          }
              case 4:{
                 StyledDocument dock = jTextPane1.getStyledDocument();

               StyleConstants.		setLeftIndent(center, 0);
dock.setParagraphAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectionEnd(), center, false);

positionText = 186;

              break;
          }
      
      //227
                case 5:{
                 StyledDocument dock = jTextPane1.getStyledDocument();

               StyleConstants.		setLeftIndent(center, 50);
dock.setParagraphAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectionEnd(), center, false);

positionText = 227;
              break;
          }
                case 6:{
                 StyledDocument dock = jTextPane1.getStyledDocument();

               StyleConstants.		setLeftIndent(center, 110);
dock.setParagraphAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectionEnd(), center, false);

positionText = 279;
              break;
          }
                case 7:{
                 StyledDocument dock = jTextPane1.getStyledDocument();

               StyleConstants.		setLeftIndent(center, 170);
dock.setParagraphAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectionEnd(), center, false);

positionText = 324;
              break;
          }
                case 8:{
                 StyledDocument dock = jTextPane1.getStyledDocument();

               StyleConstants.		setLeftIndent(center, 227);
dock.setParagraphAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectionEnd(), center, false);

positionText = 370;
              break;
          }
                case 9:{
                 StyledDocument dock = jTextPane1.getStyledDocument();

               StyleConstants.		setLeftIndent(center, 280);
dock.setParagraphAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectionEnd(), center, false);

positionText = 417;
              break;
          }
                case 10:{
                 StyledDocument dock = jTextPane1.getStyledDocument();

               StyleConstants.		setLeftIndent(center, 340);
dock.setParagraphAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectionEnd(), center, false);

positionText = 464;
              break;
          }
                case 11:{
                 StyledDocument dock = jTextPane1.getStyledDocument();

               StyleConstants.		setLeftIndent(center, 395);
dock.setParagraphAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectionEnd(), center, false);

positionText = 510;
              break;
          }
                case 12:{
                 StyledDocument dock = jTextPane1.getStyledDocument();

               StyleConstants.		setLeftIndent(center, 455);
dock.setParagraphAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectionEnd(), center, false);
positionText = 558;
              break;
          }
                case 13:{
                 StyledDocument dock = jTextPane1.getStyledDocument();
               StyleConstants.		setLeftIndent(center, 520);
dock.setParagraphAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectionEnd(), center, false);
positionText = 604;
              break;
          }
                case 14:{
                 StyledDocument dock = jTextPane1.getStyledDocument();
               StyleConstants.		setLeftIndent(center, 570);
dock.setParagraphAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectionEnd(), center, false);
positionText = 650;
              break;
          }
                case 15:{
                 StyledDocument dock = jTextPane1.getStyledDocument();
               StyleConstants.		setLeftIndent(center, 627);
dock.setParagraphAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectionEnd(), center, false);
positionText = 697;
              break;
          }
                case 16:{
                       
           
       
                 StyledDocument dock = jTextPane1.getStyledDocument();
               StyleConstants.		setLeftIndent(center, 860  );
dock.setParagraphAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectionEnd(), center, false);
positionText = 742;
              break;
          }
                case 17:{
                 StyledDocument dock = jTextPane1.getStyledDocument();
               StyleConstants.		setLeftIndent(center, 915);
dock.setParagraphAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectionEnd(), center, false);
positionText = 790;
              break;
          }
                case 18:{
                 StyledDocument dock = jTextPane1.getStyledDocument();
               StyleConstants.		setLeftIndent(center, 972);
dock.setParagraphAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectionEnd(),center, false);
positionText = 836;
              break;
          }
                case 19:{
                 StyledDocument dock = jTextPane1.getStyledDocument();
               StyleConstants.		setLeftIndent(center,1027 );
dock.setParagraphAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectionEnd(), center, false);
positionText = 882;
              break;
          }
                case 20:{
                 StyledDocument dock = jTextPane1.getStyledDocument();
               StyleConstants.		setLeftIndent(center, 1070);
dock.setParagraphAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectionEnd(), center, false);
positionText = 928;
              break;
          }
    }
    }
    
    
    
     protected void getTextSlider1(javax.swing.JTextPane jTextPane1,javax.swing.JSlider jSlider1) {
       
  
      numberslider=  Integer.valueOf(jSlider1.getValue());
      
      switch(numberslider){
          
          case 0:{
              break;
          }
           case 1:{

              break;
          }
            case 2:{
            

              break;
          }
             case 3:{
              
              break;
          }
              case 4:{
             


              break;
          }

                case 5:{
             
              break;
          }
                case 6:{
              
              break;
          }
                case 7:{
                 jTextPane1.setMargin(new Insets(100,179,79,752));  
positionText = 324;
              break;
          }
                case 8:{
              jTextPane1.setMargin(new Insets(100,179,79,696));  
positionText = 370;
              break;
          }
                case 9:{
               jTextPane1.setMargin(new Insets(100,179,79,635));  
positionText = 417;
              break;
          }
                case 10:{
              jTextPane1.setMargin(new Insets(100,179,79,590));  
positionText = 464;
              break;
          }
                case 11:{
                 jTextPane1.setMargin(new Insets(100,179,79,527));  
positionText = 510;
              break;
          }
                case 12:{
                     jTextPane1.setMargin(new Insets(100,179,79,470));  
       
positionText = 558;
              break;
          }
                case 13:{
                     jTextPane1.setMargin(new Insets(100,179,79,405));  
        
positionText = 604;
              break;
          }
                case 14:{
                    jTextPane1.setMargin(new Insets(100,179,79,350));  

positionText = 650;
              break;
          }
                case 15:{
                    jTextPane1.setMargin(new Insets(100,179,79,294));  
   
positionText = 697;
              break;
          }
                case 16:{
           
              break;
          }
                case 17:{
           
              break;
          }
                case 18:{
          
              break;
          }
                case 19:{
          
              break;
          }
                case 20:{
           
              break;
          }
    }
    }
    
    
    //spaceIn
    protected void spaceIn(javax.swing.JTextPane jTextPane1,int i){
   
       if(i<=0){
            Toolkit.getDefaultToolkit().beep();
       }
         if(i<=0){
            i=0;
                 StyledDocument doc = jTextPane1.getStyledDocument();
         StyleConstants.setSpaceAbove(center, 0);
                 doc.setParagraphAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectionEnd(), center, false);
}else{StyledDocument doc = jTextPane1.getStyledDocument();
         StyleConstants.setSpaceAbove(center, i);
                 doc.setParagraphAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectionEnd(), center, false);

              
          }
    }
   
    //spaceOut
     protected void spaceOut(javax.swing.JTextPane jTextPane1,int i){
         
         
           if(i<=0){
            Toolkit.getDefaultToolkit().beep();
       }
         
         
          if(i<=0){
            i=0;
                 StyledDocument doc = jTextPane1.getStyledDocument();
         StyleConstants.setSpaceAbove(center, 0);
                 doc.setParagraphAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectionEnd(), center, false);
}else{StyledDocument doc = jTextPane1.getStyledDocument();
         StyleConstants.setSpaceAbove(center, i);
                 doc.setParagraphAttributes(jTextPane1.getSelectionStart(), jTextPane1.getSelectionEnd(), center, false);

               
              
          }
     } 
     
     
     
   
     
    
  
        
          
          protected StyleContext euro(){
              
              return StyleContext.getDefaultStyleContext();
          }
           
             protected void getSize(javax.swing.JTextPane jTextPane1 ,javax.swing.JComboBox<String> jComboBox4){
        
  
        String string_number= (String) jComboBox4.getSelectedItem();
    String [] ab=  string_number.split(" ");
        
String h=ab[0];
  
     int vi=   Integer.valueOf(h);
 
StyleContext sc = euro();
AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Size, vi);

 jTextPane1.setCharacterAttributes(aset, false);

    }
   
             
             
protected void controlSize( javax.swing.JTextPane jTextPane1,javax.swing.JComboBox<String> jComboBox4){   
    
int offset = jTextPane1.getCaretPosition();
 StyledDocument doc=jTextPane1.getStyledDocument();
var attribut=doc.getCharacterElement(offset).getAttributes();



int fontSize = StyleConstants.getFontSize(attribut);
  
  StyleContext sc = euro();
AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Size, fontSize);

 jTextPane1.setCharacterAttributes(aset, false);
verificaSize( jComboBox4,fontSize);



}    

protected void verificaSize(javax.swing.JComboBox<String> jComboBox4,int number){
    
    
    switch(number){
        
        
        //actionPropertyChanged
    case  6 :{
           
             jComboBox4.setSelectedIndex(0);
             break;
        }   
        
 case  7 :{
           
             jComboBox4.setSelectedIndex(1);
             break;
        }
 case 8 :{
           
             jComboBox4.setSelectedIndex(2);
             break;
        }
 case 9:{
           
             jComboBox4.setSelectedIndex(3);
             break;
        }
 case 10 :{
           
             jComboBox4.setSelectedIndex(4);
             break;
        }
 case 11 :{
           
             jComboBox4.setSelectedIndex(5);
             break;
        }
 case 12 :{
           
             jComboBox4.setSelectedIndex(6);
             break;
        }
 case 13 :{
           
             jComboBox4.setSelectedIndex(7);
             break;
        }
 case 14 :{
           
             jComboBox4.setSelectedIndex(8);
             break;
        }
 case 15:{
           
             jComboBox4.setSelectedIndex(9);
             break;
        }
 case 16 :{
           
             jComboBox4.setSelectedIndex(10);
             break;
        }
 case 18 :{
           
             jComboBox4.setSelectedIndex(11);
             break;
        }
 case 20 :{
           
             jComboBox4.setSelectedIndex(12);
             break;
        }
 case 21 :{
           
             jComboBox4.setSelectedIndex(13);
             break;
        }
 case 22 :{
           
             jComboBox4.setSelectedIndex(14);
             break;
        }
 case 24 :{
           
             jComboBox4.setSelectedIndex(15);
             break;
        }
 case 26 :{
           
             jComboBox4.setSelectedIndex(16);
             break;
        }
 case 28 :{
           
             jComboBox4.setSelectedIndex(17);
             break;
        }
 case 32 :{
           
             jComboBox4.setSelectedIndex(18);
             break;
        }
 case 36 :{
           
             jComboBox4.setSelectedIndex(19);
             break;
        }
 case 40 :{
           
             jComboBox4.setSelectedIndex(20);
             break;
        }
 case 42 :{
           
             jComboBox4.setSelectedIndex(21);
             break;
        }
 case 44 :{
           
             jComboBox4.setSelectedIndex(22);
             break;
        }
 case 48:{
           
             jComboBox4.setSelectedIndex(23);
             break;
        }
 case 54 :{
           
             jComboBox4.setSelectedIndex(24);
             break;
        }
 case 60 :{
           
             jComboBox4.setSelectedIndex(25);
             break;
        }
 case 66 :{
           
             jComboBox4.setSelectedIndex(26);
             break;
        }
 case 72 :{
           
             jComboBox4.setSelectedIndex(27);
             break;
        }
 case 80 :{
           
             jComboBox4.setSelectedIndex(28);
             break;
        }
         case 88 :{
           
             jComboBox4.setSelectedIndex(29);
             break;
        }
                 case 96 :{
           
             jComboBox4.setSelectedIndex(30);
             break;
        }
    
        
    }
}
   


// selected text arial
protected void text_arial(javax.swing.JComboBox<String> jComboBox3,javax.swing.JTextPane jTextPane1){
    
     String select_arial = (String) jComboBox3.getSelectedItem();
    StyleContext sc = euro();
AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Family, select_arial);

 jTextPane1.setCharacterAttributes(aset, false);
    

    
}


//color text
protected void getColorText2(javax.swing.JTextPane jTextPane1, Color color){
    try{
  StyleContext sc = euro();
    
      
AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, color);

 jTextPane1.setCharacterAttributes(aset, false);
    
    
    }catch(NullPointerException a){
        Toolkit.getDefaultToolkit().beep();
    }catch(Exception e){
    Toolkit.getDefaultToolkit().beep();
    e.printStackTrace();
}
    
   
         
         
}




//Evidenziatore text
protected void getColorText(javax.swing.JTextPane jTextPane1, Color color) {

try{
 Highlighter highlighter = new DefaultHighlighter();
jTextPane1.setHighlighter(highlighter);
HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(color);
    int start = jTextPane1.getSelectionStart();
    int end = jTextPane1.getSelectionEnd();
    highlighter.addHighlight(start, end, painter);
}catch(BadLocationException |NullPointerException  t){
    Toolkit.getDefaultToolkit().beep();
} catch(Exception e){
    Toolkit.getDefaultToolkit().beep();
    e.printStackTrace();
}
/*
  try{
          StyleContext sc = euro();
      
AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Background, color);

 jTextPane1.setCharacterAttributes(aset, false);
    
    }catch(NullPointerException a){
        Toolkit.getDefaultToolkit().beep();
    }
    */
}






     
     
}
