/*
 * MIT License
 *
 * Copyright (c) 2017 Cruxlab, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.cruxlab.sectionedrecyclerview.lib;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Interface for interaction with RecyclerView and managing its sections.
 * <p>
 * Each section is represented by a {@link SimpleSectionAdapter} or {@link SectionAdapter},
 * which provides a binding from an app-specific data set to views, and an optional
 * {@link SectionItemTouchCallback}, which lets you control swipe/drag and drop behavior of each
 * item view within the section.
 * <p>
 * Most of the methods require an index of the section to interact with. It can be received from
 * adapter by calling {@link BaseSectionAdapter#getSection()}.
 */
public interface SectionManager {

    /**
     * Returns the total number of sections in the RecyclerView.
     *
     * @return The total number of sections.
     */
    int getSectionCount();

    /**
     * Appends the section represented by the specified SimpleSectionAdapter to the end of the
     * RecyclerView.
     *
     * @param simpleSectionAdapter SimpleSectionAdapter to represent the appended section.
     */
    void addSection(@NonNull SimpleSectionAdapter simpleSectionAdapter);

    /**
     * Appends the section represented by the specified SectionAdapter to the end of the RecyclerView.
     * <p>
     * Header type is used to cache {@link HeaderViewHolder}s displayed at the top of the
     * {@link SectionHeaderLayout}, so different SectionAdapters with the same header view should
     * return the same value. It can be any integer except {@link SectionAdapter#NO_HEADER_TYPE}.
     *
     * @param sectionAdapter SectionAdapter to represent the appended section.
     * @param headerType     Type to represent its header view.
     */
    void addSection(@NonNull SectionAdapter sectionAdapter, short headerType);

    /**
     * Appends the section represented by the specified SimpleSectionAdapter and SectionItemTouchCallback
     * to the end of the RecyclerView.
     *
     * @param simpleSectionAdapter SimpleSectionAdapter to represent the appended section.
     * @param touchCallback        SectionItemTouchCallback to represent the appended section.
     */
    void addSection(@NonNull SimpleSectionAdapter simpleSectionAdapter, SectionItemTouchCallback touchCallback);

    /**
     * Appends the section represented by the specified SectionAdapter and SectionItemTouchCallback
     * to the end of the RecyclerView.
     * <p>
     * Header type is used to cache {@link HeaderViewHolder}s displayed at the top of the
     * {@link SectionHeaderLayout}, so different SectionAdapters with the same header view should
     * return the same value. It can be any integer except {@link SectionAdapter#NO_HEADER_TYPE}.
     *
     * @param sectionAdapter SectionAdapter to represent the appended section.
     * @param touchCallback  SectionItemTouchCallback to represent the appended section.
     * @param headerType     Type to represent its header view.
     */
    void addSection(@NonNull SectionAdapter sectionAdapter, SectionItemTouchCallback touchCallback, short headerType);

    /**
     * Inserts the section represented by the specified SimpleSectionAdapter to the specified
     * position in the RecyclerView.
     *
     * @param section              Index at which the section is to be inserted.
     * @param simpleSectionAdapter SimpleSectionAdapter to represent the inserted section.
     */
    void insertSection(int section, @NonNull SimpleSectionAdapter simpleSectionAdapter);

    /**
     * Inserts the section represented by the specified SectionAdapter to the specified position
     * in the RecyclerView.
     * <p>
     * Header type is used to cache {@link HeaderViewHolder}s displayed at the top of the
     * {@link SectionHeaderLayout}, so different SectionAdapters with the same header view should
     * return the same value. It can be any integer except {@link SectionAdapter#NO_HEADER_TYPE}.
     *
     * @param section        Index at which the section is to be inserted.
     * @param sectionAdapter SectionAdapter to represent the inserted section.
     * @param headerType     Type to represent its header view.
     */
    void insertSection(int section, @NonNull SectionAdapter sectionAdapter, short headerType);

    /**
     * Inserts the section represented by the specified SimpleSectionAdapter and
     * SectionItemTouchCallback to the specified position in the RecyclerView.
     *
     * @param section              Index at which the section is to be inserted.
     * @param simpleSectionAdapter SimpleSectionAdapter to represent the inserted section.
     * @param touchCallback        SectionItemTouchCallback to represent the inserted section.
     */
    void insertSection(int section, @NonNull SimpleSectionAdapter simpleSectionAdapter,
                       SectionItemTouchCallback touchCallback);


    /**
     * Inserts the section represented by the specified SectionAdapter and SectionItemTouchCallback
     * to the specified position in the RecyclerView.
     * <p>
     * Header type is used to cache {@link HeaderViewHolder}s displayed at the top of the
     * {@link SectionHeaderLayout}, so different SectionAdapters with the same header view should
     * return the same value. It can be any integer except {@link SectionAdapter#NO_HEADER_TYPE}.
     *
     * @param section        Index at which the section is to be inserted.
     * @param sectionAdapter SectionAdapter to represent the inserted section.
     * @param touchCallback  SectionItemTouchCallback to represent the inserted section.
     * @param headerType     Type to represent its header view.
     */
    void insertSection(int section, @NonNull SectionAdapter sectionAdapter,
                       SectionItemTouchCallback touchCallback, short headerType);

    /**
     * Replaces the section at the specified position in the RecyclerView with the section
     * represented by the specified SimpleSectionAdapter.
     *
     * @param section              Index of the section to replace.
     * @param simpleSectionAdapter SimpleSectionAdapter to represent the section to replace.
     */
    void replaceSection(int section, @NonNull SimpleSectionAdapter simpleSectionAdapter);

    /**
     * Replaces the section at the specified position in the RecyclerView with the section
     * represented by the specified SectionAdapter.
     * <p>
     * Header type is used to cache {@link HeaderViewHolder}s displayed at the top of the
     * {@link SectionHeaderLayout}, so different SectionAdapters with the same header view should
     * return the same value. It can be any integer except {@link SectionAdapter#NO_HEADER_TYPE}.
     *
     * @param section        Index of the section to replace.
     * @param sectionAdapter SectionAdapter to represent the section to replace.
     * @param headerType     Type to represent its header view.
     */
    void replaceSection(int section, @NonNull SectionAdapter sectionAdapter, short headerType);

    /**
     * Replaces the section at the specified position in the RecyclerView with the section
     * represented by the specified SimpleSectionAdapter and SectionItemTouchCallback.
     *
     * @param section              Index of the section to replace.
     * @param simpleSectionAdapter SimpleSectionAdapter to represent the section to replace.
     * @param touchCallback        SectionItemTouchCallback to represent the section to replace.
     */
    void replaceSection(int section, @NonNull SimpleSectionAdapter simpleSectionAdapter,
                        SectionItemTouchCallback touchCallback);

    /**
     * Replaces the section at the specified position in the RecyclerView with the section
     * represented by the specified SectionAdapter and SectionItemTouchCallback.
     * <p>
     * Header type is used to cache {@link HeaderViewHolder}s displayed at the top of the
     * {@link SectionHeaderLayout}, so different SectionAdapters with the same header view should
     * return the same value. It can be any integer except {@link SectionAdapter#NO_HEADER_TYPE}.
     *
     * @param section        Index of the section to replace.
     * @param sectionAdapter SectionAdapter to represent the section to replace.
     * @param touchCallback  SectionItemTouchCallback to represent the section to replace.
     * @param headerType     Type to represent its header view.
     */
    void replaceSection(int section, @NonNull SectionAdapter sectionAdapter,
                        SectionItemTouchCallback touchCallback, short headerType);

    /**
     * Removes the section at the specified position in the RecyclerView.
     *
     * @param section Index of the section to remove.
     */
    void removeSection(int section);

    /**
     * Updates the section at the specified position in the RecyclerView.
     *
     * @param section Index of the section to update.
     */
    void updateSection(int section);

    /**
     * Sets the specified SectionItemTouchCallback to the section at the specified position in the
     * RecyclerView.
     *
     * @param section       Index of the section to be represented by the callback.
     * @param touchCallback SectionItemTouchCallback to represent the specified section.
     */
    void setTouchCallback(int section, @NonNull SectionItemTouchCallback touchCallback);

    /**
     * Removes SectionItemTouchCallback from the section at the specified position in the
     * RecyclerView.
     *
     * @param section Index of the section to remove the callback from.
     */
    void removeTouchCallback(int section);

    /**
     * Returns the successor of the BaseSectionAdapter which represents the specifies section in the
     * RecyclerView.
     *
     * @param section Index of the section to be represented.
     * @return Successor of the BaseSectionAdapter which represents the specifies section.
     */

    <T extends BaseSectionAdapter> T getSectionAdapter(int section);

    /**
     * Returns the SectionItemTouchCallback which represents the specifies section in the
     * RecyclerView or null.
     *
     * @param section Index of the section to be represented.
     * @return SectionItemTouchCallback which represents the specifies section or null.
     */
    @Nullable
    SectionItemTouchCallback getTouchCallback(int section);

}
