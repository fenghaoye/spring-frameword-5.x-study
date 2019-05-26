package com.fh.project.imports;

import com.fh.project.dao.AopBeanPostProcessor;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{AopBeanPostProcessor.class.getName()};
	}
}
