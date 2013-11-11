package edu.vt.cs5744;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

public class RecallPagerActivity extends FragmentActivity 
{
	private ViewPager mViewPager;
	private ReturnApi mApi;

    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        mViewPager = new ViewPager(this);
        mViewPager.setId(R.id.viewPager);
        setContentView(mViewPager);
        
        mApi = RecallReceiver.get(this).getReturnApi();
        
        FragmentManager fm = getSupportFragmentManager();
        mViewPager.setAdapter(new FragmentStatePagerAdapter(fm) 
        {
            @Override
            public int getCount() 
            {
            	if(mApi.getOrganization().equalsIgnoreCase("CPSC"))
            	{
            		return mApi.getCpsc().getSuccess().getResults().size();
            	}
            	else if(mApi.getOrganization().equalsIgnoreCase("NHTSA"))
            	{
            		return mApi.getNhtsa().getSuccess().getResults().size();
            	}
            	else if(mApi.getOrganization().equalsIgnoreCase("FDAUSDA"))
            	{
            		return mApi.getFdausda().getSuccess().getResults().size();
            	} 
            	else
            	{
            		return 0;
            	}
            }

            @Override
            public Fragment getItem(int pos) 
            {
            	if(mApi.getOrganization().equalsIgnoreCase("CPSC"))
            	{
            		ResultsCpsc recall = mApi.getCpsc().getSuccess().getResults().get(pos);
                    return RecallFragment.newInstance(recall.getRecallNumber());
            	}
            	else if(mApi.getOrganization().equalsIgnoreCase("NHTSA"))
            	{
            		ResultsNhtsa recall = mApi.getNhtsa().getSuccess().getResults().get(pos);
                    return RecallFragment.newInstance(recall.getRecallNumber());
            	}
            	else if(mApi.getOrganization().equalsIgnoreCase("FDAUSDA"))
            	{
            		ResultsFdaUsda recall = mApi.getFdausda().getSuccess().getResults().get(pos);
                    return RecallFragment.newInstance(recall.getRecallNumber());
            	} 
            	else
            	{
            		return null;
            	}
            }
        });
        
        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() 
        {
            public void onPageScrollStateChanged(int state) { }

            public void onPageScrolled(int pos, float posOffset, int posOffsetPixels) { }

            public void onPageSelected(int pos) 
            {
            	if(mApi.getOrganization().equalsIgnoreCase("CPSC"))
            	{
            		ResultsCpsc recall = mApi.getCpsc().getSuccess().getResults().get(pos);
            		if (recall.getRecallNumber() != null) 
                    {
                        setTitle(recall.getRecallNumber());
                    }
            	}
            	else if(mApi.getOrganization().equalsIgnoreCase("NHTSA"))
            	{
            		ResultsNhtsa recall = mApi.getNhtsa().getSuccess().getResults().get(pos);
            		if (recall.getRecallNumber() != null) 
                    {
                        setTitle(recall.getRecallNumber());
                    }
            	}
            	else if(mApi.getOrganization().equalsIgnoreCase("FDAUSDA"))
            	{
            		ResultsFdaUsda recall = mApi.getFdausda().getSuccess().getResults().get(pos);
            		if (recall.getRecallNumber() != null) 
                    {
                        setTitle(recall.getRecallNumber());
                    }
            	}  
            }
        });
        
        String recall_number = (String)getIntent()
                .getSerializableExtra(RecallFragment.EXTRA_RECALL_ID);
        if(mApi.getOrganization().equalsIgnoreCase("CPSC"))
    	{
        	for (int i = 0; i < mApi.getCpsc().getSuccess().getResults().size(); i++) 
            {
            	if (mApi.getCpsc().getSuccess().getResults().get(i).getRecallNumber().equals(recall_number)) 
                {
            		mViewPager.setCurrentItem(i);
                    break;
                } 
            }
    	}
    	else if(mApi.getOrganization().equalsIgnoreCase("NHTSA"))
    	{
    		for (int i = 0; i < mApi.getNhtsa().getSuccess().getResults().size(); i++) 
            {
            	if (mApi.getNhtsa().getSuccess().getResults().get(i).getRecallNumber().equals(recall_number)) 
                {
            		mViewPager.setCurrentItem(i);
                    break;
                } 
            }
    	}
    	else if(mApi.getOrganization().equalsIgnoreCase("FDAUSDA"))
    	{
    		for (int i = 0; i < mApi.getFdausda().getSuccess().getResults().size(); i++) 
            {
            	if (mApi.getFdausda().getSuccess().getResults().get(i).getRecallNumber().equals(recall_number)) 
                {
            		mViewPager.setCurrentItem(i);
                    break;
                } 
            }
    	}  
    }
}
