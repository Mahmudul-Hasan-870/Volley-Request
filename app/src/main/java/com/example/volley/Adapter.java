package com.example.volley;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<Model> modelList;

    public Adapter(List<Model> modelList) {
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View my_View = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_object, null, false);
        return new ViewHolder(my_View);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        Model model = modelList.get(position);
        holder.userid.setText(model.getUserId());
        holder.id.setText(model.getId());
        holder.title.setText(model.getTitle());
        holder.body.setText(model.getBody());
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView userid, id, title, body;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            userid = itemView.findViewById(R.id.userId);
            id = itemView.findViewById(R.id.id);
            title = itemView.findViewById(R.id.title);
            body = itemView.findViewById(R.id.body);
        }
    }
}
