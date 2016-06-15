package com.customdrawerwithheader;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ColorsFragment extends Fragment {

   /* private int[] colors;
    private int position;*/

    public ColorsFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_colors, container, false);

        /*position=getArguments().getInt("Position");
        Toast.makeText(getActivity(), position+"", Toast.LENGTH_SHORT).show();
        RelativeLayout layout=(RelativeLayout)view.findViewById(R.id.layout);
        TextView textView=(TextView)view.findViewById(R.id.textview);
        colors=getActivity().getResources().getIntArray(R.array.colors);
        textView.setText(getResources().getStringArray(R.array.colors_array)[position]);
        layout.setBackgroundColor(colors[position]);*/

        return view;
    }

}
