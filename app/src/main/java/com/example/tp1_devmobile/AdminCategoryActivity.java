package com.example.tp1_devmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView tShits, sportsTShirts, femaleDresses, sweathers;
    private ImageView glasses, hatsCaps, walletsBagsPurses, shoes;
    private ImageView headPhonesHandFree, laptots, watches, mobilePhones;

    private Button LogoutBtn, CheckOrders, maintainProductsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        tShits = (ImageView) findViewById(R.id.t_shirts);
        sportsTShirts = (ImageView) findViewById(R.id.sports_t_shirts);
        femaleDresses = (ImageView) findViewById(R.id.female_dresses);
        sweathers = (ImageView) findViewById(R.id.sweathers);

        glasses = (ImageView) findViewById(R.id.glasses);
        hatsCaps = (ImageView) findViewById(R.id.hats);
        walletsBagsPurses = (ImageView) findViewById(R.id.purses_bags);
        shoes = (ImageView) findViewById(R.id.shoes);

        headPhonesHandFree = (ImageView) findViewById(R.id.headphones_handfree);
        laptots = (ImageView) findViewById(R.id.laptop_pc);
        watches = (ImageView) findViewById(R.id.watches);
        mobilePhones = (ImageView) findViewById(R.id.mobilephones);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        CheckOrders = (Button) findViewById(R.id.check_orders_btn);
        maintainProductsBtn = (Button) findViewById(R.id.maintain_btn);


        maintainProductsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, HomeActivity.class);
                intent.putExtra("Admin", "Admin");
                startActivity(intent);
            }
        });



        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });

        CheckOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });

        tShits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "tShirts");
                startActivity(intent);
            }
        });

        sportsTShirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Sports TShirts");
                startActivity(intent);

            }
        });

        femaleDresses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Female Dresses");
                startActivity(intent);

            }
        });

        sweathers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Sweathers");
                startActivity(intent);

            }
        });

        glasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Glasses");
                startActivity(intent);

            }
        });

        hatsCaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Hats Caps");
                startActivity(intent);

            }
        });

        walletsBagsPurses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Wallets Bags Purses");
                startActivity(intent);

            }
        });

        shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Shoes");
                startActivity(intent);

            }
        });

        headPhonesHandFree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "HeadPhones HandFree");
                startActivity(intent);

            }
        });

        laptots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Laptotps");
                startActivity(intent);

            }
        });

        watches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Watches");
                startActivity(intent);

            }
        });

        mobilePhones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Mobiles Phones");
                startActivity(intent);

            }
        });


    }
}
