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

import com.navercorp.pinpoint.common.util.DataType;
import com.navercorp.pinpoint.profiler.context.Annotation;

/**
 * @author emeroad
 */
public class DataTypeAnnotation implements Annotation<DataType> {

    private final int key;
    private final DataType value;


    DataTypeAnnotation(int key, DataType value) {
        this.key = key;
        this.value = value;
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
    public DataType getValue() {
        return value;
    }

    public DataType dataTypeValue() {
        return value;
    }

    @Override
    public String toString() {
        return "DataTypeAnnotation{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
