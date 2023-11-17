package com.ivan.horniichuk.testmvvm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.ivan.horniichuk.testmvvm.databinding.ActivityMainBinding;
import com.ivan.horniichuk.testmvvm.view_model.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainActivityViewModel viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);

        // Отримуємо об'єкт SharedPreferences з режимом доступу MODE_PRIVATE
        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);

        /* Створення об'єкта SharedPreferences.Editor для запису даних
        до SharedPreferences */
        SharedPreferences.Editor editor = sharedPreferences.edit();

        // Запис поля типу String за ключем "S_KEY" із значенням "VALUE"
        editor.putString("S_KEY", "NEW_VALUE");
        // Запис поля типу int за ключем "I_KEY" із значенням 100
        editor.putInt("I_KEY", 200);
        // Застосування змін
        editor.apply();

        // Читання рядка за ключем "S_KEY"
        String val = sharedPreferences.getString("S_KEY", null);
        // Читання числа за ключем "І_KEY"
        int num = sharedPreferences.getInt("I_KEY", 0);

    }
}