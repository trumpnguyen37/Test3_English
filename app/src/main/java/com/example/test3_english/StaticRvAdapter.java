package com.example.test3_english;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StaticRvAdapter extends RecyclerView.Adapter<StaticRvAdapter.StaticRVViewHolder>{

    private ArrayList<StaticRvModel> items;
    int row_index = -1;
    Context context;
    int pos;


    public StaticRvAdapter(Context context, ArrayList<StaticRvModel> items) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public StaticRVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Lien ket xml
        View view = LayoutInflater.from(context).inflate(R.layout.static_rv_item,parent,false);
        StaticRVViewHolder staticRVViewHolder = new StaticRVViewHolder(view);
        return  staticRVViewHolder;
    }


    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull StaticRVViewHolder holder, int position) {
        StaticRvModel currentItem = items.get(position);
        holder.imageView.setImageResource(currentItem.getImage());
        holder.textView.setText(currentItem.getText());

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                row_index = position;
                notifyDataSetChanged();

                if(position==0) {
                    Toast.makeText(context, "English" + position, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, HienTaiDonActivity.class);
                    intent.putExtra("pos", pos);
                    context.startActivity(intent);
                }
                else if (position==1){
                    Toast.makeText(context, "English" + position, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, HienTaiTiepDienActivity.class);
                    intent.putExtra("pos", pos);
                    context.startActivity(intent);
                }else if (position==2){
                    Toast.makeText(context, "English" + position, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, HienTaiDonActivity.class);
                    intent.putExtra("pos", pos);
                    context.startActivity(intent);
                }else if (position==3){
                    Toast.makeText(context, "English" + position, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, HienTaiTiepDienActivity.class);
                    intent.putExtra("pos", pos);
                    context.startActivity(intent);
                }else if (position==4){
                    Toast.makeText(context, "English" + position, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, HienTaiDonActivity.class);
                    intent.putExtra("pos", pos);
                    context.startActivity(intent);
                }else if (position==5){
                    Toast.makeText(context, "English" + position, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, HienTaiTiepDienActivity.class);
                    intent.putExtra("pos", pos);
                    context.startActivity(intent);
                }

            }
        });
        if (row_index == position){
            holder.linearLayout.setBackgroundResource(R.drawable.static_rv_selected_bg);

        }
        else{
            holder.linearLayout.setBackgroundResource(R.drawable.static_rv_bg);
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class StaticRVViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        ImageView imageView;
        LinearLayout linearLayout;

        public StaticRVViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            textView = itemView.findViewById(R.id.text);
            linearLayout = itemView.findViewById(R.id.linearLayout);
        }
    }



}
