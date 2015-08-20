/*
 * This file is part of Matter Overdrive
 * Copyright (c) 2015., Simeon Radivoev, All rights reserved.
 *
 * Matter Overdrive is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Matter Overdrive is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Matter Overdrive.  If not, see <http://www.gnu.org/licenses>.
 */

package matteroverdrive.machines.configs;

/**
 * Created by Simeon on 8/16/2015.
 */
public class ConfigPropertyStringList extends ConfigPropertyInteger
{
    int ordinal;
    String[] names;

    public ConfigPropertyStringList(String key, String unlocalizedName, String[] names, int def)
    {
        super(key, unlocalizedName,0,names.length-1,def);
        ordinal = def;
        this.names = names;
    }

    @Override
    public Object getValue()
    {
        return ordinal;
    }

    @Override
    public void setValue(Object value)
    {
        ordinal = (Integer)value;
    }

    @Override
    public Class getType() {
        return Enum.class;
    }

    public String[] getList()
    {
        return names;
    }
}