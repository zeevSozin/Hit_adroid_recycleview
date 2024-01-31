package hit.androiscourse.recycleview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import hit.androiscourse.recycleview.dao.Character;

public class CharacterData {
    private ArrayList<Character> characters;

    public CharacterData(){
        characters = new ArrayList<Character>();
        characters.add(new Character("Walter White","Chemistry teacher turned methamphetamine manufacturer.", R.drawable.walter_white));
        characters.add(new Character("Jesse Pinkman","Former student of Walter White, involved in the drug trade.", R.drawable.jesse_pinkman));
        characters.add(new Character("Hank Schrader","DEA agent and brother-in-law to Walter White.", R.drawable.hank_schrader));
        characters.add(new Character("Skyler White","Walter White's wife, who becomes entangled in his criminal activities.", R.drawable.skyler_white));
        characters.add(new Character("Saul Goodman","Criminal lawyer known for his colorful personality and morally ambiguous legal tactics.", R.drawable.saul_goodman));
        characters.add(new Character("Gus Fring","Methamphetamine distributor with a legitimate front as a fast-food restaurant owner.", R.drawable.gus_fring));
        characters.add(new Character("Mike Ehrmantraut","Enforcer and fixer for Gus Fring, with a mysterious past.", R.drawable.mike_ehrmantraut));
        characters.add(new Character("Walter White Jr.","Walter and Skyler White's teenage son, who has cerebral palsy.", R.drawable.walter_white_jr));
        characters.add(new Character("Marie Schrader","Skyler White's sister, known for her love of the color purple.", R.drawable.marie_schrader));
        characters.add(new Character("Jane Margolis","Jesse Pinkman's girlfriend with a troubled past.", R.drawable.jane_margolis));
        characters.add(new Character("Tuco Salamanca","Violent and unpredictable drug dealer.", R.drawable.tuco_salamanca));
        characters.add(new Character("Gale Boetticher","Chemist and associate of Gus Fring.", R.drawable.gale_boetticher));
        characters.add(new Character("Skinny Pete","Jesse Pinkman's friends and low-level associates in the drug trade.", R.drawable.skinny_pete));
        characters.add(new Character("Hector Salamanca","Elderly, wheelchair-bound former cartel enforcer.", R.drawable.hector_salamanca));
        characters.add(new Character("Lydia Rodarte-Quayle","Madrigal executive and later a business associate in the meth trade.", R.drawable.lydia_rodarte));
        characters.add(new Character("Huell Babineaux ","Saul Goodman's bodyguard and assistant.", R.drawable.huell_babineaux));
        characters.add(new Character("Todd Alquist","Lab assistant with a dark side.", R.drawable.todd_alquist));

    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }
}
