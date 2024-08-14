package javarevisao;

import java.util.ArrayList;
import java.util.Arrays;

public class disciplinas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]disciplinas = {"matemática", "filosofia", "história", "fisíca"};
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
		novaLista.add("geografia");
		novaLista.add("língua portuguesa");

		for (String i: novaLista)
		{
			System.out.println("Disciplinas: " + i);
		}
	}

}
