package org.michal.radziwon;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Ordering;
import com.google.common.reflect.ClassPath.ClassInfo;

public class ClassSearch {
	public final static Predicate<ClassInfo> IS_CLASSINFO_IN_PACKAGE(
			final String packageName) {
		return new Predicate<ClassInfo>() {
			@Override
			public boolean apply(ClassInfo classInfo) {
				return classInfo.getName().startsWith(packageName);
			}
		};
	}

	public final static Predicate<Class<?>> IS_CLASS_IN_PACKAGE(
			final String packageName) {
		return new Predicate<Class<?>>() {
			@Override
			public boolean apply(Class<?> classInfo) {
				return classInfo.getName().startsWith(packageName);
			}
		};
	}

	public final static Predicate<Class<?>> CLASS_IS_NOT_ENUM = new Predicate<Class<?>>() {
		@Override
		public boolean apply(Class<?> c) {
			return !c.isEnum();
		}
	};

	public final static Predicate<Class<?>> IS_COLLECTION() {
		return new Predicate<Class<?>>() {
			@Override
			public boolean apply(Class<?> clazz) {
				return Collection.class.isAssignableFrom(clazz);
			}
		};
	}

	public final static Function<Field, Class<?>> FIELD_TO_PARAMETERTYPE = new Function<Field, Class<?>>() {
		@Override
		public Class<?> apply(Field field) {
			// FIXME does not support Maps
			ParameterizedType genericSuperclass = (ParameterizedType) field
					.getGenericType();
			Type type = genericSuperclass.getActualTypeArguments()[0];
			if (type instanceof WildcardType) {
				// for java.util.List<? extends com.my.Type> returns com.my.Type
				return (Class<?>) ((WildcardType) type).getUpperBounds()[0];
			} else {
				// for List<String> returns String
				return (Class<?>) type;
			}
		}
	};

	public final static Function<Method, Class<?>> METHOD_RESULT_TO_PARAMETERTYPE = new Function<Method, Class<?>>() {
		@Override
		public Class<?> apply(Method field) {
			// FIXME does not support Maps
			ParameterizedType genericSuperclass = (ParameterizedType) field
					.getGenericReturnType();
			Type type = genericSuperclass.getActualTypeArguments()[0];
			if (type instanceof WildcardType) {
				// for java.util.List<? extends com.my.Type> returns com.my.Type
				return (Class<?>) ((WildcardType) type).getUpperBounds()[0];
			} else {
				// for List<String> returns String
				return (Class<?>) type;
			}
		}
	};

	public final static Predicate<ClassInfo> CLASS_EXTENDS_CLASS(
			final Class<?> parent) {
		return new Predicate<ClassInfo>() {
			@Override
			public boolean apply(ClassInfo classInfo) {
				return parent.equals(classInfo.load().getSuperclass());
			}
		};
	}

	public final static Function<ClassInfo, Class<?>> CLASSINFO_TO_CLASS = new Function<ClassInfo, Class<?>>() {
		@Override
		public Class<?> apply(ClassInfo classInfo) {
			return classInfo.load();
		}
	};

	public final static Ordering<Field> ORDER_FIELDS_BY_NAME = Ordering
			.natural().onResultOf(new Function<Field, String>() {
				@Override
				public String apply(Field c) {
					return c.getName();
				}
			});
	public final static Ordering<Class<?>> OREDER_CLASS_BY_NAME = Ordering
			.natural().onResultOf(new Function<Class<?>, String>() {
				@Override
				public String apply(Class<?> c) {
					return c.getName();
				}
			});

	public final static Predicate<Method> METHOD_IS_ANNOTATED(
			final Class<? extends Annotation> annotationClass) {
		return new Predicate<Method>() {
			@Override
			public boolean apply(Method m) {
				return m.isAnnotationPresent(annotationClass);
			}
		};
	}

	public final static Predicate<Method> IS_PUBLIC_GETTER() {
		return new Predicate<Method>() {
			@Override
			public boolean apply(Method m) {
				return Modifier.isPublic(m.getModifiers())
						&& (m.getName().startsWith("get") || m.getName()
								.startsWith("is"));
			}
		};
	}

	public final static Predicate<ClassInfo> CLASSINFO_CLASS_HAS_NAME_ENDING_WITH(
			final String postfix) {
		return new Predicate<ClassInfo>() {
			@Override
			public boolean apply(ClassInfo classInfo) {
				return classInfo.load().getName().endsWith(postfix);
			}
		};
	}

	public final static Predicate<Class<?>> CLASS_CONTAINS_METHOD_WITH_ANNOTATION(
			final Class<? extends Annotation> annotation) {
		return new Predicate<Class<?>>() {
			@Override
			public boolean apply(Class<?> classInfo) {
				return !FluentIterable
						.from(Arrays.asList(classInfo.getDeclaredMethods()))
						.filter(METHOD_IS_ANNOTATED(annotation)).isEmpty();
			}
		};
	}

	public final static Function<Class<?>, List<Method>> CLASS_TO_CLASS_IN_METHODS_WITH_ANNOTATION(
			final Class<? extends Annotation> annotation) {
		return new Function<Class<?>, List<Method>>() {
			@Override
			public List<Method> apply(Class<?> clazz) {
				return FluentIterable
						.from(Arrays.asList(clazz.getDeclaredMethods()))
						.filter(METHOD_IS_ANNOTATED(annotation)).toList();
			}
		};
	}

	public final static Function<Method, List<Annotation>> METHOD_TO_METHOD_IN_ANNOTATION = new Function<Method, List<Annotation>>() {
		@Override
		public List<Annotation> apply(Method m) {
			return FluentIterable.from(Arrays.asList(m.getAnnotations()))
					.toList();
		}
	};
	public final static Function<Collection<?>, Integer> COLLECTION_TO_SIZE = new Function<Collection<?>, Integer>() {
		@Override
		public Integer apply(Collection<?> c) {
			return c.size();
		}
	};

}
