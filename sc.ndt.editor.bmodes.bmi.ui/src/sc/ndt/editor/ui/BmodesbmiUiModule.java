/*
 * generated by Xtext
 */
package sc.ndt.editor.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * Use this class to register components to be used within the IDE.
 */
public class BmodesbmiUiModule extends sc.ndt.editor.ui.AbstractBmodesbmiUiModule {
	public BmodesbmiUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	// override nature creation
	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public Class<? extends org.eclipse.xtext.ui.editor.IXtextEditorCallback> bindIXtextEditorCallback() {
		return sc.ndt.editor.ui.addon.nature.NatureAddingEditorCallback.class;
	}
	
}
