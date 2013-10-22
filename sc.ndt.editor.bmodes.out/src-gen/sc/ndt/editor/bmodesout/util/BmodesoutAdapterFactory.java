/**
 */
package sc.ndt.editor.bmodesout.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sc.ndt.editor.bmodesout.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sc.ndt.editor.bmodesout.BmodesoutPackage
 * @generated
 */
public class BmodesoutAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BmodesoutPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BmodesoutAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = BmodesoutPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BmodesoutSwitch<Adapter> modelSwitch =
    new BmodesoutSwitch<Adapter>()
    {
      @Override
      public Adapter caseModelBmodesout(ModelBmodesout object)
      {
        return createModelBmodesoutAdapter();
      }
      @Override
      public Adapter caseHeader(Header object)
      {
        return createHeaderAdapter();
      }
      @Override
      public Adapter caseMode(Mode object)
      {
        return createModeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesout.ModelBmodesout <em>Model Bmodesout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesout.ModelBmodesout
   * @generated
   */
  public Adapter createModelBmodesoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesout.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesout.Header
   * @generated
   */
  public Adapter createHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sc.ndt.editor.bmodesout.Mode <em>Mode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sc.ndt.editor.bmodesout.Mode
   * @generated
   */
  public Adapter createModeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //BmodesoutAdapterFactory
