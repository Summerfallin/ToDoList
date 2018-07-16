package sg.edu.rp.c346.todolist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16003749 on 16/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<ToDo> todoList;
    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ToDo> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        todoList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id,parent,false);
        TextView tvName = rowView.findViewById(R.id.tvName);
        TextView tvDate = rowView.findViewById(R.id.tvDate);
        ToDo currentItem = todoList.get(position);
        tvName.setText(currentItem.getTodoName());
        tvDate.setText(currentItem.getDateString());

        return rowView;
    }
}
