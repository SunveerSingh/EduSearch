package com.devzeta.edusearch


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment

/**
 * A simple [Fragment] subclass.
 */
class googlesearch : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view  = inflater.inflate(R.layout.fragment_googlesearch, container, false)
        val activity: resultsactivity? = activity as resultsactivity?
        val myDataFromActivity: String? = activity!!.getMyData()
        println(myDataFromActivity)
        val webview = view.findViewById(R.id.webviewgooglesearch) as WebView
        webview.settings.javaScriptEnabled = true
        webview.webViewClient = WebViewClient()
        webview.loadUrl("https://www.google.com/search?client&q=$myDataFromActivity")



        return view
    }


}

