package projects.android.my.gridview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        Integer[] imagesList = {
                R.drawable.gingerbread,
                R.drawable.honeycomb,
                R.drawable.icecreamsandwich,
                R.drawable.jellybean,
                R.drawable.kitkat,
                R.drawable.lolipop
        };
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView grid = (GridView) findViewById(R.id.images);
        grid.setAdapter(new ImageAdapter(imagesList));
    }


    class ImageAdapter extends BaseAdapter
    {
        Integer[] iList;

        ImageAdapter(Integer[] imagesList)
        {
            iList=imagesList;
        }

        @Override
        public int getCount() {
            return iList.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView;

            imageView = new ImageView(MainActivity.this);
            imageView.setImageResource(iList[position]);
            return imageView;
        }
    }
}
