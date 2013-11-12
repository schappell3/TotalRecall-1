package edu.vt.cs5744;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class RecallListFragment extends ListFragment 
{
	private static final String TAG = "RecallListFragment";
	private Recalls mApi;
	
	@Override
    public void onCreate(Bundle savedInstanceState) 
	{
        super.onCreate(savedInstanceState);
        
        mApi = RecallReceiver.get(getActivity()).getReturnApi();
        
        getActivity().setTitle(R.string.recall_title);
		RecallsAdapter adapter = new RecallsAdapter(mApi.getSuccess().getResults());
        setListAdapter(adapter);  
	}  
	
	 @Override
	 public void onListItemClick(ListView l, View v, int position, long id) 
	 {
		 Results a = ((RecallsAdapter)getListAdapter()).getItem(position);
		 // Start CrimePagerActivity with this recall
		 Intent i = new Intent(getActivity(), RecallPagerActivity.class);
	     i.putExtra(RecallFragment.EXTRA_RECALL_ID, a.getRecallNumber());
	     startActivity(i); 	 
	 }
	 
	 private class RecallsAdapter extends ArrayAdapter<Results> 
	 {
		 public RecallsAdapter(ArrayList<Results> recalls) 
	     {
			 super(getActivity(), 0, recalls);
	     }
		 
		 @Override
		 public View getView(int position, View convertView, ViewGroup parent) 
		 {
			 // If we weren't given a view, inflate one
			 if (convertView == null)
		     {
				 convertView = getActivity().getLayoutInflater()
			                .inflate(R.layout.list_item_recall, null);
		     }
			 
			 // Configure the view for this Crime
			 Results a = getItem(position);
			 
			 TextView organizationTextView =
					 (TextView)convertView.findViewById(R.id.recall_list_item_organizationTextView);
			 organizationTextView.setText(a.getOrganization());
			 TextView titleTextView =
					 (TextView)convertView.findViewById(R.id.recall_list_item_idTextView);
			 titleTextView.setText(a.getRecallNumber());
			 TextView dateTextView =
					 (TextView)convertView.findViewById(R.id.recall_list_item_dateTextView);
			 dateTextView.setText(a.getRecallDate());
			 
			 if(a.getOrganization().equalsIgnoreCase("CPSC"))
			 {
				 TextView descriptionTextView =
			    		 (TextView)convertView.findViewById(R.id.recall_list_item_descriptionTextView);
			     descriptionTextView.setText(a.descriptionsToString());
			 }
			 else if(a.getOrganization().equalsIgnoreCase("NHTSA"))
			 {
				 TextView descriptionTextView =
			    		 (TextView)convertView.findViewById(R.id.recall_list_item_descriptionTextView);
			     descriptionTextView.setText(a.getDefectSummary());
			 }
			 else if(a.getOrganization().equalsIgnoreCase("FDA") || a.getOrganization().equalsIgnoreCase("USDA"))
			 {
				 TextView descriptionTextView =
			    		 (TextView)convertView.findViewById(R.id.recall_list_item_descriptionTextView);
			     descriptionTextView.setText(a.getSummary());
			 }
			 
			 return convertView; 
		 }
	 }
	 
	 @Override
	 public void onResume() 
	 {
		 super.onResume();
		 ((RecallsAdapter)getListAdapter()).notifyDataSetChanged(); 
	 }
}
