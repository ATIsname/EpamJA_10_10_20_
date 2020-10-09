package training.Collections;

import java.util.ArrayList;
import java.util.List;

public class Chef {
    private int idOfChef;
    private String nameOfChef;
    private ArrayList<Salad> listOfSaladsToDo;

    public Chef(int idOfChef, String nameOfChef) {
        setIdOfChef(idOfChef);
        setNameOfChef(nameOfChef);
        listOfSaladsToDo = new ArrayList<Salad>();
    }

    public int getIdOfChef() {
        return idOfChef;
    }

    public void setIdOfChef(int idOfChef) {
        if (idOfChef > 0) {
            this.idOfChef = idOfChef;
        } else {
            throw new RuntimeException("Variables cannot take in an value less then 1 for the \"idOfChef\"");
        }
    }

    public List<Salad> getListOfDishesToDo() {
        return listOfSaladsToDo;
    }

    public void setListOfSaladsToDoToDo(ArrayList<Salad> listOfDishesToDo) {
        this.listOfSaladsToDo = listOfDishesToDo;
    }

    public String getNameOfChef() {
        return nameOfChef;
    }

    public void setNameOfChef(String nameOfChef) {
        if (!nameOfChef.isEmpty()) {
            this.nameOfChef = nameOfChef.substring(0, 1).toUpperCase() + nameOfChef.substring(1).toLowerCase();
        } else {
            throw new RuntimeException("Variables cannot take in an empty String or null value for the \"name\"");
        }

    }

    public void MakeSalad(Salad salad) {
        listOfSaladsToDo.add(salad);
    }

    public void ShowListOfSaladsToDo(ArrayList<Salad> salads) {
        salads.forEach(System.out::println);
    }
}
