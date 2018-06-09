/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.data.manipulator.mutable;

import org.spongepowered.api.block.tileentity.Skull;
import org.spongepowered.api.block.tileentity.TileEntity;
import org.spongepowered.api.data.DataHolder;
import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.data.manipulator.DataManipulator;
import org.spongepowered.api.data.manipulator.immutable.ImmutableRepresentedPlayerData;
import org.spongepowered.api.data.value.Value;
import org.spongepowered.api.item.inventory.ItemStack;
import org.spongepowered.api.profile.GameProfile;

/**
 * An {@link DataManipulator} handling the {@link GameProfile}
 * represented by this {@link DataHolder}. Applicable to a {@link Skull}
 * {@link TileEntity} or {@link ItemStack}.
 */
public interface RepresentedPlayerData extends DataManipulator<RepresentedPlayerData, ImmutableRepresentedPlayerData> {

    /**
     * Gets the {@link Value.Mutable}{@link GameProfile} that is
     * represented by the {@link DataHolder}.
     *
     * @return The value of the game profile
     * @see Keys#REPRESENTED_PLAYER
     */
    Value.Mutable<GameProfile> owner();

}
