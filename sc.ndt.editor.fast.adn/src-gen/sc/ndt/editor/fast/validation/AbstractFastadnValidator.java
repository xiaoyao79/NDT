/*
 * generated by Xtext
 */
package sc.ndt.editor.fast.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractFastadnValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(sc.ndt.editor.fast.fastadn.FastadnPackage.eINSTANCE);
		return result;
	}
}
