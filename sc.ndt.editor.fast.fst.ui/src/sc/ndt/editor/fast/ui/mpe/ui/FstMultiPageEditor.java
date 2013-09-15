package sc.ndt.editor.fast.ui.mpe.ui;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.SWT;
import org.eclipse.ui.ISizeProvider;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.editor.IFormPage;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import sc.ndt.editor.fast.fastfst.ModelFastfst;
import sc.ndt.editor.fast.ui.FastfstFactory;
import sc.ndt.editor.fast.ui.mpe.outline.FstMultiPageContentOutline;

//import sc.nrel.nwtc.fast.aerodyn.fAdyn.ModelFAdyn;
//import sc.nrel.nwtc.fast.fMain.ModelFMain;
//import sc.nrel.nwtc.fast.aerodyn.ui.internal.FAdynActivator;
//import sc.nrel.nwtc.fast.aerodyn.ui.editors.*;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

/**
 * @author Cotta
 *
 */
public class FstMultiPageEditor extends FormEditor /*implements ISizeProvider*/ {

	// see about ISizeprovider
	// http://www.eclipse.org/forums/index.php/m/706788/
	
	//public static final String ID = "sc.nrel.nwtc.fast.editors.FMainFileMultiPageEditor"; //$NON-NLS-1$

	// external injectors
	public Injector				fFstInjector;
	public Injector				fAdynInjector;
	public Injector				fTowrInjector;
	public Injector				fBldeInjector;
	
	// inner source editors
	@Inject
	public XtextEditor 			xtextEditorFst;		// injected here
	public XtextEditor 			xtextEditorFAdyn; 	// injected then
	
	// inner form editors
	public FormPage				formPageMain;
	public FormPage				formPageAdyn;
	public FormPage				formPageTowr;
	public FormPage				formPageBlds;
	public FormPage				formPagePfrm;
		
	// outline view
	@Inject 
	public OutlinePage 			outlinePageFMain;
	public OutlinePage 			outlinePageFAdyn;
	
	public Provider<XtextResourceSet> 	resourceSetProviderFAdyn;
		
	public ModelFastfst 					modelFst;
	//public ModelFAdyn 					modelFAdyn;
	//private XtextResourceSet 	resourceSetFAdyn;
	//private XtextResource 		resourceFAdyn;
	
	FastfstFactory ff;
	private FstMultiPageContentOutline fContentOutline;
	
	public FstMultiPageEditor() {
		ff 				= new FastfstFactory();
		fFstInjector 	= ff.getInjector();
		xtextEditorFst 	= fFstInjector.getInstance(XtextEditor.class);
		//fAdynInjector = FAdynActivator.getInstance().getInjector(FAdynActivator.SC_NREL_NWTC_FAST_AERODYN_FADYN);
	}

	/**
	 * @param editor
	 * @return
	 */
	public EObject getModelFromXtextEditor(XtextEditor editor) {
		
		EObject out = editor.getDocument().readOnly(
				
			new IUnitOfWork<EObject, XtextResource>() {

				@Override
				public EObject exec(XtextResource res) throws Exception {

					return res.getContents().get(0);
					
				}
					
			});
				
		return out;
		
	}
	
	protected void pageChange(int newPageIndex) {

		super.pageChange(newPageIndex);		
		IFormPage page = getActivePageInstance();	
		updateContentOutline(page);
		
		/* TODO 
		// manage pages
		if(newPageIndex>=0 && getCurrentPage()>=0) {
			Object oldPage = pages.get(getCurrentPage());
			Object newPage = pages.get(newPageIndex);
			
			if(oldPage instanceof FormPage && newPage instanceof XtextEditor)
				
				// commit change to Source on page change 
				xtextEditorFMain.getDocument().modify(new IUnitOfWork<Void, XtextResource>() {

					@Override
					public java.lang.Void exec(XtextResource res) throws Exception {

						// pass updated model to xtext editor
						res.getContents().set(0, modelFMain);
						
						xtextEditorFMain.getDocument().set(
								res.getSerializer().serialize(modelFMain));
						
						return null;
					}
				});
		}*/


		// GUI --> Sorce
		//if (oldPage instanceof IFormPage) {

			//ModelFMain m = formPage.model;
			
			//IFormPage fpage = (IFormPage) page;
			//if (fpage.getPartControl() == null) {
			//	fpage.createPartControl(getContainer());
			//	setControl(newPageIndex, fpage.getPartControl());
			//	fpage.getPartControl().setMenu(getContainer().getMenu());
			//}
			
		// Source --> GUI
		//} else if (oldPage instanceof XtextEditor) {
		
		//}

		super.pageChange(newPageIndex);
		
	}
	
	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return true;		
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		
		// save Main
		xtextEditorFst.doSave(monitor);
		
		// save AeroDyn
		// save Tower
		// save Blade
		
		editorDirtyStateChanged();
		
	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub
		
		/////
		xtextEditorFst.doSaveAs();
		setPageText(0, xtextEditorFst.getTitle());
		setInput(xtextEditorFst.getEditorInput());
		/////
	}

	@Override
	protected void addPages() {
		
		try {
					
			///// Formatted source			
			int index = addPage(xtextEditorFst, getEditorInput());
			setPageText(index, getEditorInput().getName());
						
			modelFst = xtextEditorFst.getDocument().readOnly(
				
					new IUnitOfWork<ModelFastfst, XtextResource>() {

						@Override
						public ModelFastfst exec(XtextResource res) throws Exception {

							return (ModelFastfst)res.getContents().get(0);
					
						}
					});
			
			///// Form
			formPageMain = new FstFormPage(this,"general","GUI");
			addPage(0,formPageMain);

			setActivePage(0);
			
			
			// AeroDyn part
			//String ADFile = modelFst.getADFile().getValue();
			//URI adynURI = URI.createPlatformResourceURI( ADFile, false);

			/*resourceSetFAdyn = fAdynInjector.getInstance(XtextResourceSet.class);
			resourceSetFAdyn.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
			resourceFAdyn = (XtextResource)resourceSetFAdyn.createResource(adynURI);
			modelFAdyn = (ModelFAdyn)resourceFAdyn.getContents().get(0);
			*/
			
			
			/* TODO AeroDyn Editor - move on another MPE Project editor
			xtextEditorFAdyn = fAdynInjector.getInstance(XtextEditor.class);
					
			IFile fileMain = (IFile) xtextEditorFMain.getEditorInput().getAdapter(IFile.class);
			
			IPath path = fileMain.getParent().getFullPath().append(ADFile);
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			
			FileEditorInput fileEditorInputAdyn = new FileEditorInput(file);
			
			index = addPage(xtextEditorFAdyn, fileEditorInputAdyn);
			setPageText(index, fileEditorInputAdyn.getName());
			
			//formPageAdyn = new FAdynFileFormPage(this,"aerodynamics","Aerodynamics");
			//addPage(1,formPageAdyn);
			 * 
			*/

		} catch (PartInitException e) {
			ErrorDialog.openError(getSite().getShell(),
					"Error creating nested text editor",null,e.getStatus());
		}
		
	}
	
	
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class adapter) {
				
		if (adapter.equals(IPropertySheetPage.class)) {
			// TODO
			return null;
		} else if (IContentOutlinePage.class.equals(adapter)) {
			return getContentOutline();
		}
		return super.getAdapter(adapter);
		
	}
 
	public FstMultiPageContentOutline getContentOutline() {
		if (fContentOutline == null || fContentOutline.isDisposed()) {
			fContentOutline = new FstMultiPageContentOutline(this);
			updateContentOutline(getActivePageInstance());
		}
		return fContentOutline;
		
	}
	
	private void updateContentOutline(IFormPage page) {
		if (fContentOutline == null)
			return;

		/*ISortable*/IContentOutlinePage outline = null;
		if (page instanceof FstFormPage)
			outline = ((FstFormPage)page).getContentOutline();
		//else if (page instanceof XtextEditor)
		//	outline = ((XtextEditor)page).getContentOutline();
			
		// outlinePageFMain.setSourceViewer(xtextEditorFst.getInternalSourceViewer());
		fContentOutline.setPageActive(outline);
	}

	/*
	@Override
	public int getSizeFlags(boolean width) {
		// TODO Auto-generated method stub
		return SWT.MIN|SWT.MAX;
	}

	@Override
	public int computePreferredSize(boolean width, int availableParallel,
			int availablePerpendicular, int preferredResult) {
		// TODO Auto-generated method stub
		return 500;
	}
	*/
}
