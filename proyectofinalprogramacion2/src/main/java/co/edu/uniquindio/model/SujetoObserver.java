package co.edu.uniquindio.model;

import java.util.ArrayList;
import java.util.List;

public class SujetoObserver {
    private List<Observer> observers = new ArrayList<>();

    public void agregarObservador(Observer observer){
        observers.add(observer);
    }

    public void eliminarObservador(Observer observer){
        observers.remove(observer);
    }

    public void notificarObservador(Observer observer){
        for (Observer obs : observers){
            obs.update();
        }
    }
}