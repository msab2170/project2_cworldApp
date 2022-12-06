package com.example.cworldapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import com.example.cworldapp.databinding.FragmentSaleBinding

class SaleFragment : Fragment() {
	override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState) }

	override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?	): View? {
		val binding = FragmentSaleBinding.inflate(inflater, container, false)

		var url = "http://192.168.0.2:8087/cworldApp/m_product_list?pcb=S"
		binding.webView.webViewClient = WebViewClient()
		binding.webView.settings.javaScriptEnabled = true
		binding.webView.loadUrl(url)

		binding.txtTent.setOnClickListener {
			Log.d("click","Tent Click")
			var url1 = "http://192.168.0.2:8087/cworldApp/m_product_list?pcb=S&pcs=S01"

			binding.webView.loadUrl(url1)
		}

		binding.txtTarp.setOnClickListener {
			Log.d("click","Tarp Click")
			var url2 = "http://192.168.0.2:8087/cworldApp/m_product_list?pcb=S&pcs=S02"
			binding.webView.loadUrl(url2)
		}

		binding.txtBedding.setOnClickListener {
			Log.d("click","Bedding Click")
			var url3 = "http://192.168.0.2:8087/cworldApp/m_product_list?pcb=S&pcs=S03"
			binding.webView.loadUrl(url3)
		}

		binding.txtChair.setOnClickListener {
			Log.d("click","Chair Click")
			var url4 = "http://192.168.0.2:8087/cworldApp/m_product_list?pcb=S&pcs=S04"
			binding.webView.loadUrl(url4)
		}

		binding.txtFire.setOnClickListener {
			Log.d("click","Fire Click")
			var url5 = "http://192.168.0.2:8087/cworldApp/m_product_list?pcb=S&pcs=S05"
			binding.webView.loadUrl(url5)
		}

		binding.txtTableware.setOnClickListener {
			Log.d("click","Tableware Click")
			var url6 = "http://192.168.0.2:8087/cworldApp/m_product_list?pcb=S&pcs=S06"
			binding.webView.loadUrl(url6)
		}
		return binding.root


	}
}