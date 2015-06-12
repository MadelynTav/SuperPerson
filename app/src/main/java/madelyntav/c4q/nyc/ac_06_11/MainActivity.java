package madelyntav.c4q.nyc.ac_06_11;

/** Created by MadelynTav and FattyDuck**/

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    ArrayList<String> listHeader;
    HashMap<String, List<String>> listDataChild;
    ArrayAdapter<String> adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView) findViewById(R.id.listView);


        SuperPerson[] Earth = new SuperPerson[6];


        listDataChild=new HashMap<String,List<String>>();
        listHeader = new ArrayList<String>();


        for(int i=0;i<Earth.length;i++){
            listHeader.add(Earth[i].getName());
        }




        ArrayList<String> supers=new ArrayList<>();
        supers.add("FireThrower");
        supers.add("KnifeThrower");
        supers.add("Invisible");
        Earth[0] = new Superhero("fat duck");
        Earth[0].setIdentity("Cool");
        Earth[0].setSuperPowers(supers);
        Earth[1] = new Superhero("silly duck");
        Earth[2] = new Superhero("furry duck");
        Earth[3] = new Supervillian("capitalist");
        Earth[4] = new Supervillian("communist");
        Earth[5] = new Supervillian("republican");


        ArrayList<String> supers2=new ArrayList<>();
        supers2.add("Eating 25kg of HotDogs");
        supers2.add("Time Travel");
        supers2.add("Turning humans into cows");
        Earth[1].setSuperPowers(supers2);

        List<String> one= new ArrayList<>();
        one.add(Earth[0].getIdentity());
        one.add((Earth[0].getSuperPowers().toString()));

        List<String> two= new ArrayList<>();
        two.add(Earth[1].getIdentity());
        two.add(Earth[1].getSuperPowers().toString());

        listDataChild.put(listHeader.get(0), supers);
        listDataChild.put(listHeader.get(1),supers2);

        ExpandableListView expandableListView= (ExpandableListView) findViewById(R.id.listView);


        ExpandableListAdapter adapter2= new ExpandableListAdapter(this,listHeader,listDataChild);

        expandableListView.setAdapter(adapter2);





    }


}
