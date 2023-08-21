package com.nordskog.customdragview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setupButtons();
	}

	private void setupButtons()
	{
		TrafficLightContainer container = findViewById(R.id.traffic_light_container);

		findViewById(R.id.add_button).setOnClickListener(view ->
		{
			container.addCell();
		});
		findViewById(R.id.remove_button).setOnClickListener(view -> {
			if (container.getChildCount() > 0 )
			{
				container.removeViewAt( container.getChildCount() - 1 );
			}
		});

		findViewById(R.id.increase_size_button).setOnClickListener(view -> container.setCellSize( container.getCellSize() + 1f ) );
		findViewById(R.id.decrease_size).setOnClickListener(view -> container.setCellSize( container.getCellSize() - 1f ) );
	}
}