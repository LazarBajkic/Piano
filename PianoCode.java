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
    ImageIcon blackKey=new ImageIcon("BlackKey.png");
    JButton tileDo=new JButton(whiteKey);
    JButton tileRe=new JButton(whiteKey);
    JButton tileMi=new JButton(whiteKey);
    JButton tileFa=new JButton(whiteKey);
    JButton tileSol=new JButton(whiteKey);
    JButton tileLa=new JButton(whiteKey);
    JButton tileSi=new JButton(whiteKey);
    JButton fMinor=new JButton(blackKey);
    JButton gMinor=new JButton(blackKey);
    JButton aMinor=new JButton(blackKey);
    JButton cMinor=new JButton(blackKey);
    JButton dMinor=new JButton(blackKey);
    
    PianoCode(){
        
        this.setSize(800,500);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        fMinor.setSize(40,125);
        fMinor.setFocusable(true);
        fMinor.addKeyListener(this);
        fMinor.setLocation(90,100);
        
        gMinor.setSize(40,125);
        gMinor.setFocusable(true);
        gMinor.addKeyListener(this);
        gMinor.setLocation(150,100);
        
        aMinor.setSize(40,125);
        aMinor.setFocusable(true);
        aMinor.addKeyListener(this);
        aMinor.setLocation(210,100);

        cMinor.setSize(40,125);
        cMinor.setFocusable(true);
        cMinor.addKeyListener(this);
        cMinor.setLocation(330,100);
        
        dMinor.setSize(40,125);
        dMinor.setFocusable(true);
        dMinor.addKeyListener(this);
        dMinor.setLocation(390,100);

        tileDo.setSize(60,200);
        tileDo.setFocusable(true);
        tileDo.addKeyListener(this);
        tileDo.setLocation(50,100);

        tileRe.setSize(60,200);
        tileRe.setFocusable(true);
        tileRe.addKeyListener(this);
        tileRe.setLocation(110,100);

        tileMi.setSize(60,200);
        tileMi.setFocusable(true);
        tileMi.addKeyListener(this);
        tileMi.setLocation(170,100);

        tileFa.setSize(60,200);
        tileFa.setFocusable(true);
        tileFa.addKeyListener(this);
        tileFa.setLocation(230,100);

        tileSol.setSize(60,200);
        tileSol.setFocusable(true);
        tileSol.addKeyListener(this);
        tileSol.setLocation(290,100);

        tileLa.setSize(60,200);
        tileLa.setFocusable(true);
        tileLa.addKeyListener(this);
        tileLa.setLocation(350,100);

        tileSi.setSize(60,200);
        tileSi.setFocusable(true);
        tileSi.addKeyListener(this);
        tileSi.setLocation(410,100);

        this.add(fMinor);
        this.add(gMinor);
        this.add(aMinor);
        this.add(cMinor);
        this.add(dMinor);
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

                    case 'w':
                    try{
                        File file=new File("F#.wav");
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

                    case 'e':
                    try{
                        File file=new File("G#.wav");
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

                    case 'r':
                    try{
                        File file=new File("A#.wav");
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

                    case 't':
                    try{
                        File file=new File("C#.wav");
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
                    
                    case 'y':
                    try{
                        File file=new File("D#.wav");
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
