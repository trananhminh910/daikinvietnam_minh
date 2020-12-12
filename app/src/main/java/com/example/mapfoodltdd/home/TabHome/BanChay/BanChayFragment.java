package com.example.mapfoodltdd.home.TabHome.BanChay;

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

import com.example.mapfoodltdd.Order.Tab.Lichsu.CustomAdapterLichSu;
import com.example.mapfoodltdd.Order.Tab.Lichsu.MonAnModel;
import com.example.mapfoodltdd.R;

import java.util.ArrayList;

public class BanChayFragment extends Fragment {

    private ListView listbanchay;
    Context context;
    private ConstraintLayout relabanchay;
    private ArrayList<MonAnBanChayModel> monanBCData;
    private CustomAdapterBanChay customAdapter;
    private MonAnBanChayModel monAnBanChayModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        context=getActivity();
        View root = inflater.inflate(R.layout.fragment_banchay, container, false);
        listbanchay = root.findViewById(R.id.listbanchay);
        relabanchay = root.findViewById(R.id.relabanchay);
        monanBCData = new ArrayList<>();

        listbanchayData();
        customAdapter = new CustomAdapterBanChay(context, monanBCData);
        listbanchay.setAdapter(customAdapter);
        registerForContextMenu(listbanchay);
        listbanchay.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(context, monanBCData.get(position).getIdtenmonanbc(), Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }
    private void listbanchayData() {

        monAnBanChayModel=new MonAnBanChayModel();
        monAnBanChayModel.setId(1);
        monAnBanChayModel.setIdimgbc(R.drawable.quan1);
        monAnBanChayModel.setIdtenmonanbc("Bánh canh đường ray-Lê Độ");
        monAnBanChayModel.setIddiachibc("K77A/09 Lê Độ, Đà Nẵng");
        monAnBanChayModel.setIdgiabc("31.000đ");
        monanBCData.add(monAnBanChayModel);

        monAnBanChayModel=new MonAnBanChayModel();
        monAnBanChayModel.setId(2);
        monAnBanChayModel.setIdimgbc(R.drawable.quan2);
        monAnBanChayModel.setIdtenmonanbc("Bánh canh đường ray-Lê Độ");
        monAnBanChayModel.setIddiachibc("K77A/09 Lê Độ, Đà Nẵng");
        monAnBanChayModel.setIdgiabc("31.000đ");
        monanBCData.add(monAnBanChayModel);

        monAnBanChayModel=new MonAnBanChayModel();
        monAnBanChayModel.setId(3);
        monAnBanChayModel.setIdimgbc(R.drawable.quan3);
        monAnBanChayModel.setIdtenmonanbc("Bánh canh đường ray-Lê Độ");
        monAnBanChayModel.setIddiachibc("K77A/09 Lê Độ, Đà Nẵng");
        monAnBanChayModel.setIdgiabc("31.000đ");
        monanBCData.add(monAnBanChayModel);

        monAnBanChayModel=new MonAnBanChayModel();
        monAnBanChayModel.setId(4);
        monAnBanChayModel.setIdimgbc(R.drawable.quan4);
        monAnBanChayModel.setIdtenmonanbc("Bánh canh đường ray-Lê Độ");
        monAnBanChayModel.setIddiachibc("K77A/09 Lê Độ, Đà Nẵng");
        monAnBanChayModel.setIdgiabc("31.000đ");
        monanBCData.add(monAnBanChayModel);

        monAnBanChayModel=new MonAnBanChayModel();
        monAnBanChayModel.setId(5);
        monAnBanChayModel.setIdimgbc(R.drawable.quan1);
        monAnBanChayModel.setIdtenmonanbc("Bánh canh đường ray-Lê Độ");
        monAnBanChayModel.setIddiachibc("K77A/09 Lê Độ, Đà Nẵng");
        monAnBanChayModel.setIdgiabc("31.000đ");
        monanBCData.add(monAnBanChayModel);

        monAnBanChayModel=new MonAnBanChayModel();
        monAnBanChayModel.setId(6);
        monAnBanChayModel.setIdimgbc(R.drawable.quan2);
        monAnBanChayModel.setIdtenmonanbc("Bánh canh đường ray-Lê Độ");
        monAnBanChayModel.setIddiachibc("K77A/09 Lê Độ, Đà Nẵng");
        monAnBanChayModel.setIdgiabc("31.000đ");
        monanBCData.add(monAnBanChayModel);
    }
}