package com.wzx.test.scrollviewviewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.ArrayList;
import java.util.List;

public class Content3Fragment extends Fragment {


	private ArrayList<String> mDatas;
	private RecyclerView mRecyclerView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view =  inflater.inflate(R.layout.fragment_content3, container, false);
		mRecyclerView = ((RecyclerView) view.findViewById(R.id.listview));
		mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
		mRecyclerView.setNestedScrollingEnabled(false);
		mDatas = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			mDatas.add("I like android " + i);
		}
		mRecyclerView.setAdapter(new MyAdapter(mDatas));


		return view;
	}

	class  MyAdapter extends BaseQuickAdapter<String,BaseViewHolder>{


		public MyAdapter(@Nullable List<String> data) {
			super(android.R.layout.simple_list_item_1, data);
		}

		@Override
		protected void convert(BaseViewHolder helper, String item) {
			helper.setText(android.R.id.text1,item);
		}
	}
	
}
