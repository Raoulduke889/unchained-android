package com.github.livingwithhippos.unchained.navigation

import com.github.livingwithhippos.unchained.R

object nav_graph {

    const val id = R.id.nav_graph

    object dest {
        const val nav_graph_home = R.id.navigation_home
        const val nav_graph_list = R.id.navigation_lists
        const val nav_graph_search = R.id.navigation_search
    }

    object action {
        const val to_home_nav = 1
        const val to_list_nav = 2
        const val to_search_nav = 3
    }

    object args {
    }

}

object home_nav_graph {

    const val id = R.id.navigation_home

    object dest {
        const val start = R.id.start_dest
        const val authentication = R.id.authentication_dest
        const val user = R.id.user_dest
    }

    object action {
        const val to_auth_flow = 4
        const val to_user_details = 5
    }

    object args {
    }

}

object list_nav_graph {

    const val id = R.id.navigation_lists

    object dest {
        const val lists = R.id.list_tabs_dest
        const val download_details = R.id.download_details_dest
        const val torrent_details = R.id.torrent_details_dest
        const val folder_details = R.id.folder_list_fragment
        const val new_download = R.id.new_download_fragment
    }

    object action {
        const val list_to_download_details = 6
        const val to_torrent_details = 7
        const val to_folder_details = 8
        const val to_new_download = 9
        const val torrent_to_download_details = 10
        const val torrent_to_folder_details = 11
        const val folder_to_download_details = 12
    }

    object args {
    }

}

object search_nav_graph {

    const val id = R.id.navigation_search

    object dest {
        const val search = R.id.search_dest
        const val search_item = R.id.search_item_dest
    }

    object action {
        const val to_search_item = 13
    }

    object args {
    }

}