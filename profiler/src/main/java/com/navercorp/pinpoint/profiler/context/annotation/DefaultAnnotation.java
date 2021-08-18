/*
 * Copyright 2021 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.profiler.context.annotation;

import com.navercorp.pinpoint.profiler.context.Annotation;
import com.navercorp.pinpoint.profiler.util.AnnotationValueMapper;

/**
 * @author emeroad
 */
public class DefaultAnnotation implements Annotation<Object> {

    private final int key;
    private final Object value;

    public DefaultAnnotation(int key, Object value) {
        this.key = key;
        this.value = AnnotationValueMapper.checkValueType(value);
    }

    @Override
    public int getAnnotationKey() {
        return getKey();
    }

    @Override
    public int getKey() {
        return key;
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ObjectAnnotation{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
