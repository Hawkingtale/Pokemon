package PokemonView;

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
	private JLabel speedLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel advancedLabel;
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
		this.pokemonIcon = new ImageIcon(getClass().getResource(""));
		this.pokemonButton = new JButton("GOTTA CATCH THEM ALL");
		this.pokedexSelector = new JComboBox(new String [] {"Metagross","Bronzong","Aegislash","Gallade","Flygon"});
		this.pokemonLabel = new JLabel("the current pokemon is," pokemonIcon, JLabel.CENTER);
		this.healthLabel = new JLabel("");
		this.combatLabel = new JLabel("");
		this.speedLabel = new JLabel("");
		this.nameLabel = new JLabel("");
		this.numberLabel = new JLabel("");
		this.advancedLabel = new JLabel("");
		this.healthField = new JTextField(5);
		this.combatField = new JTextField(5);
		this.speedField = new JTextField(5);
		this.nameField = new JTextField(25);
		this.numberField = new JTextField(5);
		this.advancedArea = new JTextArea(10,25);
		
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
		pokedexSelector.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selected = pokedexSelector.getSelectedIndex();
				nameField.setText(baseController.getPokedex().get(selected).getName())
				numberField.setText(baseController.getPokedex().get(selected).getNumber() + "");
				combatField.setText(baseController.getPokedex().get(selected).getAttackPoints() + "");
				speedField.setText(baseController.getPokedex().get(selected).getSpeed() +"");
				healthField.setText(baseController.getPokedex().getselected).getPokemonInformation()
						+"\n\n" + baseController.getPokedex().get(selected).getPokemonTypes());
				changeColorBasedOnData(baseController.getPokedex().get(selected).getPokemonTypes);
				changeImageDisplay(baseController.getPokedex().get(selected).getClass().getSimpleName());
			});

		}
	}
}

