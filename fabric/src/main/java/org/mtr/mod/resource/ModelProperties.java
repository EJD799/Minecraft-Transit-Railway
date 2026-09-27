package org.mtr.mod.resource;

import org.mtr.core.serializer.ReaderBase;
import org.mtr.libraries.it.unimi.dsi.fastutil.objects.ObjectArrayList;
import org.mtr.libraries.it.unimi.dsi.fastutil.objects.ObjectSet;
import org.mtr.mapping.holder.Identifier;
import org.mtr.mod.generated.resource.ModelPropertiesSchema;

import javax.annotation.Nullable;
import java.util.function.Consumer;

public final class ModelProperties extends ModelPropertiesSchema {

	@Nullable
	public final Identifier gangwayInnerSideTexture;
	@Nullable
	public final Identifier gangwayInnerTopTexture;
	@Nullable
	public final Identifier gangwayInnerBottomTexture;
	@Nullable
	public final Identifier gangwayOuterSideTexture;
	@Nullable
	public final Identifier gangwayOuterTopTexture;
	@Nullable
	public final Identifier gangwayOuterBottomTexture;
	@Nullable
	public final Identifier gangwayModel;
	@Nullable
	public final Identifier barrierInnerSideTexture;
	@Nullable
	public final Identifier barrierInnerTopTexture;
	@Nullable
	public final Identifier barrierInnerBottomTexture;
	@Nullable
	public final Identifier barrierOuterSideTexture;
	@Nullable
	public final Identifier barrierOuterTopTexture;
	@Nullable
	public final Identifier barrierOuterBottomTexture;
	@Nullable
	public final Identifier barrierModel;

	public ModelProperties(ReaderBase readerBase) {
		super(readerBase);
		updateData(readerBase);
		gangwayInnerSideTexture = CustomResourceTools.formatIdentifier(gangwayInnerSideResource, "png");
		gangwayInnerTopTexture = CustomResourceTools.formatIdentifier(gangwayInnerTopResource, "png");
		gangwayInnerBottomTexture = CustomResourceTools.formatIdentifier(gangwayInnerBottomResource, "png");
		gangwayOuterSideTexture = CustomResourceTools.formatIdentifier(gangwayOuterSideResource, "png");
		gangwayOuterTopTexture = CustomResourceTools.formatIdentifier(gangwayOuterTopResource, "png");
		gangwayOuterBottomTexture = CustomResourceTools.formatIdentifier(gangwayOuterBottomResource, "png");
		gangwayModel = CustomResourceTools.formatIdentifier(gangwayModelResource, "obj");
		barrierInnerSideTexture = CustomResourceTools.formatIdentifier(barrierInnerSideResource, "png");
		barrierInnerTopTexture = CustomResourceTools.formatIdentifier(barrierInnerTopResource, "png");
		barrierInnerBottomTexture = CustomResourceTools.formatIdentifier(barrierInnerBottomResource, "png");
		barrierOuterSideTexture = CustomResourceTools.formatIdentifier(barrierOuterSideResource, "png");
		barrierOuterTopTexture = CustomResourceTools.formatIdentifier(barrierOuterTopResource, "png");
		barrierOuterBottomTexture = CustomResourceTools.formatIdentifier(barrierOuterBottomResource, "png");
	    barrierModel = CustomResourceTools.formatIdentifier(barrierModelResource, "obj");
	}

	ModelProperties(double modelYOffset) {
		super(modelYOffset, "", "", "", "", "", "", "", 0, 0, 0, 0, 0, 0, 0, "", "", "", "", "", "", "", 0, 0, 0, 0, 0, 0, 0);
		gangwayInnerSideTexture = null;
		gangwayInnerTopTexture = null;
		gangwayInnerBottomTexture = null;
		gangwayOuterSideTexture = null;
		gangwayOuterTopTexture = null;
		gangwayOuterBottomTexture = null;
		gangwayModel = null;
		barrierInnerSideTexture = null;
		barrierInnerTopTexture = null;
		barrierInnerBottomTexture = null;
		barrierOuterSideTexture = null;
		barrierOuterTopTexture = null;
		barrierOuterBottomTexture = null;
		barrierModel = null;
	}

	ModelProperties(
			ObjectArrayList<ModelPropertiesPart> parts,
			double modelYOffset,
			String gangwayInnerSideResource,
			String gangwayInnerTopResource,
			String gangwayInnerBottomResource,
			String gangwayOuterSideResource,
			String gangwayOuterTopResource,
			String gangwayOuterBottomResource,
		    String gangwayModelResource,
		    double gangwayModelWidth,
		    double gangwayModelHeight,
		    double gangwayModelDepth,
			double gangwayWidth,
			double gangwayHeight,
			double gangwayYOffset,
			double gangwayZOffset,
			String barrierInnerSideResource,
			String barrierInnerTopResource,
			String barrierInnerBottomResource,
			String barrierOuterSideResource,
			String barrierOuterTopResource,
			String barrierOuterBottomResource,
		    String barrierModelResource,
		    double barrierModelWidth,
		    double barrierModelHeight,
		    double barrierModelDepth,
			double barrierWidth,
			double barrierHeight,
			double barrierYOffset,
			double barrierZOffset
	) {
		super(
				modelYOffset,
				gangwayInnerSideResource,
				gangwayInnerTopResource,
				gangwayInnerBottomResource,
				gangwayOuterSideResource,
				gangwayOuterTopResource,
				gangwayOuterBottomResource,
			    gangwayModelResource,
			    gangwayModelWidth,
			    gangwayModelHeight,
			    gangwayModelDepth,
				gangwayWidth,
				gangwayHeight,
				gangwayYOffset,
				gangwayZOffset,
				barrierInnerSideResource,
				barrierInnerTopResource,
				barrierInnerBottomResource,
				barrierOuterSideResource,
				barrierOuterTopResource,
				barrierOuterBottomResource,
			    barrierModelResource,
			    barrierModelWidth,
                barrierModelHeight,
			    barrierModelDepth,
				barrierWidth,
				barrierHeight,
				barrierYOffset,
				barrierZOffset
		);
		this.parts.addAll(parts);
		gangwayInnerSideTexture = CustomResourceTools.formatIdentifier(gangwayInnerSideResource, "png");
		gangwayInnerTopTexture = CustomResourceTools.formatIdentifier(gangwayInnerTopResource, "png");
		gangwayInnerBottomTexture = CustomResourceTools.formatIdentifier(gangwayInnerBottomResource, "png");
		gangwayOuterSideTexture = CustomResourceTools.formatIdentifier(gangwayOuterSideResource, "png");
		gangwayOuterTopTexture = CustomResourceTools.formatIdentifier(gangwayOuterTopResource, "png");
		gangwayOuterBottomTexture = CustomResourceTools.formatIdentifier(gangwayOuterBottomResource, "png");
		gangwayModel = CustomResourceTools.formatIdentifier(gangwayModelResource, "obj");
		barrierInnerSideTexture = CustomResourceTools.formatIdentifier(barrierInnerSideResource, "png");
		barrierInnerTopTexture = CustomResourceTools.formatIdentifier(barrierInnerTopResource, "png");
		barrierInnerBottomTexture = CustomResourceTools.formatIdentifier(barrierInnerBottomResource, "png");
		barrierOuterSideTexture = CustomResourceTools.formatIdentifier(barrierOuterSideResource, "png");
		barrierOuterTopTexture = CustomResourceTools.formatIdentifier(barrierOuterTopResource, "png");
		barrierOuterBottomTexture = CustomResourceTools.formatIdentifier(barrierOuterBottomResource, "png");
		barrierModel = CustomResourceTools.formatIdentifier(barrierModelResource, "obj");
	}

	public void iterateParts(Consumer<ModelPropertiesPart> consumer) {
		parts.forEach(consumer);
	}

	public double getModelYOffset() {
		return modelYOffset;
	}

	public double getGangwayModelWidth() {
		return gangwayModelWidth;
	}

	public double getGangwayModelHeight() {
		return gangwayModelHeight;
	}

	public double getGangwayModelDepth() {
		return gangwayModelDepth;
	}

	public double getGangwayWidth() {
		return gangwayWidth;
	}

	public double getGangwayHeight() {
		return gangwayHeight;
	}

	public double getGangwayYOffset() {
		return gangwayYOffset;
	}

	public double getGangwayZOffset() {
		return gangwayZOffset;
	}

	public double getBarrierModelWidth() {
		return barrierModelWidth;
	}

	public double getBarrierModelHeight() {
		return barrierModelHeight;
	}

	public double getBarrierModelDepth() {
		return barrierModelDepth;
	}

	public double getBarrierWidth() {
		return barrierWidth;
	}

	public double getBarrierHeight() {
		return barrierHeight;
	}

	public double getBarrierYOffset() {
		return barrierYOffset;
	}

	public double getBarrierZOffset() {
		return barrierZOffset;
	}

	VehicleModelWrapper toVehicleModelWrapper(String modelResource, String textureResource, String modelPropertiesResource, String positionDefinitionsResource, boolean flipTextureV, ObjectArrayList<ModelPropertiesPartWrapper> parts) {
		return new VehicleModelWrapper(
				modelResource,
				textureResource,
				modelPropertiesResource,
				positionDefinitionsResource,
				flipTextureV,
				parts,
				modelYOffset,
				gangwayInnerSideResource,
				gangwayInnerTopResource,
				gangwayInnerBottomResource,
				gangwayOuterSideResource,
				gangwayOuterTopResource,
				gangwayOuterBottomResource,
			    gangwayModelResource,
			    gangwayModelWidth,
			    gangwayModelHeight,
			    gangwayModelDepth,
				gangwayWidth,
				gangwayHeight,
				gangwayYOffset,
				gangwayZOffset,
				barrierInnerSideResource,
				barrierInnerTopResource,
				barrierInnerBottomResource,
				barrierOuterSideResource,
				barrierOuterTopResource,
				barrierOuterBottomResource,
			    barrierModelResource,
			    barrierModelWidth,
			    barrierModelHeight,
			    barrierModelDepth,
				barrierWidth,
				barrierHeight,
				barrierYOffset,
				barrierZOffset
		);
	}

	public void addPartsIfEmpty(ObjectSet<String> partNames) {
		if (parts.isEmpty()) {
			parts.add(new ModelPropertiesPart(partNames));
		}
	}
}
