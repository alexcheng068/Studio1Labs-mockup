package fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.rp.foodmenu.R;

import java.util.ArrayList;

import adapters.ListviewAdapterDe;
import helper.Beanclassde;


/**
 * Created by wolfsoft on 10/11/2015.
 */
public class DessertFragment extends Fragment {

    private View view;

    ListView delistview;


    private int[] DeImage = {R.drawable.washingmachine,R.drawable.mat,R.drawable.musictran};

    private String[] DeTitle ={"Last washed","Connection","Sound"};

    private String[] DeRupee = {"May 12, 2015","Active","ON"};


    private ArrayList<Beanclassde> beansde;
    private ListviewAdapterDe listbaseAdapterDe;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view  =  inflater.inflate(R.layout.fragment_desserts, container, false);



        delistview= (ListView)view.findViewById(R.id.delistview);
        beansde= new ArrayList<Beanclassde>();

        for (int i= 0; i< DeTitle.length; i++) {

            Beanclassde beanclassde = new Beanclassde(DeImage[i], DeTitle[i], DeRupee[i]);
            beansde.add(beanclassde);

        }
        listbaseAdapterDe = new ListviewAdapterDe(getActivity(), beansde);
        delistview.setAdapter(listbaseAdapterDe);

        return view;
    }




}
