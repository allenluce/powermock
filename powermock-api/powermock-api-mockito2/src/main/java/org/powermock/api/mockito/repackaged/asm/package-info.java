/*
 *
 *   ASM: a very small and fast Java bytecode manipulation framework
 *   Copyright (c) 2000-2007 INRIA, France Telecom
 *   All rights reserved.
 *
 *   Redistribution and use in source and binary forms, with or without
 *   modification, are permitted provided that the following conditions
 *   are met:
 *   1. Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *   2. Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *   3. Neither the name of the copyright holders nor the names of its
 *      contributors may be used to endorse or promote products derived from
 *      this software without specific prior written permission.
 *
 *   THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 *   AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 *   IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 *   ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 *   LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *   CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 *   SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 *   INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 *   CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 *   ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 *   THE POSSIBILITY OF SUCH DAMAGE.
 */

/**
 * Provides a small and fast bytecode manipulation framework.
 * <p>
 * The <a href="http://www.objectweb.org/asm">ASM</a> framework is organized
 * around the {@link org.objectweb.asm.ClassVisitor ClassVisitor},
 * {@link org.objectweb.asm.FieldVisitor FieldVisitor} and
 * {@link org.objectweb.asm.MethodVisitor MethodVisitor} interfaces, which allow
 * one to visit the fields and methods of a class, including the bytecode
 * instructions of each method.
 * <p>
 * In addition to these main interfaces, ASM provides a {@link
 * org.objectweb.asm.ClassReader ClassReader} class, that can parse an
 * existing class and make a given visitor visit it. ASM also provides
 * a {@link org.objectweb.asm.ClassWriter ClassWriter} class, which is
 * a visitor that generates Java class files.
 * <p>
 * In order to generate a class from scratch, only the {@link
 * org.objectweb.asm.ClassWriter ClassWriter} class is necessary. Indeed,
 * in order to generate a class, one must just call its visit<i>XXX</i>
 * methods with the appropriate arguments to generate the desired fields
 * and methods. See the "helloworld" example in the ASM distribution for
 * more details about class generation.
 * <p>
 * In order to modify existing classes, one must use a {@link
 * org.objectweb.asm.ClassReader ClassReader} class to analyze
 * the original class, a class modifier, and a {@link org.objectweb.asm.ClassWriter
 * ClassWriter} to construct the modified class. The class modifier
 * is just a {@link org.objectweb.asm.ClassVisitor ClassVisitor}
 * that delegates most of the work to another {@link org.objectweb.asm.ClassVisitor
 * ClassVisitor}, but that sometimes changes some parameter values,
 * or call additional methods, in order to implement the desired
 * modification process. In order to make it easier to implement such
 * class modifiers, ASM provides the {@link org.objectweb.asm.ClassAdapter
 * ClassAdapter} and {@link org.objectweb.asm.MethodAdapter MethodAdapter}
 * classes, which implement the {@link org.objectweb.asm.ClassVisitor ClassVisitor}
 * and {@link org.objectweb.asm.MethodVisitor MethodVisitor} interfaces by
 * delegating all work to other visitors. See the "adapt" example in the ASM
 * distribution for more details about class modification.
 * <p>
 * The size of the core ASM library, <tt>asm.jar</tt>, is only 42KB, which is much
 * smaller than the size of the
 * <a href="http://jakarta.apache.org/bcel">BCEL</a> library (504KB), and than the
 * size of the
 * <a href="http://serp.sourceforge.net">SERP</a> library (150KB). ASM is also
 * much faster than these tools. Indeed the overhead of a load time class
 * transformation process is of the order of 60% with ASM, 700% or more with BCEL,
 * and 1100% or more with SERP (see the <tt>test/perf</tt> directory in the ASM
 * distribution)!
 * @since ASM 1.3
 */
package org.powermock.api.mockito.repackaged.asm;