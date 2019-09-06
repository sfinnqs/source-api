/* The Source API - An API for the Source plugin
 * Copyright (C) 2019 Finn Voichick
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, version 3.
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

public interface OpenSource extends Plugin {
    String getSource();
}