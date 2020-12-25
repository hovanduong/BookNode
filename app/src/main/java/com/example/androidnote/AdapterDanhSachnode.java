package com.example.androidnote;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Node;

import java.util.ArrayList;

public class AdapterDanhSachnode extends RecyclerView.Adapter<AdapterDanhSachnode.ViewHolder> {
    Context context;
    int resource;
    ArrayList<Note> nodeArrayList;
    public AdapterDanhSachnode(Context context, int resource, ArrayList<Note> nodeArrayList){
        this.context=context;
        this.resource=resource;
        this.nodeArrayList=nodeArrayList;

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txttieude,txtnoidung,txtngay;
        LinearLayout layout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txttieude=itemView.findViewById(R.id.txttieude);
            txtnoidung=itemView.findViewById(R.id.txtnoidung);
            txtngay=itemView.findViewById(R.id.txtngay);
            layout=itemView.findViewById(R.id.Layout);

        }
    }
    @NonNull
    @Override
    public AdapterDanhSachnode.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(resource,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final AdapterDanhSachnode.ViewHolder holder, int position) {
        Note notes= nodeArrayList.get(position);
        holder.txttieude.setText(notes.getTieude());
        holder.txtngay.setText(notes.getNgay());
        holder.txtnoidung.setText(notes.getNoidung());
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MainActivity.class);
                intent.putExtra("tieude", holder.txttieude.getText());
                intent.putExtra("noidung", holder.txtnoidung.getText());
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return nodeArrayList.size();
    }

}
