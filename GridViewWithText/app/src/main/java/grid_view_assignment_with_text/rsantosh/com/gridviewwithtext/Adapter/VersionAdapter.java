package grid_view_assignment_with_text.rsantosh.com.gridviewwithtext.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import grid_view_assignment_with_text.rsantosh.com.gridviewwithtext.Model.ItemImageAndText;
import grid_view_assignment_with_text.rsantosh.com.gridviewwithtext.R;

/**
 * Created by C S Ramachandran on 14-05-2016.
 */
public class VersionAdapter extends ArrayAdapter{

    //Declaration of variables.
    private Context mContext;
    private ArrayList<ItemImageAndText> mImageResource;
    private LayoutInflater mLayoutInflater;

    private ImageView mImageView;
    private TextView mTextView;

    //Constructor.
    public VersionAdapter(Context context, int resource, ArrayList<ItemImageAndText> mImageResource) {
        super(context, resource);
        this.mContext = context;
        this.mImageResource = mImageResource;
        this.mLayoutInflater = LayoutInflater.from(mContext);
    }

    //Getting the size of array list.
    @Override
    public int getCount() {
        return mImageResource.size();
    }

    //Getting the position of the array list.
    @Override
    public Object getItem(int position) {
        return mImageResource.get(position);
    }

    //Writing the code to display the values in to corresponding fields.
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Checking the convert view is null.
        if (convertView == null){

            convertView = mLayoutInflater.inflate(R.layout.item_gridview_text,parent,false);

        }

        //Initialisation of image view and edit text.
        mImageView = (ImageView) convertView.findViewById(R.id.version_image);
        mTextView = (TextView) convertView.findViewById(R.id.version_name);

        ItemImageAndText itemImageAndText = (ItemImageAndText) getItem(position);

        //Inserting the values in to the corresponding field.
        mImageView.setImageResource(itemImageAndText.Resource);
        mTextView.setText(itemImageAndText.VersionName);

        return convertView;
    }
}
