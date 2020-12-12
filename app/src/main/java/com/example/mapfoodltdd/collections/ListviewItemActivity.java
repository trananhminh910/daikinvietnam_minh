package com.example.mapfoodltdd.collections;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mapfoodltdd.R;

public class ListviewItemActivity extends AppCompatActivity {

    TextView iddongho, idgia;
    ImageView imageView;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_listitem );

        iddongho = findViewById ( R.id.idTitle );
        imageView = findViewById ( R.id.imageView );
        Intent intent = getIntent ();
        String receivedName = intent.getStringExtra ( "name" );
        int receivedImage = intent.getIntExtra ( "image", 0 );

        iddongho.setText ( receivedName );
        imageView.setImageResource ( receivedImage );

        back = (ImageView) findViewById ( R.id.back );
        back.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                openXemThemActivity ();
            }

            private void openXemThemActivity() {
                Intent intent = new Intent ( ListviewItemActivity.this, Xemthem.class );
                intent.setFlags ( Intent.FLAG_ACTIVITY_CLEAR_TOP );
                finish ();
            }
        } );

    }
}