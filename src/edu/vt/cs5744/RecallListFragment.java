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
	private ReturnApi mApi;
	
	@Override
    public void onCreate(Bundle savedInstanceState) 
	{
        super.onCreate(savedInstanceState);
        
        mApi = RecallReceiver.get(getActivity()).getReturnApi();
        
        if(mApi.getOrganization().equalsIgnoreCase("CPSC"))
    	{
        	getActivity().setTitle(R.string.recall_title_cpsc);
    		CpscAdapter adapter = new CpscAdapter(mApi.getCpsc().getSuccess().getResults());
            setListAdapter(adapter);
    	}
    	else if(mApi.getOrganization().equalsIgnoreCase("NHTSA"))
    	{
    		getActivity().setTitle(R.string.recall_title_nhtsa);
    		NhtsaAdapter adapter = new NhtsaAdapter(mApi.getNhtsa().getSuccess().getResults());
            setListAdapter(adapter);
    	}
    	else if(mApi.getOrganization().equalsIgnoreCase("FDAUSDA"))
    	{
    		getActivity().setTitle(R.string.recall_title_fdausda);
    		FdaUsdaAdapter adapter = new FdaUsdaAdapter(mApi.getFdausda().getSuccess().getResults());
            setListAdapter(adapter);
    	}   
	}  
	
	 @Override
	 public void onListItemClick(ListView l, View v, int position, long id) 
	 {
		 if(mApi.getOrganization().equalsIgnoreCase("CPSC"))
		 {
			 ResultsCpsc a = ((CpscAdapter)getListAdapter()).getItem(position);
			 // Start RecallPagerActivity with this recall
			 Intent i = new Intent(getActivity(), RecallPagerActivity.class);
		     i.putExtra(RecallFragment.EXTRA_RECALL_ID, a.getRecallNumber());
		     startActivity(i);
		 }
		 else if(mApi.getOrganization().equalsIgnoreCase("NHTSA"))
		 {
			 ResultsNhtsa a = ((NhtsaAdapter)getListAdapter()).getItem(position);
			 // Start RecallPagerActivity with this recall
			 Intent i = new Intent(getActivity(), RecallPagerActivity.class);
		     i.putExtra(RecallFragment.EXTRA_RECALL_ID, a.getRecallNumber());
		     startActivity(i);
		 }
		 else if(mApi.getOrganization().equalsIgnoreCase("FDAUSDA"))
		 {
			 ResultsFdaUsda a = ((FdaUsdaAdapter)getListAdapter()).getItem(position);
			 // Start RecallPagerActivity with this recall
			 Intent i = new Intent(getActivity(), RecallPagerActivity.class);
		     i.putExtra(RecallFragment.EXTRA_RECALL_ID, a.getRecallNumber());
		     startActivity(i);
		 }  	 
	 }
	 
	 private class CpscAdapter extends ArrayAdapter<ResultsCpsc> 
	 {
		 public CpscAdapter(ArrayList<ResultsCpsc> recalls) 
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
			                .inflate(R.layout.list_item_recall_cpsc, null);
		     }
			 
			 // Configure the view for this Recall
			 ResultsCpsc a = getItem(position);
			 TextView titleTextView =
					 (TextView)convertView.findViewById(R.id.recall_list_item_idTextView);
			 titleTextView.setText(a.getRecallNumber());
			 TextView dateTextView =
					 (TextView)convertView.findViewById(R.id.recall_list_item_dateTextView);
			 dateTextView.setText(a.getRecallDate());
			 TextView descriptionTextView =
		    		 (TextView)convertView.findViewById(R.id.recall_list_item_descriptionTextView);
		     descriptionTextView.setText(a.descriptionsToString());

			 return convertView;
			 
		 }
	 }
	 
	 private class NhtsaAdapter extends ArrayAdapter<ResultsNhtsa> 
	 {
		 public NhtsaAdapter(ArrayList<ResultsNhtsa> recalls) 
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
			                .inflate(R.layout.list_item_recall_nhtsa, null);
		     }
			 
			 // Configure the view for this Recall
			 ResultsNhtsa a = getItem(position);

		     TextView titleTextView =
		    		 (TextView)convertView.findViewById(R.id.recall_list_item_idTextView);
		     titleTextView.setText(a.getRecallNumber());
		     TextView dateTextView =
		    		 (TextView)convertView.findViewById(R.id.recall_list_item_dateTextView);
		     dateTextView.setText(a.getRecallDate());
		     TextView componentDescriptionTextView =
		    		 (TextView)convertView.findViewById(R.id.recall_list_item_componentDescriptionTextView);
		     componentDescriptionTextView.setText(a.getComponentDescription());

		     return convertView; 
		 }
	 }
	 
	 private class FdaUsdaAdapter extends ArrayAdapter<ResultsFdaUsda> 
	 {
		 public FdaUsdaAdapter(ArrayList<ResultsFdaUsda> recalls) 
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
			                .inflate(R.layout.list_item_recall_fdausda, null);
		     }
			 
			 // Configure the view for this Recall
			 ResultsFdaUsda a = getItem(position);

		     TextView titleTextView =
		    		 (TextView)convertView.findViewById(R.id.recall_list_item_idTextView);
		     titleTextView.setText(a.getRecallNumber());
		     TextView dateTextView =
		    		 (TextView)convertView.findViewById(R.id.recall_list_item_dateTextView);
		     dateTextView.setText(a.getRecallDate());
		     TextView summaryTextView =
		    		 (TextView)convertView.findViewById(R.id.recall_list_item_summaryTextView);
		     summaryTextView.setText(a.getSummary());
		     

		     return convertView; 
		 }
	 }
	 
	 @Override
	 public void onResume() 
	 {
		 super.onResume();
		 if(mApi.getOrganization().equalsIgnoreCase("CPSC"))
		 {
			 ((CpscAdapter)getListAdapter()).notifyDataSetChanged();
		 }
		 else if(mApi.getOrganization().equalsIgnoreCase("NHTSA"))
		 {
			 ((NhtsaAdapter)getListAdapter()).notifyDataSetChanged();
		 }
		 else if(mApi.getOrganization().equalsIgnoreCase("FDAUSDA"))
		 {
			 ((FdaUsdaAdapter)getListAdapter()).notifyDataSetChanged();
		 } 
	 }
}
