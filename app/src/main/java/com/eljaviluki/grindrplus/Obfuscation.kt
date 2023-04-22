package com.eljaviluki.grindrplus

object Obfuscation {
    object GApp {
        object api {
            private const val _api = Constants.GRINDR_PKG + ".api"

            const val GrindrRestService = "$_api.GrindrRestService"
            object GrindrRestService_ {
                const val recordProfileViews = "W"
            }
        }

        object base {
            private const val _base = Constants.GRINDR_PKG + ".base"

            object Experiment {
                private const val _experiment = "$_base.experiment"

                const val IExperimentsManager = "$_experiment.a"
            }
        }

        object experiment {
            private const val _experiment = Constants.GRINDR_PKG + ".experiment"

            const val Experiments = "$_experiment.f"
            object Experiments_ {
                const val uncheckedIsEnabled_expMgr = "c"
            }
        }

        object manager {
            private const val _manager = Constants.GRINDR_PKG + ".manager"
            const val BlockInteractor = "$_manager.o"
            object BlockInteractor_ {
                const val blockstream = "n"
                const val processAndRemoveBlockedProfiles = "D"
            }
        }

        object model {
            private const val _model = Constants.GRINDR_PKG + ".model"

            const val ExpiringImageBody = "$_model.ExpiringImageBody"
            object ExpiringImageBody_ {
                const val getDuration = "getDuration"
            }

            const val ExpiringPhotoStatusResponse = "$_model.ExpiringPhotoStatusResponse"
            object ExpiringPhotoStatusResponse_ {
                const val getTotal = "getTotal"
                const val getAvailable = "getAvailable"
            }

            const val Feature = "$_model.Feature"
            object Feature_ {
                const val isGranted = "isGranted"
            }

            const val UpsellsV8 = "$_model.UpsellsV8"
            object UpsellsV8_ {
                const val getMpuFree = "getMpuFree"
                const val getMpuXtra = "getMpuXtra"
            }

            const val Inserts = "$_model.Inserts"
            object Inserts_ {
                const val getMpuFree = "getMpuFree"
                const val getMpuXtra = "getMpuXtra"
            }

            const val ChatMessageParserCoroutine = "$_model.ChatMessageParser\$parseXmppMessage$2"
        }

        object persistence {
            private const val _persistence = Constants.GRINDR_PKG + ".persistence"

            object cache {
                private const val _cache = "$_persistence.cache"

                const val BlockedByHelper = "$_cache.BlockedByHelper"
                object BlockByHelper_ {
                    const val addBlockByProfile = "addBlockByProfile"
                    const val removeBlockByProfile = "removeBlockByProfile"
                }

            }

            object model {
                private const val _model = "$_persistence.model"

                const val ChatMessage = "$_model.ChatMessage"
                object ChatMessage_ {
                    const val TAP_TYPE_NONE = "TAP_TYPE_NONE"
                    const val getType = "getType"
                    const val setType = "setType"
                    const val setBody = "setBody"
                }

                const val Profile = "$_model.Profile"
            }

            object repository {
                private const val _repository = "$_persistence.repository"

                const val ChatRepo = "$_repository.ChatRepo"
                object ChatRepo_ {
                    const val checkMessageForVideoCall = "checkMessageForVideoCall"
                }

                const val ProfileRepo = "$_repository.ProfileRepo"
                object ProfileRepo_ {
                    const val delete = "delete"
                }
            }
        }

        object R {
            private const val _R = Constants.GRINDR_PKG

            const val color = "$_R.m0"
            object color_ {
                const val grindr_gold_star_gay = "F"
                const val grindr_pure_white = "V"
            }
        }

        object storage {
            private const val _storage = Constants.GRINDR_PKG + ".storage"

            const val UserSession = "$_storage.z0"

            const val IUserSession = "$_storage.UserSession"
            object IUserSession_ {
                const val hasFeature_feature = "a"
                const val isFree = "r"
                const val isNoXtraUpsell = "g"
                const val isXtra = "o"
                const val isUnlimited = "x"
            }
        }

        object ui {
            private const val _ui = Constants.GRINDR_PKG + ".ui"

            object profileV2 {
                private const val _profileV2 = "$_ui.profileV2"

                const val ProfileFieldsView = "$_profileV2.ProfileFieldsView"
                object ProfileFieldsView_ {
                    const val setProfile = "h"
                }
            }

            object chat {
                private const val _chat = "$_ui.chat"

                const val ChatBaseFragmentV2 = "$_chat.ChatBaseFragmentV2"
                object ChatBaseFragmentV2_ {
                    const val _canBeUnsent = "Y1"
                }
            }
        }

        object utils {
            private const val _utils = Constants.GRINDR_PKG + ".utils"

            const val ProfileUtils = "$_utils.n0"
            object ProfileUtils_ {
                const val onlineIndicatorDuration = "b"
            }
        }

        object view {
            private const val _view = Constants.GRINDR_PKG + ".view"

            const val ExtendedProfileFieldView = "$_view.z4"
            object ExtendedProfileFieldView_ {
                const val setLabel = "l"
                const val setValue = "n"
            }

            const val TapsAnimLayout = "$_view.TapsAnimLayout"
            object TapsAnimLayout_ {
                const val tapType = "i"

                const val getCanSelectVariants = "getCanSelectVariants"
                const val getDisableVariantSelection = "getDisableVariantSelection"
                const val setTapType = "S"
            }
        }
    }
}