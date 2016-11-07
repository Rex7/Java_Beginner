/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TempWorkingDirectory;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author Regis
 */

public class TestDemo{
    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        new PhotoShop();
    }
 
}
class PhotoShop extends javax.swing.JFrame{
    JLabel imagelabel;
    JButton upload,reset,blur,circle;
    Mat src,des,original;
    String filename;
    public PhotoShop(){
        imagelabel = new JLabel("Image ");
        upload = new JButton("Upload the image");
        reset = new JButton("Reset");
        blur = new JButton("Blur");
        circle = new JButton("Draw Circle");
        filename=new String();
        setLayout(new FlowLayout());
        add(imagelabel);
        add(upload);
        add(reset);
        add(blur);
        add(circle);
        upload.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                JFileChooser chooser= new JFileChooser();
                int result = chooser.showOpenDialog(rootPane);
                if(result==JFileChooser.APPROVE_OPTION){
                    filename=chooser.getSelectedFile().getName();
                    onCall();
                    
                }
            }
        });
        blur.addActionListener(new ActionListener(){
            @Override 
            public void actionPerformed(ActionEvent event){
                
                
                Imgproc.blur(src, des, new Size(3.0,3.0));
                BufferedImage img =getImage(des);
                updateImage(img);
                    
            }
        });
        reset.addActionListener(new ActionListener(){
            @Override 
            public void actionPerformed(ActionEvent event){
                if(!(filename.isEmpty()))
                    onCall();   
                else
                    System.out.println("Its empty");
            }
        });
        circle.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
               imagelabel.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
                if(original!=null){
                Imgproc.circle(src, new Point(e.getX(),e.getY()), 20, new Scalar(255,0,0),10);
                BufferedImage img  = getImage(src);
                imagelabel.setIcon(new ImageIcon((Image)img));
            }
            }

        });
            }
            
        });
        
        setVisible(true);
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
    public void updateImage(BufferedImage im){
      
        
         imagelabel.setIcon(new ImageIcon((Image)im));
        
        
    }
    public void onCall(){
        src=Imgcodecs.imread(filename);
        original=Imgcodecs.imread(filename);
        des = new Mat(src.rows(),src.cols(),src.type());
        BufferedImage img = getImage(src);
        imagelabel.setIcon(new ImageIcon((Image)img));  
    }
    
    public BufferedImage getImage(Mat m){
        BufferedImage img = new BufferedImage(m.width(),m.height(),BufferedImage.TYPE_3BYTE_BGR);
        DataBufferByte bytedata = (DataBufferByte)img.getRaster().getDataBuffer();
        byte b[] = bytedata.getData();
        m.get(0, 0, b);
        return img;
    }
}