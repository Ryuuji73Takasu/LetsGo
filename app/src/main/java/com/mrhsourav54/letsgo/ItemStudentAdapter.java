package com.mrhsourav54.letsgo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemStudentAdapter extends BaseAdapter {


    private Context activity;
    private ArrayList<StudentInfo> allStudent = new ArrayList<>();
    private LayoutInflater layoutInflater = null;


    private static class ViewHolder {
        private TextView name, id, level, credit,phoneno;
    }

    private ViewHolder viewHolder = null;


    public ItemStudentAdapter(Context context, ArrayList<StudentInfo> allStudent) {
        activity = context;
        this.allStudent = allStudent;
        layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return allStudent.size();
    }

    @Override
    public Object getItem(int position) {
        return allStudent.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        {
            View view = convertView;
            final int pos = position;
            if (view == null) {
                viewHolder = new ViewHolder();
                view = layoutInflater.inflate(R.layout.row_cell_student, null);
                viewHolder.name = view.findViewById(R.id.fullname1);
                viewHolder.id = view.findViewById(R.id.coyname1);
                viewHolder.level = view.findViewById(R.id.registration1);
                viewHolder.credit = view.findViewById(R.id.address1);
                viewHolder.phoneno = view.findViewById(R.id.phoneno1);
                view.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) view.getTag();
            }
            viewHolder.name.setText(allStudent.get(pos).getFullname());
            viewHolder.id.setText(allStudent.get(pos).getCoyname());
            viewHolder.level.setText(allStudent.get(pos).getRegistrationid());
            viewHolder.credit.setText(allStudent.get(pos).getAddress());
            viewHolder.phoneno.setText(allStudent.get(pos).getPhonenumber());
            return view;
        }
    }
}