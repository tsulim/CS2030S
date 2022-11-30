/**
 * The Immutator interface that can transform 
 * to type T2, an object of type T1.
 * Contains a single abstract method invoke.
 * CS2030S Lab 4
 * AY22/23 Semester 1
 * @author Lim Xiu Jia (Lab 12A)
 */

package cs2030s.fp; // Placess the java file into the Package

public abstract interface Immutator<S, T> {
  public abstract S invoke(T input);
}
