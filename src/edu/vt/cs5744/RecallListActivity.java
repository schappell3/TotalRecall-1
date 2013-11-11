package edu.vt.cs5744;

import android.support.v4.app.Fragment;

public class RecallListActivity extends SingleFragmentActivity 
{
	@Override
	protected Fragment createFragment() 
	{
		return new RecallListFragment();
	}
}
