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
 * <p>
 * Provides a framework for static code analysis based on the asm.tree package.
 * </p>
 * <p>
 * Basic usage:
 * </p>
 * <pre>
 * ClassReader cr = new ClassReader(bytecode);
 * ClassNode cn = new ClassNode();
 * cr.accept(cn, ClassReader.SKIP_DEBUG);
 * List methods = cn.methods;
 * for (int i = 0; i < methods.size(); ++i) {
 * MethodNode method = (MethodNode) methods.get(i);
 * if (method.instructions.size() > 0) {
 * Analyzer a = new Analyzer(new BasicInterpreter());
 * a.analyze(cn.name, method);
 * Frame[] frames = a.getFrames();
 * // Elements of the frames arrray now contains info for each instruction
 * // from the analyzed method. BasicInterpreter creates BasicValue, that
 * // is using simplified type system that distinguishes the UNINITIALZED,
 * // INT, FLOAT, LONG, DOUBLE, REFERENCE and RETURNADDRESS types.
 * ...
 * }
 * }
 * </pre>
 * <p>
 * @since ASM 1.4.3
 * </p>
 */
package org.powermock.api.mockito.repackaged.asm.tree.analysis;