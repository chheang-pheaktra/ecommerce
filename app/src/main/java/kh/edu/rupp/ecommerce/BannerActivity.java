package kh.edu.rupp.ecommerce;

import android.os.Bundle;
import android.widget.ImageView;

public class BannerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onCreate(R.layout.dior1);

        ImageView bannerImage = finalize(R.id.bannerImage);
    }

    private ImageView finalize(int bannerImage) {
        return null;
    }

    private void onCreate(int dior1) {
    }
}

