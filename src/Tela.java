import javax.swing.*;
import javafx.embed.swing.JFXPanel;
import javafx.scene.*;
import javafx.scene.media.*;
import javafx.scene.layout.StackPane;

import java.io.File;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela extends JFrame{
	
		JButton bt1;
		JButton bt2;
		JButton bt3;
		JButton bt4;
		JButton bt5;
		JButton bt6;
		JButton bt7;
		JButton bt8;
		JButton bt9;
		boolean rodada = true; 
		Inserir inserir = new Inserir();
		Validacao validar = new Validacao();
		
		public Tela () {
			
		this.setSize(700,600);
    	this.setTitle("Jogo das Velhas");
    	this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    	this.setLocationRelativeTo(null);
    	
    	this.setLayout(null);
    	this.setResizable(false);

    	JLabel titulo = new JLabel();
    	titulo.setBounds(240,15,250,45);
    	titulo.setText("Jogo das Velhas");
    	titulo.setFont(new Font("Arial", Font.BOLD, 30));
    	add(titulo);
    	
    	JLabel frase = new JLabel();
    	frase.setBounds(260,450,400,45);
    	frase.setText("SUA VEZ HOMOGENIC!");
    	frase.setFont(new Font("Arial", Font.BOLD, 20));
    	add(frase);
    	
    	
    	//Posições do Tabuleiro
    	bt1 = new JButton();
    	bt1.setBounds(210, 110, 80, 80);
    	
    	bt1.setOpaque(false);
    	bt1.setContentAreaFilled(false);
    	bt1.setBorderPainted(false);
    	bt1.setFocusPainted(false);
    	add(bt1);
    	
    	
    	bt2 = new JButton();
    	bt2.setBounds(310, 110, 80, 80);
    	
    	bt2.setOpaque(false);
    	bt2.setContentAreaFilled(false);
    	bt2.setBorderPainted(false);
    	bt2.setFocusPainted(false);
    	add(bt2);
    	
    	bt3 = new JButton();
    	bt3.setBounds(410, 110, 80, 80);
    
    	bt3.setOpaque(false);
    	bt3.setContentAreaFilled(false);
    	bt3.setBorderPainted(false);
    	bt3.setFocusPainted(false);
    	add(bt3);
    	
    	bt4 = new JButton();
    	bt4.setBounds(210, 210, 80, 80);
    
    	bt4.setOpaque(false);
    	bt4.setContentAreaFilled(false);
    	bt4.setBorderPainted(false);
    	bt4.setFocusPainted(false);
    	add(bt4);
    	
    	
    	bt5 = new JButton();
    	bt5.setBounds(310, 210, 80, 80);
    
    	bt5.setOpaque(false);
    	bt5.setContentAreaFilled(false);
    	bt5.setBorderPainted(false);
    	bt5.setFocusPainted(false);
    	add(bt5);
    	
    	
    	bt6 = new JButton();
    	bt6.setBounds(410, 210, 80, 80);
    
    	bt6.setOpaque(false);
    	bt6.setContentAreaFilled(false);
    	bt6.setBorderPainted(false);
    	bt6.setFocusPainted(false);
    	add(bt6);
    	
    	
    	bt7 = new JButton();
    	bt7.setBounds(210, 310, 80, 80);
    
    	bt7.setOpaque(false);
    	bt7.setContentAreaFilled(false);
    	bt7.setBorderPainted(false);
    	bt7.setFocusPainted(false);
    	add(bt7);
    	
    	bt8 = new JButton();
    	bt8.setBounds(310, 310, 80, 80);
    	
    	bt8.setOpaque(false);
    	bt8.setContentAreaFilled(false);
    	bt8.setBorderPainted(false);
    	bt8.setFocusPainted(false);
    	add(bt8);
    	
    	bt9 = new JButton();
    	bt9.setBounds(410, 310, 80, 80);
    
    	bt9.setOpaque(false);
    	bt9.setContentAreaFilled(false);
    	bt9.setBorderPainted(false);
    	bt9.setFocusPainted(false);
    	add(bt9);
    	
    	
    	//Imagens
    	
    	ImageIcon jogo = new ImageIcon(getClass().getResource("/assets/jogo.png"));
    	ImageIcon homogenic = new ImageIcon(getClass().getResource("/assets/homogenic.png"));
    	ImageIcon ray = new ImageIcon(getClass().getResource("/assets/ray.png"));
    	ImageIcon bola = new ImageIcon(getClass().getResource("/assets/excuseme.jpg"));
    	ImageIcon x = new ImageIcon(getClass().getResource("/assets/rayoflight.jpg"));
    	
    	
    	JLabel tabuleiro = new JLabel(jogo);
    	JLabel imagem = new JLabel(homogenic);
    	JLabel mad = new JLabel(ray);
    	
    	
    	tabuleiro.setBounds(200, 100, 300, 300);
    	add(tabuleiro);
    	
    	mad.setBounds(390, 100, 300, 300);
    	add(mad);
    	
    	imagem.setBounds(0, 100, 200, 300);
    	add(imagem);
    	
    	
    	
    	
    	this.setVisible(true);
    	
    	
    	
    	//Inserções
    	
    	bt1.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent event) {
    			
    			
    		if(rodada) {
    			
    			inserir.Player1(0,0);
    			
    			if(validar.ValidarO() == true) {
    				bt1.setVisible(false); 

    				Video video = new Video("assets/bjork.mp4",80,80);

    				video.setBounds(210, 110, 80, 80);

    				add(video);

    				repaint();

    			    
    				frase.setText("Parabéns Homogenic!");
    				bt1.setEnabled(false);
    				bt2.setEnabled(false);
    				bt3.setEnabled(false);
    				bt4.setEnabled(false);
    				bt5.setEnabled(false);
    				bt6.setEnabled(false);
    				bt7.setEnabled(false);
    				bt8.setEnabled(false);
    				bt9.setEnabled(false);
    			}else {
    				
	    			bt1.setIcon(bola);
	    			bt1.setDisabledIcon(bola);
	    			frase.setText("SUA VEZ RAY OF LIGHT!");
    			}
    			
    			
    		}else {
    			inserir.Player2(0, 0);
    			
    			if(validar.ValidarX() == true) {
    				Video video = new Video("assets/maddona.mp4",80,80);

    				video.setBounds(210, 110, 80, 80);

    				add(video);

    				repaint();
    				frase.setText("Parabéns Ray of Light!");
    				bt1.setEnabled(false);
    				bt2.setEnabled(false);
    				bt3.setEnabled(false);
    				bt4.setEnabled(false);
    				bt5.setEnabled(false);
    				bt6.setEnabled(false);
    				bt7.setEnabled(false);
    				bt8.setEnabled(false);
    				bt9.setEnabled(false);
    			}else {
    				bt1.setIcon(x);
        			bt1.setDisabledIcon(x);
        			frase.setText("SUA VEZ RAY OF LIGHT!");
    			}
    			
    		}
    		
    		bt1.setEnabled(false);
    		rodada = !rodada;
    	  }
    	}
      );
    	
    	bt2.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent event) {
    			
    			
    		if(rodada) {
    			inserir.Player1(0,1);
    			if(validar.ValidarO() == true) {
    				Video video = new Video("assets/bjork.mp4",80,80);

    				video.setBounds(310, 110, 80, 80);

    				add(video);

    				repaint();
    				frase.setText("Parabéns Homogenic!");
    				bt1.setEnabled(false);
    				bt2.setEnabled(false);
    				bt3.setEnabled(false);
    				bt4.setEnabled(false);
    				bt5.setEnabled(false);
    				bt6.setEnabled(false);
    				bt7.setEnabled(false);
    				bt8.setEnabled(false);
    				bt9.setEnabled(false);
    			}else {
    				
	    			bt2.setIcon(bola);
	    			bt2.setDisabledIcon(bola);
	    			frase.setText("SUA VEZ RAY OF LIGHT!");
    			}
    			
    		}else {
    			inserir.Player2(0, 1);
    			if(validar.ValidarX() == true) {
    				Video video = new Video("assets/maddona.mp4",80,80);

    				video.setBounds(310, 110, 80, 80);

    				add(video);

    				repaint();
    				frase.setText("Parabéns Ray of Light!");
    				bt1.setEnabled(false);
    				bt2.setEnabled(false);
    				bt3.setEnabled(false);
    				bt4.setEnabled(false);
    				bt5.setEnabled(false);
    				bt6.setEnabled(false);
    				bt7.setEnabled(false);
    				bt8.setEnabled(false);
    				bt9.setEnabled(false);
    			}else {
    				bt2.setIcon(x);
        			bt2.setDisabledIcon(x);
        			frase.setText("SUA VEZ HOMOGENIC!");
    			}
    		}
    		
    		bt2.setEnabled(false);
    		rodada = !rodada;
    	  }
    	}
      );
    	
    	bt3.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent event) {
    			
    			
    		if(rodada) {
    			inserir.Player1(0,2);
    			if(validar.ValidarO() == true) {
    				Video video = new Video("assets/bjork.mp4",80,80);

    				video.setBounds(410, 110, 80, 80);

    				add(video);

    				repaint();
    				frase.setText("Parabéns Homogenic!");
    				bt1.setEnabled(false);
    				bt2.setEnabled(false);
    				bt3.setEnabled(false);
    				bt4.setEnabled(false);
    				bt5.setEnabled(false);
    				bt6.setEnabled(false);
    				bt7.setEnabled(false);
    				bt8.setEnabled(false);
    				bt9.setEnabled(false);
    			}else {
    				
	    			bt3.setIcon(bola);
	    			bt3.setDisabledIcon(bola);
	    			frase.setText("SUA VEZ RAY OF LIGHT!");
    			}
    			
    		}else {
    			inserir.Player2(0, 2);
    			if(validar.ValidarX() == true) {
    				Video video = new Video("assets/maddona.mp4",80,80);

    				video.setBounds(410, 110, 80, 80);

    				add(video);

    				repaint();
    				frase.setText("Parabéns Ray of Light!");
    				bt1.setEnabled(false);
    				bt2.setEnabled(false);
    				bt3.setEnabled(false);
    				bt4.setEnabled(false);
    				bt5.setEnabled(false);
    				bt6.setEnabled(false);
    				bt7.setEnabled(false);
    				bt8.setEnabled(false);
    				bt9.setEnabled(false);
    			}else {
    				bt3.setIcon(x);
        			bt3.setDisabledIcon(x);
        			frase.setText("SUA VEZ HOMOGENIC!");
    			}
    		}
    		
    		bt3.setEnabled(false);
    		rodada = !rodada;
    	  }
    	}
      );
    	
    	bt4.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent event) {
    			
    			
    		if(rodada) {
    			inserir.Player1(1,0);
    			if(validar.ValidarO() == true) {
    				Video video = new Video("assets/bjork.mp4",80,80);

    				video.setBounds(210, 210, 80, 80);

    				add(video);

    				repaint();
    				frase.setText("Parabéns Homogenic!");
    				bt1.setEnabled(false);
    				bt2.setEnabled(false);
    				bt3.setEnabled(false);
    				bt4.setEnabled(false);
    				bt5.setEnabled(false);
    				bt6.setEnabled(false);
    				bt7.setEnabled(false);
    				bt8.setEnabled(false);
    				bt9.setEnabled(false);
    			}else {
    				
	    			bt4.setIcon(bola);
	    			bt4.setDisabledIcon(bola);
	    			frase.setText("SUA VEZ RAY OF LIGHT!");
    			}
    			
    		}else {
    			inserir.Player2(1, 0);
    			if(validar.ValidarX() == true) {
    				Video video = new Video("assets/maddona.mp4",80,80);

    				video.setBounds(210, 210, 80, 80);

    				add(video);

    				repaint();
    				frase.setText("Parabéns Ray of Light!");
    				bt1.setEnabled(false);
    				bt2.setEnabled(false);
    				bt3.setEnabled(false);
    				bt4.setEnabled(false);
    				bt5.setEnabled(false);
    				bt6.setEnabled(false);
    				bt7.setEnabled(false);
    				bt8.setEnabled(false);
    				bt9.setEnabled(false);
    			}else {
    				bt4.setIcon(x);
        			bt4.setDisabledIcon(x);
        			frase.setText("SUA VEZ HOMOGENIC!");
    			}
    		}
    		
    		bt4.setEnabled(false);
    		rodada = !rodada;
    	  }
    	}
      );
    	
    	bt5.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent event) {
    			
    			
    		if(rodada) {
    			inserir.Player1(1,1);
    			if(validar.ValidarO() == true) {
    				Video video = new Video("assets/bjork.mp4",80,80);

    				video.setBounds(310, 210, 80, 80);

    				add(video);

    				repaint();
    				frase.setText("Parabéns Homogenic!");
    				bt1.setEnabled(false);
    				bt2.setEnabled(false);
    				bt3.setEnabled(false);
    				bt4.setEnabled(false);
    				bt5.setEnabled(false);
    				bt6.setEnabled(false);
    				bt7.setEnabled(false);
    				bt8.setEnabled(false);
    				bt9.setEnabled(false);
    			}else {
    				
	    			bt5.setIcon(bola);
	    			bt5.setDisabledIcon(bola);
	    			frase.setText("SUA VEZ RAY OF LIGHT!");
    			}
    			
    		}else {
    			inserir.Player2(1, 1);
    			if(validar.ValidarX() == true) {
    				Video video = new Video("assets/maddona.mp4",80,80);

    				video.setBounds(410, 210, 80, 80);

    				add(video);

    				repaint();
    				frase.setText("Parabéns Ray of Light!");
    				bt1.setEnabled(false);
    				bt2.setEnabled(false);
    				bt3.setEnabled(false);
    				bt4.setEnabled(false);
    				bt5.setEnabled(false);
    				bt6.setEnabled(false);
    				bt7.setEnabled(false);
    				bt8.setEnabled(false);
    				bt9.setEnabled(false);
    			}else {
    				bt5.setIcon(x);
        			bt5.setDisabledIcon(x);
        			frase.setText("SUA VEZ HOMOGENIC!");
    			}
    		}
    		
    		bt5.setEnabled(false);
    		rodada = !rodada;
    	  }
    	}
      );
    	
    	
    	bt6.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent event) {
    			
    			
    		if(rodada) {
    			inserir.Player1(1,2);
    			if(validar.ValidarO() == true) {
    				Video video = new Video("assets/bjork.mp4",80,80);

    				video.setBounds(410, 210, 80, 80);

    				add(video);

    				repaint();
    				frase.setText("Parabéns Homogenic!");
    				bt1.setEnabled(false);
    				bt2.setEnabled(false);
    				bt3.setEnabled(false);
    				bt4.setEnabled(false);
    				bt5.setEnabled(false);
    				bt6.setEnabled(false);
    				bt7.setEnabled(false);
    				bt8.setEnabled(false);
    				bt9.setEnabled(false);
    			}else {
    				
	    			bt6.setIcon(bola);
	    			bt6.setDisabledIcon(bola);
	    			frase.setText("SUA VEZ RAY OF LIGHT!");
    			}
    			
    		}else {
    			inserir.Player2(1, 2);
    			if(validar.ValidarX() == true) {
    				Video video = new Video("assets/maddona.mp4",80,80);

    				video.setBounds(410, 210, 80, 80);

    				add(video);

    				repaint();
    				frase.setText("Parabéns Ray of Light!");
    				bt1.setEnabled(false);
    				bt2.setEnabled(false);
    				bt3.setEnabled(false);
    				bt4.setEnabled(false);
    				bt5.setEnabled(false);
    				bt6.setEnabled(false);
    				bt7.setEnabled(false);
    				bt8.setEnabled(false);
    				bt9.setEnabled(false);
    			}else {
    				bt6.setIcon(x);
        			bt6.setDisabledIcon(x);
        			frase.setText("SUA VEZ HOMOGENIC!");
    			}
    		}
    		
    		bt6.setEnabled(false);
    		rodada = !rodada;
    	  }
    	}
      );
    	
    	
    	bt7.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent event) {
    			
    			
    		if(rodada) {
    			inserir.Player1(2,0);
    			if(validar.ValidarO() == true) {
    				Video video = new Video("assets/bjork.mp4",80,80);

    				video.setBounds(210, 310, 80, 80);

    				add(video);

    				repaint();
    				frase.setText("Parabéns Homogenic!");
    				bt1.setEnabled(false);
    				bt2.setEnabled(false);
    				bt3.setEnabled(false);
    				bt4.setEnabled(false);
    				bt5.setEnabled(false);
    				bt6.setEnabled(false);
    				bt7.setEnabled(false);
    				bt8.setEnabled(false);
    				bt9.setEnabled(false);
    			}else {
    				
	    			bt7.setIcon(bola);
	    			bt7.setDisabledIcon(bola);
	    			frase.setText("SUA VEZ RAY OF LIGHT!");
    			}
    			
    		}else {
    			inserir.Player2(2, 0);
    			if(validar.ValidarX() == true) {
    				Video video = new Video("assets/maddona.mp4",80,80);

    				video.setBounds(210, 310, 80, 80);

    				add(video);

    				repaint();
    				frase.setText("Parabéns Ray of Light!");
    				bt1.setEnabled(false);
    				bt2.setEnabled(false);
    				bt3.setEnabled(false);
    				bt4.setEnabled(false);
    				bt5.setEnabled(false);
    				bt6.setEnabled(false);
    				bt7.setEnabled(false);
    				bt8.setEnabled(false);
    				bt9.setEnabled(false);
    			}else {
    				bt7.setIcon(x);
        			bt7.setDisabledIcon(x);
        			frase.setText("SUA VEZ HOMOGENIC!");
    			}
    		}
    		
    		bt7.setEnabled(false);
    		rodada = !rodada;
    	  }
    	}
      );
    	
    	
    	bt8.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent event) {
    			
    			
    		if(rodada) {
    			inserir.Player1(2,1);
    			if(validar.ValidarO() == true) {
    				Video video = new Video("assets/bjork.mp4",80,80);

    				video.setBounds(310, 310, 80, 80);

    				add(video);

    				repaint();
    				frase.setText("Parabéns Homogenic!");
    				bt1.setEnabled(false);
    				bt2.setEnabled(false);
    				bt3.setEnabled(false);
    				bt4.setEnabled(false);
    				bt5.setEnabled(false);
    				bt6.setEnabled(false);
    				bt7.setEnabled(false);
    				bt8.setEnabled(false);
    				bt9.setEnabled(false);
    			}else {
    				
	    			bt8.setIcon(bola);
	    			bt8.setDisabledIcon(bola);
	    			frase.setText("SUA VEZ RAY OF LIGHT!");
    			}
    			
    		}else {
    			inserir.Player2(2, 1);
    			if(validar.ValidarX() == true) {
    				Video video = new Video("assets/maddona.mp4",80,80);

    				video.setBounds(310, 310, 80, 80);

    				add(video);

    				repaint();
    				frase.setText("Parabéns Ray of Light!");
    				bt1.setEnabled(false);
    				bt2.setEnabled(false);
    				bt3.setEnabled(false);
    				bt4.setEnabled(false);
    				bt5.setEnabled(false);
    				bt6.setEnabled(false);
    				bt7.setEnabled(false);
    				bt8.setEnabled(false);
    				bt9.setEnabled(false);
    			}else {
    				bt8.setIcon(x);
        			bt8.setDisabledIcon(x);
        			frase.setText("SUA VEZ HOMOGENIC!");
    			}
    		}
    		
    		bt8.setEnabled(false);
    		rodada = !rodada;
    	  }
    	}
      );
    	
    	
    	bt9.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent event) {
    			
    			
    		if(rodada) {
    			inserir.Player1(2,2);
    			if(validar.ValidarO() == true) {
    				Video video = new Video("assets/bjork.mp4",80,80);

    				video.setBounds(410, 310, 80, 80);

    				add(video);

    				repaint();
    				frase.setText("Parabéns Homogenic!");
    				bt1.setEnabled(false);
    				bt2.setEnabled(false);
    				bt3.setEnabled(false);
    				bt4.setEnabled(false);
    				bt5.setEnabled(false);
    				bt6.setEnabled(false);
    				bt7.setEnabled(false);
    				bt8.setEnabled(false);
    				bt9.setEnabled(false);
    			}else {
    				
	    			bt9.setIcon(bola);
	    			bt9.setDisabledIcon(bola);
	    			frase.setText("SUA VEZ RAY OF LIGHT!");
    			}
    			
    		}else {
    			inserir.Player2(2, 2);
    			if(validar.ValidarX() == true) {
    				Video video = new Video("assets/maddona.mp4",80,80);

    				video.setBounds(410, 310, 80, 80);

    				add(video);

    				repaint();
    				frase.setText("Parabéns Ray of Light!");
    				bt1.setEnabled(false);
    				bt2.setEnabled(false);
    				bt3.setEnabled(false);
    				bt4.setEnabled(false);
    				bt5.setEnabled(false);
    				bt6.setEnabled(false);
    				bt7.setEnabled(false);
    				bt8.setEnabled(false);
    				bt9.setEnabled(false);
    			}else {
    				bt9.setIcon(x);
        			bt9.setDisabledIcon(x);
        			frase.setText("SUA VEZ HOMOGENIC!");
    			}
    		}
    		
    		bt9.setEnabled(false);
    		rodada = !rodada;
    	  }
    	}
      );
    
	}

}
