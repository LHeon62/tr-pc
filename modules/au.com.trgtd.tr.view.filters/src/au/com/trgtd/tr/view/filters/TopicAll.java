/*
 * ThinkingRock, a project management tool for Personal Computers. 
 * Copyright (C) 2006 Avente Pty Ltd
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
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package au.com.trgtd.tr.view.filters;

import au.com.trgtd.tr.appl.Constants;
import java.io.Serializable;
import org.openide.util.NbBundle;
import tr.model.topic.Topic;
 
/**
 * Topic for selection of all topics.
 *
 * @author Jeremy Moore
 */

public final class TopicAll extends Topic implements Serializable {
    
    private static final long serialVersionUID = 7738438725287L;

    public static final String ID = ChoiceAll.ID;
    
    public TopicAll() {
        super(Constants.ID_FILTER_TOPICS_ALL);
        super.setName(NbBundle.getMessage(TopicAll.class, "filter-all"));
    }
    
    public boolean equals(Object object) {
        return object instanceof TopicAll;
    }
}


