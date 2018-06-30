using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Data.Usage.Library.RNDataUsageLibrary
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNDataUsageLibraryModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNDataUsageLibraryModule"/>.
        /// </summary>
        internal RNDataUsageLibraryModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNDataUsageLibrary";
            }
        }
    }
}
