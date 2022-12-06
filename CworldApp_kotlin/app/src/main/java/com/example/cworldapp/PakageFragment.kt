package com.example.cworldapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import com.example.cworldapp.databinding.FragmentPakageBinding

class PakageFragment : Fragment() {
	override fun onCreate(savedInstanceState: Bundle?) {super.onCreate(savedInstanceState)}

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
		val binding = FragmentPakageBinding.inflate(inflater, container, false)

		var url = "http://192.168.0.2:8087/cworldApp/m_product_list?pcb=P"
		binding.webView.webViewClient = WebViewClient()
		binding.webView.settings.javaScriptEnabled = true
		binding.webView.loadUrl(url)
		return binding.root
	}
}