package PokemonFrame;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SpringLayout;

import pokemonController.PokemonController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Event;
import java.awt.Color;

public class PokemonFrame extends JPanel
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
	
	public PokemonPanel(PokeController baseController)

	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.pokeButton = new JButton("GOTTA CATCH THEM ALL");
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this
	}
}

