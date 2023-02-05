package edu.ntnu.idatt2001.lectures.interfaces.defaultmethod;

import edu.ntnu.idatt2001.lectures.interfaces.animal.Moveable;

public interface Flyable extends Moveable {
  
  //Old method
  default boolean canFly() {
    return true;
  }

  //new method
  boolean canFly(String name);

}
