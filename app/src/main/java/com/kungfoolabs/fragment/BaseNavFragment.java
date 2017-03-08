package com.kungfoolabs.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;

/**
 * Created by ckung on 3/7/17.
 */

public class BaseNavFragment extends Fragment {

    private OnNavFragmentListener listener;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if(context instanceof OnNavFragmentListener) {
            listener = (OnNavFragmentListener) context;
        }
    }

    protected OnNavFragmentListener getListener() {
        return listener;
    }

    @Override
    public void onDetach() {
        super.onDetach();

        listener = null;
    }
}
