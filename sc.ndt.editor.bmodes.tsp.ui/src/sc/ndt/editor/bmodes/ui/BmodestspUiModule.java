/*
 * generated by Xtext
 */
package sc.ndt.editor.bmodes.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * Use this class to register components to be used within the IDE.
 */
public class BmodestspUiModule extends sc.ndt.editor.bmodes.ui.AbstractBmodestspUiModule {
	public BmodestspUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	// override nature creation
		// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
		public Class<? extends org.eclipse.xtext.ui.editor.IXtextEditorCallback> bindIXtextEditorCallback() {
			return sc.ndt.editor.bmodes.ui.addon.nature.NatureAddingEditorCallback.class;
		}
		
}
