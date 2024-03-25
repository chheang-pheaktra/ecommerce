package kh.edu.rupp.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.SearchView;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class HomepageActivity extends AppCompatActivity {
    private View searchView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage_main);
        // Search
        SearchView searchView;

            searchView = findViewById(R.id.search_bar); // Assuming your search bar has the ID 'search_bar'

            // Set a listener for search queries
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    // User submitted the search query
                    // Perform search operation based on the query string 'query'
                    return true;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    // User is typing in the search bar
                    // Perform actions like suggestions based on the current text 'newText'
                    return false;
                }
            });
       //button
        // Create a LinearLayout programmatically
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        linearLayout.setOrientation(LinearLayout.HORIZONTAL); // Arrange buttons horizontally

        // Create three buttons programmatically
        Button button1 = new Button(this);
        button1.setText("Button 1");
        button1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f)); // Make buttons weight equally

        Button button2 = new Button(this);
        button2.setText("Button 2");
        button2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));

        Button button3 = new Button(this);
        button3.setText("Button 3");
        button3.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));

        // Add buttons to the LinearLayout
        linearLayout.addView(button1);
        linearLayout.addView(button2);
        linearLayout.addView(button3);
    }


}
