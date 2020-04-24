package com.devzeta.edusearch


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

/**
 * A simple [Fragment] subclass.
 */
class googlescholor : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_googlescholor, container, false)
        val activity: resultsactivity? = activity as resultsactivity?
        val myDataFromActivity: String? = activity!!.getMyData()
        println(myDataFromActivity)
        val webview = view.findViewById(R.id.webgooglescholor) as WebView
        webview.settings.javaScriptEnabled = true
        webview.webViewClient = WebViewClient()
        webview.loadUrl("https://scholar.google.com/scholar?q=$myDataFromActivity")
        return view
    }


}
