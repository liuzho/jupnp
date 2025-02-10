/*
 * Copyright (C) 2011-2025 4th Line GmbH, Switzerland and others
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License Version 1 or later
 * ("CDDL") (collectively, the "License"). You may not use this file
 * except in compliance with the License. See LICENSE.txt for more
 * information.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * SPDX-License-Identifier: CDDL-1.0
 */
package org.jupnp.support.model.dlna;

/**
 * DLNA.ORG_PN: DLNA Profiles
 *
 * @author Mario Franco
 * @author Amit Kumar Mondal - Code Refactoring
 */
public enum DLNAProfiles {

    NONE("", ""),

    // Image
    JPEG_SM("JPEG_SM", DLNAMimeTypes.MIME_IMAGE_JPEG), /* Profile for image media class content of small resolution */
    JPEG_MED("JPEG_MED", DLNAMimeTypes.MIME_IMAGE_JPEG), /*
                                                          * Profile for image media class content of medium resolution
                                                          */
    JPEG_LRG("JPEG_LRG", DLNAMimeTypes.MIME_IMAGE_JPEG), /* Profile for image media class content of high resolution */
    JPEG_TN("JPEG_TN", DLNAMimeTypes.MIME_IMAGE_JPEG), /* Profile for image thumbnails */
    JPEG_SM_ICO("JPEG_SM_ICO", DLNAMimeTypes.MIME_IMAGE_JPEG), /* Profile for small icons */
    JPEG_LRG_ICO("JPEG_LRG_ICO", DLNAMimeTypes.MIME_IMAGE_JPEG), /* Profile for large icons */

    PNG_TN("PNG_TN", DLNAMimeTypes.MIME_IMAGE_PNG), /* Profile for image thumbnails */
    PNG_SM_ICO("PNG_SM_ICO", DLNAMimeTypes.MIME_IMAGE_PNG), /* Profile for small icons */
    PNG_LRG_ICO("PNG_LRG_ICO", DLNAMimeTypes.MIME_IMAGE_PNG), /* Profile for image class content of high resolution */
    PNG_LRG("PNG_LRG", DLNAMimeTypes.MIME_IMAGE_PNG),

    // Audio
    LPCM("LPCM", DLNAMimeTypes.MIME_AUDIO_LPCM),
    LPCM_LOW("LPCM_low", DLNAMimeTypes.MIME_AUDIO_LPCM),

    MP3("MP3", DLNAMimeTypes.MIME_AUDIO_MPEG),
    MP3X("MP3X", DLNAMimeTypes.MIME_AUDIO_MPEG),

    WMABASE("WMABASE", DLNAMimeTypes.MIME_AUDIO_WMA),
    WMAFULL("WMAFULL", DLNAMimeTypes.MIME_AUDIO_WMA),
    WMAPRO("WMAPRO", DLNAMimeTypes.MIME_AUDIO_WMA),

    AAC_ADTS("AAC_ADTS", DLNAMimeTypes.MIME_AUDIO_ADTS),
    AAC_ADTS_320("AAC_ADTS_320", DLNAMimeTypes.MIME_AUDIO_ADTS),
    AAC_ISO("AAC_ISO", DLNAMimeTypes.MIME_AUDIO_MPEG_4),
    AAC_ISO_320("AAC_ISO_320", DLNAMimeTypes.MIME_AUDIO_MPEG_4),
    AAC_LTP_ISO("AAC_LTP_ISO", DLNAMimeTypes.MIME_AUDIO_MPEG_4),
    AAC_LTP_MULT5_ISO("AAC_LTP_MULT5_ISO", DLNAMimeTypes.MIME_AUDIO_MPEG_4),
    AAC_LTP_MULT7_ISO("AAC_LTP_MULT7_ISO", DLNAMimeTypes.MIME_AUDIO_MPEG_4),
    AAC_MULT5_ADTS("AAC_MULT5_ADTS", DLNAMimeTypes.MIME_AUDIO_ADTS),
    AAC_MULT5_ISO("AAC_MULT5_ISO", DLNAMimeTypes.MIME_AUDIO_MPEG_4),

    HEAAC_L2_ADTS("HEAAC_L2_ADTS", DLNAMimeTypes.MIME_AUDIO_ADTS),
    HEAAC_L2_ISO("HEAAC_L2_ISO", DLNAMimeTypes.MIME_AUDIO_MPEG_4),
    HEAAC_L3_ADTS("HEAAC_L3_ADTS", DLNAMimeTypes.MIME_AUDIO_ADTS),
    HEAAC_L3_ISO("HEAAC_L3_ISO", DLNAMimeTypes.MIME_AUDIO_MPEG_4),
    HEAAC_MULT5_ADTS("HEAAC_MULT5_ADTS", DLNAMimeTypes.MIME_AUDIO_ADTS),
    HEAAC_MULT5_ISO("HEAAC_MULT5_ISO", DLNAMimeTypes.MIME_AUDIO_MPEG_4),
    HEAAC_L2_ADTS_320("HEAAC_L2_ADTS_320", DLNAMimeTypes.MIME_AUDIO_ADTS),
    HEAAC_L2_ISO_320("HEAAC_L2_ISO_320", DLNAMimeTypes.MIME_AUDIO_MPEG_4),

    BSAC_ISO("BSAC_ISO", DLNAMimeTypes.MIME_AUDIO_MPEG_4),
    BSAC_MULT5_ISO("BSAC_MULT5_ISO", DLNAMimeTypes.MIME_AUDIO_MPEG_4),

    HEAACv2_L2("HEAACv2_L2", DLNAMimeTypes.MIME_AUDIO_MPEG_4),
    HEAACv2_L2_ADTS("HEAACv2_L2", DLNAMimeTypes.MIME_AUDIO_ADTS),
    HEAACv2_L2_320("HEAACv2_L2_320", DLNAMimeTypes.MIME_AUDIO_MPEG_4),
    HEAACv2_L2_320_ADTS("HEAACv2_L2_320", DLNAMimeTypes.MIME_AUDIO_ADTS),
    HEAACv2_L3("HEAACv2_L3", DLNAMimeTypes.MIME_AUDIO_MPEG_4),
    HEAACv2_L3_ADTS("HEAACv2_L3", "vnd.dlna.adts"),
    HEAACv2_MULT5("HEAACv2_MULT5", DLNAMimeTypes.MIME_AUDIO_MPEG_4),
    HEAACv2_MULT5_ADTS("HEAACv2_MULT5", "vnd.dlna.adts"),

    AC3("AC3", DLNAMimeTypes.MIME_AUDIO_DOLBY_DIGITAL),

    AMR("AMR_3GPP", DLNAMimeTypes.MIME_AUDIO_MPEG_4),
    THREE_GPP("AMR_3GPP", DLNAMimeTypes.MIME_AUDIO_3GP),

    AMR_WBplus("AMR_WBplus", DLNAMimeTypes.MIME_AUDIO_3GP),
    ATRAC3("ATRAC3plus", DLNAMimeTypes.MIME_AUDIO_ATRAC),

    // Video
    WMVMED_BASE("WMVMED_BASE", DLNAMimeTypes.MIME_VIDEO_WMV),
    WMVMED_FULL("WMVMED_FULL", DLNAMimeTypes.MIME_VIDEO_WMV),
    WMVMED_PRO("WMVMED_PRO", DLNAMimeTypes.MIME_VIDEO_WMV),
    WMVHIGH_FULL("WMVHIGH_FULL", DLNAMimeTypes.MIME_VIDEO_WMV),
    WMVHIGH_PRO("WMVHIGH_PRO", DLNAMimeTypes.MIME_VIDEO_WMV),
    WMVHM_BASE("WMVHM_BASE", DLNAMimeTypes.MIME_VIDEO_WMV),
    WMVSPLL_BASE("WMVSPLL_BASE", DLNAMimeTypes.MIME_VIDEO_WMV),
    WMVSPML_BASE("WMVSPML_BASE", DLNAMimeTypes.MIME_VIDEO_WMV),
    WMVSPML_MP3("WMVSPML_MP3", DLNAMimeTypes.MIME_VIDEO_WMV),

    MPEG1("MPEG1", DLNAMimeTypes.MIME_VIDEO_MPEG),

    MPEG_PS_NTSC("MPEG_PS_NTSC", DLNAMimeTypes.MIME_VIDEO_MPEG),
    MPEG_PS_NTSC_XAC3("MPEG_PS_NTSC_XAC3", DLNAMimeTypes.MIME_VIDEO_MPEG),
    MPEG_PS_PAL("MPEG_PS_PAL", DLNAMimeTypes.MIME_VIDEO_MPEG),
    MPEG_PS_PAL_XAC3("MPEG_PS_PAL_XAC3", DLNAMimeTypes.MIME_VIDEO_MPEG),

    MPEG_TS_MP_LL_AAC("MPEG_TS_MP_LL_AAC", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG_TS_MP_LL_AAC_T("MPEG_TS_MP_LL_AAC_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG_TS_MP_LL_AAC_ISO("MPEG_TS_MP_LL_AAC_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),

    MPEG_TS_SD_50_L2_T("MPEG_TS_SD_50_L2_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG_TS_SD_60_L2_T("MPEG_TS_SD_60_L2_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG_TS_SD_60_AC3_T("MPEG_TS_SD_60_AC3_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),

    MPEG_TS_SD_EU("MPEG_TS_SD_EU", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG_TS_SD_EU_T("MPEG_TS_SD_EU_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG_TS_SD_EU_ISO("MPEG_TS_SD_EU_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    MPEG_TS_SD_50_AC3_T("MPEG_TS_SD_50_AC3_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),

    MPEG_TS_SD_NA("MPEG_TS_SD_NA", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG_TS_SD_NA_T("MPEG_TS_SD_NA_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG_TS_SD_NA_ISO("MPEG_TS_SD_NA_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    MPEG_TS_SD_NA_XAC3("MPEG_TS_SD_NA_XAC3", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG_TS_SD_NA_XAC3_T("MPEG_TS_SD_NA_XAC3_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG_TS_SD_NA_XAC3_ISO("MPEG_TS_SD_NA_XAC3_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),

    MPEG_TS_HD_NA("MPEG_TS_HD_NA", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG_TS_HD_NA_T("MPEG_TS_HD_NA_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG_TS_HD_50_L2_T("MPEG_TS_HD_50_L2_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG_TS_HD_50_L2_ISO("MPEG_TS_HD_50_L2_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    MPEG_TS_HD_60_L2_T("MPEG_TS_HD_60_L2_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG_TS_HD_60_L2_ISO("MPEG_TS_HD_60_L2_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),

    MPEG_TS_HD_NA_ISO("MPEG_TS_HD_NA_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    MPEG_TS_HD_NA_XAC3("MPEG_TS_HD_NA_XAC3", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG_TS_HD_NA_XAC3_T("MPEG_TS_HD_NA_XAC3_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG_TS_HD_NA_XAC3_ISO("MPEG_TS_HD_NA_XAC3_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),

    MPEG_ES_PAL("MPEG_ES_PAL", DLNAMimeTypes.MIME_VIDEO_MPEG),
    MPEG_ES_NTSC("MPEG_ES_NTSC", DLNAMimeTypes.MIME_VIDEO_MPEG),
    MPEG_ES_PAL_XAC3("MPEG_ES_PAL_XAC3", DLNAMimeTypes.MIME_VIDEO_MPEG),
    MPEG_ES_NTSC_XAC3("MPEG_ES_NTSC_XAC3", DLNAMimeTypes.MIME_VIDEO_MPEG),

    MPEG4_P2_MP4_SP_AAC("MPEG4_P2_MP4_SP_AAC", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    MPEG4_P2_MP4_SP_HEAAC("MPEG4_P2_MP4_SP_HEAAC", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    MPEG4_P2_MP4_SP_ATRAC3plus("MPEG4_P2_MP4_SP_ATRAC3plus", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    MPEG4_P2_MP4_SP_AAC_LTP("MPEG4_P2_MP4_SP_AAC_LTP", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    MPEG4_P2_MP4_SP_L2_AAC("MPEG4_P2_MP4_SP_L2_AAC", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    MPEG4_P2_MP4_SP_L2_AMR("MPEG4_P2_MP4_SP_L2_AMR", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    MPEG4_P2_MP4_SP_VGA_AAC("MPEG4_P2_MP4_SP_VGA_AAC", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    MPEG4_P2_MP4_SP_VGA_HEAAC("MPEG4_P2_MP4_SP_VGA_HEAAC", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    MPEG4_P2_MP4_ASP_AAC("MPEG4_P2_MP4_ASP_AAC", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    MPEG4_P2_MP4_ASP_HEAAC("MPEG4_P2_MP4_ASP_HEAAC", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    MPEG4_P2_MP4_ASP_HEAAC_MULT5("MPEG4_P2_MP4_ASP_HEAAC_MULT5", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    MPEG4_P2_MP4_ASP_ATRAC3plus("MPEG4_P2_MP4_ASP_ATRAC3plus", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    MPEG4_P2_MP4_ASP_L5_SO_AAC("MPEG4_P2_MP4_ASP_L5_SO_AAC", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    MPEG4_P2_MP4_ASP_L5_SO_HEAAC("MPEG4_P2_MP4_ASP_L5_SO_HEAAC", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    MPEG4_P2_MP4_ASP_L5_SO_HEAAC_MULT5("MPEG4_P2_MP4_ASP_L5_SO_HEAAC_MULT5", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    MPEG4_P2_MP4_ASP_L4_SO_AAC("MPEG4_P2_MP4_ASP_L4_SO_AAC", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    MPEG4_P2_MP4_ASP_L4_SO_HEAAC("MPEG4_P2_MP4_ASP_L4_SO_HEAAC", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    MPEG4_P2_MP4_ASP_L4_SO_HEAAC_MULT5("MPEG4_P2_MP4_ASP_L4_SO_HEAAC_MULT5", DLNAMimeTypes.MIME_VIDEO_MPEG_4),

    MPEG4_H263_MP4_P0_L10_AAC("MPEG4_H263_MP4_P0_L10_AAC", DLNAMimeTypes.MIME_VIDEO_3GP),
    MPEG4_H263_MP4_P0_L10_AAC_LTP("MPEG4_H263_MP4_P0_L10_AAC_LTP", DLNAMimeTypes.MIME_VIDEO_3GP),

    MPEG4_P2_TS_SP_AAC("MPEG4_P2_TS_SP_AAC", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG4_P2_TS_SP_AAC_T("MPEG4_P2_TS_SP_AAC_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG4_P2_TS_SP_AAC_ISO("MPEG4_P2_TS_SP_AAC_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    MPEG4_P2_TS_SP_MPEG1_L3("MPEG4_P2_TS_SP_MPEG1_L3", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG4_P2_TS_SP_MPEG1_L3_T("MPEG4_P2_TS_SP_MPEG1_L3_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG4_P2_TS_SP_MPEG1_L3_ISO("MPEG4_P2_TS_SP_MPEG1_L3_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    MPEG4_P2_TS_SP_AC3_L3("MPEG4_P2_TS_SP_AC3_L3", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG4_P2_TS_SP_AC3_T("MPEG4_P2_TS_SP_AC3_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG4_P2_TS_SP_AC3_ISO("MPEG4_P2_TS_SP_AC3_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    MPEG4_P2_TS_SP_MPEG2_L2("MPEG4_P2_TS_SP_MPEG2_L2", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG4_P2_TS_SP_MPEG2_L2_T("MPEG4_P2_TS_SP_MPEG2_L2_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG4_P2_TS_SP_MPEG2_L2_ISO("MPEG4_P2_TS_SP_MPEG2_L2_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    MPEG4_P2_TS_ASP_AAC("MPEG4_P2_TS_ASP_AAC", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG4_P2_TS_ASP_AAC_T("MPEG4_P2_TS_ASP_AAC_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG4_P2_TS_ASP_AAC_ISO("MPEG4_P2_TS_ASP_AAC_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    MPEG4_P2_TS_ASP_MPEG1_L3("MPEG4_P2_TS_ASP_MPEG1_L3", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG4_P2_TS_ASP_MPEG1_L3_T("MPEG4_P2_TS_ASP_MPEG1_L3_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG4_P2_TS_ASP_MPEG1_L3_ISO("MPEG4_P2_TS_ASP_MPEG1_L3_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    MPEG4_P2_TS_ASP_AC3_L3("MPEG4_P2_TS_ASP_AC3_L3", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG4_P2_TS_ASP_AC3_T("MPEG4_P2_TS_ASP_AC3_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG4_P2_TS_ASP_AC3_ISO("MPEG4_P2_TS_ASP_AC3_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    MPEG4_P2_TS_CO_AC3("MPEG4_P2_TS_CO_AC3", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG4_P2_TS_CO_AC3_T("MPEG4_P2_TS_CO_AC3_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG4_P2_TS_CO_AC3_ISO("MPEG4_P2_TS_CO_AC3_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    MPEG4_P2_TS_CO_MPEG2_L2("MPEG4_P2_TS_CO_MPEG2_L2", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG4_P2_TS_CO_MPEG2_L2_T("MPEG4_P2_TS_CO_MPEG2_L2_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    MPEG4_P2_TS_CO_MPEG2_L2_ISO("MPEG4_P2_TS_CO_MPEG2_L2_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),

    MPEG4_P2_ASF_SP_G726("MPEG4_P2_ASF_SP_G726", DLNAMimeTypes.MIME_VIDEO_ASF),
    MPEG4_P2_ASF_ASP_L5_SO_G726("MPEG4_P2_ASF_ASP_L5_SO_G726", DLNAMimeTypes.MIME_VIDEO_ASF),
    MPEG4_P2_ASF_ASP_L4_SO_G726("MPEG4_P2_ASF_ASP_L4_SO_G726", DLNAMimeTypes.MIME_VIDEO_ASF),

    MPEG4_H263_3GPP_P0_L10_AMR_WBplus("MPEG4_H263_3GPP_P0_L10_AMR_WBplus", DLNAMimeTypes.MIME_VIDEO_3GP),
    MPEG4_P2_3GPP_SP_L0B_AAC("MPEG4_P2_3GPP_SP_L0B_AAC", DLNAMimeTypes.MIME_VIDEO_3GP),
    MPEG4_P2_3GPP_SP_L0B_AMR("MPEG4_P2_3GPP_SP_L0B_AMR", DLNAMimeTypes.MIME_VIDEO_3GP),
    MPEG4_H263_3GPP_P3_L10_AMR("MPEG4_H263_3GPP_P3_L10_AMR", DLNAMimeTypes.MIME_VIDEO_3GP),

    AVC_MP4_MP_SD_AAC_MULT5("AVC_MP4_MP_SD_AAC_MULT5", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_MP_SD_HEAAC_L2("AVC_MP4_MP_SD_HEAAC_L2", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_MP_SD_MPEG1_L3("AVC_MP4_MP_SD_MPEG1_L3", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_MP_SD_AC3("AVC_MP4_MP_SD_AC3", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_MP_SD_AAC_LTP("AVC_MP4_MP_SD_AAC_LTP", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_MP_SD_AAC_LTP_MULT5("AVC_MP4_MP_SD_AAC_LTP_MULT5", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_MP_SD_AAC_LTP_MULT7("AVC_MP4_MP_SD_AAC_LTP_MULT7", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_MP_SD_ATRAC3plus("AVC_MP4_MP_SD_ATRAC3plus", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_MP_SD_BSAC("AVC_MP4_MP_SD_BSAC", DLNAMimeTypes.MIME_VIDEO_MPEG_4),

    AVC_MP4_MP_HD_720p_AAC("AVC_MP4_MP_HD_720p_AAC", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_MP_HD_1080i_AAC("AVC_MP4_MP_HD_1080i_AAC", DLNAMimeTypes.MIME_VIDEO_MPEG_4),

    AVC_MP4_HP_HD_AAC("AVC_MP4_HP_HD_AAC", DLNAMimeTypes.MIME_VIDEO_MPEG_4),

    AVC_MP4_BL_L3L_SD_AAC("AVC_MP4_BL_L3L_SD_AAC", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_BL_L3L_SD_HEAAC("AVC_MP4_BL_L3L_SD_HEAAC", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_BL_L3_SD_AAC("AVC_MP4_BL_L3_SD_AAC", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_BL_CIF30_AAC_MULT5("AVC_MP4_BL_CIF30_AAC_MULT5", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_BL_CIF30_HEAAC_L2("AVC_MP4_BL_CIF30_HEAAC_L2", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_BL_CIF30_MPEG1_L3("AVC_MP4_BL_CIF30_MPEG1_L3", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_BL_CIF30_AC3("AVC_MP4_BL_CIF30_AC3", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_BL_CIF30_AAC_LTP("AVC_MP4_BL_CIF30_AAC_LTP", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_BL_CIF30_AAC_LTP_MULT5("AVC_MP4_BL_CIF30_AAC_LTP_MULT5", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_BL_L2_CIF30_AAC("AVC_MP4_BL_L2_CIF30_AAC", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_BL_CIF30_BSAC("AVC_MP4_BL_CIF30_BSAC", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_BL_CIF30_BSAC_MULT5("AVC_MP4_BL_CIF30_BSAC_MULT5", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_BL_CIF15_HEAAC("AVC_MP4_BL_CIF15_HEAAC", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_BL_CIF15_AMR("AVC_MP4_BL_CIF15_AMR", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_BL_CIF15_AAC("AVC_MP4_BL_CIF15_AAC", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_BL_CIF15_AAC_520("AVC_MP4_BL_CIF15_AAC_520", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_BL_CIF15_AAC_LTP("AVC_MP4_BL_CIF15_AAC_LTP", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_BL_CIF15_AAC_LTP_520("AVC_MP4_BL_CIF15_AAC_LTP_520", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_BL_CIF15_BSAC("AVC_MP4_BL_CIF15_BSAC", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_BL_L12_CIF15_HEAAC("AVC_MP4_BL_L12_CIF15_HEAAC", DLNAMimeTypes.MIME_VIDEO_MPEG_4),
    AVC_MP4_BL_L1B_QCIF15_HEAAC("AVC_MP4_BL_L1B_QCIF15_HEAAC", DLNAMimeTypes.MIME_VIDEO_MPEG_4),

    AVC_TS_MP_SD_AAC_MULT5("AVC_TS_MP_SD_AAC_MULT5", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_SD_AAC_MULT5_T("AVC_TS_MP_SD_AAC_MULT5_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_SD_AAC_MULT5_ISO("AVC_TS_MP_SD_AAC_MULT5_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    AVC_TS_MP_SD_HEAAC_L2("AVC_TS_MP_SD_HEAAC_L2", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_SD_HEAAC_L2_T("AVC_TS_MP_SD_HEAAC_L2_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_SD_HEAAC_L2_ISO("AVC_TS_MP_SD_HEAAC_L2_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    AVC_TS_MP_SD_MPEG1_L3("AVC_TS_MP_SD_MPEG1_L3", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_SD_MPEG1_L3_T("AVC_TS_MP_SD_MPEG1_L3_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_SD_MPEG1_L3_ISO("AVC_TS_MP_SD_MPEG1_L3_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    AVC_TS_MP_SD_AC3("AVC_TS_MP_SD_AC3", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_SD_AC3_T("AVC_TS_MP_SD_AC3_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_SD_AC3_ISO("AVC_TS_MP_SD_AC3_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    AVC_TS_MP_SD_AAC_LTP("AVC_TS_MP_SD_AAC_LTP", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_SD_AAC_LTP_T("AVC_TS_MP_SD_AAC_LTP_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_SD_AAC_LTP_ISO("AVC_TS_MP_SD_AAC_LTP_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    AVC_TS_MP_SD_AAC_LTP_MULT5("AVC_TS_MP_SD_AAC_LTP_MULT5", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_SD_AAC_LTP_MULT5_T("AVC_TS_MP_SD_AAC_LTP_MULT5_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_SD_AAC_LTP_MULT5_ISO("AVC_TS_MP_SD_AAC_LTP_MULT5_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    AVC_TS_MP_SD_AAC_LTP_MULT7("AVC_TS_MP_SD_AAC_LTP_MULT7", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_SD_AAC_LTP_MULT7_T("AVC_TS_MP_SD_AAC_LTP_MULT7_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_SD_AAC_LTP_MULT7_ISO("AVC_TS_MP_SD_AAC_LTP_MULT7_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    AVC_TS_MP_SD_BSAC("AVC_TS_MP_SD_BSAC", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_SD_BSAC_T("AVC_TS_MP_SD_BSAC_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_SD_BSAC_ISO("AVC_TS_MP_SD_BSAC_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),

    AVC_TS_HD_24_AC3("AVC_TS_HD_24_AC3", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_HD_24_AC3_T("AVC_TS_HD_24_AC3_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_HD_24_AC3_ISO("AVC_TS_HD_24_AC3_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),

    AVC_TS_HD_50_LPCM_T("AVC_TS_HD_50_LPCM_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_HD_50_AC3("AVC_TS_HD_50_AC3", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_HD_50_AC3_T("AVC_TS_HD_50_AC3_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_HD_50_AC3_ISO("AVC_TS_HD_50_AC3_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),

    AVC_TS_HD_60_AC3("AVC_TS_HD_60_AC3", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_HD_60_AC3_T("AVC_TS_HD_60_AC3_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_HD_60_AC3_ISO("AVC_TS_HD_60_AC3_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),

    AVC_TS_BL_CIF30_AAC_MULT5("AVC_TS_BL_CIF30_AAC_MULT5", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_BL_CIF30_AAC_MULT5_T("AVC_TS_BL_CIF30_AAC_MULT5_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_BL_CIF30_AAC_MULT5_ISO("AVC_TS_BL_CIF30_AAC_MULT5_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    AVC_TS_BL_CIF30_HEAAC_L2("AVC_TS_BL_CIF30_HEAAC_L2", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_BL_CIF30_HEAAC_L2_T("AVC_TS_BL_CIF30_HEAAC_L2_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_BL_CIF30_HEAAC_L2_ISO("AVC_TS_BL_CIF30_HEAAC_L2_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    AVC_TS_BL_CIF30_MPEG1_L3("AVC_TS_BL_CIF30_MPEG1_L3", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_BL_CIF30_MPEG1_L3_T("AVC_TS_BL_CIF30_MPEG1_L3_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_BL_CIF30_MPEG1_L3_ISO("AVC_TS_BL_CIF30_MPEG1_L3_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    AVC_TS_BL_CIF30_AC3("AVC_TS_BL_CIF30_AC3", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_BL_CIF30_AC3_T("AVC_TS_BL_CIF30_AC3_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_BL_CIF30_AC3_ISO("AVC_TS_BL_CIF30_AC3_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    AVC_TS_BL_CIF30_AAC_LTP("AVC_TS_BL_CIF30_AAC_LTP", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_BL_CIF30_AAC_LTP_T("AVC_TS_BL_CIF30_AAC_LTP_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_BL_CIF30_AAC_LTP_ISO("AVC_TS_BL_CIF30_AAC_LTP_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    AVC_TS_BL_CIF30_AAC_LTP_MULT5("AVC_TS_BL_CIF30_AAC_LTP_MULT5", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_BL_CIF30_AAC_LTP_MULT5_T("AVC_TS_BL_CIF30_AAC_LTP_MULT5_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_BL_CIF30_AAC_LTP_MULT5_ISO("AVC_TS_BL_CIF30_AAC_LTP_MULT5_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    AVC_TS_BL_CIF30_AAC_940("AVC_TS_BL_CIF30_AAC_940", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_BL_CIF30_AAC_940_T("AVC_TS_BL_CIF30_AAC_940_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_BL_CIF30_AAC_940_ISO("AVC_TS_BL_CIF30_AAC_940_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),

    AVC_TS_MP_HD_AAC_MULT5("AVC_TS_MP_HD_AAC_MULT5", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_HD_AAC_MULT5_T("AVC_TS_MP_HD_AAC_MULT5_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_HD_AAC_MULT5_ISO("AVC_TS_MP_HD_AAC_MULT5_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    AVC_TS_MP_HD_HEAAC_L2("AVC_TS_MP_HD_HEAAC_L2", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_HD_HEAAC_L2_T("AVC_TS_MP_HD_HEAAC_L2_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_HD_HEAAC_L2_ISO("AVC_TS_MP_HD_HEAAC_L2_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    AVC_TS_MP_HD_MPEG1_L3("AVC_TS_MP_HD_MPEG1_L3", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_HD_MPEG1_L3_T("AVC_TS_MP_HD_MPEG1_L3_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_HD_MPEG1_L3_ISO("AVC_TS_MP_HD_MPEG1_L3_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    AVC_TS_MP_HD_AC3("AVC_TS_MP_HD_AC3", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_HD_AC3_T("AVC_TS_MP_HD_AC3_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_HD_AC3_ISO("AVC_TS_MP_HD_AC3_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    AVC_TS_MP_HD_AAC("AVC_TS_MP_HD_AAC", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_HD_AAC_T("AVC_TS_MP_HD_AAC_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_HD_AAC_ISO("AVC_TS_MP_HD_AAC_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    AVC_TS_MP_HD_AAC_LTP("AVC_TS_MP_HD_AAC_LTP", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_HD_AAC_LTP_T("AVC_TS_MP_HD_AAC_LTP_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_HD_AAC_LTP_ISO("AVC_TS_MP_HD_AAC_LTP_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    AVC_TS_MP_HD_AAC_LTP_MULT5("AVC_TS_MP_HD_AAC_LTP_MULT5", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_HD_AAC_LTP_MULT5_T("AVC_TS_MP_HD_AAC_LTP_MULT5_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_HD_AAC_LTP_MULT5_ISO("AVC_TS_MP_HD_AAC_LTP_MULT5_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    AVC_TS_MP_HD_AAC_LTP_MULT7("AVC_TS_MP_HD_AAC_LTP_MULT7", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_HD_AAC_LTP_MULT7_T("AVC_TS_MP_HD_AAC_LTP_MULT7_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_MP_HD_AAC_LTP_MULT7_ISO("AVC_TS_MP_HD_AAC_LTP_MULT7_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),

    AVC_TS_BL_CIF15_AAC("AVC_TS_BL_CIF15_AAC", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_BL_CIF15_AAC_T("AVC_TS_BL_CIF15_AAC_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_BL_CIF15_AAC_ISO("AVC_TS_BL_CIF15_AAC_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    AVC_TS_BL_CIF15_AAC_540("AVC_TS_BL_CIF15_AAC_540", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_BL_CIF15_AAC_540_T("AVC_TS_BL_CIF15_AAC_540_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_BL_CIF15_AAC_540_ISO("AVC_TS_BL_CIF15_AAC_540_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    AVC_TS_BL_CIF15_AAC_LTP("AVC_TS_BL_CIF15_AAC_LTP", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_BL_CIF15_AAC_LTP_T("AVC_TS_BL_CIF15_AAC_LTP_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_BL_CIF15_AAC_LTP_ISO("AVC_TS_BL_CIF15_AAC_LTP_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),
    AVC_TS_BL_CIF15_BSAC("AVC_TS_BL_CIF15_BSAC", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_BL_CIF15_BSAC_T("AVC_TS_BL_CIF15_BSAC_T", DLNAMimeTypes.MIME_VIDEO_MPEG_TS),
    AVC_TS_BL_CIF15_BSAC_ISO("AVC_TS_BL_CIF15_BSAC_ISO", DLNAMimeTypes.MIME_VIDEO_MPEG),

    AVC_3GPP_BL_CIF30_AMR_WBplus("AVC_3GPP_BL_CIF30_AMR_WBplus", DLNAMimeTypes.MIME_VIDEO_3GP),
    AVC_3GPP_BL_CIF15_AMR_WBplus("AVC_3GPP_BL_CIF15_AMR_WBplus", DLNAMimeTypes.MIME_VIDEO_3GP),
    AVC_3GPP_BL_QCIF15_AAC("AVC_3GPP_BL_QCIF15_AAC", DLNAMimeTypes.MIME_VIDEO_3GP),
    AVC_3GPP_BL_QCIF15_AAC_LTP("AVC_3GPP_BL_QCIF15_AAC_LTP", DLNAMimeTypes.MIME_VIDEO_3GP),
    AVC_3GPP_BL_QCIF15_HEAAC("AVC_3GPP_BL_QCIF15_HEAAC", DLNAMimeTypes.MIME_VIDEO_3GP),
    AVC_3GPP_BL_QCIF15_AMR_WBplus("AVC_3GPP_BL_QCIF15_AMR_WBplus", DLNAMimeTypes.MIME_VIDEO_3GP),
    AVC_3GPP_BL_QCIF15_AMR("AVC_3GPP_BL_QCIF15_AMR", DLNAMimeTypes.MIME_VIDEO_3GP),

    AVC_MP4_LPCM("AVC_MP4_LPCM", DLNAMimeTypes.MIME_VIDEO_MPEG_4),

    AVI("AVI", DLNAMimeTypes.MIME_VIDEO_AVI),
    AVI_XMS("AVI", DLNAMimeTypes.MIME_VIDEO_XMS_AVI),
    DIVX("AVI", DLNAMimeTypes.MIME_VIDEO_DIVX),

    MATROSKA("MATROSKA", DLNAMimeTypes.MIME_VIDEO_MATROSKA),
    MATROSKA_MKV("MATROSKA", DLNAMimeTypes.MIME_VIDEO_MKV),

    VC1_ASF_AP_L1_WMA("VC1_ASF_AP_L1_WMA", DLNAMimeTypes.MIME_VIDEO_ASF),
    VC1_ASF_AP_L2_WMA("VC1_ASF_AP_L2_WMA", DLNAMimeTypes.MIME_VIDEO_ASF),
    VC1_ASF_AP_L3_WMA("VC1_ASF_AP_L3_WMA", DLNAMimeTypes.MIME_VIDEO_ASF),

    VC1_ASF_AP_L1_WMA_WMV("VC1_ASF_AP_L1_WMA", DLNAMimeTypes.MIME_VIDEO_WMV),
    VC1_ASF_AP_L2_WMA_WMV("VC1_ASF_AP_L2_WMA", DLNAMimeTypes.MIME_VIDEO_WMV),
    VC1_ASF_AP_L3_WMA_WMV("VC1_ASF_AP_L3_WMA", DLNAMimeTypes.MIME_VIDEO_WMV);

    private final String code;
    private final String contentFormat;

    DLNAProfiles(String code, String contentFormat) {
        this.code = code;
        this.contentFormat = contentFormat;
    }

    public String getCode() {
        return code;
    }

    public String getContentFormat() {
        return contentFormat;
    }

    public static DLNAProfiles valueOf(String code, String contentFormat) {
        for (DLNAProfiles errorCode : values()) {
            if (errorCode.getCode().equals(code)
                    && (contentFormat.isEmpty() || errorCode.getContentFormat().equals(contentFormat))) {
                return errorCode;
            }
        }
        return null;
    }

    public static class DLNAMimeTypes {

        /** Constructor */
        private DLNAMimeTypes() {
            throw new IllegalAccessError("Non-Instantiable");
        }

        public static final String MIME_IMAGE_JPEG = "image/jpeg";
        public static final String MIME_IMAGE_PNG = "image/png";

        public static final String MIME_AUDIO_3GP = "audio/3gpp";
        public static final String MIME_AUDIO_ADTS = "audio/vnd.dlna.adts";
        public static final String MIME_AUDIO_ATRAC = "audio/x-sony-oma";
        public static final String MIME_AUDIO_DOLBY_DIGITAL = "audio/vnd.dolby.dd-raw";
        public static final String MIME_AUDIO_LPCM = "audio/L16";
        public static final String MIME_AUDIO_MPEG = "audio/mpeg";
        public static final String MIME_AUDIO_MPEG_4 = "audio/mp4";
        public static final String MIME_AUDIO_WMA = "audio/x-ms-wma";

        public static final String MIME_VIDEO_3GP = "video/3gpp";
        public static final String MIME_VIDEO_ASF = "video/x-ms-asf";
        public static final String MIME_VIDEO_MPEG = "video/mpeg";
        public static final String MIME_VIDEO_MPEG_4 = "video/mp4";
        public static final String MIME_VIDEO_MPEG_TS = "video/vnd.dlna.mpeg-tts";
        public static final String MIME_VIDEO_WMV = "video/x-ms-wmv";
        public static final String MIME_VIDEO_DIVX = "video/divx";
        public static final String MIME_VIDEO_AVI = "video/avi";
        public static final String MIME_VIDEO_XMS_AVI = "video/x-msvideo";
        public static final String MIME_VIDEO_MATROSKA = "video/x-matroska";
        public static final String MIME_VIDEO_MKV = "video/x-mkv";
    }
}
