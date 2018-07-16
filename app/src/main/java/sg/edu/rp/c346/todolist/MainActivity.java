package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvdo;
    ArrayList<ToDo> alToDoList;
    CustomAdapter caToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvdo = findViewById(R.id.listViewDo);
        alToDoList = new ArrayList<>();
        Calendar date1 = Calendar.getInstance();
        date1.set(2018,7,1);
        Calendar date2 = Calendar.getInstance();
        date2.set(2018,9,22);
        ToDo todo1 = new ToDo("MSA",date1);
        ToDo todo2 = new ToDo("Go for haircut",date2);
        alToDoList.add(todo1);
        alToDoList.add(todo2);
        caToDo = new CustomAdapter(this,R.layout.to_do,alToDoList);
        lvdo.setAdapter(caToDo);



    }
}
