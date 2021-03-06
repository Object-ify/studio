/*
 *                 Sun Public License Notice
 * 
 * The contents of this file are subject to the Sun Public License
 * Version 1.0 (the "License"). You may not use this file except in
 * compliance with the License. A copy of the License is available at
 * http://www.sun.com/
 * 
 * The Original Code is NetBeans. The Initial Developer of the Original
 * Code is Sun Microsystems, Inc. Portions Copyright 1997-2000 Sun
 * Microsystems, Inc. All Rights Reserved.
 */

package org.openide.actions;

import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.actions.CallableSystemAction;

/** Perform a system garbage collection.
*
* @author   Ian Formanek
*/
public class GarbageCollectAction extends CallableSystemAction {
    /** generated Serialized Version UID */
    static final long serialVersionUID = -3365766607488094613L;

    /* Human presentable name of the action. This should be
    * presented as an item in a menu.
    * @return the name of the action
    */
    public String getName() {
        return NbBundle.getBundle(GarbageCollectAction.class).getString("CTL_GarbageCollect"); // NOI18N
    }

    /* Help context where to find more about the action.
    * @return the help context for this action
    */
    public HelpCtx getHelpCtx() {
        return new HelpCtx (GarbageCollectAction.class);
    }

    public void performAction() {
        System.gc();
    }
    
    /* URL to this action.
    * @return URL to the action icon
    */
    protected String iconResource () {
        return "org/openide/resources/actions/garbageCollect.gif"; // NOI18N
    }
}
