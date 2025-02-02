package com.github.livingwithhippos.unchained.utilities

const val OPEN_SOURCE_CLIENT_ID = "X245A4XAIBGVM"

const val OPEN_SOURCE_GRANT_TYPE = "http://oauth.net/grant_type/device/1.0"

const val BASE_URL = "https://api.real-debrid.com/rest/1.0/"
const val BASE_AUTH_URL = "https://api.real-debrid.com/oauth/v2/"
const val REFERRAL_LINK = "http://real-debrid.com/?id=78841"
const val PREMIUM_LINK = "https://real-debrid.com/premium"
const val ACCOUNT_LINK = "https://real-debrid.com/account"
// unofficial link to get streaming from a browser page
const val RD_STREAMING_URL = "https://real-debrid.com/streaming-"

const val KEY_TOKEN: String = "TOKEN_KEY"

const val PRIVATE_TOKEN: String = "private_token"

const val REMOTE_TRAFFIC_OFF: Int = 0
const val REMOTE_TRAFFIC_ON: Int = 1

const val MAGNET_PATTERN: String = "magnet:\\?xt=urn:btih:[a-zA-Z0-9]{32}"
const val TORRENT_PATTERN: String = "https?://[^\\s]{7,}\\.torrent"
const val CONTAINER_PATTERN: String = "https?://[^\\s]{7,}\\.(rsdf|ccf3|ccf|dlc)"
const val CONTAINER_EXTENSION_PATTERN: String = "[^\\s]+\\.(rsdf|ccf3|ccf|dlc)$"

const val FEEDBACK_URL = "https://github.com/LivingWithHippos/unchained-android"
const val PLUGINS_URL =
    "https://github.com/LivingWithHippos/unchained-android/tree/master/extra_assets/plugins"
const val GPLV3_URL = "https://www.gnu.org/licenses/gpl-3.0.en.html"

const val SCHEME_MAGNET = "magnet"
const val SCHEME_HTTP = "http"
const val SCHEME_HTTPS = "https"

val errorMap = mapOf(
    -1 to "Internal error",
    1 to "Missing parameter",
    2 to "Bad parameter value",
    3 to "Unknown method",
    4 to "Method not allowed",
    5 to "Slow down",
    6 to "Resource unreachable",
    7 to "Resource not found",
    8 to "Bad token",
    9 to "Permission denied",
    10 to "Two-Factor authentication needed",
    11 to "Two-Factor authentication pending",
    12 to "Invalid login",
    13 to "Invalid password",
    14 to "Account locked",
    15 to "Account not activated",
    16 to "Unsupported hoster",
    17 to "Hoster in maintenance",
    18 to "Hoster limit reached",
    19 to "Hoster temporarily unavailable",
    20 to "Hoster not available for free users",
    21 to "Too many active downloads",
    22 to "IP Address not allowed",
    23 to "Traffic exhausted",
    24 to "File unavailable",
    25 to "Service unavailable",
    26 to "Upload too big",
    27 to "Upload error",
    28 to "File not allowed",
    29 to "Torrent too big",
    30 to "Torrent file invalid",
    31 to "Action already done",
    32 to "Image resolution error",
    33 to "Torrent already active"
)

// Torrent status list

val endedStatusList = listOf("magnet_error", "downloaded", "error", "virus", "dead")

// possible status are magnet_error, magnet_conversion, waiting_files_selection,
// queued, downloading, downloaded, error, virus, compressing, uploading, dead
val loadingStatusList = listOf(
    "downloading",
    "magnet_conversion",
    "waiting_files_selection",
    "queued",
    "compressing",
    "uploading"
)
