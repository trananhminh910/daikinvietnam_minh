package com.example.mapfoodltdd.home;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.mapfoodltdd.R;
import com.example.mapfoodltdd.home.Adapter.SectionPagerAdapterHome;
import com.example.mapfoodltdd.home.IconMenu.IconMenuAdapter;
import com.example.mapfoodltdd.home.IconMenu.IconModel;
import com.example.mapfoodltdd.home.TabHome.BanChay.BanChayFragment;
import com.example.mapfoodltdd.home.TabHome.DanhGia.DanhGiaFragment;
import com.example.mapfoodltdd.home.TabHome.GanToi.GanToiFragment;
import com.example.mapfoodltdd.home.TabHome.GiaoNhanh.GiaoNhanhFragment;
import com.example.mapfoodltdd.home.listprovince.ListProvince;
import com.example.mapfoodltdd.profile.DiaChi;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private TextView  txtaddaddress132;
    Context context132;


    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment getInstance() {
        return new HomeFragment();
    }

    interface FragmentCallback {
        void onClickButton(HomeFragment fragment);
    }
    private FragmentCallback mCallback;
    @SuppressLint("WrongViewCast")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater,container,savedInstanceState);
        context132=getActivity();
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        ImageSlider imageSlider = (ImageSlider) root.findViewById ( R.id.slide );
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add ( new SlideModel (R.drawable.sl1) );
        slideModels.add ( new SlideModel (R.drawable.sl2) );
        slideModels.add ( new SlideModel (R.drawable.sl3) );
        slideModels.add ( new SlideModel (R.drawable.sl4) );
        slideModels.add ( new SlideModel (R.drawable.sl5) );
        imageSlider.setImageList ( slideModels,true );


        txtaddaddress132 = root.findViewById(R.id.textlocation);
        txtaddaddress132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddaddress();
            }
        });

        return root;
    }

    public void openAddaddress(){
        Intent intent=new Intent(HomeFragment.this.getActivity(), DiaChi.class);
        startActivity(intent);
    }

}