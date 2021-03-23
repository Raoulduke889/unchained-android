package com.github.livingwithhippos.unchained.search.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.github.livingwithhippos.unchained.base.UnchainedFragment
import com.github.livingwithhippos.unchained.databinding.FragmentSearchBinding
import com.github.livingwithhippos.unchained.search.viewmodel.SearchViewModel
import com.github.livingwithhippos.unchained.utilities.EventObserver
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchFragment : UnchainedFragment() {

    private val viewModel: SearchViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val searchBinding = FragmentSearchBinding.inflate(inflater, container, false)

        searchBinding.button.setOnClickListener {
            viewModel.fetchAppDetails()
        }

        viewModel.resultLiveData.observe(viewLifecycleOwner, EventObserver { details ->
            details?.let {
                val text = (it.name + " " + it.appData.description)
                searchBinding.text.text = text
            }
        })

        return searchBinding.root
    }
}