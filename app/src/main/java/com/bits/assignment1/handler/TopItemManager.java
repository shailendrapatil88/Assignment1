package com.bits.assignment1.handler;

import android.view.View;

import com.bits.assignment1.R;

/**
 * Created by shailendra patil on 3/8/2016.
 */
public class TopItemManager implements View.OnClickListener {
    private final ItemClickListener itemClickListener;
    private View view;

    public TopItemManager(View view, ItemClickListener itemClickListener) {
        this.view = view;
        this.itemClickListener = itemClickListener;
        initView();
    }

    private void initView() {
        view.findViewById(R.id.button1).setOnClickListener(this);
        view.findViewById(R.id.button2).setOnClickListener(this);
        view.findViewById(R.id.button3).setOnClickListener(this);
        view.findViewById(R.id.button4).setOnClickListener(this);
        view.findViewById(R.id.button5).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                if (itemClickListener != null)
                    itemClickListener.onItemClick("Item 1 has clicked.");
                break;
            case R.id.button2:
                if (itemClickListener != null)
                    itemClickListener.onItemClick("Item 2 has clicked.");
                break;
            case R.id.button3:
                if (itemClickListener != null)
                    itemClickListener.onItemClick("Item 3 has clicked.");
                break;
            case R.id.button4:
                if (itemClickListener != null)
                    itemClickListener.onItemClick("Item 4 has clicked.");
                break;
            case R.id.button5:
                if (itemClickListener != null)
                    itemClickListener.onItemClick("Item 5 has clicked.");
                break;
        }
    }

    public interface ItemClickListener {
        void onItemClick(String name);
    }

}
