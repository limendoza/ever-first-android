package com.everfirst.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.everfirst.app.databinding.ActivityCustomerBinding;


public class CustomerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCustomerBinding binding =  ActivityCustomerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.pensionSource
                .setAdapter(ArrayAdapter.createFromResource(this, R.array.pension_source, android.R.layout.simple_spinner_dropdown_item));
        binding.pensionType
                .setAdapter(ArrayAdapter.createFromResource(this, R.array.pension_type, android.R.layout.simple_spinner_dropdown_item));
        binding.pensionMemberModePension
                .setAdapter(ArrayAdapter.createFromResource(this, R.array.mode_of_pension, android.R.layout.simple_spinner_dropdown_item));
    }


}
