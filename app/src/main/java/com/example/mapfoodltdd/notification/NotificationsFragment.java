package com.example.mapfoodltdd.notification;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.example.mapfoodltdd.R;

import java.util.ArrayList;

public class NotificationsFragment extends Fragment {

    private ListView listView132, listView2132;
    Context context;
    private ConstraintLayout rela132, rela2132;
    private ArrayList<ThongBaoModel> thongbaoData132;
    private CustomAdapter customAdapter132;
    private ThongBaoModel thongbaoModel132;

    private ArrayList<TinhTrangModel> tinhtrangData132;
    private CustomAdapter2 customAdapter2132;
    private TinhTrangModel tinhtrangModel132;

    //1
    @SuppressLint("WrongViewCast")
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        context=getActivity();
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
        listView132 = root.findViewById(R.id.listView);
        rela132 = root.findViewById(R.id.rela);
        thongbaoData132 = new ArrayList<>();

        listView2132 = root.findViewById(R.id.listView2);
        rela2132 = root.findViewById(R.id.rela2);
        tinhtrangData132 = new ArrayList<>();

        //add Countries Data
        listthongbaoData();
        listtinhtrang();
        customAdapter132 = new CustomAdapter(context, thongbaoData132);
        listView132.setAdapter(customAdapter132);
        registerForContextMenu(listView132);
        listView132.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(context, thongbaoData132.get(position).getTieude(), Toast.LENGTH_SHORT).show();
//                Toast.makeText(getApplicationContext(),name[position], Toast.LENGTH_LONG).show();
//                 Intent intent = new Intent(getApplicationContext(), OpenThongBao.class);
//                intent.putExtra("image", image[position]);
//                intent.putExtra("name", name[position]);
//                startActivity(intent);
            }
        });
        customAdapter2132 = new CustomAdapter2(context, tinhtrangData132);
        listView2132.setAdapter(customAdapter2132);
        registerForContextMenu(listView2132);
        listView2132.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(context, tinhtrangData132.get(position).getTieude2(), Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }

    private void listthongbaoData() {

        thongbaoModel132=new ThongBaoModel();
        thongbaoModel132.setId(1);
        thongbaoModel132.setAvata(R.drawable.sale);
        thongbaoModel132.setTieude("Khuyến mãi");
        thongbaoModel132.setNoidung("vocher giảm 10%");
        thongbaoModel132.setDetail(R.drawable.detail);
        thongbaoData132.add(thongbaoModel132);

        thongbaoModel132=new ThongBaoModel();
        thongbaoModel132.setId(2);
        thongbaoModel132.setAvata(R.drawable.loa);
        thongbaoModel132.setTieude("Tin tức");
        thongbaoModel132.setNoidung("Chưa có tin tức nào");
        thongbaoModel132.setDetail(R.drawable.detail);
        thongbaoData132.add(thongbaoModel132);
    }
    private void listtinhtrang() {

        tinhtrangModel132=new TinhTrangModel();
        tinhtrangModel132.setId(1);
        tinhtrangModel132.setAvata2(R.drawable.bst2);
        tinhtrangModel132.setTieude2("Đã hoàn tất đơn");
        tinhtrangModel132.setNoidung2("Thiết bị đã được mua thành công. cảm ơn bạn đã mua hàng tại daikin Việt Nam");
        tinhtrangModel132.setTime("24/10/2020 13:04");
        tinhtrangData132.add(tinhtrangModel132);

        tinhtrangModel132=new TinhTrangModel();
        tinhtrangModel132.setId(2);
        tinhtrangModel132.setAvata2(R.drawable.bst1);
        tinhtrangModel132.setTieude2("Đã hoàn tất đơn");
        tinhtrangModel132.setNoidung2("Thiết bị đã được mua thành công. cảm ơn bạn đã mua hàng tại daikin Việt Nam");
        tinhtrangModel132.setTime("22/10/2020 9:15");
        tinhtrangData132.add(tinhtrangModel132);

        tinhtrangModel132=new TinhTrangModel();
        tinhtrangModel132.setId(3);
        tinhtrangModel132.setAvata2(R.drawable.bst4);
        tinhtrangModel132.setTieude2("Đã hoàn tất đơn");
        tinhtrangModel132.setNoidung2("Thiết bị đã được mua thành công. cảm ơn bạn đã mua hàng tại daikin Việt Nam");
        tinhtrangModel132.setTime("17/10/2020 10:20");
        tinhtrangData132.add(tinhtrangModel132);

        tinhtrangModel132=new TinhTrangModel();
        tinhtrangModel132.setId(4);
        tinhtrangModel132.setAvata2(R.drawable.bst5);
        tinhtrangModel132.setTieude2("Đã hoàn tất đơn");
        tinhtrangModel132.setNoidung2("Thiết bị đã được mua thành công. cảm ơn bạn đã mua hàng tại daikin Việt Nam");
        tinhtrangModel132.setTime("11/10/2020 18:20");
        tinhtrangData132.add(tinhtrangModel132);

    }
}
