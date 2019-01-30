package com.example.megha.myapp.Home;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.megha.myapp.Operation_link_pages.CashvanActivity;
import com.example.megha.myapp.Operation_link_pages.CatalogActivity;
import com.example.megha.myapp.Operation_link_pages.CustomersActivity;
import com.example.megha.myapp.Operation_link_pages.DelaivriesActivity;
import com.example.megha.myapp.Operation_link_pages.DetailedPerformanceActivity;
import com.example.megha.myapp.Operation_link_pages.InvoicesActivity;
import com.example.megha.myapp.Operation_link_pages.MaintenanceActivity;
import com.example.megha.myapp.Operation_link_pages.OrderActivity;
import com.example.megha.myapp.Operation_link_pages.PaymentActivity;
import com.example.megha.myapp.Operation_link_pages.OffersActivity;
import com.example.megha.myapp.Operation_link_pages.ReturnActivity;
import com.example.megha.myapp.Operation_link_pages.SurveysActivity;
import com.example.megha.myapp.R;

public class OperationsFragment extends Fragment implements View.OnClickListener{
    Button button;

    public static OperationsFragment newInstance() {
        OperationsFragment fragment = new OperationsFragment();
        return fragment;
    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_operations, container, false);

            button = (Button) view.findViewById(R.id.button2);
            button.setOnClickListener(this);

            button = (Button) view.findViewById(R.id.order);
            button.setOnClickListener(this);

            button = (Button) view.findViewById(R.id.returns);
            button.setOnClickListener(this);

            button = (Button) view.findViewById(R.id.invoices);
            button.setOnClickListener(this);

            button = (Button) view.findViewById(R.id.payment);
            button.setOnClickListener(this);

            button = (Button) view.findViewById(R.id.catalog);
            button.setOnClickListener(this);

            button = (Button) view.findViewById(R.id.surveys);
            button.setOnClickListener(this);

            button = (Button) view.findViewById(R.id.maintenance);
            button.setOnClickListener(this);

            button = (Button) view.findViewById(R.id.deliveries);
            button.setOnClickListener(this);

            button = (Button) view.findViewById(R.id.customers);
            button.setOnClickListener(this);

            button = (Button) view.findViewById(R.id.cash_van);
            button.setOnClickListener(this);

            button = (Button) view.findViewById(R.id.offers);
            button.setOnClickListener(this);

        return view;
        }
        public void onClick(View view)
        {
            switch (view.getId())
            {
                case R.id.button2:
                    Intent intent = new Intent(getActivity(),DetailedPerformanceActivity.class);
                    startActivity(intent);
                    break;
                case R.id.order:
                    Intent intent1 = new Intent(getActivity(),OrderActivity.class);
                    startActivity(intent1);
                    break;
                case R.id.returns:
                    Intent intent2 = new Intent(getActivity(),ReturnActivity.class);
                    startActivity(intent2);
                    break;
                case R.id.invoices:
                    Intent intent3 = new Intent(getActivity(),InvoicesActivity.class);
                    startActivity(intent3);
                    break;
                case R.id.payment:
                    Intent intent4 = new Intent(getActivity(),PaymentActivity.class);
                    startActivity(intent4);
                    break;
                case R.id.catalog:
                    Intent intent5 = new Intent(getActivity(),CatalogActivity.class);
                    startActivity(intent5);
                    break;
                case R.id.surveys:
                    Intent intent6 = new Intent(getActivity(),SurveysActivity.class);
                    startActivity(intent6);
                    break;
                case R.id.maintenance:
                    Intent intent7 = new Intent(getActivity(),MaintenanceActivity.class);
                    startActivity(intent7);
                    break;
                case R.id.deliveries:
                    Intent intent8 = new Intent(getActivity(),DelaivriesActivity.class);
                    startActivity(intent8);
                    break;
                case R.id.customers:
                    Intent intent9 = new Intent(getActivity(),CustomersActivity.class);
                    startActivity(intent9);
                    break;
                case R.id.cash_van:
                    Intent intent10 = new Intent(getActivity(),CashvanActivity.class);
                    startActivity(intent10);
                    break;
                case R.id.offers:
                    Intent intent11 = new Intent(getActivity(),OffersActivity.class);
                    startActivity(intent11);
                    break;

            }
        }
    }























