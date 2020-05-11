package com.example.workexperiencehub.ui.aboutus;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.workexperiencehub.AndroidDevelopment;
import com.example.workexperiencehub.MainActivity;
import com.example.workexperiencehub.R;

public class AboutUsFragment extends Fragment {

    private AboutUsViewModel aboutUsViewModel;



    // creating phone call requires permission in code
    public static final String CALL_PHONE = "android.permission.CALL_PHONE";
    public static final int PERMISSION_CODE = 42042;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)

    {
        aboutUsViewModel = ViewModelProviders.of(this).get(AboutUsViewModel.class);

        View root = inflater.inflate(R.layout.fragment_aboutus, container, false);

        MainActivity.getInstance().changeToolbarTittle("ABOUT");


        ImageButton btncall = (ImageButton) root.findViewById(R.id.img_call);

        ImageButton btnemail = (ImageButton) root.findViewById(R.id.img_email);



        btncall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


             //  Toast.makeText(getContext(), "Show numb", Toast.LENGTH_SHORT).show();

//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:9411280247"));
//
//                if (ActivityCompat.checkSelfPermission(getContext(),
//                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    return;
//                }
//                startActivity(callIntent);

                int permissionCheck = ContextCompat.checkSelfPermission(getContext(), CALL_PHONE);
                if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
                    requestPermissions( new String[]{CALL_PHONE}, PERMISSION_CODE);
                }

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+94112802471"));
                startActivity(callIntent);

            }
        });


        btnemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","training@archmage.lk", null));
                intent.putExtra(Intent.EXTRA_SUBJECT, "Job at Archmage Solutions");
                intent.putExtra(Intent.EXTRA_TEXT, "Type your contend");
                startActivity(Intent.createChooser(intent, "Choose an Email client :"));
            }
        });

        return root;
    }


}