import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

public class PianoCode extends JFrame implements KeyListener{

    ImageIcon whiteKey=new ImageIcon("WhiteKey.png");
    JButton tileDo=new JButton(whiteKey);
    JButton tileRe=new JButton(whiteKey);
    
    PianoCode(){
        
        this.setSize(500,500);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        tileDo.setSize(100,150);
        tileDo.setFocusable(true);
        tileDo.addKeyListener(this);
        tileDo.setLocation(100,100);

        tileRe.setSize(100,150);
        tileRe.setFocusable(true);
        tileRe.addKeyListener(this);
        tileRe.setLocation(150,100);

        this.add(tileDo);
        this.add(tileRe);

    }
    public void KeyPressed(KeyEvent e){

    }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        switch(e.getKeyChar()){
            case 'a':
            try{
                File file1=new File("do-80236.wav");
                AudioInputStream audiostream1=AudioSystem.getAudioInputStream(file1);
                Clip clip1=AudioSystem.getClip();
                clip1.open(audiostream1);
                clip1.start();
                }catch(LineUnavailableException e1){
                    e1.printStackTrace();
                }catch(IOException e1){
                    e1.printStackTrace();
                }catch(UnsupportedAudioFileException e1){
                    e1.printStackTrace();
                }
                case 'd':
                try{
                    File file=new File("re-78500.wav");
                    AudioInputStream audiostream=AudioSystem.getAudioInputStream(file);
                    Clip clip=AudioSystem.getClip();
                    clip.open(audiostream);
                    clip.start();
                    }catch(LineUnavailableException e1){
                        e1.printStackTrace();
                    }catch(IOException e1){
                        e1.printStackTrace();
                    }catch(UnsupportedAudioFileException e1){
                        e1.printStackTrace();
                    }
        }
        
    }
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
}
