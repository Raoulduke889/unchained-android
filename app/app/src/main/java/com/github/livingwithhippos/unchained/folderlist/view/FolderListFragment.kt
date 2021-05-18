package com.github.livingwithhippos.unchained.folderlist.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResultListener
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.github.livingwithhippos.unchained.data.model.DownloadItem
import com.github.livingwithhippos.unchained.databinding.FragmentFolderListBinding
import com.github.livingwithhippos.unchained.folderlist.model.FolderItemAdapter
import com.github.livingwithhippos.unchained.folderlist.viewmodel.FolderListViewModel
import com.github.livingwithhippos.unchained.lists.view.DownloadContextualDialogFragment
import com.github.livingwithhippos.unchained.lists.view.DownloadListListener
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class FolderListFragment : Fragment(), DownloadListListener {

    var _binding: FragmentFolderListBinding? = null
    val binding get() = _binding!!

    private val viewModel: FolderListViewModel by viewModels()
    private val args: FolderListFragmentArgs by navArgs()

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFolderListBinding.inflate(inflater, container, false)

        setup(args.folderFiles)
        return binding.root
    }

    private fun setup(folderLink: Array<DownloadItem>) {

        val adapter = FolderItemAdapter(this)
        binding.rvFolderList.adapter = adapter
        adapter.submitList(folderLink.toList())

        setFragmentResultListener("downloadActionKey") { _, bundle ->
            bundle.getString("deletedDownloadKey")?.let {
                viewModel.deleteDownload(it)
            }
            bundle.getParcelable<DownloadItem>("openedDownloadItem")?.let {
                onClick(it)
            }
        }
    }

    override fun onClick(item: DownloadItem) {
        val action = FolderListFragmentDirections.actionFolderListFragmentToDownloadDetailsDest(item)
        findNavController().navigate(action)
    }

    override fun onLongClick(item: DownloadItem) {
        val dialog = DownloadContextualDialogFragment(item)
        dialog.show(parentFragmentManager, "DownloadContextualDialogFragment")
    }
}