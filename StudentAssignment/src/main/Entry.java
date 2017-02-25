package main;

import com.synerzip.handler.SmartMouseHandler;
import com.synerzip.handler.SmartWindowHandler;
import com.synerzip.view.StudentForm;

// TODO: Auto-generated Javadoc
/**
 * The Class Entry.
 */
public class Entry {

  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {

    StudentForm studentform = new StudentForm();
    studentform.addWindowListener(new SmartWindowHandler());
    studentform.addMouseListener(new SmartMouseHandler());
  }
}