package TempWorkingDirectory;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.File;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
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
public class PhotoShopDemo {

    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        new PhotoShop();
    }

}

class PhotoShop extends javax.swing.JFrame {

    int no_of_count = 0;
    JLabel imagelabel;
    JButton upload, reset, blur, circle, edge;
    JSlider slider,slider_x,slider_y;
    Mat src, des, original;
    String filename;
    JRadioButton guassian_blur, median_blur, box_blur;
    ButtonGroup buttongroup;
    File file;

    public PhotoShop() {
        imagelabel = new JLabel("Image ");
        upload = new JButton("Upload the image");
        reset = new JButton("Reset");
        blur = new JButton("Blur");
        circle = new JButton("Draw Circle");
        edge = new JButton("Edge");
        guassian_blur = new JRadioButton("Gauassian Blur");
        median_blur = new JRadioButton("Meddian Blur");
        box_blur = new JRadioButton("Box Blur");

        slider = new JSlider(JSlider.HORIZONTAL, 0, 20, 0);
        slider_x=new JSlider(JSlider.HORIZONTAL,0,100,0);
        slider_y=new JSlider(JSlider.HORIZONTAL,0,100,0);
        //setting both x and y silder to invisible
        slider_x.setVisible(false);
        slider_y.setVisible(false);
       
        buttongroup = new ButtonGroup();
        //adding the radio buttons to button
        buttongroup.add(guassian_blur);
        buttongroup.add(median_blur);
        buttongroup.add(box_blur);
        //slider settings
        slider.setMajorTickSpacing(5);
        slider.setMinorTickSpacing(1);
        slider.setPaintTrack(true);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        // setting slider_x 
        slider_x.setMajorTickSpacing(10);
        slider_x.setMinorTickSpacing(15);
        slider_x.setPaintTrack(true);
        slider_x.setPaintLabels(true);
        slider_x.setPaintTicks(true);
        //setting slider_y 
        slider_y.setMajorTickSpacing(10);
        slider_y.setMinorTickSpacing(15);
        slider_y.setPaintTrack(true);
        slider_y.setPaintLabels(true);
        slider_y.setPaintTicks(true);
        filename = new String();
        setLayout(new FlowLayout());
        //adding all to frame
        add(imagelabel);
        add(upload);
        add(reset);
        add(blur);
        add(circle);
        add(edge);
        add(slider);
        add(slider_x);
        add(slider_y);
        add(median_blur);
        add(guassian_blur);
        add(box_blur);
        
        //listeneing for change in slider values
        slider.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {

            }

        });

        upload.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                JFileChooser chooser = new JFileChooser();
                if ((no_of_count == 0)) {
                    int result = chooser.showOpenDialog(rootPane);
                    if (result == JFileChooser.APPROVE_OPTION) {
                        filename = chooser.getSelectedFile().getName();
                        file = chooser.getCurrentDirectory();
                        onCall();
                        no_of_count++;
                    }

                } else {
                    chooser.setCurrentDirectory(file);
                    int result = chooser.showOpenDialog(rootPane);
                    if (result == JFileChooser.APPROVE_OPTION) {
                        filename = chooser.getSelectedFile().getName();
                        onCall();
                        no_of_count++;
                    }
                }
                System.out.println("Count" + no_of_count);

            }

        });
        blur.addActionListener(new ActionListener() {
            double elapsed;

            @Override
            public void actionPerformed(ActionEvent event) {

                BufferedImage img;
                if (src != null && des != null) {
                    if (slider.getValue() != 0) {
                        double t0 = Core.getTickCount();
                        switch (getSelection(buttongroup)) {
                            case "Gauassian Blur":
                                slider_x.setName("x");
                                slider_x.setVisible(true);
                                slider_y.setVisible(true);
                                 Imgproc.GaussianBlur(src, des, new Size(slider.getValue(),slider.getValue()), slider_x.getValue(), slider_y.getValue());
                                 img = getImage(des);
                                updateImage(img);
                                break;
                            case "Meddian Blur":

                                break;
                            case "Box Blur":
                                Imgproc.boxFilter(src, des, des.depth(), new Size(slider.getValue(), slider.getValue()));
                                img = getImage(des);
                                updateImage(img);
                                break;
                            default:

                                break;

                        }
                        elapsed = ((double) Core.getTickCount() - t0) / Core.getTickFrequency();
                        JOptionPane.showMessageDialog(rootPane, "Seconds " + Math.abs(elapsed));
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Sorry Slider Value Cant Be Zero");
                    }

                }

            }
        });
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (!(filename.isEmpty())) {
                    onCall();
                    slider.setValue(0);
                } else {
                    System.out.println("Its empty");
                }
            }
        });
        circle.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                imagelabel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        if (original != null) {
                            Imgproc.circle(src, new Point(e.getX(), e.getY()), 20, new Scalar(255, 0, 0), 10);
                            BufferedImage img = getImage(src);
                            imagelabel.setIcon(new ImageIcon((Image) img));
                        }
                    }

                });

            }

        });
        edge.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        setVisible(true);
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public String getSelection(ButtonGroup buttongroup_) {
        for (Enumeration<AbstractButton> button = buttongroup_.getElements(); buttongroup_.getElements().hasMoreElements();) {
            AbstractButton buttons = button.nextElement();
            if (buttons.isSelected()) {
                return buttons.getText();
            }

        }
        return "";
    }

    public void updateImage(BufferedImage im) {

        imagelabel.setIcon(new ImageIcon((Image) im));

    }

    public void onCall() {
        src = Imgcodecs.imread(filename);
        original = Imgcodecs.imread(filename);
        des = new Mat(src.rows(), src.cols(), src.type());
        BufferedImage img = getImage(src);
        imagelabel.setIcon(new ImageIcon((Image) img));
    }

    public BufferedImage getImage(Mat m) {
        BufferedImage img = new BufferedImage(m.width(), m.height(), BufferedImage.TYPE_3BYTE_BGR);
        DataBufferByte bytedata = (DataBufferByte) img.getRaster().getDataBuffer();
        byte b[] = bytedata.getData();
        m.get(0, 0, b);
        return img;
    }
}
