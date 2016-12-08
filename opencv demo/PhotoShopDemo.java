package TempWorkingDirectory;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;
import java.math.BigDecimal;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.KeyStroke;
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
        PhotoShop photoshop = new PhotoShop();
        photoshop.setVisible(true);
        photoshop.setSize(600, 600);
        photoshop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class PhotoShop extends javax.swing.JFrame {

    int no_of_count = 0;
    JLabel imagelabel;
    JButton edge;
    JSlider slider, slider_x, slider_y;
    Mat src, des, original;
    String filename;
    JRadioButton guassian_blur, median_blur, box_blur;
    ButtonGroup buttongroup;
    File file;
    JMenuBar bar;
    JMenuItem upload, reset, clear, blur, circle, erosion, dilation;
    JMenu menu, filter, morph;
    //constructor where all elements are added

    public PhotoShop() {
        imagelabel = new JLabel();
        guassian_blur = new JRadioButton("Gauassian Blur");
        median_blur = new JRadioButton("Meddian Blur");
        box_blur = new JRadioButton("Box Blur");
        slider = new JSlider(JSlider.HORIZONTAL, 0, 20, 0);
        slider_x = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
        slider_y = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
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
        //Menu Setting 
        bar = new JMenuBar();
        //main menu
        menu = new JMenu("File");

        filter = new JMenu("Filter");
        morph = new JMenu("Morphology");
        // menu item
        upload = new JMenuItem("upload");
        reset = new JMenuItem("Reset");
        clear = new JMenuItem("clear");
        blur = new JMenuItem("blur");
        circle = new JMenuItem("Circle");
        erosion = new JMenuItem("Erosion");
        dilation = new JMenuItem("Dilation");
        morph.add(erosion);
        morph.add(dilation);

        //setting shortcut keys
        upload.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        reset.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_DOWN_MASK));
        blur.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_DOWN_MASK));

        filter.add(blur);
        menu.add(upload);
        menu.add(reset);
        menu.add(clear);
        bar.add(menu);
        bar.add(filter);
        bar.add(morph);
        setJMenuBar(bar);
        setLayout(new FlowLayout());
        //adding all to frame
        add(imagelabel);
        add(slider);
        add(slider_x);
        add(slider_y);
        add(median_blur);
        add(guassian_blur);
        add(box_blur);
        erosion.addActionListener(new ActionListener(){
            @Override 
            public void actionPerformed(ActionEvent event){
                if(src==null){
                    JOptionPane.showMessageDialog(rootPane, "Erosion is called \n.Upload Some Image"); 
                }
                else {
                    Imgproc.erode(src, des, new Mat());
                    BufferedImage img = getImage(des);
                    imagelabel.setIcon(new ImageIcon((Image)img));
                }
              
            }
        });
        dilation.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(src==null){
                    JOptionPane.showMessageDialog(rootPane, "Dilation is called \n.Upload Some Image"); 
                }
                else {
                    Imgproc.dilate(src, des, new Mat());
                    BufferedImage img = getImage(des);
                    imagelabel.setIcon(new ImageIcon((Image)img));
                }
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

            }

        });
        blur.addActionListener(new ActionListener() {
            double elapsed;
            BigDecimal big = new BigDecimal(elapsed);

            @Override
            public void actionPerformed(ActionEvent event) {

                BufferedImage img;
                if (src != null && des != null) {
                    if (slider.getValue() != 0) {
                        String selected = getSelection(buttongroup);
                        double t0 = Core.getTickCount();
                        switch (selected) {
                            case "Gauassian Blur":
                                slider_x.setVisible(true);
                                slider_y.setVisible(true);
                                Imgproc.GaussianBlur(src, des, new Size(slider.getValue(), slider.getValue()), slider_x.getValue(), slider_y.getValue());
                                img = getImage(des);
                                updateImage(img);
                                break;
                            case "Meddian Blur":
                                if (slider_x.isVisible() && slider_y.isVisible()) {
                                    slider_x.setVisible(false);
                                    slider_y.setVisible(false);
                                }
                                Imgproc.medianBlur(src, des, slider.getValue());
                                img = getImage(des);
                                updateImage(img);
                                break;
                            case "Box Blur":
                                Imgproc.boxFilter(src, des, des.depth(), new Size(slider.getValue(), slider.getValue()));
                                img = getImage(des);
                                updateImage(img);
                                break;
                            default:
                                JOptionPane.showMessageDialog(rootPane, "Select one of the blur methods ");
                                break;
                        }
                        elapsed = ((double) Core.getTickCount() - t0) / Core.getTickFrequency();
                        JOptionPane.showMessageDialog(rootPane, "Seconds " + big.setScale(4, BigDecimal.ROUND_FLOOR));
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Sorry Slider Value Cant Be Zero");
                    }

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Upload Some Image");
                }

            }
        });
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (!(filename.isEmpty())) {
                    onCall();
                    slider.setValue(0);
                    slider_x.setVisible(false);
                    slider_y.setVisible(false);
                    slider_x.setValue(0);
                    slider_y.setValue(0);
                    buttongroup.clearSelection();
                } else {

                    if (getCheck() && !getSelection(buttongroup).equals("null")) {
                        buttongroup.clearSelection();
                        slider.setValue(0);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "There is nothing to reset");
                    }

                }
            }
        });
        clear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                buttongroup.clearSelection();
                slider.setValue(0);
                if (slider_x.isVisible() && slider_y.isVisible()) {
                    slider_x.setValue(0);
                    slider_y.setValue(0);
                }
            }

        });
        circle.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (original == null) {
                    JOptionPane.showMessageDialog(rootPane, "First Upload The Image");
                }
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

    }

    public String getSelection(ButtonGroup buttongroup_) {
        String select = "null";
        try {
            Enumeration<AbstractButton> b = buttongroup_.getElements();
            while (b.hasMoreElements()) {
                AbstractButton buttons = b.nextElement();
                if (buttons.isSelected()) {
                    return buttons.getText();
                }
            }

        } catch (NoSuchElementException ex) {

        }
        return select;
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

    public boolean getCheck() {
        return filename.isEmpty();
    }

    //Converting Mat object to image 
    public BufferedImage getImage(Mat mat) {
        BufferedImage image;
        Mat des_ = new Mat();
        Size s = new Size(640, 480);
        int type;
        if (mat.channels() == 1) {
            type = BufferedImage.TYPE_BYTE_GRAY;
        } else {
            type = BufferedImage.TYPE_3BYTE_BGR;
        }
        if (mat.height() > 640 && mat.width() > 480) {
            Imgproc.resize(mat, des_, s);
            Imgcodecs.imwrite("katt.jpg", des_);

        }
        image = new BufferedImage(mat.width(), mat.height(), type);
        WritableRaster raster = image.getRaster();
        DataBufferByte dataBuffer = (DataBufferByte) raster.getDataBuffer();
        byte[] data = dataBuffer.getData();
        mat.get(0, 0, data);
        return image;
    }
}
