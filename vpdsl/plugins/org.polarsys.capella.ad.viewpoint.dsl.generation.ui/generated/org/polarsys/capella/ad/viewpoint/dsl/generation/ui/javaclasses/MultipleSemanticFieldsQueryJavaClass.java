/*******************************************************************************
* Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*    Thales - initial API and implementation
*******************************************************************************/
//Generated with EGF 1.2.0.v20150211-1405
package org.polarsys.capella.ad.viewpoint.dsl.generation.ui.javaclasses;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIContainer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI_Field_Type;
import org.polarsys.capella.ad.viewpoint.dsl.generation.ui.util.DataWidget;
import org.polarsys.capella.ad.viewpoint.dsl.generation.ui.util.EPFUtility;
import org.polarsys.capella.ad.viewpoint.dsl.generation.ui.util.JDTUtility;
import org.polarsys.capella.ad.viewpoint.dsl.generation.ui.util.PluginExtensionEntry;
import org.polarsys.capella.ad.viewpoint.dsl.generation.ui.util.UIProjectManager;

public class MultipleSemanticFieldsQueryJavaClass
		extends
		org.polarsys.capella.ad.viewpoint.dsl.generation.ui.common.AbstractLoopFinishedJavaClass {
	protected static String nl;

	public static synchronized MultipleSemanticFieldsQueryJavaClass create(
			String lineSeparator) {
		nl = lineSeparator;
		MultipleSemanticFieldsQueryJavaClass result = new MultipleSemanticFieldsQueryJavaClass();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties()
			.getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "package ";
	protected final String TEXT_2 = ";";
	protected final String TEXT_3 = NL + "  /**" + NL
			+ " * <!-- begin-user-doc -->" + NL + " * The '<em><b>[";
	protected final String TEXT_4 = "]</b></em>' BusinessQuery defined for "
			+ NL + " * '<em><b>[";
	protected final String TEXT_5 = "]</b></em>'." + NL
			+ " * <!-- end-user-doc -->" + NL + " * <p>" + NL + " * </p>" + NL
			+ " *" + NL + " * @generated" + NL + " */" + NL + "public class ";
	protected final String TEXT_6 = " implements IBusinessQuery {"
			+ NL
			+ ""
			+ NL
			+ "   /**"
			+ NL
			+ "    * <!-- begin-user-doc -->"
			+ NL
			+ "    * <!-- end-user-doc -->"
			+ NL
			+ "    * @param elementP"
			+ NL
			+ "    * @generated"
			+ NL
			+ "    */"
			+ NL
			+ "\tpublic List<CapellaElement> getAvailableElements(CapellaElement elementP) {"
			+ NL
			+ "\t\tList<CapellaElement> availableElements = new ArrayList<CapellaElement>();"
			+ NL
			+ "\t\tSystemEngineering systemEngineering = CapellaQueries.getInstance()"
			+ NL + "\t\t\t\t.getRootQueries().getSystemEngineering(elementP);"
			+ NL + "\t\tif (null != systemEngineering) {" + NL
			+ "\t\t\tfor (EObject elt : EObjectExt.getAll(systemEngineering, ";
	protected final String TEXT_7 = ")) {"
			+ NL
			+ "\t\t\t\tavailableElements.add((CapellaElement) elt);"
			+ NL
			+ "\t\t\t}"
			+ NL
			+ "\t\t}"
			+ NL
			+ "\t\tavailableElements = ListExt.removeDuplicates(availableElements);"
			+ NL
			+ "\t\tavailableElements.remove(elementP);"
			+ NL
			+ "\t\treturn availableElements;"
			+ NL
			+ "\t}"
			+ NL
			+ ""
			+ NL
			+ "\t/**"
			+ NL
			+ "     * <!-- begin-user-doc -->"
			+ NL
			+ "     * <!-- end-user-doc -->"
			+ NL
			+ "     * @param elementP"
			+ NL
			+ "     * @param onlyGeneratedP"
			+ NL
			+ "     * @generated"
			+ NL
			+ "     */"
			+ NL
			+ "\tpublic List<CapellaElement> getCurrentElements(CapellaElement elementP,"
			+ NL
			+ "\t\t\tboolean onlyGeneratedP) {"
			+ NL
			+ "\t\tList<CapellaElement> currentsElements = new ArrayList<CapellaElement>();"
			+ NL + "\t\tif (elementP instanceof ";
	protected final String TEXT_8 = ")" + NL
			+ "\t\t\tcurrentsElements.addAll(((";
	protected final String TEXT_9 = ") elementP).";
	protected final String TEXT_10 = ");" + NL + "\t\treturn currentsElements;"
			+ NL + "\t}" + NL + "" + NL + "\t/**" + NL
			+ "     * <!-- begin-user-doc -->" + NL
			+ "     * <!-- end-user-doc -->" + NL + "     * @generated" + NL
			+ "     */" + NL + "\tpublic EClass getEClass() {" + NL
			+ "\t\treturn ";
	protected final String TEXT_11 = ";" + NL + "\t}" + NL + "" + NL + "\t/**"
			+ NL + "     * <!-- begin-user-doc -->" + NL
			+ "     * <!-- end-user-doc -->" + NL + "     * @generated" + NL
			+ "     */" + NL
			+ "\tpublic List<EReference> getEStructuralFeatures() {" + NL
			+ "\t\tList<EReference> eReferences = new ArrayList<EReference>();"
			+ NL + "\t\teReferences.add(";
	protected final String TEXT_12 = ");" + NL + "\t\treturn eReferences;" + NL
			+ "\t}" + NL + "" + NL + "}" + NL;
	protected final String TEXT_13 = NL
			+ "import java.util.ArrayList;"
			+ NL
			+ "import java.util.List;"
			+ NL
			+ ""
			+ NL
			+ "import org.eclipse.emf.ecore.EClass;"
			+ NL
			+ "import org.eclipse.emf.ecore.EObject;"
			+ NL
			+ "import org.eclipse.emf.ecore.EReference;"
			+ NL
			+ ""
			+ NL
			+ "import org.polarsys.capella.common.helpers.EObjectExt;"
			+ NL
			+ "import org.polarsys.capella.core.business.queries.IBusinessQuery;"
			+ NL
			+ "import org.polarsys.capella.core.data.capellacore.CapellaElement;"
			+ NL
			+ "import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;"
			+ NL
			+ "import org.polarsys.capella.core.model.helpers.query.CapellaQueries;"
			+ NL + "import org.polarsys.capella.core.model.utils.ListExt;";
	protected final String TEXT_14 = NL + "\t\timport ";
	protected final String TEXT_15 = ";" + NL + "\t";
	protected final String TEXT_16 = NL + "import ";
	protected final String TEXT_17 = ";";
	protected final String TEXT_18 = "// create the extension";
	protected final String TEXT_19 = NL;
	protected final String TEXT_20 = NL;

	public MultipleSemanticFieldsQueryJavaClass() {
		//Here is the constructor
		StringBuffer stringBuffer = new StringBuffer();

		// add initialisation of the pattern variables (declaration has been already done).

	}

	public String generate(Object argument) throws Exception {
		final StringBuffer stringBuffer = new StringBuffer();

		InternalPatternContext ctx = (InternalPatternContext) argument;
		Map<String, String> queryCtx = null;
		IQuery.ParameterDescription paramDesc = null;
		Node.Container currentNode = ctx.getNode();

		List<Object> parameterList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object parameterParameter : parameterList) {

			this.parameter = (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIField) parameterParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration(ctx);
			}

		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(
					OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_19);
		stringBuffer.append(TEXT_20);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		method_setSection(new StringBuffer(), ictx);

		method_setEPFUtility(new StringBuffer(), ictx);
		super.orchestration(new SuperOrchestrationContext(ictx));

		method_genPackage(new StringBuffer(), ictx);

		method_genDefaultImport(new StringBuffer(), ictx);

		method_genSematicImports(new StringBuffer(), ictx);

		method_genClass(new StringBuffer(), ictx);

		method_registerExtension(new StringBuffer(), ictx);

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("parameter", this.parameter);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx,
					parameterValues);
		}
		return null;
	}

	protected org.polarsys.capella.ad.viewpoint.dsl.generation.ui.util.EPFUtility epfUtility = null;

	public void set_epfUtility(
			org.polarsys.capella.ad.viewpoint.dsl.generation.ui.util.EPFUtility object) {
		this.epfUtility = object;
	}

	protected org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIContainer section = null;

	public void set_section(
			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIContainer object) {
		this.section = object;
	}

	protected org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIField parameter = null;

	public void set_parameter(
			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIField object) {
		this.parameter = object;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		return parameters;
	}

	protected void method_setParameters(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		String tabID = ((UI) section.eContainer()).getName();
		classname = epfUtility.getWidgetName(parameter) + "Query";
		projectname = UIProjectManager.INSTANCE.getUiProject().getName();
		packagename = JDTUtility.getValidPackageName(projectname + ".queries");
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setParameters",
				stringBuffer.toString());
	}

	protected void method_setEPFUtility(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		epfUtility = EPFUtility.getEPFUtilityFor(section);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setEPFUtility",
				stringBuffer.toString());
	}

	protected void method_setSection(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		EObject eObject = parameter.eContainer();
		while (eObject instanceof UIContainer
				&& !(eObject.eContainer() instanceof UI)) {
			eObject = eObject.eContainer();
		}
		section = (UIContainer) eObject;

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "setSection",
				stringBuffer.toString());
	}

	protected void method_genPackage(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		stringBuffer.append(TEXT_1);
		stringBuffer.append(packagename);
		stringBuffer.append(TEXT_2);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "genPackage",
				stringBuffer.toString());
	}

	protected void method_genClass(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		DataWidget iDataWidget = epfUtility.getDataOf(parameter);
		String associatedEStructuralFeature = iDataWidget.widgetFieldAccessorName;
		String inWidgetQueryName = iDataWidget.widgetName + "Query";

		char first = Character.toUpperCase(inWidgetQueryName.charAt(0));
		inWidgetQueryName = first + inWidgetQueryName.substring(1);

		String widgetFieldEType = iDataWidget.widgetFieldETypeName;
		String widgetFieldETypeLiteral = iDataWidget.widgetFieldETypeLiteral;
		String widgetFieldContainerLiteral = iDataWidget.widgetFieldContainerLiteral;
		String widgetFieldEContainerAccessorName = iDataWidget.widgetFieldContainerAccessorName;
		String widgetFieldGetter = iDataWidget.widgetFieldGetter;

		stringBuffer.append(TEXT_3);
		stringBuffer.append(inWidgetQueryName);
		stringBuffer.append(TEXT_4);
		stringBuffer.append(associatedEStructuralFeature);
		stringBuffer.append(TEXT_5);
		stringBuffer.append(inWidgetQueryName);
		stringBuffer.append(TEXT_6);
		stringBuffer.append(widgetFieldETypeLiteral);
		stringBuffer.append(TEXT_7);
		stringBuffer.append(widgetFieldEContainerAccessorName);
		stringBuffer.append(TEXT_8);
		stringBuffer.append(widgetFieldEContainerAccessorName);
		stringBuffer.append(TEXT_9);
		stringBuffer.append(widgetFieldGetter);
		stringBuffer.append(TEXT_10);
		stringBuffer.append(widgetFieldContainerLiteral);
		stringBuffer.append(TEXT_11);
		stringBuffer.append(associatedEStructuralFeature);
		stringBuffer.append(TEXT_12);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "genClass",
				stringBuffer.toString());
	}

	protected void method_genDefaultImport(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		stringBuffer.append(TEXT_13);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "genDefaultImport",
				stringBuffer.toString());
	}

	protected void method_genSematicImports(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		ArrayList<String> importList = epfUtility
				.getSematicImportsFor(parameter);
		for (String currentImport : importList) {
			stringBuffer.append(TEXT_14);
			stringBuffer.append(currentImport);
			stringBuffer.append(TEXT_15);
		}
		DataWidget iDataWidget = epfUtility.getDataOf(parameter);
		String associatedEStructuralFeature = iDataWidget.widgetFieldAccessorName;
		stringBuffer.append(TEXT_16);
		stringBuffer.append(iDataWidget.computeWidgetFieldETypeEPackage());
		stringBuffer.append(TEXT_17);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "genSematicImports",
				stringBuffer.toString());
	}

	protected void method_registerExtension(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		stringBuffer.append(TEXT_18);

		DataWidget iDataWidget = epfUtility.getDataOf(parameter);
		String classQualifiedName = packagename + "." + classname;
		String extensionPoint = "org.polarsys.capella.core.data.business.queries.MDEBusinessQueries";
		String extension = "   <MDEBusinessQueries \n" + "         class=\""
				+ classQualifiedName + "\" \n" + "         id=\""
				+ classQualifiedName + "\"> \n" + "   </MDEBusinessQueries> \n";
		iDataWidget.PluginExtensionEntries.add(new PluginExtensionEntry(
				extensionPoint, true, extension));

		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "registerExtension",
				stringBuffer.toString());
	}

	public boolean preCondition(PatternContext ctx) throws Exception {
		return parameter.getType().equals(UI_Field_Type.MULTIPLE_CHOICE_LIST);
	}
}