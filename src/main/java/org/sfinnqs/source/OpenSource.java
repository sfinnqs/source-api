/* The Source API - An API for the Source plugin
 * Copyright (C) 2019 Finn Voichick
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published by the
 * Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, see <https://www.gnu.org/licenses>.
 */
package org.sfinnqs.source;

import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

import java.net.URL;

/**
 * An open source Bukkit plugin. Plugins that are open source can implement this
 * interface to indicate that they are open source and provide a link to their
 * source code.
 */
public interface OpenSource extends Plugin {
    /**
     * Gets a link to this plugin's source code. For example, this may be a git
     * repository.
     *
     * @return A URL pointing to all of this plugin's source code.
     */
    @NotNull
    URL getSource();
}
