/*
 * generated by Xtext
 */
package sc.ndt.editor.iecwind.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * Use this class to register components to be used within the IDE.
 */
public class IecwindiecUiModule extends sc.ndt.editor.iecwind.ui.AbstractIecwindiecUiModule {
	public IecwindiecUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	// override nature creation
	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public Class<? extends org.eclipse.xtext.ui.editor.IXtextEditorCallback> bindIXtextEditorCallback() {
		return sc.ndt.editor.iecwind.ui.addon.nature.NatureAddingEditorCallback.class;
	}
		
}
