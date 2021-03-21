package ventana;

import java.awt.Color;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class ventana extends JFrame{

	public JPanel panel1;  //Creación del panel
	
		public ventana() {
		this.setSize(600,800); 		//Establecemos el tamaño de la ventana//
		setTitle("Calculadora");	//Titulo de la ventana//
		setLocationRelativeTo(null); //Hace que el panel se habra en medio de tu pantalla//
		
		//setLocation(500,200);		//Establecemos la posicion inicial de la ventana//
		//this.getContentPane().setBackground(Color.GREEN);		//Establecemos el color de fondo en la Ventana//
		
		
		this.iniciarComponentes();		//Iniciar//
		
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Cuando finalice el programa hace que no se siga ejecutando//
	}
	
	private void iniciarComponentes() {			
	this.colocarPaneles();			//iniciamos los metodos
	//this.colocarEtiqueta();
	this.colocarBotones();
	this.crearPantalla();
		
	}
	
	private void colocarPaneles() {

	panel1 = new JPanel(); // Creación panel
		
	panel1.setLayout(null); 			//Desactivamos el diseño
	this.getContentPane().add(panel1); 	//Agregamos el panel a la ventana
	panel1.setBackground(Color.gray);	//Cambiamos el color del panel//
	this.getContentPane().add(panel1); 	//Agregamos el panel a la ventana//
	}
	
	private void colocarBotones() {
		
		JLabel etiqueta = new JLabel();		//Creamos una Etiqueta de Texto//
		etiqueta.setText("hola");			//Insertamos el Texto//
		
		JButton botoncoma = new JButton(",");	//Inicializamos el Boton
		botoncoma.setBounds(340, 600, 100, 40);	//Decimos la posicion donde va a estar el boton
		//botoncoma.setBackground(Color.BLUE);	//Establecemos el color de fondo del boton
		panel1.add(botoncoma);					//Lo añadimos al panel
		
		JButton boton0 = new JButton("0");
		boton0.setBounds(200, 600, 100, 40);
		panel1.add(boton0);
		
		JButton boton1 = new JButton("1");
		boton1.setBounds(60, 530, 100, 40);
		panel1.add(boton1);

		JButton boton2 = new JButton("2");
		boton2.setBounds(200, 530, 100, 40);
		panel1.add(boton2);
		
		
		JButton boton3 = new JButton("3");
		boton3.setBounds(340, 530, 100, 40);
		panel1.add(boton3);
		
		JButton boton4 = new JButton("4");
		boton4.setBounds(60, 470, 100, 40);
		panel1.add(boton4);
		
		JButton boton5 = new JButton("5");
		boton5.setBounds(200, 470, 100, 40);
		panel1.add(boton5);
		
		JButton boton6 = new JButton("6");
		boton6.setBounds(340, 470, 100, 40);
		panel1.add(boton6);
		
		JButton boton7 = new JButton("7");
		boton7.setBounds(60, 410, 100, 40);
		panel1.add(boton7);
		
		JButton boton8 = new JButton("8");
		boton8.setBounds(200, 410, 100, 40);
		panel1.add(boton8);
		
		JButton boton9 = new JButton("9");
		boton9.setBounds(340, 410, 100, 40);
		panel1.add(boton9);
		
		JButton botonmas = new JButton("+");
		botonmas.setBounds(450, 600, 75, 40);
		panel1.add(botonmas);
		
		JButton botonmenos = new JButton("-");
		botonmenos.setBounds(450, 530, 75, 40);
		panel1.add(botonmenos);
		
		JButton botonmulti = new JButton("x");
		botonmulti.setBounds(450, 470, 75, 40);
		panel1.add(botonmulti);
		
		JButton botondivision = new JButton("/");
		botondivision.setBounds(450, 410, 75, 40);
		panel1.add(botondivision);
		
		JButton botonborrar = new JButton("C");
		botonborrar.setBounds(450, 350, 75, 40);
		panel1.add(botonborrar);
		
		JButton botonigual = new JButton("=");
		botonigual.setBounds(450, 290, 75, 40);
		panel1.add(botonigual);
		
		
		
		
		
	}
	
	private void crearPantalla() {
		
		TextField Pantalla = new TextField(); 	//Creamos la pantalla de la calculadora
		Pantalla.setBounds(80, 290, 350, 70);	//Le decimos las medidas que debe tener, y la posicion
		panel1.add(Pantalla);					//Añadimos al panel	
		
				
		
		
	}
	
	public static int suma(int a, int b) {
		int suma ;
			
		
		return suma=a+b;
	}
	
	public static int Resta(int a, int b) {
		int Resta ;
			
		
		return Resta=a-b;
	}
	
	public static int multiplicacion(int a, int b) {
		int multiplicacion ;
			
		
		return multiplicacion=a*b;
	}
	
	public static int division(int a, int b) {
		int division ;
			
		
		return division=a/b;
	}
	
	// private void colocarEtiqueta() {
		
	//	JLabel etiqueta = new JLabel();		//Creamos una Etiqueta de Texto//
	//	etiqueta.setText("hola");		//Insertamos el Texto//
	//}
	
	
	
	
}


