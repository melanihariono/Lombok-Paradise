package smktelkommalang.onboarding.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import smktelkommalang.onboarding.R;
import smktelkommalang.onboarding.model.Wisata;


/**
 * Created by Melanihariono on 4/18/2017.
 */

public class WisataAdapter extends RecyclerView.Adapter<WisataAdapter.ViewHolder> {

    IWisataAdapter mIWisataAdapter;
    ArrayList<Wisata> wisataList;

    public WisataAdapter(Context context, ArrayList<Wisata> wisataList) {
        this.wisataList = wisataList;
        mIWisataAdapter = (IWisataAdapter) context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Wisata wisata = wisataList.get(position);
        holder.tvJudul.setText(wisata.judul);
        holder.tvDeskripsi.setText(wisata.deskripsi);
        holder.ivFoto.setImageURI(Uri.parse(wisata.foto));
    }

    @Override
    public int getItemCount() {
        if (wisataList != null)
            return wisataList.size();
        return 0;
    }

    public interface IWisataAdapter {
        void doClick(int pos);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvJudul;
        TextView tvDeskripsi;

        public ViewHolder(View itemView) {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsi);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIWisataAdapter.doClick(getAdapterPosition());
                }
            });
        }
    }
}




