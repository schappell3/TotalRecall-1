package edu.vt.cs5744;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class RecallFragment extends Fragment 
{
	public static final String EXTRA_RECALL_ID =
	        "com.example.portcriminalintent.recall_id";
	private ReturnApi mApi;
	private ResultsCpsc mCpsc;
	private ResultsNhtsa mNhtsa;
	private ResultsFdaUsda mFdaUsda;

    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
    	super.onCreate(savedInstanceState);
    	String recall_number = (String)getArguments().getSerializable(EXTRA_RECALL_ID);
    	
    	mApi = RecallReceiver.get(getActivity()).getReturnApi();
    	if(mApi.getOrganization().equalsIgnoreCase("CPSC"))
		{
    		mCpsc = RecallReceiver.get(getActivity()).getResultsCpsc(recall_number);
		}
		else if(mApi.getOrganization().equalsIgnoreCase("NHTSA"))
		{
			mNhtsa = RecallReceiver.get(getActivity()).getResultsNhtsa(recall_number);
		}
		else if(mApi.getOrganization().equalsIgnoreCase("FDAUSDA"))
		{
			mFdaUsda = RecallReceiver.get(getActivity()).getResultsFdaUsda(recall_number);
		}
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
            Bundle savedInstanceState) 
    {
        if(mApi.getOrganization().equalsIgnoreCase("CPSC"))
		{
        	View v = inflater.inflate(R.layout.fragment_recall_cpsc, parent, false);
        	
        	TextView mOrganizationField = (TextView)v.findViewById(R.id.recall_organization);
        	mOrganizationField.setText(mCpsc.getOrganization());
        	
            TextView mNumberField = (TextView)v.findViewById(R.id.recall_number);
            mNumberField.setText(mCpsc.getRecallNumber());
            
            TextView mDateField = (TextView)v.findViewById(R.id.recall_date);
            mDateField.setText(mCpsc.getRecallDate());
            
            TextView mUrlField = (TextView)v.findViewById(R.id.recall_url);
            mUrlField.setText(mCpsc.getRecallUrl());
            
            TextView mManufacturersField = (TextView)v.findViewById(R.id.recall_manufacturers);
            mManufacturersField.setText(mCpsc.manufacturersToString());
            
            TextView mTypeField = (TextView)v.findViewById(R.id.recall_types);
            mTypeField.setText(mCpsc.typeToString());
            
            TextView mDescriptionsField = (TextView)v.findViewById(R.id.recall_descriptions);
            mDescriptionsField.setText(mCpsc.descriptionsToString());
            
            TextView mUpcsField = (TextView)v.findViewById(R.id.recall_upcs);
            mUpcsField.setText(mCpsc.upcsToString());
            
            TextView mHazardsField = (TextView)v.findViewById(R.id.recall_hazards);
            mHazardsField.setText(mCpsc.hazardsToString());
            
            TextView mCountriesField = (TextView)v.findViewById(R.id.recall_countries);
            mCountriesField.setText(mCpsc.countriesToString());  
            
            return v;
		}
		else if(mApi.getOrganization().equalsIgnoreCase("NHTSA"))
		{
			View v = inflater.inflate(R.layout.fragment_recall_nhtsa, parent, false);
			
			TextView mOrganizationField = (TextView)v.findViewById(R.id.recall_organization);
        	mOrganizationField.setText(mNhtsa.getOrganization());
        	
            TextView mNumberField = (TextView)v.findViewById(R.id.recall_number);
            mNumberField.setText(mNhtsa.getRecallNumber());
            
            TextView mDateField = (TextView)v.findViewById(R.id.recall_date);
            mDateField.setText(mNhtsa.getRecallDate());
            
            TextView mUrlField = (TextView)v.findViewById(R.id.recall_url);
            mUrlField.setText(mNhtsa.getRecallUrl());
            
            TextView mRecordsField = (TextView)v.findViewById(R.id.recall_records);
            mRecordsField.setText(mNhtsa.recordsToString());
	        
            TextView mManufacturerCampaignNumberField = (TextView)v.findViewById(R.id.recall_manufacturer_campaign_number);
            mManufacturerCampaignNumberField.setText(mNhtsa.getManufacturerCampaignNumber());
            
            TextView mComponentDescriptionField = (TextView)v.findViewById(R.id.recall_component_description);
            mComponentDescriptionField.setText(mNhtsa.getComponentDescription());
            
            TextView mManufacturerField = (TextView)v.findViewById(R.id.recall_manufacturer);
            mManufacturerField.setText(mNhtsa.getManufacturer());
            
            TextView mCodeField = (TextView)v.findViewById(R.id.recall_code);
            mCodeField.setText(mNhtsa.getCode());
            
            TextView mPotentialUnitsAffectedField = (TextView)v.findViewById(R.id.recall_potential_units_affected);
            mPotentialUnitsAffectedField.setText(mNhtsa.getPotentialUnitsAffected());
            
            TextView mInitiatorField = (TextView)v.findViewById(R.id.recall_initiator);
            mInitiatorField.setText(mNhtsa.getInitiator());
            
            TextView mReportDateField = (TextView)v.findViewById(R.id.recall_report_date);
            mReportDateField.setText(mNhtsa.getRecallDate());
            
            TextView mDefectSummaryField = (TextView)v.findViewById(R.id.recall_defect_summary);
            mDefectSummaryField.setText(mNhtsa.getDefectSummary());
            
            TextView mConsequenceSummaryField = (TextView)v.findViewById(R.id.recall_consequence_summary);
            mConsequenceSummaryField.setText(mNhtsa.getConsequenceSummary());
            
            TextView mCorrectiveSummaryField = (TextView)v.findViewById(R.id.recall_corrective_summary);
            mCorrectiveSummaryField.setText(mNhtsa.getCorrectiveSummary());
            
            TextView mNotesField = (TextView)v.findViewById(R.id.recall_notes);
            mNotesField.setText(mNhtsa.getNotes());
            
            TextView mRecallSubjectField = (TextView)v.findViewById(R.id.recall_recall_subject);
            mRecallSubjectField.setText(mNhtsa.getRecallSubject());
            
	        return v;
		}
		else if(mApi.getOrganization().equalsIgnoreCase("FDAUSDA"))
		{
			View v = inflater.inflate(R.layout.fragment_recall_fdausda, parent, false);
			
			TextView mOrganizationField = (TextView)v.findViewById(R.id.recall_organization);
			mOrganizationField.setText(mFdaUsda.getOrganization());
	        
	        TextView mNumberField = (TextView)v.findViewById(R.id.recall_number);
	        mNumberField.setText(mFdaUsda.getRecallNumber());
	        
	        TextView mDateField = (TextView)v.findViewById(R.id.recall_date);
	        mDateField.setText(mFdaUsda.getRecallDate());
	        
	        TextView mUrlField = (TextView)v.findViewById(R.id.recall_url);
	        mUrlField.setText(mFdaUsda.getUrl());
	        
	        TextView mDescriptionField = (TextView)v.findViewById(R.id.recall_description);
	        mDescriptionField.setText(mFdaUsda.getDescription());
	        
	        TextView mSummaryField = (TextView)v.findViewById(R.id.recall_summary);
	        mSummaryField.setText(mFdaUsda.getSummary());
	        
	        return v;
		} 
		else
		{
			return null;
		}
    }
    
    public static RecallFragment newInstance(String RecallId) 
    {
        Bundle args = new Bundle();
        args.putSerializable(EXTRA_RECALL_ID, RecallId);

        RecallFragment fragment = new RecallFragment();
        fragment.setArguments(args);

        return fragment;
    }
}
