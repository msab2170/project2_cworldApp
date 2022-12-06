package com.example.cworldapp


import android.annotation.TargetApi
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.cworldapp.databinding.FragmentRentBinding

class RentFragment : Fragment() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
	}

	var client: WebViewClient = object : WebViewClient() {

		@TargetApi(Build.VERSION_CODES.N)
		override fun shouldOverrideUrlLoading(view: WebView, request: WebResourceRequest): Boolean {
			return false
		}

	}

	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		val binding = FragmentRentBinding.inflate(inflater, container, false)
		var url = "http://192.168.0.2:8087/cworldApp/m_product_list?pcb=R"

		WebView.setWebContentsDebuggingEnabled(true)
		binding.webView.apply {
			settings.javaScriptEnabled = true
			settings.javaScriptCanOpenWindowsAutomatically = true
			settings.setSupportMultipleWindows(true)
			webViewClient = client

		}

		binding.webView!!.loadUrl(url)

		binding.txtTent.setOnClickListener {
			Log.d("click", "Tent Click")
			var url1 = "http://192.168.0.2:8087/cworldApp/m_product_list?pcb=R&pcs=R01"
			binding.webView!!.loadUrl(url1)
		}

		binding.txtTarp.setOnClickListener {
			Log.d("click", "Tarp Click")
			var url2 = "http://192.168.0.2:8087/cworldApp/m_product_list?pcb=R&pcs=R02"
			binding.webView.loadUrl(url2)
		}

		binding.txtBedding.setOnClickListener {
			Log.d("click", "Bedding Click")
			var url3 = "http://192.168.0.2:8087/cworldApp/m_product_list?pcb=R&pcs=R03"
			binding.webView.loadUrl(url3)
		}

		binding.txtChair.setOnClickListener {
			Log.d("click", "Chair Click")
			var url4 = "http://192.168.0.2:8087/cworldApp/m_product_list?pcb=R&pcs=R04"
			binding.webView.loadUrl(url4)
		}

		binding.txtFire.setOnClickListener {
			Log.d("click", "Fire Click")
			var url5 = "http://192.168.0.2:8087/cworldApp/m_product_list?pcb=R&pcs=R05"
			binding.webView.loadUrl(url5)
		}

		binding.txtTableware.setOnClickListener {
			Log.d("click", "Tableware Click")
			var url6 = "http://192.168.0.2:8087/cworldApp/m_product_list?pcb=R&pcs=R06"
			binding.webView.loadUrl(url6)
		}

		return binding.root
	}
}
