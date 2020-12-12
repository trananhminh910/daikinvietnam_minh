package com.example.mapfoodltdd.home.TabHome.GanToi;

import android.content.Context;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.mapfoodltdd.R;
import com.example.mapfoodltdd.home.TabHome.DanhGia.CustomAdapterDanhGia;
import com.example.mapfoodltdd.home.TabHome.DanhGia.MonAnDanhGiaModel;

import java.util.ArrayList;

public class GanToiFragment extends Fragment {

    private ListView listgantoi;
    Context context;
    private ConstraintLayout relagantoi;
    private ArrayList<MonAnGanToiModel> monangtData;
    private CustomAdapterGanToi customAdapter;
    private MonAnGanToiModel monAnGanToiModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        context=getActivity();
        View root = inflater.inflate(R.layout.fragment_gantoi, container, false);
        listgantoi = root.findViewById(R.id.listgantoi);
        relagantoi= root.findViewById(R.id.relagantoi);
        monangtData = new ArrayList<>();

        listgantoiData();
        customAdapter = new CustomAdapterGanToi(context, monangtData);
        listgantoi.setAdapter(customAdapter);
        registerForContextMenu(listgantoi);
        listgantoi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(context, monangtData.get(position).getIdtenmonangt(), Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }
    private void listgantoiData() {

        monAnGanToiModel=new MonAnGanToiModel();
        monAnGanToiModel.setId(1);
        monAnGanToiModel.setIdimggt(R.drawable.quan1);
        monAnGanToiModel.setIdtenmonangt("Bánh canh đường ray-Lê Độ");
        monAnGanToiModel.setIddiachigt("K77A/09 Lê Độ, Đà Nẵng");
        monAnGanToiModel.setIdgiagt("31.000đ");
        monangtData.add(monAnGanToiModel);

        monAnGanToiModel=new MonAnGanToiModel();
        monAnGanToiModel.setId(2);
        monAnGanToiModel.setIdimggt(R.drawable.quan2);
        monAnGanToiModel.setIdtenmonangt("Bánh canh đường ray-Lê Độ");
        monAnGanToiModel.setIddiachigt("K77A/09 Lê Độ, Đà Nẵng");
        monAnGanToiModel.setIdgiagt("31.000đ");
        monangtData.add(monAnGanToiModel);

        monAnGanToiModel=new MonAnGanToiModel();
        monAnGanToiModel.setId(3);
        monAnGanToiModel.setIdimggt(R.drawable.quan3);
        monAnGanToiModel.setIdtenmonangt("Bánh canh đường ray-Lê Độ");
        monAnGanToiModel.setIddiachigt("K77A/09 Lê Độ, Đà Nẵng");
        monAnGanToiModel.setIdgiagt("31.000đ");
        monangtData.add(monAnGanToiModel);

        monAnGanToiModel=new MonAnGanToiModel();
        monAnGanToiModel.setId(4);
        monAnGanToiModel.setIdimggt(R.drawable.quan4);
        monAnGanToiModel.setIdtenmonangt("Bánh canh đường ray-Lê Độ");
        monAnGanToiModel.setIddiachigt("K77A/09 Lê Độ, Đà Nẵng");
        monAnGanToiModel.setIdgiagt("31.000đ");
        monangtData.add(monAnGanToiModel);

        monAnGanToiModel=new MonAnGanToiModel();
        monAnGanToiModel.setId(5);
        monAnGanToiModel.setIdimggt(R.drawable.quan1);
        monAnGanToiModel.setIdtenmonangt("Bánh canh đường ray-Lê Độ");
        monAnGanToiModel.setIddiachigt("K77A/09 Lê Độ, Đà Nẵng");
        monAnGanToiModel.setIdgiagt("31.000đ");
        monangtData.add(monAnGanToiModel);

        monAnGanToiModel=new MonAnGanToiModel();
        monAnGanToiModel.setId(6);
        monAnGanToiModel.setIdimggt(R.drawable.quan2);
        monAnGanToiModel.setIdtenmonangt("Bánh canh đường ray-Lê Độ");
        monAnGanToiModel.setIddiachigt("K77A/09 Lê Độ, Đà Nẵng");
        monAnGanToiModel.setIdgiagt("31.000đ");
        monangtData.add(monAnGanToiModel);
    }
}