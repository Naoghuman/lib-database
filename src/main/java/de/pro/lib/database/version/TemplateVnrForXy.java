/*
 * Copyright (C) 2014 PRo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.pro.lib.database.version;
import de.pro.lib.database.api.IVersioning;
import java.sql.Connection;

/**
 * Template for the injection from the Interface {@link de.pro.lib.database.version.api.IVersion IVersion}.
 * See the JavaDoc from {@link de.pro.lib.database.api.IVersioning IVersioning}
 * for an advanced description.
 *
 * @author PRo
 */
public class TemplateVnrForXy implements IVersioning {
    
    private Connection connection = null;

    public TemplateVnrForXy(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void initTable() {
    }

    @Override
    public void initDefaultData() {
    }

    @Override
    public void initTestData() {
    }
    
}
