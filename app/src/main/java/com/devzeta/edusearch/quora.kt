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
class quora : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_quora, container, false)
        val activity: resultsactivity? = activity as resultsactivity?
        val myDataFromActivity: String? = activity!!.getMyData()
        println(myDataFromActivity)
        val webview = view.findViewById(R.id.webquora) as WebView
        webview.settings.javaScriptEnabled = true
        webview.webViewClient = WebViewClient()
        webview.loadUrl("https://www.quora.com/search?q=$myDataFromActivity")
        return view
    }


}
