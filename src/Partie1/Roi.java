package Partie1;

public class Roi extends Piece{
	
	public Roi(String nom, String couleur)
	{
		super(nom, couleur);
	}
	
	public boolean estValide(Position depart, Position arrivee)
	{
		//Si le calcul de la norme() = 1 (d�placement vertical/horizontal) ou = 2 (d�placement diagonal)
		if (norme(depart, arrivee) == 1 || norme(depart, arrivee) == 2) 
			return true;
		else if(depart == arrivee) //�galement, on consid�re un d�placement nul ( depart = arrivee ) comme �tant VALIDE.
			return true;
		else 
			return false;
	}

}
