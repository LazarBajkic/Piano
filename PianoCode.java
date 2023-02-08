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
    JButton tileMi=new JButton(whiteKey);
    JButton tileFa=new JButton(whiteKey);
    JButton tileSol=new JButton(whiteKey);
    JButton tileLa=new JButton(whiteKey);
    JButton tileSi=new JButton(whiteKey);
    
    PianoCode(){
        
        this.setSize(800,500);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        tileDo.setSize(100,150);
        tileDo.setFocusable(true);
        tileDo.addKeyListener(this);
        tileDo.setLocation(50,100);

        tileRe.setSize(100,150);
        tileRe.setFocusable(true);
        tileRe.addKeyListener(this);
        tileRe.setLocation(150,100);

        tileMi.setSize(100,150);
        tileMi.setFocusable(true);
        tileMi.addKeyListener(this);
        tileMi.setLocation(250,100);

        tileFa.setSize(100,150);
        tileFa.setFocusable(true);
        tileFa.addKeyListener(this);
        tileFa.setLocation(350,100);

        tileSol.setSize(100,150);
        tileSol.setFocusable(true);
        tileSol.addKeyListener(this);
        tileSol.setLocation(450,100);

        tileLa.setSize(100,150);
        tileLa.setFocusable(true);
        tileLa.addKeyListener(this);
        tileLa.setLocation(550,100);

        tileSi.setSize(100,150);
        tileSi.setFocusable(true);
        tileSi.addKeyListener(this);
        tileSi.setLocation(650,100);

        this.add(tileDo);
        this.add(tileRe);
        this.add(tileMi);
        this.add(tileFa);
        this.add(tileSol);
        this.add(tileLa);
        this.add(tileSi);

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
                break;
                case 's':
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
                    break;
                case 'd':
                try{
                    File file=new File("mi-80239.wav");
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
                    break;
                case 'f':
                try{
                    File file=new File("fa-78409.wav");
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
                    break;
                            case 'g':
                            try{
                                File file=new File("sol-101774.wav");
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
                                break;
                            case 'h':
                                try{
                                    File file=new File("la-80237.wav");
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
                                    break;
                                    case 'j':
                                    try{
                                        File file=new File("si-80238.wav");
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
                                        break;
        }
        
    }
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
}
