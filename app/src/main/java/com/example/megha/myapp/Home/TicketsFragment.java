package com.example.megha.myapp.Home;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.example.megha.myapp.R;
import com.example.megha.myapp.Tickets_link_pages.CreateTicketsActivity;

public class TicketsFragment extends Fragment implements View.OnClickListener
{
    Button button;
    public static TicketsFragment newInstance()
    {
        TicketsFragment fragment = new TicketsFragment();
        return fragment;
    }
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_tickets, container, false);

        button = (Button) view.findViewById(R.id.btn);
        button.setOnClickListener(this);

       return view;
    }

    public void onClick(View view)
    {
        Intent intent = new Intent(getActivity(), CreateTicketsActivity.class);
        startActivity(intent);
    }
}
