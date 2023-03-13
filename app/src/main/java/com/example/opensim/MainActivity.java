package com.example.opensim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.PackageManager;
import android.os.Bundle;

import android.support.test.InstrumentationRegistry;

//import org.simalliance.openmobileapi.Channel;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		supportOMAPIReaders();

//		SEServiceCallback callback = new SEServiceCallback();
//		new SEService(this, callback);
	}

	private boolean supportOMAPIReaders() {
		final PackageManager pm = InstrumentationRegistry.getContext().getPackageManager();
		return (pm.hasSystemFeature(PackageManager.FEATURE_SE_OMAPI_UICC)
				|| pm.hasSystemFeature(PackageManager.FEATURE_SE_OMAPI_ESE)
				|| pm.hasSystemFeature(PackageManager.FEATURE_SE_OMAPI_SD));
	}

/*
	private void performTest() {
		Reader[] readers = _service.getReaders();
		logText("Available readers:  \n");
		for (Reader reader : readers)
			logText("	" + reader.getName() + "   - " + ((reader.isSecureElementPresent()) ? "present" : "absent") + "\n");

		if (readers.length == 0) {
			logText("No reader available \n");
			return;
		}
	}
	*/
}