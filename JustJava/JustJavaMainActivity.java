/**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 * <p>
 * package com.example.android.justjava;
 */
package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    /**
     * the int quantity = 2 declares the Global Variable quantity whose datatype is int and which is initialized to 2.
     */
    int quantity = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = quantity*5;
        String summary  = ("Name:\n" +
                "Quantity:" + quantity + "\n" + "price: " + price + "\nthank you");
        displayMessage(summary);
    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int quantity) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + quantity);
    }



    /**
     * This method displays the price message.
     */
    private void displayMessage(String summary) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(summary);
    }
    /**
     * This method is called when the + button is pressed.
     */
    public void increment(View view) {

        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    /**
     * this method is called when the - button is pressed.
     */
    public void decrement(View view) {

        quantity = quantity - 1;
        displayQuantity(quantity);
    }

}
