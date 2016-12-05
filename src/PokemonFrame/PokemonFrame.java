package PokemonFrame;

import javax.swing.*;

import pokemonController.PokemonModel;
import pokemonController.PokemonController;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PokemonFrame extends JFrame
{
	private PokemonController baseController;
	private PokemonPanel appPanel;
	{
		private PokemonController baseController;
		private PokemonPanel appPanel;
		
		PokemonFrame(pokemonController baseController)
		{
			super();
			this.baseController= baseController;
			this.appPanel = new PokemonPanel(baseController);
			
			this.setupFrame();
			
		}
		private void setupFrame()
		{
			this.setContentPane(appPanel);
			this.setTitle("POKEMON");
			this.setSize(new Dimension(900, 600));
			this.setLocationRelativeTo(null);
			this.setVisible(true);
		}
	}
	
}
