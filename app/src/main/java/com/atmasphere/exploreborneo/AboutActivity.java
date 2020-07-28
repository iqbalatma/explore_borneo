package com.atmasphere.exploreborneo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.atmasphere.exploreborneo.LibraryAbout.AboutPage;
import com.atmasphere.exploreborneo.LibraryAbout.Element;

import java.util.Calendar;

public class AboutActivity extends AppCompatActivity {

    /*
    NIM         : 10117124
    Nama        : Iqbal Atma Muliawan
    Kelas       : IF4
    Matakuliah  : Aplikasi Komputasi Bergerak

    20 Juli 2020 : Membuat about activity untuk menampilkan informasi ttg aplikasi dan developer
 */



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Element adsElement = new Element();
        adsElement.setTitle("EXPLORE BORNEO APPS");

        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .enableDarkMode(false)
                .setImage(R.drawable.profile)
                .addItem(new Element().setTitle("Version 2.0"))
                .addItem(adsElement)
                .addGroup("Connect with us")
                .addEmail("iqbalatma@gmail.com")
                .addWebsite("https://exploreborneo.xyz")
                .addTwitter("iqbalatma")
//                .addYoutube("UCdPQtdWIsg7_pi4mrRu46vA")
//                .addPlayStore("com.atmasphere")
                .addInstagram("atmaiqbal_")
                .addGitHub("iqbalatma")
                .addItem(getCopyRightsElement())
                .create();

        setContentView(aboutPage);
    }


    Element getCopyRightsElement() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.copy_right), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.about_icon_copy_right);
        copyRightsElement.setAutoApplyIconTint(true);
        copyRightsElement.setIconTint(R.color.colorPrimary);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.CENTER);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AboutActivity.this, copyrights, Toast.LENGTH_SHORT).show();
            }
        });
        return copyRightsElement;
    }
}