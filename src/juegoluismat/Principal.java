/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Principal.java
 *
 * Created on 03-dic-2017, 13:28:41
 */
package juegoluismat;


import TetrisLuis.Tetris;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author back
 */
public class Principal extends javax.swing.JFrame {
  Timer contador;
  int r1=0,r2=0,r3=0,vida=0,vip=0;
  String rr1="0",rr2="0",rr3="0";
  int n1=0,n2=0,n3=0,n4=0,n5=0,n6=0;
  int Co=0,Co2=0,Co3=0,Co4=0,Co5=0,Co6=0;
  int v1=0,v2=0,v3=0,v4=0,v5=0;
  int a;
  String nombre;
    /** Creates new form Principal */
    public Principal() {
           setUndecorated(true);
        initComponents();
      
           this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      bloqueo();
      
     
       contador = new Timer(50, new claseTimer());
    contador.start();
   
    }
   void borrar(){
       
       txt1.setText("");
         txt2.setText("");
           txt3.setText("");
           txt6.setText("");
           txt5.setText("");
           txt4.setText("");
           txt7.setText("");
           txt8.setText("");
           txt9.setText("");
           txt11.setText("");
           txt12.setText("");
            txt13.setText("");
           txt15.setText("");
            txt17.setText("");
             txt116.setText("");
             txt20.setText("");
             txt21.setText("");
             txt22.setText("");
           File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes2\\luis11.png");
            String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
         lbluis2.setIcon(new ImageIcon(foto));
          lbdi2.setIcon(null); 
         //    
          
            txt1.setEditable(true);
              txt2.setEditable(true);
                txt3.setEditable(true);
                 txt6.setEditable(true);
           txt5.setEditable(true);
           txt4.setEditable(true);
            txt7.setEditable(true);
           txt8.setEditable(true);
           txt9.setEditable(true);
           txt11.setEditable(true);
           txt12.setEditable(true);;
            txt13.setEditable(true);
            
            txt15.setEditable(true);
            txt17.setEditable(true);
             txt116.setEditable(true);
             txt20.setEditable(true);
            txt21.setEditable(true);
             txt22.setEditable(true);
           
             lbcor.setIcon(null);
            lb2.setIcon(null);
             lb3.setIcon(null);
             lbcor1.setIcon(null);
             lb5.setIcon(null);
             lb4.setIcon(null);   
             lbcor71.setIcon(null);
               lb81.setIcon(null);
                 lb91.setIcon(null);
                 lbcor10.setIcon(null);
                  lb12.setIcon(null);
                   lb13.setIcon(null);
                     lbcor14.setIcon(null);
                     lb15.setIcon(null);
                     lb16.setIcon(null);
                     lbcor15.setIcon(null);
                     lb18.setIcon(null);
                     lb17.setIcon(null);
        
    }
    void bloqueo(){
        
     Mapa.setVisible(false);
     mundo1.setVisible(false);
     mundo2.setVisible(false);
     mundo3.setVisible(false);
     mundo4.setVisible(false);
     mundo5.setVisible(false);
     mundo6.setVisible(false);
     gana.setVisible(false);
     txtnom.setVisible(false);  
     btse.setVisible(false);
    lbnon.setVisible(false);
    btsi.setVisible(false);
    btno.setVisible(false);
    lbo.setVisible(false);
    lbpi2.setEnabled(false);
     btse2.setVisible(false);
     lbno2.setVisible(false);
     btma.setEnabled(false);
      btma2.setEnabled(false);
      btro2.setEnabled(false);
       btro.setEnabled(false);
        btegi2.setEnabled(false);
        btegi.setEnabled(false);
        lbpi2.setEnabled(false);
        lbcoli.setEnabled(false);
       lbesfi2.setEnabled(false);
       lbpirg.setEnabled(false);
       btseguir.setEnabled(false);
        bttras.setVisible(false);
          bttras1.setVisible(false);
          btseguir1.setEnabled(false);
           bttras2.setVisible(false);
           btseguir2.setEnabled(false);
           bttras3.setVisible(false);
           btseguir3.setEnabled(false);
            bttras4.setVisible(false);
           btseguir4.setEnabled(false);
           bttras5.setVisible(false);
            btseguir5.setEnabled(false);
            regresar.setVisible(false);
             txtnom.setEnabled(false);  
           n1=0; n2=0;n3=0;n4=0;n5=0;n6=0;
   Co=0;Co2=0;Co3=0;Co4=0;Co5=0;Co6=0;
   
    }
    
    //1
    void Cuenta(){
        File ruta,ruta2,ruta3;
        String d,d1,d2,d3,d4;
        Image foto,foto2,foto3,foto4;
        //////////////////////
         ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes3\\bien.png");
           d=(String.valueOf(ruta));
           foto= getToolkit().getImage(d);
           
           ruta2 = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes3\\mal.png");
            d1=(String.valueOf(ruta2));
           foto2= getToolkit().getImage(d1);
           
           
           
        if(n1==1){
        ///////////////////////////////////    
         r1=Integer.valueOf(txt1.getText());
        r2=Integer.valueOf(txt2.getText());
         r3=Integer.valueOf(txt3.getText());
         ////////////////////////
             if((r1!=0) ||(r2!=0) || (r3!=0) ){
               txt1.setEditable(false); 
                txt2.setEditable(false);
                 txt3.setEditable(false); 
                 //////////////////
              if(r1==6) {
               lbcor.setIcon(new ImageIcon(foto)); 
             v1=0;
              } else {
                lbcor.setIcon(new ImageIcon(foto2)); 
               
                v1 =1;
                 //lbvida.setText(String.valueOf(vida));
                          
              }
              /////////////
              if(r2==11) {
               lb2.setIcon(new ImageIcon(foto));
           v2=0;
              } else{
                lb2.setIcon(new ImageIcon(foto2)); 
                 
                v2=1;
                 // lv2.setText(String.valueOf(vida));
              }
              /////////////////
               if(r3==6) {
                lb3.setIcon(new ImageIcon(foto)); 
          v3 =0;
              } else{
               lb3.setIcon(new ImageIcon(foto2));
               
                v3=1;
               //   lv3.setText(String.valueOf(vida));
               }
               
             }
             vida+=v1+v2+v3;
             // lbvida.setText(String.valueOf(vida));
               v1=0;v2=0;v3=0;
          r1=0;r2=0;r3=0;
         
        }
         if(n1==2){
             
             r1=Integer.valueOf(txt6.getText());
        r2=Integer.valueOf(txt5.getText());
            r3=Integer.valueOf(txt4.getText());
            
             if((r1!=0)  || (r3!=0)|| (r2!=0) ){
                
               txt6.setEditable(false); 
                txt5.setEditable(false);
                 txt4.setEditable(false); 
                 //////////////////
              if(r1==2) {
              lbcor1.setIcon(new ImageIcon(foto)); 
            v1=0;
              } else {
               lbcor1.setIcon(new ImageIcon(foto2)); 
                 v1=1;
                
                    
              }
              /////////////
              if(r2==0) {
               lb5.setIcon(new ImageIcon(foto));
           v2=0;
              } else{
               lb5.setIcon(new ImageIcon(foto2)); 
                 v2=1;
                 
              }
              /////////////////
               if(r3==16) {
                lb4.setIcon(new ImageIcon(foto)); 
          v3 =0;
              } else{
               lb4.setIcon(new ImageIcon(foto2)); 
                v3 =1;
                 
               }
               
             }
            vida+=v1+v2+v3;
             v1=0;v2=0;v3=0;
            //  lbvida.setText(String.valueOf(vida));    
          r1=0;r2=0;r3=0;
        
        }
          if(n1==3){
        ///////////////////////////////////    
         r1=Integer.valueOf(txt7.getText());
         r2=Integer.valueOf(txt8.getText());
         r3=Integer.valueOf(txt9.getText());
         ////////////////////////
             if((r1!=0) ||(r2!=0) || (r3!=0) ){
               txt7.setEditable(false); 
                txt8.setEditable(false);
                 txt9.setEditable(false); 
                 //////////////////
              if(r1==10) {
               lbcor71.setIcon(new ImageIcon(foto));   
                
           
              } 
            
               else {
                lbcor71.setIcon(new ImageIcon(foto2)); 
                 vida +=1;
                    
              }   
              /////////////
              if(r2==3) {
               lb81.setIcon(new ImageIcon(foto));
          
              } else{
                lb81.setIcon(new ImageIcon(foto2)); 
                 vida +=1;
              }
              /////////////////
               if(r3==9) {
                lb91.setIcon(new ImageIcon(foto)); 
         
              } else{
               lb91.setIcon(new ImageIcon(foto2)); 
                vida +=1;
               }
               
             }
          r1=0;r2=0;r3=0;
         rr1="";rr2="";rr3="";
          
        }
          if(n1==4){
        ///////////////////////////////////    
         r1=Integer.valueOf(txt11.getText());
        r2=Integer.valueOf(txt12.getText());
         r3=Integer.valueOf(txt13.getText());
         ////////////////////////
             if((r1!=0) ||(r2!=0) || (r3!=0) ){
               txt11.setEditable(false); 
                txt12.setEditable(false);
                 txt13.setEditable(false); 
                 //////////////////
              if(r1==14) {
              lbcor10.setIcon(new ImageIcon(foto)); 
           
              } else {
                lbcor10.setIcon(new ImageIcon(foto2)); 
                 vida +=1;
                    
              }
              /////////////
              if(r2==1000) {
              lb12.setIcon(new ImageIcon(foto));
          
              } else{
               lb12.setIcon(new ImageIcon(foto2)); 
                 vida +=1;
              }
              /////////////////
               if(r3==500) {
                lb13.setIcon(new ImageIcon(foto)); 
         
              } else{
               lb13.setIcon(new ImageIcon(foto2)); 
                vida +=1;
               }
               
             }
             
          r1=0;r2=0;r3=0;
        }
           if(n1==5){
        ///////////////////////////////////    
         rr1=txt15.getText();
        rr2=txt116.getText();
         rr3=txt17.getText();
         ////////////////////////
            
              
                 //////////////////
                   if((rr1.isEmpty()) ){
                 
               }else{
                 txt15.setEditable(false);            
              if(rr1.equals("triangulo")) {
                  
               
               lbcor14.setIcon(new ImageIcon(foto)); 
           
              } else {
                lbcor14.setIcon(new ImageIcon(foto2)); 
                 vida +=1;
                    
              }
              }
              /////////////
                    if((rr2.isEmpty()) ){
                 
               }else{
                txt116.setEditable(false);          
              if(rr2.equals("rombo")) {
                 
               lb15.setIcon(new ImageIcon(foto));
          
              } else{
               lb15.setIcon(new ImageIcon(foto2)); 
                 vida +=1;
              }
              }
              
              /////////////////
                       if((rr3.isEmpty()) ){
                 
               }else{
                txt17.setEditable(false); 
               if(rr3.equals("cuadrado")) {
                lb16.setIcon(new ImageIcon(foto)); 
         
              } else{
               lb16.setIcon(new ImageIcon(foto2)); 
                vida +=1;
               }
               }
               
              
                    
             
          r1=0;r2=0;r3=0;
          rr1="0";rr2="0";rr3="0";
         
           
        }
            if(n1==6){
        ///////////////////////////////////    
         rr1=txt20.getText();
        rr2=txt21.getText();
         rr3=txt22.getText();
         ////////////////////////
             if((rr1.equals("0")) ||(rr2.equals("0")) || (rr3.equals("0")) ){
               }else{  
               txt20.setEditable(false); 
                txt21.setEditable(false);
                 txt22.setEditable(false); 
                 //////////////////
              if(rr1.equals("cubo")) {
               lbcor15.setIcon(new ImageIcon(foto)); 
           
              } else {
               lbcor15.setIcon(new ImageIcon(foto2)); 
                 vida +=1;
                    
              }
              /////////////
              if(rr2.equals("cilindro")) {
               lb18.setIcon(new ImageIcon(foto));
          
              } else{
              lb18.setIcon(new ImageIcon(foto2)); 
                 vida +=1;
              }
              /////////////////
               if(rr3.equals("decagono")) {
                lb17.setIcon(new ImageIcon(foto)); 
         
              } else{
               lb17.setIcon(new ImageIcon(foto2)); 
                vida +=1;
               }
               
             }
          r1=0;r2=0;r3=0;
          rr1="";rr2="";rr3="";
         }
           
           
        vida();  
       
        btcompr.setEnabled(false); 
    btcompr1.setEnabled(false); 
     btcompr2.setEnabled(false); 
     btcompr3.setEnabled(false); 
      btcompr4.setEnabled(false);
       btcompr5.setEnabled(false);
    }
    
    
    
    
    
    
    
   void vida(){
       File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes2\\vida2.png");
            String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
      if(vida==1){
          
        lbvi5.setIcon(new ImageIcon(foto)); 
          lbvi7.setIcon(new ImageIcon(foto)); 
      lbvi11.setIcon(new ImageIcon(foto));
       lbvi14.setIcon(new ImageIcon(foto));
      lbvi15.setIcon(new ImageIcon(foto));
       lbvi20.setIcon(new ImageIcon(foto));
    
      
             vip=1;   
        }
        if(vida==2){
         
          lbvi5.setIcon(new ImageIcon(foto)); 
         lbvi2.setIcon(new ImageIcon(foto)); 
         
         lbvi7.setIcon(new ImageIcon(foto));  
        lbvi8.setIcon(new ImageIcon(foto)); 
       
        lbvi11.setIcon(new ImageIcon(foto));
       lbvi10.setIcon(new ImageIcon(foto));
       
         lbvi14.setIcon(new ImageIcon(foto));
       lbvi12.setIcon(new ImageIcon(foto)); 
       
       lbvi15.setIcon(new ImageIcon(foto));
         lbvi16.setIcon(new ImageIcon(foto));
       
         lbvi20.setIcon(new ImageIcon(foto)); 
        lbvi21.setIcon(new ImageIcon(foto));
     
      
             vip=2;
             
        }
       if((vida<3) ||( vida==1)||( vida==2)){
      // lv2.setText("sigue");
             File ruta2 = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes3\\cara2.png");
            String d2=(String.valueOf(ruta2));
           Image foto2= getToolkit().getImage(d2);
            File ruta3 = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes3\\sies.png");
            String d3=(String.valueOf(ruta3));
           Image foto3= getToolkit().getImage(d3);
            if(n1==1){
             lbcara.setIcon(new ImageIcon(foto2));
              lbdi3.setIcon(new ImageIcon(foto3));
               btseguir.setEnabled(true);
           }
             if(n1==2){
             lbcara2.setIcon(new ImageIcon(foto2));
              lbdi4.setIcon(new ImageIcon(foto3)); 
               btseguir1.setEnabled(true);
           }
              if(n1==3){
             cara3.setIcon(new ImageIcon(foto2));
              lbdi5.setIcon(new ImageIcon(foto3)); 
               btseguir2.setEnabled(true);
           }
               if(n1==4){
             cara4.setIcon(new ImageIcon(foto2));
              lbdi6.setIcon(new ImageIcon(foto3)); 
               btseguir3.setEnabled(true);
           }
                if(n1==5){
             cara5.setIcon(new ImageIcon(foto2));
              lbdi7.setIcon(new ImageIcon(foto3)); 
               btseguir4.setEnabled(true);
           }
                  if(n1==6){
             cara6.setIcon(new ImageIcon(foto2));
              lbdi8.setIcon(new ImageIcon(foto3)); 
               btseguir5.setEnabled(true);
           }
  
          
             
         }
      
         if(vida==3 || vida>3){
         
          
         lbvi5.setIcon(new ImageIcon(foto)); 
         lbvi2.setIcon(new ImageIcon(foto));    
         lbvi4.setIcon(new ImageIcon(foto));
         
         lbvi7.setIcon(new ImageIcon(foto)); 
        lbvi8.setIcon(new ImageIcon(foto));    
         lbvi6.setIcon(new ImageIcon(foto));
         
         lbvi11.setIcon(new ImageIcon(foto));
       lbvi10.setIcon(new ImageIcon(foto));
       lbvi9.setIcon(new ImageIcon(foto));
       
        lbvi14.setIcon(new ImageIcon(foto));
       lbvi12.setIcon(new ImageIcon(foto));
       lbvi13.setIcon(new ImageIcon(foto));
       
        lbvi15.setIcon(new ImageIcon(foto));
      lbvi16.setIcon(new ImageIcon(foto));
      lbvi17.setIcon(new ImageIcon(foto));
      
      lbvi20.setIcon(new ImageIcon(foto)); 
        lbvi21.setIcon(new ImageIcon(foto));
      lbvi22.setIcon(new ImageIcon(foto));
     // lbvida.setText(String.valueOf(vida));
         vip=3;
        
         File  ruta4 = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes3\\cara2.png");
          String  d4=(String.valueOf(ruta4));
        Image  foto4= getToolkit().getImage(d4);
        lbcara.setIcon(new ImageIcon(foto4));
         lbcara2.setIcon(new ImageIcon(foto4));
        cara3.setIcon(new ImageIcon(foto4));
          cara4.setIcon(new ImageIcon(foto4));
         File ruta5 = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes3\\0.png");
          String  d5=(String.valueOf(ruta5));
         Image foto5= getToolkit().getImage(d5);
        lbdi3.setIcon(new ImageIcon(foto5));
        bttras.setVisible(true);
          lbdi4.setIcon(new ImageIcon(foto5));
        bttras1.setVisible(true);
        lbdi5.setIcon(new ImageIcon(foto5));
         bttras2.setVisible(true);
          lbdi6.setIcon(new ImageIcon(foto5));
         bttras3.setVisible(true);
         lbdi7.setIcon(new ImageIcon(foto5));
         bttras4.setVisible(true);
         lbdi8.setIcon(new ImageIcon(foto5));
         bttras5.setVisible(true);
     vida=0; 
   
      
        }  
       
   }
      
    //2salida
    void tras(){
         vid();
          r1=0;r2=0;r3=0;vida=0;
          rr1="";rr2="";rr3="";
         borrar();
          bloqueo(); 
        File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes2\\vida.png");
          String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
         

          Mapa.setVisible(true);
         lbvi5.setIcon(new ImageIcon(foto)); 
          lbvi2.setIcon(new ImageIcon(foto)); 
          lbvi4.setIcon(new ImageIcon(foto)); 
            lbvi8.setIcon(new ImageIcon(foto)); 
          lbvi7.setIcon(new ImageIcon(foto)); 
           lbvi6.setIcon(new ImageIcon(foto)); 
           lbvi11.setIcon(new ImageIcon(foto)); 
           lbvi10.setIcon(new ImageIcon(foto)); 
           lbvi9.setIcon(new ImageIcon(foto));
           lbvi14.setIcon(new ImageIcon(foto));
       lbvi12.setIcon(new ImageIcon(foto));
       lbvi13.setIcon(new ImageIcon(foto));
       lbvi15.setIcon(new ImageIcon(foto));
       lbvi16.setIcon(new ImageIcon(foto));
       lbvi17.setIcon(new ImageIcon(foto));
        lbvi20.setIcon(new ImageIcon(foto));
       lbvi21.setIcon(new ImageIcon(foto));
       lbvi22.setIcon(new ImageIcon(foto));
        
          btma.setVisible(true);

            btma2.setVisible(true);
            btro2.setVisible(true);
             btro.setVisible(true);
              btegi2.setVisible(true);
              btegi.setVisible(true);
          // btcompr.setEnabled(true);
           bttras.setVisible(false);
          
           
          a=100;
           contador = new Timer(50, new claseTimer());
    contador.start();
    
        
    }
 public class claseTimer implements ActionListener
  {
   public claseTimer() { 
   }
    
    public void actionPerformed(ActionEvent e)
    {
     
      if(a<=500){
           a+=1;
       if(a<=10){   
       // File ruta = new File(" C:\\Program Files\\LuisMatematicas\\Graficos\\Imagenes\\luis.png");
           // String d=(String.valueOf(ruta));
           // Image foto= getToolkit().getImage(d);
          // lbluis.setIcon(new ImageIcon(foto)); 
           
     
            
      }
        if(a>10 && a<=20){
          File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes\\luis2.png");
            String d=(String.valueOf(ruta));
            Image foto= getToolkit().getImage(d);
           lbluis.setIcon(new ImageIcon(foto)); 
        
            ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes\\d1.png");
            d=(String.valueOf(ruta));
            foto= getToolkit().getImage(d);
          lbdi.setIcon(new ImageIcon(foto)); 
           txtnom.setVisible(true); 
            txtnom.setText("Introduce tu nombre"); 
             btse.setVisible(true);
          
               a=20;
         Principal.this.contador.stop(); 
              
      } 
        
          
        if(a>20 && a<=30){
             txtnom.setVisible(false); 
            
             
            File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes\\d2.png");
            String d=(String.valueOf(ruta));
            Image foto= getToolkit().getImage(d);
           lbdi.setIcon(new ImageIcon(foto));
           lbnon.setText(nombre);
           lbnon.setVisible(true);
           a=30;
         Principal.this.contador.stop();    
         
        }
         if(a>30 && a<=40){
            
             lbnon.setVisible(false);
            File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes\\d3.png");
            String d=(String.valueOf(ruta));
            Image foto= getToolkit().getImage(d);
           lbdi.setIcon(new ImageIcon(foto));
         a=40;
        Principal.this.contador.stop();    
         
        }
           if(a>40 && a<=50){
                btse.setVisible(false);
                 btsi.setVisible(true);
                  btno.setVisible(true);
                  lbo.setVisible(true);
              lbnon1.setText(nombre);
             
            File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes\\d4.png");
            String d=(String.valueOf(ruta));
            Image foto= getToolkit().getImage(d);
           lbdi.setIcon(new ImageIcon(foto));
    
       lbnon1.setVisible(true);
       a=50;
        Principal.this.contador.stop();    
         
        }
           if(a>50 && a<=65){
               
                 btsi.setVisible(false);
                  btno.setVisible(false);
                  lbo.setVisible(false);
              
              lbnon1.setVisible(false); 
           lbdi.setIcon(null);
          File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes\\luis6.png");
            String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
           lbluis.setIcon(new ImageIcon(foto));   
         
        }
            if(a>65 && a<=70){
               
                
          
          File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes\\luis5.png");
            String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
           lbluis.setIcon(new ImageIcon(foto)); 
           
          ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes\\d5.png");
            d=(String.valueOf(ruta));
         foto= getToolkit().getImage(d);
           lbdi.setIcon(new ImageIcon(foto));  
          
        }
             if(a>70 && a<=75){
               
                
          
          File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes\\pla2.png");
            String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
           lbpla.setIcon(new ImageIcon(foto)); 
           lbpla.setText("::E M P E Z A R::");
          a=75;
          Principal.this.contador.stop();
             }
               if(a>75 && a<=100){
                   Mapa.setVisible(true);   
               }
               
           if(a>100&& a<=150){
               
                
           
          File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes2\\12.png");
            String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
          lbluis2.setIcon(new ImageIcon(foto)); 
          ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes2\\dd1.png");
           d=(String.valueOf(ruta));
            foto= getToolkit().getImage(d);
          lbdi2.setIcon(new ImageIcon(foto)); 
          btse2.setVisible(true);
  
          a=150;
          Principal.this.contador.stop();
             }
             if(a>150&& a<=160){
               
                
          
          File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes2\\dd2.png");
            String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
          lbdi2.setIcon(new ImageIcon(foto)); 
           
        
          a=160;
          Principal.this.contador.stop();
             }
             if(a>160&& a<=190){
               
            
           
          File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes2\\dd3.png");
            String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
          lbdi2.setIcon(new ImageIcon(foto)); 
           ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes2\\co2.png");
             d=(String.valueOf(ruta));
          foto= getToolkit().getImage(d);
          lbluis2.setIcon(new ImageIcon(foto)); 
        
          a=190;
        
             }
               if(a>190&& a<=230){
               
                
           
          File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes2\\vida.png");
            String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
          lbvi1.setIcon(new ImageIcon(foto)); 
         
            ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes2\\vida.png");
             d=(String.valueOf(ruta));
          foto= getToolkit().getImage(d);
          lbvi.setIcon(new ImageIcon(foto)); 
            ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes2\\vida.png");
             d=(String.valueOf(ruta));
          foto= getToolkit().getImage(d);
          lbvi3.setIcon(new ImageIcon(foto)); 
          
        
          a=230;
         Principal.this.contador.stop();
             }
                if(a>230&& a<=250){
               
              
           
          File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes2\\dd4.png");
            String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
          lbdi2.setIcon(new ImageIcon(foto)); 
           ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes2\\luis9.png");
             d=(String.valueOf(ruta));
          foto= getToolkit().getImage(d);
          lbluis2.setIcon(new ImageIcon(foto)); 
        
          a=250;
           Principal.this.contador.stop();
        
             }
                  if(a>250&& a<=280){
               
              
           btse2.setVisible(false);
          File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes2\\dd5.png");
            String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
          lbdi2.setIcon(new ImageIcon(foto)); 
           lbno2.setVisible(true);
          lbno2.setText(nombre);
           ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes2\\co.png");
             d=(String.valueOf(ruta));
          foto= getToolkit().getImage(d);
          lbluis2.setIcon(new ImageIcon(foto)); 
        
          a=280;
         
        
             }
            if(a>280&& a<=340){
               
              
           btse2.setVisible(false);
           btma.setEnabled(true);
          File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes2\\1.2.png");
            String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
         btma.setIcon(new ImageIcon(foto)); 
           lbno2.setVisible(true);
         lbpi2.setEnabled(true);
        
          a=340;
           Principal.this.contador.stop();
        
             }
             if(a>340&& a<=380){
               
               
       
          
          File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes3\\cara.png");
            String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
         lbcara.setIcon(new ImageIcon(foto)); 
         
          ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes3\\mayatxt.png");
            d=(String.valueOf(ruta));
           foto= getToolkit().getImage(d);
         lbdi3.setIcon(new ImageIcon(foto)); 
          
          
        Principal.this.contador.stop();
          a=380;
           
        
             }
              if(a>380&& a<=390){
               
              File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes3\\cara.png");
            String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
         lbcara2.setIcon(new ImageIcon(foto)); 
         
          ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes3\\mayatxt.png");
            d=(String.valueOf(ruta));
           foto= getToolkit().getImage(d);
         lbdi4.setIcon(new ImageIcon(foto)); 
          
          
        Principal.this.contador.stop(); 
            
          a=390;
      
             }
                if(a>390&& a<=400){
               
              File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes3\\cara.png");
            String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
         cara3.setIcon(new ImageIcon(foto)); 
         
          ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes3\\diro.png");
            d=(String.valueOf(ruta));
           foto= getToolkit().getImage(d);
         lbdi5.setIcon(new ImageIcon(foto)); 
          
          
        Principal.this.contador.stop(); 
            
          a=400;
      
             }
                  if(a>400&& a<=420){
               
              File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes3\\cara.png");
            String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
         cara4.setIcon(new ImageIcon(foto)); 
         
          ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes3\\diro.png");
            d=(String.valueOf(ruta));
           foto= getToolkit().getImage(d);
         lbdi6.setIcon(new ImageIcon(foto)); 
          
          
        Principal.this.contador.stop(); 
            
          a=420;
      
             }
                  if(a>420&& a<=430){
               
              File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes3\\cara.png");
            String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
         cara5.setIcon(new ImageIcon(foto)); 
         
          ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes3\\di5e.png");
            d=(String.valueOf(ruta));
           foto= getToolkit().getImage(d);
         lbdi7.setIcon(new ImageIcon(foto)); 
          
          
        Principal.this.contador.stop(); 
            
          a=430;
      
             }
                  if(a>430&& a<=440){
               
              File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes3\\cara.png");
            String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
         cara6.setIcon(new ImageIcon(foto)); 
         
          ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes3\\di5e.png");
            d=(String.valueOf(ruta));
           foto= getToolkit().getImage(d);
         lbdi8.setIcon(new ImageIcon(foto)); 
          
          
        Principal.this.contador.stop(); 
            
          a=450;
      
             }
           
            
            
       
      }
      }
  
    }
 //principal
     void vid(){   
        if(vip==1){
          File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes2\\vida2.png");
            String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
      
         lbvi1.setIcon(new ImageIcon(foto));
             
        }
        if(vip==2){
          File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes2\\vida2.png");
            String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
        
        
        
           lbvi.setIcon(new ImageIcon(foto));
            lbvi1.setIcon(new ImageIcon(foto));
             
        }
         if(vip==3){
          File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes2\\vida2.png");
            String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
         
      
          
         
         lbvi3.setIcon(new ImageIcon(foto));
          lbvi.setIcon(new ImageIcon(foto));
            lbvi1.setIcon(new ImageIcon(foto));
        
          
        }
         
          }
 
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        gana = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        mundo6 = new javax.swing.JPanel();
        lb17 = new javax.swing.JLabel();
        lb18 = new javax.swing.JLabel();
        lbcor15 = new javax.swing.JLabel();
        txt21 = new javax.swing.JTextField();
        txt22 = new javax.swing.JTextField();
        txt20 = new javax.swing.JTextField();
        btseguir5 = new javax.swing.JButton();
        btcompr5 = new javax.swing.JButton();
        bttras5 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        lbno8 = new javax.swing.JLabel();
        lbvi22 = new javax.swing.JLabel();
        lbvi21 = new javax.swing.JLabel();
        lbvi20 = new javax.swing.JLabel();
        lbdi8 = new javax.swing.JLabel();
        cara6 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        mundo5 = new javax.swing.JPanel();
        btseguir4 = new javax.swing.JButton();
        bttras4 = new javax.swing.JButton();
        btcompr4 = new javax.swing.JButton();
        lb16 = new javax.swing.JLabel();
        lb15 = new javax.swing.JLabel();
        lbcor14 = new javax.swing.JLabel();
        txt116 = new javax.swing.JTextField();
        txt17 = new javax.swing.JTextField();
        txt15 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        lbno7 = new javax.swing.JLabel();
        lbvi17 = new javax.swing.JLabel();
        lbvi16 = new javax.swing.JLabel();
        lbvi15 = new javax.swing.JLabel();
        lbdi7 = new javax.swing.JLabel();
        cara5 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        mundo4 = new javax.swing.JPanel();
        lb13 = new javax.swing.JLabel();
        lb12 = new javax.swing.JLabel();
        lbcor10 = new javax.swing.JLabel();
        btseguir3 = new javax.swing.JButton();
        btcompr3 = new javax.swing.JButton();
        bttras3 = new javax.swing.JButton();
        txt12 = new javax.swing.JTextField();
        txt13 = new javax.swing.JTextField();
        txt11 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        lbno6 = new javax.swing.JLabel();
        lbvi13 = new javax.swing.JLabel();
        lbvi12 = new javax.swing.JLabel();
        lbvi14 = new javax.swing.JLabel();
        lbdi6 = new javax.swing.JLabel();
        cara4 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        mundo3 = new javax.swing.JPanel();
        txt8 = new javax.swing.JTextField();
        txt9 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        btseguir2 = new javax.swing.JButton();
        bttras2 = new javax.swing.JButton();
        btcompr2 = new javax.swing.JButton();
        lb91 = new javax.swing.JLabel();
        lb81 = new javax.swing.JLabel();
        lbcor71 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lbno5 = new javax.swing.JLabel();
        lbvi9 = new javax.swing.JLabel();
        lbvi10 = new javax.swing.JLabel();
        lbvi11 = new javax.swing.JLabel();
        lbdi5 = new javax.swing.JLabel();
        cara3 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        mundo2 = new javax.swing.JPanel();
        btseguir1 = new javax.swing.JButton();
        btcompr1 = new javax.swing.JButton();
        bttras1 = new javax.swing.JButton();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lbcor1 = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lbno4 = new javax.swing.JLabel();
        lbvi6 = new javax.swing.JLabel();
        lbvi7 = new javax.swing.JLabel();
        lbvi8 = new javax.swing.JLabel();
        lbdi4 = new javax.swing.JLabel();
        lbcara2 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        mundo1 = new javax.swing.JPanel();
        bttras = new javax.swing.JButton();
        btseguir = new javax.swing.JButton();
        btcompr = new javax.swing.JButton();
        lb3 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lbcor = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbno3 = new javax.swing.JLabel();
        lbvi4 = new javax.swing.JLabel();
        lbvi2 = new javax.swing.JLabel();
        lbvi5 = new javax.swing.JLabel();
        lbdi3 = new javax.swing.JLabel();
        lbcara = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Mapa = new javax.swing.JPanel();
        btse2 = new javax.swing.JButton();
        btegi = new javax.swing.JButton();
        btegi2 = new javax.swing.JButton();
        btro = new javax.swing.JButton();
        btro2 = new javax.swing.JButton();
        btma = new javax.swing.JButton();
        btma2 = new javax.swing.JButton();
        lbno2 = new javax.swing.JLabel();
        lbvi3 = new javax.swing.JLabel();
        lbvi = new javax.swing.JLabel();
        lbvi1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbesfi2 = new javax.swing.JLabel();
        lbcoli = new javax.swing.JLabel();
        lbpirg = new javax.swing.JLabel();
        lbluis2 = new javax.swing.JLabel();
        lbpi2 = new javax.swing.JLabel();
        lbdi2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lbo = new javax.swing.JLabel();
        btno = new javax.swing.JButton();
        btsi = new javax.swing.JButton();
        lbpla = new javax.swing.JButton();
        btse = new javax.swing.JButton();
        lbnon1 = new javax.swing.JLabel();
        lbnon = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lbluis = new javax.swing.JLabel();
        lbdi = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(-16777216,true));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        gana.setBackground(new java.awt.Color(-16777216,true));
        gana.setLayout(null);

        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/141.gif"))); // NOI18N
        gana.add(jLabel55);
        jLabel55.setBounds(-20, 300, 200, 179);

        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rr.gif"))); // NOI18N
        gana.add(jLabel54);
        jLabel54.setBounds(60, 280, 200, 179);

        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rr.gif"))); // NOI18N
        gana.add(jLabel56);
        jLabel56.setBounds(700, 190, 200, 179);

        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/141.gif"))); // NOI18N
        gana.add(jLabel57);
        jLabel57.setBounds(510, 180, 200, 179);

        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mano.gif"))); // NOI18N
        gana.add(jLabel58);
        jLabel58.setBounds(0, 270, 310, 190);

        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gano.png"))); // NOI18N
        gana.add(jLabel59);
        jLabel59.setBounds(-20, 0, 240, 350);

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/GANAT.png"))); // NOI18N
        jLabel60.setText("jLabel7");
        gana.add(jLabel60);
        jLabel60.setBounds(170, 10, 660, 180);

        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/141.gif"))); // NOI18N
        gana.add(jLabel61);
        jLabel61.setBounds(180, 170, 200, 179);

        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rr.gif"))); // NOI18N
        gana.add(jLabel62);
        jLabel62.setBounds(330, 240, 200, 179);

        regresar.setBackground(new java.awt.Color(-16777216,true));
        regresar.setFont(new java.awt.Font("Dialog", 1, 18));
        regresar.setForeground(new java.awt.Color(-16776961,true));
        regresar.setText("<<<Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        gana.add(regresar);
        regresar.setBounds(773, 413, 170, 60);

        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rr.gif"))); // NOI18N
        gana.add(jLabel63);
        jLabel63.setBounds(450, 330, 200, 179);

        jPanel1.add(gana);
        gana.setBounds(0, 0, 960, 500);

        mundo6.setBackground(new java.awt.Color(-12566464,true));
        mundo6.setLayout(null);

        lb17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mundo6.add(lb17);
        lb17.setBounds(770, 380, 40, 60);

        lb18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mundo6.add(lb18);
        lb18.setBounds(680, 280, 40, 60);

        lbcor15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mundo6.add(lbcor15);
        lbcor15.setBounds(680, 180, 40, 60);

        txt21.setFont(new java.awt.Font("Dialog", 1, 18));
        txt21.setOpaque(false);
        mundo6.add(txt21);
        txt21.setBounds(550, 290, 110, 50);

        txt22.setFont(new java.awt.Font("Dialog", 1, 18));
        txt22.setOpaque(false);
        mundo6.add(txt22);
        txt22.setBounds(550, 390, 190, 40);

        txt20.setFont(new java.awt.Font("Dialog", 1, 18));
        txt20.setOpaque(false);
        mundo6.add(txt20);
        txt20.setBounds(550, 190, 100, 50);

        btseguir5.setBackground(new java.awt.Color(-16711936,true));
        btseguir5.setFont(new java.awt.Font("Dialog", 1, 14));
        btseguir5.setForeground(new java.awt.Color(-256,true));
        btseguir5.setText("Siguiente>>");
        btseguir5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btseguir5ActionPerformed(evt);
            }
        });
        mundo6.add(btseguir5);
        btseguir5.setBounds(0, 270, 150, 50);

        btcompr5.setBackground(new java.awt.Color(-16711936,true));
        btcompr5.setFont(new java.awt.Font("Dialog", 1, 14));
        btcompr5.setForeground(new java.awt.Color(-16776961,true));
        btcompr5.setText("Comprobar");
        btcompr5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcompr5ActionPerformed(evt);
            }
        });
        mundo6.add(btcompr5);
        btcompr5.setBounds(810, 440, 150, 60);

        bttras5.setBackground(new java.awt.Color(-65536,true));
        bttras5.setFont(new java.awt.Font("Dialog", 1, 12));
        bttras5.setText("<<<<");
        bttras5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttras5ActionPerformed(evt);
            }
        });
        mundo6.add(bttras5);
        bttras5.setBounds(710, 110, 80, 25);

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/g9.png"))); // NOI18N
        mundo6.add(jLabel47);
        jLabel47.setBounds(250, 350, 530, 120);

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/g5.png"))); // NOI18N
        mundo6.add(jLabel48);
        jLabel48.setBounds(330, 250, 350, 120);

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/g4.png"))); // NOI18N
        mundo6.add(jLabel49);
        jLabel49.setBounds(330, 150, 360, 120);

        lbno8.setFont(new java.awt.Font("Dialog", 1, 14));
        lbno8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mundo6.add(lbno8);
        lbno8.setBounds(300, 50, 90, 30);

        lbvi22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/vida.png"))); // NOI18N
        lbvi22.setText("jLabel23");
        mundo6.add(lbvi22);
        lbvi22.setBounds(820, 340, 120, 100);

        lbvi21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/vida.png"))); // NOI18N
        lbvi21.setText("jLabel23");
        mundo6.add(lbvi21);
        lbvi21.setBounds(820, 250, 130, 100);

        lbvi20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/vida.png"))); // NOI18N
        lbvi20.setText("jLabel23");
        mundo6.add(lbvi20);
        lbvi20.setBounds(820, 160, 130, 100);

        lbdi8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/di5e.png"))); // NOI18N
        mundo6.add(lbdi8);
        lbdi8.setBounds(160, 20, 690, 140);

        cara6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/cara.png"))); // NOI18N
        mundo6.add(cara6);
        cara6.setBounds(-90, 50, 310, 220);

        jLabel50.setBackground(new java.awt.Color(-256,true));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/egifinal.jpg"))); // NOI18N
        jLabel50.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mundo6.add(jLabel50);
        jLabel50.setBounds(0, 160, 980, 280);

        jLabel51.setBackground(new java.awt.Color(-256,true));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/4.png"))); // NOI18N
        mundo6.add(jLabel51);
        jLabel51.setBounds(-10, 160, 990, 280);

        jLabel52.setBackground(new java.awt.Color(-16776961,true));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/fofi.jpg"))); // NOI18N
        mundo6.add(jLabel52);
        jLabel52.setBounds(0, 0, 980, 520);

        jLabel53.setText("jLabel4");
        mundo6.add(jLabel53);
        jLabel53.setBounds(290, 140, 420, 160);

        jPanel1.add(mundo6);
        mundo6.setBounds(0, 0, 980, 520);

        mundo5.setBackground(new java.awt.Color(-12566464,true));
        mundo5.setLayout(null);

        btseguir4.setBackground(new java.awt.Color(-16711936,true));
        btseguir4.setFont(new java.awt.Font("Dialog", 1, 14));
        btseguir4.setForeground(new java.awt.Color(-256,true));
        btseguir4.setText("Siguiente>>");
        btseguir4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btseguir4ActionPerformed(evt);
            }
        });
        mundo5.add(btseguir4);
        btseguir4.setBounds(0, 270, 150, 50);

        bttras4.setBackground(new java.awt.Color(-65536,true));
        bttras4.setFont(new java.awt.Font("Dialog", 1, 12));
        bttras4.setText("<<<<");
        bttras4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttras4ActionPerformed(evt);
            }
        });
        mundo5.add(bttras4);
        bttras4.setBounds(710, 110, 80, 25);

        btcompr4.setBackground(new java.awt.Color(-16711936,true));
        btcompr4.setFont(new java.awt.Font("Dialog", 1, 14));
        btcompr4.setForeground(new java.awt.Color(-16776961,true));
        btcompr4.setText("Comprobar");
        btcompr4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcompr4ActionPerformed(evt);
            }
        });
        mundo5.add(btcompr4);
        btcompr4.setBounds(810, 440, 150, 60);

        lb16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mundo5.add(lb16);
        lb16.setBounds(680, 380, 40, 60);

        lb15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mundo5.add(lb15);
        lb15.setBounds(680, 280, 40, 60);

        lbcor14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mundo5.add(lbcor14);
        lbcor14.setBounds(680, 180, 40, 60);

        txt116.setFont(new java.awt.Font("Dialog", 1, 18));
        txt116.setForeground(new java.awt.Color(-14336,true));
        txt116.setOpaque(false);
        mundo5.add(txt116);
        txt116.setBounds(550, 290, 110, 50);

        txt17.setFont(new java.awt.Font("Dialog", 1, 18));
        txt17.setForeground(new java.awt.Color(-14336,true));
        txt17.setOpaque(false);
        mundo5.add(txt17);
        txt17.setBounds(550, 380, 110, 50);

        txt15.setFont(new java.awt.Font("Dialog", 1, 18));
        txt15.setForeground(new java.awt.Color(-14336,true));
        txt15.setOpaque(false);
        mundo5.add(txt15);
        txt15.setBounds(550, 190, 100, 50);

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/g3.png"))); // NOI18N
        mundo5.add(jLabel41);
        jLabel41.setBounds(330, 350, 350, 120);

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/g2.png"))); // NOI18N
        mundo5.add(jLabel42);
        jLabel42.setBounds(330, 250, 350, 120);

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/g1.png"))); // NOI18N
        mundo5.add(jLabel43);
        jLabel43.setBounds(330, 150, 360, 120);

        lbno7.setFont(new java.awt.Font("Dialog", 1, 14));
        lbno7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mundo5.add(lbno7);
        lbno7.setBounds(300, 50, 90, 30);

        lbvi17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/vida.png"))); // NOI18N
        lbvi17.setText("jLabel23");
        mundo5.add(lbvi17);
        lbvi17.setBounds(820, 340, 120, 100);

        lbvi16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/vida.png"))); // NOI18N
        lbvi16.setText("jLabel23");
        mundo5.add(lbvi16);
        lbvi16.setBounds(820, 250, 130, 100);

        lbvi15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/vida.png"))); // NOI18N
        lbvi15.setText("jLabel23");
        mundo5.add(lbvi15);
        lbvi15.setBounds(820, 160, 130, 100);

        lbdi7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/di5e.png"))); // NOI18N
        mundo5.add(lbdi7);
        lbdi7.setBounds(160, 20, 690, 140);

        cara5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/cara.png"))); // NOI18N
        mundo5.add(cara5);
        cara5.setBounds(-90, 50, 310, 220);

        jLabel44.setBackground(new java.awt.Color(-256,true));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setOpaque(true);
        mundo5.add(jLabel44);
        jLabel44.setBounds(0, 160, 960, 280);

        jLabel45.setBackground(new java.awt.Color(-16776961,true));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/fo.jpg"))); // NOI18N
        mundo5.add(jLabel45);
        jLabel45.setBounds(0, 0, 960, 520);

        jLabel46.setText("jLabel4");
        mundo5.add(jLabel46);
        jLabel46.setBounds(290, 140, 420, 160);

        jPanel1.add(mundo5);
        mundo5.setBounds(-1, -1, 960, 500);

        mundo4.setBackground(new java.awt.Color(-12566464,true));
        mundo4.setLayout(null);

        lb13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mundo4.add(lb13);
        lb13.setBounds(680, 380, 40, 60);

        lb12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mundo4.add(lb12);
        lb12.setBounds(680, 280, 40, 60);

        lbcor10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mundo4.add(lbcor10);
        lbcor10.setBounds(680, 180, 40, 60);

        btseguir3.setBackground(new java.awt.Color(-16711936,true));
        btseguir3.setFont(new java.awt.Font("Dialog", 1, 14));
        btseguir3.setForeground(new java.awt.Color(-65536,true));
        btseguir3.setText("Siguiente>>");
        btseguir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btseguir3ActionPerformed(evt);
            }
        });
        mundo4.add(btseguir3);
        btseguir3.setBounds(0, 270, 150, 50);

        btcompr3.setBackground(new java.awt.Color(-16711936,true));
        btcompr3.setFont(new java.awt.Font("Dialog", 1, 14));
        btcompr3.setForeground(new java.awt.Color(-16776961,true));
        btcompr3.setText("Comprobar");
        btcompr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcompr3ActionPerformed(evt);
            }
        });
        mundo4.add(btcompr3);
        btcompr3.setBounds(810, 440, 150, 60);

        bttras3.setBackground(new java.awt.Color(-65536,true));
        bttras3.setFont(new java.awt.Font("Dialog", 1, 12));
        bttras3.setText("<<<<");
        bttras3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttras3ActionPerformed(evt);
            }
        });
        mundo4.add(bttras3);
        bttras3.setBounds(710, 110, 80, 25);

        txt12.setFont(new java.awt.Font("Dialog", 1, 36));
        txt12.setForeground(new java.awt.Color(-65536,true));
        txt12.setOpaque(false);
        mundo4.add(txt12);
        txt12.setBounds(460, 280, 110, 50);

        txt13.setFont(new java.awt.Font("Dialog", 1, 36));
        txt13.setForeground(new java.awt.Color(-65536,true));
        txt13.setOpaque(false);
        mundo4.add(txt13);
        txt13.setBounds(450, 380, 110, 50);

        txt11.setFont(new java.awt.Font("Dialog", 1, 36));
        txt11.setForeground(new java.awt.Color(-65536,true));
        txt11.setOpaque(false);
        mundo4.add(txt11);
        txt11.setBounds(550, 180, 100, 50);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/r7.png"))); // NOI18N
        mundo4.add(jLabel35);
        jLabel35.setBounds(330, 350, 350, 120);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/r6.png"))); // NOI18N
        mundo4.add(jLabel36);
        jLabel36.setBounds(330, 250, 350, 120);

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/r4.png"))); // NOI18N
        mundo4.add(jLabel37);
        jLabel37.setBounds(330, 150, 360, 120);

        lbno6.setFont(new java.awt.Font("Dialog", 1, 14));
        lbno6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mundo4.add(lbno6);
        lbno6.setBounds(300, 50, 90, 30);

        lbvi13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/vida.png"))); // NOI18N
        lbvi13.setText("jLabel23");
        mundo4.add(lbvi13);
        lbvi13.setBounds(820, 340, 120, 100);

        lbvi12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/vida.png"))); // NOI18N
        lbvi12.setText("jLabel23");
        mundo4.add(lbvi12);
        lbvi12.setBounds(820, 250, 130, 100);

        lbvi14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/vida.png"))); // NOI18N
        lbvi14.setText("jLabel23");
        mundo4.add(lbvi14);
        lbvi14.setBounds(820, 160, 130, 100);
        mundo4.add(lbdi6);
        lbdi6.setBounds(160, 20, 690, 140);

        cara4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/cara.png"))); // NOI18N
        mundo4.add(cara4);
        cara4.setBounds(-90, 50, 310, 220);

        jLabel38.setBackground(new java.awt.Color(-65536,true));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/roma2.png"))); // NOI18N
        jLabel38.setOpaque(true);
        mundo4.add(jLabel38);
        jLabel38.setBounds(0, 160, 960, 280);

        jLabel39.setBackground(new java.awt.Color(-16776961,true));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/fo.jpg"))); // NOI18N
        mundo4.add(jLabel39);
        jLabel39.setBounds(0, 0, 960, 500);

        jLabel40.setText("jLabel4");
        mundo4.add(jLabel40);
        jLabel40.setBounds(290, 140, 420, 160);

        jPanel1.add(mundo4);
        mundo4.setBounds(0, 0, 960, 500);

        mundo3.setBackground(new java.awt.Color(-12566464,true));
        mundo3.setLayout(null);

        txt8.setFont(new java.awt.Font("Dialog", 1, 36));
        txt8.setForeground(new java.awt.Color(-65536,true));
        txt8.setOpaque(false);
        mundo3.add(txt8);
        txt8.setBounds(510, 280, 110, 50);

        txt9.setFont(new java.awt.Font("Dialog", 1, 36));
        txt9.setForeground(new java.awt.Color(-65536,true));
        txt9.setOpaque(false);
        mundo3.add(txt9);
        txt9.setBounds(480, 380, 110, 50);

        txt7.setFont(new java.awt.Font("Dialog", 1, 36));
        txt7.setForeground(new java.awt.Color(-65536,true));
        txt7.setOpaque(false);
        mundo3.add(txt7);
        txt7.setBounds(520, 180, 100, 50);

        btseguir2.setBackground(new java.awt.Color(-16711936,true));
        btseguir2.setFont(new java.awt.Font("Dialog", 1, 14));
        btseguir2.setForeground(new java.awt.Color(-65536,true));
        btseguir2.setText("Siguiente>>");
        btseguir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btseguir2ActionPerformed(evt);
            }
        });
        mundo3.add(btseguir2);
        btseguir2.setBounds(0, 270, 150, 50);

        bttras2.setBackground(new java.awt.Color(-65536,true));
        bttras2.setFont(new java.awt.Font("Dialog", 1, 12));
        bttras2.setText("<<<<");
        bttras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttras2ActionPerformed(evt);
            }
        });
        mundo3.add(bttras2);
        bttras2.setBounds(710, 110, 80, 25);

        btcompr2.setBackground(new java.awt.Color(-16711936,true));
        btcompr2.setFont(new java.awt.Font("Dialog", 1, 14));
        btcompr2.setForeground(new java.awt.Color(-16776961,true));
        btcompr2.setText("Comprobar");
        btcompr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcompr2ActionPerformed(evt);
            }
        });
        mundo3.add(btcompr2);
        btcompr2.setBounds(810, 440, 150, 60);

        lb91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mundo3.add(lb91);
        lb91.setBounds(680, 380, 40, 60);

        lb81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mundo3.add(lb81);
        lb81.setBounds(690, 280, 40, 60);

        lbcor71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mundo3.add(lbcor71);
        lbcor71.setBounds(630, 180, 40, 60);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/r3.png"))); // NOI18N
        mundo3.add(jLabel26);
        jLabel26.setBounds(330, 350, 350, 120);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/r2.png"))); // NOI18N
        mundo3.add(jLabel30);
        jLabel30.setBounds(330, 250, 350, 120);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/r1.png"))); // NOI18N
        mundo3.add(jLabel31);
        jLabel31.setBounds(330, 150, 360, 120);

        lbno5.setFont(new java.awt.Font("Dialog", 1, 14));
        lbno5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mundo3.add(lbno5);
        lbno5.setBounds(300, 50, 90, 30);

        lbvi9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/vida.png"))); // NOI18N
        lbvi9.setText("jLabel23");
        mundo3.add(lbvi9);
        lbvi9.setBounds(820, 340, 120, 100);

        lbvi10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/vida.png"))); // NOI18N
        lbvi10.setText("jLabel23");
        mundo3.add(lbvi10);
        lbvi10.setBounds(820, 250, 130, 100);

        lbvi11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/vida.png"))); // NOI18N
        lbvi11.setText("jLabel23");
        mundo3.add(lbvi11);
        lbvi11.setBounds(820, 160, 130, 100);
        mundo3.add(lbdi5);
        lbdi5.setBounds(160, 20, 690, 140);
        mundo3.add(cara3);
        cara3.setBounds(-90, 50, 310, 220);

        jLabel32.setBackground(new java.awt.Color(-65536,true));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setOpaque(true);
        mundo3.add(jLabel32);
        jLabel32.setBounds(0, 160, 960, 280);

        jLabel33.setBackground(new java.awt.Color(-16776961,true));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/fo.jpg"))); // NOI18N
        mundo3.add(jLabel33);
        jLabel33.setBounds(0, 0, 960, 500);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/1m.png"))); // NOI18N
        jLabel34.setText("jLabel4");
        mundo3.add(jLabel34);
        jLabel34.setBounds(290, 140, 420, 160);

        jPanel1.add(mundo3);
        mundo3.setBounds(0, 0, 960, 500);

        mundo2.setBackground(new java.awt.Color(-12566464,true));
        mundo2.setLayout(null);

        btseguir1.setBackground(new java.awt.Color(-16711936,true));
        btseguir1.setFont(new java.awt.Font("Dialog", 1, 14));
        btseguir1.setForeground(new java.awt.Color(-16776961,true));
        btseguir1.setText("Siguiente>>");
        btseguir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btseguir1ActionPerformed(evt);
            }
        });
        mundo2.add(btseguir1);
        btseguir1.setBounds(0, 270, 150, 50);

        btcompr1.setBackground(new java.awt.Color(-16711936,true));
        btcompr1.setFont(new java.awt.Font("Dialog", 1, 14));
        btcompr1.setForeground(new java.awt.Color(-16776961,true));
        btcompr1.setText("Comprobar");
        btcompr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcompr1ActionPerformed(evt);
            }
        });
        mundo2.add(btcompr1);
        btcompr1.setBounds(810, 440, 150, 60);

        bttras1.setBackground(new java.awt.Color(-65536,true));
        bttras1.setFont(new java.awt.Font("Dialog", 1, 12));
        bttras1.setText("<<<<");
        bttras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttras1ActionPerformed(evt);
            }
        });
        mundo2.add(bttras1);
        bttras1.setBounds(680, 103, 80, 30);

        lb4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mundo2.add(lb4);
        lb4.setBounds(680, 380, 40, 60);

        lb5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mundo2.add(lb5);
        lb5.setBounds(690, 280, 40, 60);

        lbcor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mundo2.add(lbcor1);
        lbcor1.setBounds(620, 180, 40, 60);

        txt4.setFont(new java.awt.Font("Dialog", 1, 36));
        txt4.setForeground(new java.awt.Color(-16776961,true));
        txt4.setOpaque(false);
        mundo2.add(txt4);
        txt4.setBounds(610, 380, 60, 50);

        txt5.setFont(new java.awt.Font("Dialog", 1, 36));
        txt5.setForeground(new java.awt.Color(-16776961,true));
        txt5.setOpaque(false);
        mundo2.add(txt5);
        txt5.setBounds(590, 280, 60, 50);

        txt6.setFont(new java.awt.Font("Dialog", 1, 36));
        txt6.setForeground(new java.awt.Color(-16776961,true));
        txt6.setOpaque(false);
        mundo2.add(txt6);
        txt6.setBounds(560, 180, 60, 50);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/m6.png"))); // NOI18N
        mundo2.add(jLabel15);
        jLabel15.setBounds(330, 350, 350, 120);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/m5.png"))); // NOI18N
        mundo2.add(jLabel24);
        jLabel24.setBounds(340, 250, 350, 120);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/m4.png"))); // NOI18N
        mundo2.add(jLabel25);
        jLabel25.setBounds(340, 150, 340, 120);

        lbno4.setFont(new java.awt.Font("Dialog", 1, 14));
        lbno4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mundo2.add(lbno4);
        lbno4.setBounds(300, 50, 90, 30);

        lbvi6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/vida.png"))); // NOI18N
        lbvi6.setText("jLabel23");
        mundo2.add(lbvi6);
        lbvi6.setBounds(820, 340, 120, 100);

        lbvi7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/vida.png"))); // NOI18N
        lbvi7.setText("jLabel23");
        mundo2.add(lbvi7);
        lbvi7.setBounds(820, 160, 130, 100);

        lbvi8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/vida.png"))); // NOI18N
        lbvi8.setText("jLabel23");
        mundo2.add(lbvi8);
        lbvi8.setBounds(820, 250, 130, 100);
        mundo2.add(lbdi4);
        lbdi4.setBounds(160, 20, 690, 140);

        lbcara2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/cara.png"))); // NOI18N
        mundo2.add(lbcara2);
        lbcara2.setBounds(-90, 50, 310, 220);

        jLabel27.setBackground(new java.awt.Color(-16776961,true));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/tikal2.jpg"))); // NOI18N
        jLabel27.setOpaque(true);
        mundo2.add(jLabel27);
        jLabel27.setBounds(0, 160, 960, 280);

        jLabel28.setBackground(new java.awt.Color(-16776961,true));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/fo.jpg"))); // NOI18N
        mundo2.add(jLabel28);
        jLabel28.setBounds(0, 0, 960, 500);

        jLabel29.setText("jLabel4");
        mundo2.add(jLabel29);
        jLabel29.setBounds(290, 140, 420, 160);

        jPanel1.add(mundo2);
        mundo2.setBounds(0, 0, 960, 500);

        mundo1.setBackground(new java.awt.Color(-12566464,true));
        mundo1.setLayout(null);

        bttras.setBackground(new java.awt.Color(-65536,true));
        bttras.setFont(new java.awt.Font("Dialog", 1, 12));
        bttras.setText("<<<<");
        bttras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttrasActionPerformed(evt);
            }
        });
        mundo1.add(bttras);
        bttras.setBounds(680, 103, 80, 30);

        btseguir.setBackground(new java.awt.Color(-16711936,true));
        btseguir.setFont(new java.awt.Font("Dialog", 1, 14));
        btseguir.setForeground(new java.awt.Color(-16776961,true));
        btseguir.setText("Siguiente>>");
        btseguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btseguirActionPerformed(evt);
            }
        });
        mundo1.add(btseguir);
        btseguir.setBounds(0, 270, 150, 50);

        btcompr.setBackground(new java.awt.Color(-16711936,true));
        btcompr.setFont(new java.awt.Font("Dialog", 1, 14));
        btcompr.setForeground(new java.awt.Color(-16776961,true));
        btcompr.setText("Comprobar");
        btcompr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcomprActionPerformed(evt);
            }
        });
        mundo1.add(btcompr);
        btcompr.setBounds(810, 440, 150, 60);

        lb3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mundo1.add(lb3);
        lb3.setBounds(630, 380, 40, 60);

        lb2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mundo1.add(lb2);
        lb2.setBounds(620, 280, 40, 60);

        lbcor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mundo1.add(lbcor);
        lbcor.setBounds(620, 180, 40, 60);

        txt2.setFont(new java.awt.Font("Dialog", 1, 36));
        txt2.setForeground(new java.awt.Color(-16776961,true));
        txt2.setOpaque(false);
        mundo1.add(txt2);
        txt2.setBounds(560, 280, 60, 50);

        txt3.setFont(new java.awt.Font("Dialog", 1, 36));
        txt3.setForeground(new java.awt.Color(-16776961,true));
        txt3.setOpaque(false);
        mundo1.add(txt3);
        txt3.setBounds(570, 380, 60, 50);

        txt1.setFont(new java.awt.Font("Dialog", 1, 36));
        txt1.setForeground(new java.awt.Color(-16776961,true));
        txt1.setOpaque(false);
        mundo1.add(txt1);
        txt1.setBounds(500, 180, 60, 50);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/m3.png"))); // NOI18N
        mundo1.add(jLabel13);
        jLabel13.setBounds(340, 350, 340, 120);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/m2.png"))); // NOI18N
        mundo1.add(jLabel14);
        jLabel14.setBounds(340, 250, 340, 120);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/1m.png"))); // NOI18N
        mundo1.add(jLabel5);
        jLabel5.setBounds(340, 150, 340, 120);

        lbno3.setFont(new java.awt.Font("Dialog", 1, 14));
        lbno3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mundo1.add(lbno3);
        lbno3.setBounds(300, 50, 90, 30);

        lbvi4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/vida.png"))); // NOI18N
        lbvi4.setText("jLabel23");
        mundo1.add(lbvi4);
        lbvi4.setBounds(820, 340, 120, 100);

        lbvi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/vida.png"))); // NOI18N
        lbvi2.setText("jLabel23");
        mundo1.add(lbvi2);
        lbvi2.setBounds(820, 250, 130, 100);

        lbvi5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/vida.png"))); // NOI18N
        lbvi5.setText("jLabel23");
        mundo1.add(lbvi5);
        lbvi5.setBounds(820, 160, 130, 100);
        mundo1.add(lbdi3);
        lbdi3.setBounds(160, 20, 690, 140);

        lbcara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/cara.png"))); // NOI18N
        mundo1.add(lbcara);
        lbcara.setBounds(-90, 50, 310, 220);

        jLabel16.setBackground(new java.awt.Color(-16776961,true));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/tikal.jpg"))); // NOI18N
        jLabel16.setOpaque(true);
        mundo1.add(jLabel16);
        jLabel16.setBounds(0, 160, 960, 280);

        jLabel17.setBackground(new java.awt.Color(-16776961,true));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/fo.jpg"))); // NOI18N
        mundo1.add(jLabel17);
        jLabel17.setBounds(0, 0, 960, 500);

        jLabel23.setText("jLabel4");
        mundo1.add(jLabel23);
        jLabel23.setBounds(290, 140, 420, 160);

        jPanel1.add(mundo1);
        mundo1.setBounds(0, 0, 960, 500);

        Mapa.setBackground(new java.awt.Color(-12566464,true));
        Mapa.setLayout(null);

        btse2.setBackground(new java.awt.Color(-256,true));
        btse2.setFont(new java.awt.Font("Dialog", 1, 12));
        btse2.setText("siguir>");
        btse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btse2ActionPerformed(evt);
            }
        });
        Mapa.add(btse2);
        btse2.setBounds(390, 80, 73, 23);

        btegi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/6.png"))); // NOI18N
        btegi.setText("egipcia");
        btegi.setContentAreaFilled(false);
        btegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btegiActionPerformed(evt);
            }
        });
        Mapa.add(btegi);
        btegi.setBounds(740, 70, 160, 147);

        btegi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/5.png"))); // NOI18N
        btegi2.setText("egipcia");
        btegi2.setContentAreaFilled(false);
        btegi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btegi2ActionPerformed(evt);
            }
        });
        Mapa.add(btegi2);
        btegi2.setBounds(610, 50, 110, 120);

        btro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/4.png"))); // NOI18N
        btro.setContentAreaFilled(false);
        btro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btroActionPerformed(evt);
            }
        });
        Mapa.add(btro);
        btro.setBounds(510, 90, 90, 110);

        btro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/3.png"))); // NOI18N
        btro2.setContentAreaFilled(false);
        btro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btro2ActionPerformed(evt);
            }
        });
        Mapa.add(btro2);
        btro2.setBounds(430, 180, 100, 120);

        btma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/uno.png"))); // NOI18N
        btma.setText("Maya");
        btma.setContentAreaFilled(false);
        btma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/uno.png"))); // NOI18N
        btma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmaActionPerformed(evt);
            }
        });
        Mapa.add(btma);
        btma.setBounds(240, 270, 120, 130);

        btma2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/dos.png"))); // NOI18N
        btma2.setText("Maya");
        btma2.setContentAreaFilled(false);
        btma2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btma2ActionPerformed(evt);
            }
        });
        Mapa.add(btma2);
        btma2.setBounds(320, 160, 120, 130);

        lbno2.setFont(new java.awt.Font("Dialog", 1, 14));
        lbno2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mapa.add(lbno2);
        lbno2.setBounds(300, 50, 90, 30);

        lbvi3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/vida2.png"))); // NOI18N
        lbvi3.setText("jLabel23");
        Mapa.add(lbvi3);
        lbvi3.setBounds(840, 400, 120, 100);

        lbvi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/vida2.png"))); // NOI18N
        lbvi.setText("jLabel23");
        Mapa.add(lbvi);
        lbvi.setBounds(750, 400, 130, 100);

        lbvi1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/vida2.png"))); // NOI18N
        lbvi1.setText("jLabel23");
        Mapa.add(lbvi1);
        lbvi1.setBounds(660, 400, 130, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/mapa.png"))); // NOI18N
        Mapa.add(jLabel1);
        jLabel1.setBounds(200, 110, 610, 350);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/pla3.png"))); // NOI18N
        Mapa.add(jLabel3);
        jLabel3.setBounds(620, 300, 510, 470);

        lbesfi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/Sfing2.png"))); // NOI18N
        Mapa.add(lbesfi2);
        lbesfi2.setBounds(450, 190, 460, 290);

        lbcoli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/Gri.png"))); // NOI18N
        Mapa.add(lbcoli);
        lbcoli.setBounds(380, 160, 220, 280);

        lbpirg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/pira4.png"))); // NOI18N
        Mapa.add(lbpirg);
        lbpirg.setBounds(330, 60, 630, 310);

        lbluis2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/luis11.png"))); // NOI18N
        Mapa.add(lbluis2);
        lbluis2.setBounds(-10, 40, 360, 460);

        lbpi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/ma.png"))); // NOI18N
        Mapa.add(lbpi2);
        lbpi2.setBounds(80, 240, 330, 190);
        Mapa.add(lbdi2);
        lbdi2.setBounds(160, 0, 320, 120);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/nube.jpg"))); // NOI18N
        Mapa.add(jLabel19);
        jLabel19.setBounds(-400, 0, 460, 340);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/cielo.jpg"))); // NOI18N
        Mapa.add(jLabel18);
        jLabel18.setBounds(50, 0, 460, 340);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/nube.jpg"))); // NOI18N
        Mapa.add(jLabel20);
        jLabel20.setBounds(500, 0, 460, 340);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/s2.jpg"))); // NOI18N
        Mapa.add(jLabel21);
        jLabel21.setBounds(450, 330, 450, 180);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/s.jpg"))); // NOI18N
        Mapa.add(jLabel22);
        jLabel22.setBounds(0, 334, 450, 170);

        jPanel1.add(Mapa);
        Mapa.setBounds(0, 0, 960, 500);

        lbo.setFont(new java.awt.Font("Dialog", 1, 14));
        lbo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbo.setText("O");
        jPanel1.add(lbo);
        lbo.setBounds(600, 60, 30, 20);

        btno.setBackground(new java.awt.Color(-256,true));
        btno.setFont(new java.awt.Font("Dialog", 1, 12));
        btno.setText("no");
        jPanel1.add(btno);
        btno.setBounds(640, 60, 50, 25);

        btsi.setBackground(new java.awt.Color(-256,true));
        btsi.setFont(new java.awt.Font("Dialog", 1, 12));
        btsi.setText("si");
        btsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsiActionPerformed(evt);
            }
        });
        jPanel1.add(btsi);
        btsi.setBounds(540, 60, 50, 25);

        lbpla.setFont(new java.awt.Font("Dialog", 1, 36));
        lbpla.setForeground(new java.awt.Color(-256,true));
        lbpla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pla1.png"))); // NOI18N
        lbpla.setContentAreaFilled(false);
        lbpla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbpla.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbpla.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pla1.png"))); // NOI18N
        lbpla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbplaActionPerformed(evt);
            }
        });
        jPanel1.add(lbpla);
        lbpla.setBounds(90, 90, 420, 370);

        btse.setBackground(new java.awt.Color(-256,true));
        btse.setFont(new java.awt.Font("Dialog", 1, 12));
        btse.setText("Seguir>");
        btse.setBorder(null);
        btse.setBorderPainted(false);
        btse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btseActionPerformed(evt);
            }
        });
        jPanel1.add(btse);
        btse.setBounds(650, 80, 90, 20);

        lbnon1.setFont(new java.awt.Font("Dialog", 1, 14));
        lbnon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbnon1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbnon1);
        lbnon1.setBounds(670, 30, 70, 20);

        lbnon.setFont(new java.awt.Font("Dialog", 1, 14));
        lbnon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbnon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbnon);
        lbnon.setBounds(530, 0, 70, 50);

        txtnom.setFont(new java.awt.Font("Dialog", 1, 12));
        txtnom.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtnom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnomMouseClicked(evt);
            }
        });
        txtnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomActionPerformed(evt);
            }
        });
        jPanel1.add(txtnom);
        txtnom.setBounds(510, 80, 130, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/num2.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 40, 390, 130);

        lbluis.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbluis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/luis.png"))); // NOI18N
        lbluis.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lbluis);
        lbluis.setBounds(610, 30, 350, 470);
        jPanel1.add(lbdi);
        lbdi.setBounds(490, -30, 320, 180);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/num.png"))); // NOI18N
        jLabel4.setText("2");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 410, 370, 130);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cuadro.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(770, 390, 150, 130);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cuadro.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(880, 390, 110, 130);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tri.png"))); // NOI18N
        jLabel8.setText("jLabel2");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 200, 170, 160);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sfing.png"))); // NOI18N
        jLabel10.setText("jLabel2");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(280, 240, 390, 440);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pira.png"))); // NOI18N
        jLabel9.setText("1");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(-280, 330, 670, 280);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cuadro.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(660, 390, 170, 130);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/num.png"))); // NOI18N
        jLabel12.setText("jLabel2");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(320, 250, 370, 130);

        jMenu2.setForeground(new java.awt.Color(-65536,true));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/Error.png"))); // NOI18N
        jMenu2.setText("SALIR");
        jMenu2.setFont(new java.awt.Font("Bauhaus 93", 0, 12)); // NOI18N
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem2.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem2.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(255, 0, 0));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/Windows.png"))); // NOI18N
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu1.setBackground(new java.awt.Color(-16777216,true));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/Warning_2.png"))); // NOI18N
        jMenu1.setText("SEGURIDAD");
        jMenu1.setFont(new java.awt.Font("Bauhaus 93", 0, 12)); // NOI18N

        jMenuItem4.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem4.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(0, 51, 153));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/User2.png"))); // NOI18N
        jMenuItem4.setText("Usuario");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/Fav.png"))); // NOI18N
        jMenu3.setText("MINI JUEGO");
        jMenu3.setFont(new java.awt.Font("Bauhaus 93", 0, 12)); // NOI18N

        jMenuItem3.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem3.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(0, 51, 153));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/Windows8.png"))); // NOI18N
        jMenuItem3.setText("Tetris");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void lbplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbplaActionPerformed
if(a==75){ 
   contador = new Timer(50, new claseTimer());
    contador.start(); 
}
   
      
           // TODO add your handling code here:
}//GEN-LAST:event_lbplaActionPerformed

private void txtnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtnomActionPerformed

private void btseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btseActionPerformed
  nombre=txtnom.getText();
 
    if(nombre.equals("Introduce tu nombre")|| nombre.equals("")){
        txtnom.setText("Introduce tu nombre");     
        }else{
    
         
         contador = new Timer(50, new claseTimer());
    contador.start();
           
      }
     
    
   
    
  
           
     
    
 
   
 
 // TODO add your handling code here:
}//GEN-LAST:event_btseActionPerformed

private void btsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsiActionPerformed
  
     
         contador = new Timer(50, new claseTimer());
    contador.start();           
    
      // TODO add your handling code here:
}//GEN-LAST:event_btsiActionPerformed

private void btro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btro2ActionPerformed
btma.setVisible(false);
btma2.setVisible(false);
btro2.setVisible(false);
btro.setVisible(false);
btegi2.setVisible(false);
btegi.setVisible(false);
   // mundo1.setVisible(true);
 mundo3.setVisible(true);

    if(((vida==0) && (vida!=1 || vida!=2|| vida!=3))||(Co3==0)){ 
       btcompr2.setEnabled(true);  
    }
     a=390;
    contador = new Timer(50, new claseTimer());
    contador.start();
    
   // TODO add your handling code here:
}//GEN-LAST:event_btro2ActionPerformed

private void btse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btse2ActionPerformed
   contador = new Timer(50, new claseTimer());
    contador.start(); // TODO add your handling code here:
}//GEN-LAST:event_btse2ActionPerformed

private void btmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmaActionPerformed

    btma.setVisible(false);
btma2.setVisible(false);
btro2.setVisible(false);
btro.setVisible(false);
btegi2.setVisible(false);
btegi.setVisible(false);
 mundo1.setVisible(true);   
    if(((vida==0) && (vida!=1 || vida!=2|| vida!=3))||(Co==0)){ 
       btcompr.setEnabled(true);  
       
    }
     
    contador = new Timer(50, new claseTimer());
    contador.start();
 //btma.setEnabled(false);
 
}//GEN-LAST:event_btmaActionPerformed

private void btcomprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcomprActionPerformed
n1=1;

     Cuenta();
   Co=1;  
    //n1=2;
  
}//GEN-LAST:event_btcomprActionPerformed

private void btseguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btseguirActionPerformed

mundo1.setVisible(false);

 File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes2\\2.2.png");
            String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
       btma2.setIcon(new ImageIcon(foto));
  btma2.setEnabled(true);
  btma2.setVisible(true);
Mapa.setVisible(true);
btma.setEnabled(true);
btma.setVisible(true);
btro2.setVisible(true);


 
  btro.setVisible(true);

 btegi2.setVisible(true);
      
  btegi.setVisible(true);

lbdi2.setIcon(null);
lbno2.setVisible(false);
vid();

 

// contador = new Timer(50, new claseTimer());
 //   contador.start();
}//GEN-LAST:event_btseguirActionPerformed

private void bttrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttrasActionPerformed
vip=3;
    tras();// TODO add your handling code here:
}//GEN-LAST:event_bttrasActionPerformed

private void btma2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btma2ActionPerformed

   btma.setVisible(false);
btma2.setVisible(false);
btro2.setVisible(false);
btro.setVisible(false);
btegi2.setVisible(false);
btegi.setVisible(false);
mundo2.setVisible(true);
    if(((vida==0) && (vida!=1 || vida!=2|| vida!=3))||(Co2==0)){ 
       btcompr1.setEnabled(true);  
    }
     a=380;
    contador = new Timer(50, new claseTimer());
    contador.start();
    
   
        
       
}//GEN-LAST:event_btma2ActionPerformed

private void btseguir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btseguir1ActionPerformed
mundo2.setVisible(false);

 File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes2\\3.2.png");
            String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
           btro2.setIcon(new ImageIcon(foto));
           btro2.setVisible(true);
           btro2.setEnabled(true);
          lbpi2.setEnabled(true);
         lbcoli.setEnabled(true);  
       //btma2.setIcon(new ImageIcon(foto));
  //btma2.setEnabled(true);
  //btma2.setVisible(true);
Mapa.setVisible(true);
btma.setEnabled(true);
btma.setVisible(true);
btma2.setEnabled(true);
btma2.setVisible(true);

 btro2.setVisible(true);
 
  btro.setVisible(true);
 
 btegi2.setVisible(true);

  btegi.setVisible(true);


lbdi2.setIcon(null);
lbno2.setVisible(false);
vid();
// TODO add your handling code here:
}//GEN-LAST:event_btseguir1ActionPerformed

private void btcompr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcompr1ActionPerformed
n1=2;
    Cuenta();
     Co2=1;
     // n2=0;// TODO add your handling code here:
}//GEN-LAST:event_btcompr1ActionPerformed

private void bttras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttras1ActionPerformed
vip=3;
    tras();// TODO add your handling code here:
}//GEN-LAST:event_bttras1ActionPerformed

private void btseguir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btseguir2ActionPerformed
mundo3.setVisible(false);

 File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes2\\4.2.png");
            String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
           btro.setIcon(new ImageIcon(foto));
           btro.setVisible(true);
           btro.setEnabled(true);
          lbpi2.setEnabled(true);
         lbcoli.setEnabled(true);  
       //btma2.setIcon(new ImageIcon(foto));
  //btma2.setEnabled(true);
  //btma2.setVisible(true);
Mapa.setVisible(true);
btma.setEnabled(true);
btma.setVisible(true);
btma2.setEnabled(true);
btma2.setVisible(true);
 btro2.setVisible(true);
 btro2.setEnabled(true);


 btegi2.setVisible(true);
    
  btegi.setVisible(true);



lbdi2.setIcon(null);
lbno2.setVisible(false);
vid();// TODO add your handling code here:
}//GEN-LAST:event_btseguir2ActionPerformed

private void bttras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttras2ActionPerformed
vip=3;
    tras();// TODO add your handling code here:
}//GEN-LAST:event_bttras2ActionPerformed

private void btcompr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcompr2ActionPerformed
n1=3;
    Cuenta();
     Co3=1;
     // n1=3;// TODO add your handling code here:
}//GEN-LAST:event_btcompr2ActionPerformed

private void btseguir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btseguir3ActionPerformed
mundo4.setVisible(false);

 File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes2\\5.2.png");
            String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
          btegi2.setIcon(new ImageIcon(foto));
          btegi2.setVisible(true);
           btegi2.setEnabled(true);
          lbpi2.setEnabled(true);
         lbcoli.setEnabled(true);  
         lbesfi2.setEnabled(true);  
       //btma2.setIcon(new ImageIcon(foto));
  //btma2.setEnabled(true);
  //btma2.setVisible(true);
Mapa.setVisible(true);
btma.setEnabled(true);
btma.setVisible(true);
btma2.setEnabled(true);
btma2.setVisible(true);
 btro2.setVisible(true);
 btro2.setEnabled(true);
  btro.setVisible(true);
 btro.setEnabled(true);
 btegi2.setVisible(true);
        
  btegi.setVisible(true);
  vid();
 
}//GEN-LAST:event_btseguir3ActionPerformed

private void btcompr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcompr3ActionPerformed
n1=4;

     Cuenta();
   Co4=1;
    //n4=0;// TODO add your handling code here:
}//GEN-LAST:event_btcompr3ActionPerformed

private void bttras3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttras3ActionPerformed
vip=3;
    tras();// TODO add your handling code here:
}//GEN-LAST:event_bttras3ActionPerformed

private void btroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btroActionPerformed
  btma.setVisible(false);
btma2.setVisible(false);
btro2.setVisible(false);
btro.setVisible(false);
btegi2.setVisible(false);
btegi.setVisible(false);
   // mundo1.setVisible(true);
 mundo4.setVisible(true);

    if(((vida==0) && (vida!=1 || vida!=2|| vida!=3))||(Co4==0)){ 
       btcompr3.setEnabled(true);  
    }
     a=400;
    contador = new Timer(50, new claseTimer());
    contador.start();
    
   
        
       
         // TODO add your handling code here:
}//GEN-LAST:event_btroActionPerformed

private void btseguir4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btseguir4ActionPerformed
mundo5.setVisible(false);

 File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes2\\6.2.png");
            String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
          btegi.setIcon(new ImageIcon(foto));
          btegi.setVisible(true);
           btegi.setEnabled(true);
          lbpi2.setEnabled(true);
         lbcoli.setEnabled(true);  
         lbesfi2.setEnabled(true);
         lbpirg.setEnabled(true);
         
         
       //btma2.setIcon(new ImageIcon(foto));
  //btma2.setEnabled(true);
  //btma2.setVisible(true);
Mapa.setVisible(true);
btma.setEnabled(true);
btma.setVisible(true);
btma2.setEnabled(true);
btma2.setVisible(true);
 btro2.setVisible(true);
 btro2.setEnabled(true);
  btro.setVisible(true);
 btro.setEnabled(true);
 btegi2.setVisible(true);
 btegi2.setEnabled(true);
 vid();
           
}//GEN-LAST:event_btseguir4ActionPerformed

private void bttras4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttras4ActionPerformed
vip=3;
    tras();// TODO add your handling code here:
}//GEN-LAST:event_bttras4ActionPerformed

private void btcompr4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcompr4ActionPerformed
n1=5;

     Cuenta();
   Co5=1;
    //n5=0;// TODO add your handling code here:
}//GEN-LAST:event_btcompr4ActionPerformed

private void btegi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btegi2ActionPerformed
btma.setVisible(false);
btma2.setVisible(false);
btro2.setVisible(false);
btro.setVisible(false);
btegi2.setVisible(false);
btegi.setVisible(false);
   // mundo1.setVisible(true);
 mundo5.setVisible(true);

    if(((vida==0) && (vida!=1 || vida!=2|| vida!=3))||(Co5==0)){ 
       btcompr4.setEnabled(true);  
    }
     a=400;
    contador = new Timer(50, new claseTimer());
    contador.start();    
    
   
    
    
}//GEN-LAST:event_btegi2ActionPerformed

private void btegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btegiActionPerformed
btma.setVisible(false);
btma2.setVisible(false);
btro2.setVisible(false);
btro.setVisible(false);
btegi2.setVisible(false);
btegi.setVisible(false);
   // mundo1.setVisible(true);
 mundo6.setVisible(true);

    if(((vida==0) && (vida!=1 || vida!=2|| vida!=3))||(Co6==0)){ 
       btcompr5.setEnabled(true);  
    }
     a=430;
    contador = new Timer(50, new claseTimer());
    contador.start();    
    
   
    
    
      
    
// TODO add your handling code here:
}//GEN-LAST:event_btegiActionPerformed

private void btseguir5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btseguir5ActionPerformed
mundo6.setVisible(false);

 File ruta = new File("C:\\Archivos de programa\\LuisMatematicas\\Graficos\\Imagenes2\\6.2.png");
            String d=(String.valueOf(ruta));
           Image foto= getToolkit().getImage(d);
          btegi.setIcon(new ImageIcon(foto));
         // btegi.setVisible(true);
          //btegi.setEnabled(true);
          //lbpi2.setEnabled(true);
         //lbcoli.setEnabled(true);  
         //lbesfi2.setEnabled(true);
         //lbpirg.setEnabled(true);
         
         
       //btma2.setIcon(new ImageIcon(foto));
  //btma2.setEnabled(true);
  //btma2.setVisible(true);
       
 gana.setVisible(true);
 regresar.setVisible(true);
//btma.setEnabled(true);
//btma.setVisible(true);
//btma2.setEnabled(true);
//btma2.setVisible(true);
 //btro2.setVisible(true);
 //btro2.setEnabled(true);
  //btro.setVisible(true);
 //btro.setEnabled(true);
 //btegi2.setVisible(true);
 //btegi2.setEnabled(true);
}//GEN-LAST:event_btseguir5ActionPerformed

private void btcompr5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcompr5ActionPerformed
n1=6;

     Cuenta();
   Co6=1;
   // n6=0;// TODO add your handling code here:
}//GEN-LAST:event_btcompr5ActionPerformed

private void bttras5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttras5ActionPerformed
vip=3;
    tras();
}//GEN-LAST:event_bttras5ActionPerformed

private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
this.dispose();// TODO add your handling code here:
}//GEN-LAST:event_jMenu2ActionPerformed

private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
vip=3;
    tras();

}//GEN-LAST:event_regresarActionPerformed

   

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
new Tetris().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
new Registro().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtnomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnomMouseClicked
txtnom.setText(""); 
txtnom.setEnabled(true); // TODO add your handling code here:
    }//GEN-LAST:event_txtnomMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Mapa;
    private javax.swing.JButton btcompr;
    private javax.swing.JButton btcompr1;
    private javax.swing.JButton btcompr2;
    private javax.swing.JButton btcompr3;
    private javax.swing.JButton btcompr4;
    private javax.swing.JButton btcompr5;
    private javax.swing.JButton btegi;
    private javax.swing.JButton btegi2;
    private javax.swing.JButton btma;
    private javax.swing.JButton btma2;
    private javax.swing.JButton btno;
    private javax.swing.JButton btro;
    private javax.swing.JButton btro2;
    private javax.swing.JButton btse;
    private javax.swing.JButton btse2;
    private javax.swing.JButton btseguir;
    private javax.swing.JButton btseguir1;
    private javax.swing.JButton btseguir2;
    private javax.swing.JButton btseguir3;
    private javax.swing.JButton btseguir4;
    private javax.swing.JButton btseguir5;
    private javax.swing.JButton btsi;
    private javax.swing.JButton bttras;
    private javax.swing.JButton bttras1;
    private javax.swing.JButton bttras2;
    private javax.swing.JButton bttras3;
    private javax.swing.JButton bttras4;
    private javax.swing.JButton bttras5;
    private javax.swing.JLabel cara3;
    private javax.swing.JLabel cara4;
    private javax.swing.JLabel cara5;
    private javax.swing.JLabel cara6;
    private javax.swing.JPanel gana;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb12;
    private javax.swing.JLabel lb13;
    private javax.swing.JLabel lb15;
    private javax.swing.JLabel lb16;
    private javax.swing.JLabel lb17;
    private javax.swing.JLabel lb18;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb81;
    private javax.swing.JLabel lb91;
    private javax.swing.JLabel lbcara;
    private javax.swing.JLabel lbcara2;
    private javax.swing.JLabel lbcoli;
    private javax.swing.JLabel lbcor;
    private javax.swing.JLabel lbcor1;
    private javax.swing.JLabel lbcor10;
    private javax.swing.JLabel lbcor14;
    private javax.swing.JLabel lbcor15;
    private javax.swing.JLabel lbcor71;
    private javax.swing.JLabel lbdi;
    private javax.swing.JLabel lbdi2;
    private javax.swing.JLabel lbdi3;
    private javax.swing.JLabel lbdi4;
    private javax.swing.JLabel lbdi5;
    private javax.swing.JLabel lbdi6;
    private javax.swing.JLabel lbdi7;
    private javax.swing.JLabel lbdi8;
    private javax.swing.JLabel lbesfi2;
    private javax.swing.JLabel lbluis;
    private javax.swing.JLabel lbluis2;
    private javax.swing.JLabel lbno2;
    private javax.swing.JLabel lbno3;
    private javax.swing.JLabel lbno4;
    private javax.swing.JLabel lbno5;
    private javax.swing.JLabel lbno6;
    private javax.swing.JLabel lbno7;
    private javax.swing.JLabel lbno8;
    private javax.swing.JLabel lbnon;
    private javax.swing.JLabel lbnon1;
    private javax.swing.JLabel lbo;
    private javax.swing.JLabel lbpi2;
    private javax.swing.JLabel lbpirg;
    private javax.swing.JButton lbpla;
    private javax.swing.JLabel lbvi;
    private javax.swing.JLabel lbvi1;
    private javax.swing.JLabel lbvi10;
    private javax.swing.JLabel lbvi11;
    private javax.swing.JLabel lbvi12;
    private javax.swing.JLabel lbvi13;
    private javax.swing.JLabel lbvi14;
    private javax.swing.JLabel lbvi15;
    private javax.swing.JLabel lbvi16;
    private javax.swing.JLabel lbvi17;
    private javax.swing.JLabel lbvi2;
    private javax.swing.JLabel lbvi20;
    private javax.swing.JLabel lbvi21;
    private javax.swing.JLabel lbvi22;
    private javax.swing.JLabel lbvi3;
    private javax.swing.JLabel lbvi4;
    private javax.swing.JLabel lbvi5;
    private javax.swing.JLabel lbvi6;
    private javax.swing.JLabel lbvi7;
    private javax.swing.JLabel lbvi8;
    private javax.swing.JLabel lbvi9;
    private javax.swing.JPanel mundo1;
    private javax.swing.JPanel mundo2;
    private javax.swing.JPanel mundo3;
    private javax.swing.JPanel mundo4;
    private javax.swing.JPanel mundo5;
    private javax.swing.JPanel mundo6;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt116;
    private javax.swing.JTextField txt12;
    private javax.swing.JTextField txt13;
    private javax.swing.JTextField txt15;
    private javax.swing.JTextField txt17;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt20;
    private javax.swing.JTextField txt21;
    private javax.swing.JTextField txt22;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    private javax.swing.JTextField txtnom;
    // End of variables declaration//GEN-END:variables
}
