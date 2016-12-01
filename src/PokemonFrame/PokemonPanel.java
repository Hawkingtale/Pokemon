package PokemonFrame;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import pokemonController.PokemonController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Event;
import java.awt.Color;

public class PokemonPanel extends JPanel
{
	private PokemonController baseController;
	private ImageIcon pokemonIcon;
	private JButton updateButton;
	private SpringLayout baseLayout;
	private JComboBox pokedexSelector;
	private JLabel pokemonLabel;
	private JLabel healthLabel;
	private JLabel combatLabel;
	private JLabel speedLabe;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel advancedLevel;
	private JTextField healthField;
	private JTextField combatField;
	private JTextField speedField;
	private JTextField nameField;
	private JTextField numberField;
	private JTextArea advancedArea;
	private JButton pokemonButton;
	
	public PokemonPanel(PokemonController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.pokemonButton = new JButton("GOTTA CATCH THEM ALL");
		this.pokemonSelector = new JComboBox(new Strin [] {"Metagross","Bronzong","Aegislash","Gallade","Flygon"});
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.cyan);
		this.add(updateButton);
		this.add(pokemonLabel);
		this.add(healthLabel);
		
	}
	private void setupLayout()
	{
		
	}
	private void setupListeners()
	{
		
	}
}

