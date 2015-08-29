package org.fasttrackit.dev.todolist;

/**
 * Created by condor on April 04, 2015
 * FastTrackIT, 2015
 */
public class ToDoBean {

    ToDoBean(int id, String value) {
        this.id=id;
        this.whatToDo=value;
        isDone=false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWhatToDo() {
        return whatToDo;
    }

    public void setWhatToDo(String whatToDo) {
        this.whatToDo = whatToDo;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

    private int id;
    private String whatToDo;
    private boolean isDone;

}