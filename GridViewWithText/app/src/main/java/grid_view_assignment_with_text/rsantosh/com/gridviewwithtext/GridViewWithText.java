package grid_view_assignment_with_text.rsantosh.com.gridviewwithtext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

import grid_view_assignment_with_text.rsantosh.com.gridviewwithtext.Adapter.VersionAdapter;
import grid_view_assignment_with_text.rsantosh.com.gridviewwithtext.Model.ItemImageAndText;

public class GridViewWithText extends AppCompatActivity {

    //Declaration of variables.
    private ArrayList<ItemImageAndText> mItemImageAndTexts;
    public VersionAdapter mAdpt;
    private GridView mGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_with_text);

        //Initialisation of variables.
        mItemImageAndTexts = getVersions();
        mGridView= (GridView) findViewById(R.id.grid_version);
        mAdpt = new VersionAdapter(getApplicationContext(),R.layout.item_gridview_text,mItemImageAndTexts);
        mGridView.setAdapter(mAdpt);

        //writing the code for on item click listener.
        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                Toast.makeText(getBaseContext(),"" + mItemImageAndTexts.get(position).VersionName,Toast.LENGTH_LONG).show();
            }
        });
    }

    private ArrayList<ItemImageAndText> getVersions() {

        //Initialisation of all variables.
        ArrayList<ItemImageAndText> mItemImageAndTexts = new ArrayList<>();

        //Inserting values of of the array.
        mItemImageAndTexts.add(new ItemImageAndText(R.drawable.gingerbread1,"Ginger Bread"));
        mItemImageAndTexts.add(new ItemImageAndText(R.drawable.honeycomb1,"Honey Comb"));
        mItemImageAndTexts.add(new ItemImageAndText(R.drawable.icecreamsandwich,"Icecream Sandwich"));
        mItemImageAndTexts.add(new ItemImageAndText(R.drawable.jellybean,"Jelly Bean"));
        mItemImageAndTexts.add(new ItemImageAndText(R.drawable.kitkat,"Kit Kat"));
        mItemImageAndTexts.add(new ItemImageAndText(R.drawable.lollipop1,"Lollipop"));

        return mItemImageAndTexts;
    }
}
