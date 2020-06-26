package com.nwu.studentsupport.Fragment;
import android.app.ProgressDialog;
import android.os.*;

import androidx.annotation.Nullable;

import android.util.Log;
import android.view.*;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import com.nwu.studentsupport.R;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;


public class FtagmentSlybsThirdYear extends Fragment {
    WebView mWebView;
    ProgressDialog progressDialog;

	CardView x;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.sl3, container, false);


    }
	/*@Override
	 public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
	 super.onViewCreated(view, savedInstanceState);
	 ImageView iamge = (ImageView) view.findViewById(R.id.vector); */


	@Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mWebView = (WebView) getActivity().findViewById(R.id.webview2);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setWebChromeClient(new WebChromeClient() {
            public boolean onConsoleMessage(ConsoleMessage cm) {
                String TAG = null;
                Log.d(TAG, cm.message() + " -- From line "
                        + cm.lineNumber() + " of "
                        + cm.sourceId() );
                return true;
            }

        });
        mWebView.loadUrl("file:///android_asset/slybs.html");
        mWebView.loadUrl("javascript:plot()");
    }




    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        //x.setRadius(10);
    }

}

