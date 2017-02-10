package com.easylabs.residentevil7guidee;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    // Для анимации кнопки
    Animation animation;

    AlertDialog.Builder ad;
    Context context;

    // Для сохранения данных
    SharedPreferences sPref;
    Editor ed;

    // счетчик запусков приложения
    int countOfRun = 0;
    // флаг, есть ли отзыв у приложения от пользователя
    boolean isRated = false;

    // ID для SharedPreferences
    final String COUNT_OF_RUN = "count_of_run";
    final String IS_RATED = "is_rated";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        animation = AnimationUtils.loadAnimation(this, R.anim.butanim);

        context = MenuActivity.this;

        // Создаём диалог "Оставьте отзыв"
        createAlertDialogRateUs();

        // Получаем количество запусков приложений и флаг для отзыва
        sPref = getPreferences(MODE_PRIVATE);
        countOfRun = sPref.getInt(COUNT_OF_RUN, 0);
        isRated = sPref.getBoolean(IS_RATED, false);

        // Увеличиваем счетчик запусков приложения
        ++countOfRun;

        // Записываем количество запусков приложения
        ed = sPref.edit();
        ed.putInt(COUNT_OF_RUN, countOfRun);
        ed.commit();

        // Просим оставить лайк на каждом четном запуске
        if (countOfRun % 2 == 0 && !isRated)
            ad.show();
    }

    public void btWeaponsMenuClick(View v) {
        v.startAnimation(animation);
        startActivity(new Intent(this, WeaponsMenuActivity.class));
    }

    public void btAncientCoinsClick(View v) {
        v.startAnimation(animation);
        startActivity(new Intent(this, AncientCoinsActivity.class));
    }

    public void btBackpackClick(View v) {
        v.startAnimation(animation);
        startActivity(new Intent(this, BackpackActivity.class));
    }

    public void btKeysClick(View v) {
        v.startAnimation(animation);
        startActivity(new Intent(this, KeysActivity.class));
    }

    public void btRepairKitClick(View v) {
        v.startAnimation(animation);
        startActivity(new Intent(this, RepairKitsActivity.class));
    }

    public void btSteroidsClick(View v) {
        v.startAnimation(animation);
        startActivity(new Intent(this, SteroidsActivity.class));
    }

    private void createAlertDialogRateUs() {
        String title = "Вы хотите оценить наше приложение?";
        String message = "Пожалуйста, оцените наше приложение. Нам будет очень приятно :)";
        String positiveButtonString = "Да";
        String negativeButtonString = "Нет";
        String neutralButtonString = "Напомнить позже";

        ad = new AlertDialog.Builder(context);
        ad.setTitle(title);  // заголовок
        ad.setMessage(message); // сообщение

        ad.setPositiveButton(positiveButtonString, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int arg1) {
                isRated = true;

                sPref = getPreferences(MODE_PRIVATE);
                ed = sPref.edit();
                ed.putBoolean(IS_RATED, isRated);
                ed.commit();

                openAppPage();
            }
        });

        ad.setNegativeButton(negativeButtonString, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int arg1) {
                isRated = true;

                sPref = getPreferences(MODE_PRIVATE);
                ed = sPref.edit();
                ed.putBoolean(IS_RATED, isRated);
                ed.commit();
            }
        });

        ad.setNeutralButton(neutralButtonString, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int arg1) {
            }
        });

        ad.setCancelable(true);

        ad.setOnCancelListener(new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialog) {

            }
        });
    }

    private boolean isActivityStarted(Intent aIntent) {
        try {
            startActivity(aIntent);
            return true;
        } catch (ActivityNotFoundException e) {
            return false;
        }
    }

    private void openAppPage(){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("market://details?id=com.easylabs.residentevil7guidee"));
        if (!isActivityStarted(intent)) {
            intent.setData(Uri
                    .parse("https://play.google.com/store/apps/details?id=com.easylabs.residentevil7guidee"));
            if (!isActivityStarted(intent)) {
                Toast.makeText(
                        this,
                        "Could not open Android market, please check if the market app installed or not. Try again later",
                        Toast.LENGTH_SHORT).show();
            }
        }
    }
}
