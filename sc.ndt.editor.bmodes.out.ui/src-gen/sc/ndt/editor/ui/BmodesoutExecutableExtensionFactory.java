/*
 * generated by Xtext
 */
package sc.ndt.editor.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import sc.ndt.editor.ui.internal.BmodesoutActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class BmodesoutExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return BmodesoutActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return BmodesoutActivator.getInstance().getInjector(BmodesoutActivator.SC_NDT_EDITOR_BMODESOUT);
	}
	
}
