package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * A class representing a list of notes using Note objects.
 */

public class NoteList implements Serializable
{
  private ArrayList<Note> notesList;


  /**
   * The one-argument constructor sets the attribute notesList to a notesList from the given ArrayList
   * @param notesList
   */
  public NoteList(ArrayList<Note> notesList)
  {
    this.notesList = notesList;
  }
  public NoteList()
  {
    this.notesList = new ArrayList<>();
  }
  public void addNote(Note note)
  {
    notesList.add(note);
  }
  public void removeNote(Note note)
  {
    notesList.remove(note);
  }
  public int size()
  {
    return notesList.size();
  }

  public ArrayList<Note> getAllNotes() {
    return notesList;
  }


  public NoteList addAll(NoteList otherList) {
    NoteList newList = new NoteList();
    newList.notesList.addAll(otherList.getAllNotes());
    return newList;
  }
  public void clear() {
    notesList.clear();
  }
  @Override
  public String toString() {
    return "NotesList{" +
        "notesList=" + notesList +
        '}';
  }
  public Note get(int index)
  {
    return notesList.get(index);
  }
}
