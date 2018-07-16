package sg.edu.rp.c346.todolist;

import java.util.Calendar;

/**
 * Created by 16003749 on 16/7/2018.
 */

public class ToDo {
    private  String todoName;
    private Calendar toDate;

    public  ToDo(String todoName , Calendar toDate){
        this.todoName = todoName;
        this.toDate = toDate;
    }

    public String getTodoName() {
        return todoName;
    }

    public void setTodoName(String todoName) {
        this.todoName = todoName;
    }

    public String getDateString() {
        String str = toDate.get(Calendar.DAY_OF_MONTH)+"/"+toDate.get(Calendar.MONTH)+"/"+toDate.get((Calendar.YEAR));
        return  str;
    }

    public void setToDate(Calendar toDate) {
        this.toDate = toDate;
    }

    @Override
    public String toString() {
        return "ToDo{" +"todoName='"+ todoName +'\''+",toDate='"+toDate+'\''+'}';
    }
}
