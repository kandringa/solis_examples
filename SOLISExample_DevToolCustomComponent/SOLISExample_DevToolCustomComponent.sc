stk.v.11.0
WrittenBy    STK_v11.4.1
BEGIN Scenario
    Name		 SOLISExample_DevToolCustomComponent

    BEGIN Epoch

        Epoch		 5 Feb 2016 14:25:00.000000000
        SmartEpoch		
        BEGIN EVENT
            Epoch		 5 Feb 2016 14:25:00.000000000
            EventEpoch		
            BEGIN EVENT
                Type		 EVENT_LINKTO
                Name		 AnalysisStartTime
            END EVENT
            EpochState		 Implicit
        END EVENT


    END Epoch

    BEGIN Interval

        Start		 5 Feb 2016 14:25:00.000000000
        Stop		 5 Feb 2016 15:45:00.000000000
        SmartInterval		
        BEGIN EVENTINTERVAL
            BEGIN Interval
                Start		 5 Feb 2016 14:25:00.000000000
                Stop		 5 Feb 2016 15:45:00.000000000
            END Interval
            IntervalState		 Explicit
        END EVENTINTERVAL

        EpochUsesAnalStart		 No
        AnimStartUsesAnalStart		 Yes
        AnimStopUsesAnalStop		 Yes

    END Interval

    BEGIN EOPFile

        InheritEOPSource		 No
        EOPFilename		 EOP-v1.1.txt

    END EOPFile

    BEGIN GlobalPrefs
        SatelliteNoOrbWarning		 No
        MissilePerigeeWarning		 No
        MissileStopTimeWarning		 No
        AircraftWGS84Warning		 Always
    END GlobalPrefs

    BEGIN CentralBody

        PrimaryBody		 Earth

    END CentralBody

    BEGIN CentralBodyTerrain

        BEGIN CentralBody
            Name		 Earth
            UseTerrainCache		 Yes
            TotalCacheSize		 402653184

            BEGIN StreamingTerrain
                UseCurrentStreamingTerrainServer		 No
                StreamingTerrainServerName		 assets.agi.com/stk-terrain/
                StreamingTerrainAzimuthElevationMaskEnabled		 Yes
                StreamingTerrainObscurationEnabled		 Yes
                StreamingTerrainCoverageGridObscurationEnabled		 Yes
            END StreamingTerrain
        END CentralBody

    END CentralBodyTerrain

    BEGIN StarCollection

        Name		 Hipparcos 2 Mag 6

    END StarCollection

    BEGIN ScenarioLicenses
        Module		 ASTGv11.4
        Module		 AnalysisWBv11.4
        Module		 COVv11.4
        Module		 Commv11.4
        Module		 STKIntegrationv11.4
        Module		 STKProfessionalv11.4
        Module		 STKv11.4
        Module		 SatProv11.4
    END ScenarioLicenses

    BEGIN Extensions

        BEGIN ClsApp
            RangeConstraint		 5000
            ApoPeriPad		 30000
            OrbitPathPad		 100000
            TimeDistPad		 30000
            OutOfDate		 2.592e+06
            MaxApoPeriStep		 900
            ApoPeriAngle		 0.785
            UseApogeePerigeeFilter		 Yes
            UsePathFilter		 No
            UseTimeFilter		 No
            UseOutOfDate		 Yes
            CreateSats		 No
            MaxSatsToCreate		 500
            UseModelScale		 No
            ModelScale		 0
            UseCrossRefDb		 Yes
            CollisionDB		 stkAllTLE.tce
            CollisionCrossRefDB		 stkAllTLE.sd
            ShowLine		 Yes
            AnimHighlight		 Yes
            StaticHighlight		 Yes
            UseLaunchWindow		 No
            LaunchWindowUseEntireTraj		 Yes
            LaunchWindowTrajMETStart		 0
            LaunchWindowTrajMETStop		 900
            LaunchWindowStart		 -69900
            LaunchWindowStop		 11700
            LaunchMETOffset		 0
            LaunchWindowUseSecEphem		 No 
            LaunchWindowUseScenFolderForSecEphem		 Yes
            LaunchWindowUsePrimEphem		 No 
            LaunchWindowUseScenFolderForPrimEphem		 Yes
            LaunchWindowIntervalPtr		
            BEGIN EVENTINTERVAL
                BEGIN Interval
                    Start		 4 Feb 2016 19:00:00.000000000
                    Stop		 5 Feb 2016 19:00:00.000000000
                END Interval
                IntervalState		 Explicit
            END EVENTINTERVAL

            LaunchWindowUsePrimMTO		 No 
            GroupLaunches		 No 
            LWTimeConvergence		 0.001
            LWRelValueConvergence		 1e-08
            LWTSRTimeConvergence		 0.0001
            LWTSRRelValueConvergence		 1e-10
            LaunchWindowStep		 300
            MaxTSRStep		 1.8000000000000000e+02
            MaxTSRRelMotion		 2.0000000000000000e+01
            UseLaunchArea		 No 
            LaunchAreaOrientation		 North
            LaunchAreaAzimuth		 0
            LaunchAreaXLimits		 -10000 10000
            LaunchAreaYLimits		 -10000 10000
            LaunchAreaNumXIntrPnts		 1
            LaunchAreaNumYIntrPnts		 1
            LaunchAreaAltReference		 Ellipsoid
            TargetSameStop		 No 
            SkipSurfaceMetric		 No 
            LWAreaTSRRelValueConvergence		 1e-10
            AreaLaunchWindowStep		 300
            AreaMaxTSRStep		 3.0000000000000000e+01
            AreaMaxTSRRelMotion		 1
            ShowLaunchArea		 No 
            ShowBlackoutTracks		 No 
            ShowClearedTracks		 No 
            UseObjectForClearedColor		 No 
            BlackoutColor		 #ff0000
            ClearedColor		 #ffffff
            ShowTracksSegments		 Yes
            ShowMinRangeTracks		 Yes
            MinRangeTrackTimeStep		 0.5
            UsePrimStepForTracks		 Yes
            GfxTracksTimeStep		 30
            GfxAreaNumXIntrPnts		 1
            GfxAreaNumYIntrPnts		 1
            CreateLaunchMTO		 No 
            CovarianceSigmaScale		 3
            CovarianceMode		 None 
        END ClsApp

        BEGIN Units
            DistanceUnit		 Kilometers
            TimeUnit		 Seconds
            DateFormat		 GregorianUTC
            AngleUnit		 Degrees
            MassUnit		 Kilograms
            PowerUnit		 dBW
            FrequencyUnit		 Gigahertz
            SmallDistanceUnit		 Meters
            LatitudeUnit		 Degrees
            LongitudeUnit		 Degrees
            DurationUnit		 Hr:Min:Sec
            Temperature		 Kelvin
            SmallTimeUnit		 Seconds
            RatioUnit		 Decibel
            RcsUnit		 Decibel
            DopplerVelocityUnit		 MetersperSecond
            SARTimeResProdUnit		 Meter-Second
            ForceUnit		 Newtons
            PressureUnit		 Pascals
            SpecificImpulseUnit		 Seconds
            PRFUnit		 Kilohertz
            BandwidthUnit		 Megahertz
            SmallVelocityUnit		 CentimetersperSecond
            Percent		 Percentage
            SolidAngle		 Steradians
            SpectralBandwidthUnit		 Hertz
            BitsUnit		 MegaBits
            MagneticFieldUnit		 nanoTesla
        END Units

        BEGIN ReportUnits
            DistanceUnit		 Meters
            TimeUnit		 Minutes
            DateFormat		 EpochSeconds
            AngleUnit		 Revolution
            MassUnit		 Kilograms
            PowerUnit		 Watts
            FrequencyUnit		 Gigahertz
            SmallDistanceUnit		 Meters
            LatitudeUnit		 Degrees
            LongitudeUnit		 Degrees
            DurationUnit		 Hr:Min:Sec
            Temperature		 Kelvin
            SmallTimeUnit		 Seconds
            RatioUnit		 Decibel
            RcsUnit		 Decibel
            DopplerVelocityUnit		 MetersperSecond
            SARTimeResProdUnit		 Meter-Second
            ForceUnit		 Newtons
            PressureUnit		 Pascals
            SpecificImpulseUnit		 Seconds
            PRFUnit		 Kilohertz
            BandwidthUnit		 Megahertz
            SmallVelocityUnit		 CentimetersperSecond
            Percent		 Percentage
            SolidAngle		 Steradians
            SpectralBandwidthUnit		 Hertz
            BitsUnit		 MegaBits
            MagneticFieldUnit		 nanoTesla
        END ReportUnits

        BEGIN ConnectReportUnits
            DistanceUnit		 Kilometers
            TimeUnit		 Seconds
            DateFormat		 GregorianUTC
            AngleUnit		 Degrees
            MassUnit		 Kilograms
            PowerUnit		 dBW
            FrequencyUnit		 Gigahertz
            SmallDistanceUnit		 Meters
            LatitudeUnit		 Degrees
            LongitudeUnit		 Degrees
            DurationUnit		 Hr:Min:Sec
            Temperature		 Kelvin
            SmallTimeUnit		 Seconds
            RatioUnit		 Decibel
            RcsUnit		 Decibel
            DopplerVelocityUnit		 MetersperSecond
            SARTimeResProdUnit		 Meter-Second
            ForceUnit		 Newtons
            PressureUnit		 Pascals
            SpecificImpulseUnit		 Seconds
            PRFUnit		 Kilohertz
            BandwidthUnit		 Megahertz
            SmallVelocityUnit		 CentimetersperSecond
            Percent		 Percentage
            SolidAngle		 Steradians
            SpectralBandwidthUnit		 Hertz
            BitsUnit		 MegaBits
            MagneticFieldUnit		 nanoTesla
        END ConnectReportUnits

        BEGIN ReportFavorites
            BEGIN Class
                Name		 Satellite
                BEGIN Favorite
                    Type		 Graph
                    BaseDir		 User
                    Style		 Momentum
                END Favorite
                BEGIN Favorite
                    Type		 Graph
                    BaseDir		 Scenario
                    Style		 Torque
                END Favorite
                BEGIN Favorite
                    Type		 Graph
                    BaseDir		 Scenario
                    Style		 Momentum
                END Favorite
            END Class
        END ReportFavorites

        BEGIN ADFFileData
        END ADFFileData

        BEGIN GenDb

            BEGIN Database
                DbType		 Satellite
                DefDb		 stkAllTLE.sd
                UseMyDb		 Off
                MaxMatches		 2000
                Use4SOC		 On

                BEGIN FieldDefaults

                    BEGIN Field
                        Name		 "SSC Number"
                        Default		 "*"
                    END Field

                    BEGIN Field
                        Name		 "Common Name"
                        Default		 "*"
                    END Field

                END FieldDefaults

            END Database

            BEGIN Database
                DbType		 City
                DefDb		 stkCityDb.cd
                UseMyDb		 Off
                MaxMatches		 2000
                Use4SOC		 On

                BEGIN FieldDefaults

                    BEGIN Field
                        Name		 "City Name"
                        Default		 "*"
                    END Field

                END FieldDefaults

            END Database

            BEGIN Database
                DbType		 Facility
                DefDb		 stkFacility.fd
                UseMyDb		 Off
                MaxMatches		 2000
                Use4SOC		 On

                BEGIN FieldDefaults

                END FieldDefaults

            END Database
        END GenDb

        BEGIN SOCDb
            BEGIN Defaults
            END Defaults
        END SOCDb

        BEGIN Msgp4Ext
        END Msgp4Ext

        BEGIN FileLocations
        END FileLocations

        BEGIN Author
            Optimize		 No
            UseBasicGlobe		 Yes
            SaveEphemeris		 Yes
            SaveScenFolder		 Yes
            BEGIN ExternalFileTypes
                BEGIN Type
                    FileType		 Calculation Scalar
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Celestial Image
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Cloud
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 EOP
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 External Vector Data
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Globe
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Globe Data
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Map
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Map Image
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Marker/Label
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Model
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Object Break-up File
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Planetary Ephemeris
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Report Style Script
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Report/Graph Style
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Scalar Calculation File
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Terrain
                    Include		 No
                END Type
                BEGIN Type
                    FileType		 Volume Grid Intervals File
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 Volumetric File
                    Include		 Yes
                END Type
                BEGIN Type
                    FileType		 WTM
                    Include		 No
                END Type
            END ExternalFileTypes
            ReadOnly		 No
            ViewerPassword		 No
            STKPassword		 No
            ExcludeInstallFiles		 No
            BEGIN ExternalFileList
                BEGIN File
                    Name		 "facility.mdl"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Landmapper_BC.a"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Aero.rst"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "AttErr.rsg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "CBF2CBI.rst"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "GPS_TSLV.rsg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Gravity.rst"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "LLA Position.rst"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Momentum.rsg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Rates.rsg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "TgtNormal.rst"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Thrust.rsg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "TlmMon.rsg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Aero.rst"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "AttErr.rsg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "CBF2CBI.rst"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "GPS_TSLV.rsg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Gravity.rst"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "LLA Position.rst"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Momentum.rsg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Rates.rsg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "TgtNormal.rst"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Thrust.rsg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "TlmMon.rsg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Landmapper_BC.dae"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "satellite.mdl"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "goldfoil.tga"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "mottled-grey.tga"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "target.mdl"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Target.bmp"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "EOP-v1.1.txt"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Analytic_Orbit.CBOrbitModel"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Ceres.cb"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "JPL_SPICE.CBOrbitModel"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Oblate_Spheroid.CBShapeModel"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "RotationCoefficientsFile.CBSpinModel"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ZonalsToJ4.grv"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Hyperion.cb"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "IAU_1994.CBSpinModel"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "JPL_SPICE.CBOrbitModel"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Triaxial_Ellipsoid.CBShapeModel"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ZonalsToJ4.grv"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Iapetus.cb"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "JPL_SPICE.CBOrbitModel"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Oblate_Spheroid.CBShapeModel"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "RotationCoefficientsFile.CBSpinModel"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ZonalsToJ4.grv"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "JPL_SPICE.CBOrbitModel"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Mimas.cb"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "RotationCoefficientsFile.CBSpinModel"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Triaxial_Ellipsoid.CBShapeModel"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ZonalsToJ4.grv"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "JPL_SPICE.CBOrbitModel"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Phoebe.cb"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "RotationCoefficientsFile.CBSpinModel"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Triaxial_Ellipsoid.CBShapeModel"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ZonalsToJ4.grv"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "JPL_SPICE.CBOrbitModel"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Rhea.cb"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "RotationCoefficientsFile.CBSpinModel"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Triaxial_Ellipsoid.CBShapeModel"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ZonalsToJ4.grv"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "JPL_SPICE.CBOrbitModel"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "RotationCoefficientsFile.CBSpinModel"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Tethys.cb"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Triaxial_Ellipsoid.CBShapeModel"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ZonalsToJ4.grv"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Basic.bmp"
                    IncludeInVDF		 No
                END File
                BEGIN File
                    Name		 "Earth_PE_b.jp2"
                    IncludeInVDF		 No
                END File
                BEGIN File
                    Name		 "water.jp2"
                    IncludeInVDF		 No
                END File
                BEGIN File
                    Name		 "Sun.jp2"
                    IncludeInVDF		 No
                END File
                BEGIN File
                    Name		 "Moon.jp2"
                    IncludeInVDF		 No
                END File
                BEGIN File
                    Name		 "DPT_rec_payload.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "DPT_rt_only.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_CommonParameters.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_Components.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_HWR_Components.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_MissionSpecific.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_MissionSpecific_CommonParameters.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_Objects.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_SecondaryComponents.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_SelectedTelemetry.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_SimulationSpecific.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_Static.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_Subsystems.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_TOC.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_UnitSpecific.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_UTL_Objects.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ODY_CommonParameters.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ODY_Components.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ODY_ConnectionsToFSW.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ODY_SecondaryComponents.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ODY_SelectedTelemetry.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ODY_SimulationSpecific.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ODY_TOC.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ODY_UnitSpecific.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "SOL_CommonParameters.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "SOL_ConnectionsToODySSy.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "SOL_SecondaryComponents.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "SOL_TOC.cfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FswCmdDetail.csv"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FswCmdEnum.csv"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FswCmdMaster.csv"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FswParamDB.xml"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FswTlmDetail.csv"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FswTlmEnum.csv"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FswTlmMaster.csv"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "20180123204314.mta"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "CommOff.fj"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "CommOn.fj"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "MissionSequenceExecutionScript.fj"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "PayloadOff.fj"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "PayloadOn.fj"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "TargetPlan.fj"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "TrackOtherSat.fj"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "CommOff.seqs"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "CommOn.seqs"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "PayloadOff.seqs"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "PayloadOn.seqs"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "TargetPlan.seqs"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "TrackOtherSat.seqs"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "exported.ctlm"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "exported.lcfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "exported.msel"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "exported.mtlm"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "exported.scfg"
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "exported.tpc"
                    IncludeInVDF		 Yes
                END File
            END ExternalFileList
        END Author

        BEGIN ExportDataFile
            FileType		 Ephemeris
            IntervalType		 Ephemeris
            TimePeriodStart		 0
            TimePeriodStop		 0
            StepType		 Ephemeris
            StepSize		 60
            EphemType		 STK
            UseVehicleCentralBody		 Yes
            CentralBody		 Earth
            SatelliteID		 -200000
            CoordSys		 ICRF
            NonSatCoordSys		 Fixed
            InterpolateBoundaries		 Yes
            EphemFormat		 Current
            InterpType		 9
            InterpOrder		 5
            AttCoordSys		 Fixed
            Quaternions		 0
            ExportCovar		 Position
            AttitudeFormat		 Current
            TimePrecision		 6
            CCSDSDateFormat		 YMD
            CCSDSEphFormat		 SciNotation
            CCSDSTimeSystem		 UTC
            CCSDSRefFrame		 ICRF
            UseSatCenterAndFrame		 No
            IncludeCovariance		 No
            IncludeAcceleration		 No
            CCSDSFileFormat		 KVN
        END ExportDataFile

        BEGIN Desc
        END Desc

        BEGIN RfEnv
<?xml version = "1.0" standalone = "yes"?>
<VAR name = "STK_RF_Environment">
    <SCOPE Class = "RFEnvironment">
        <VAR name = "Version">
            <STRING>&quot;1.0.0 a&quot;</STRING>
        </VAR>
        <VAR name = "STKVersion">
            <INT>1140</INT>
        </VAR>
        <VAR name = "ComponentName">
            <STRING>&quot;STK_RF_Environment&quot;</STRING>
        </VAR>
        <VAR name = "Description">
            <STRING>&quot;STK RF Environment&quot;</STRING>
        </VAR>
        <VAR name = "Type">
            <STRING>&quot;STK RF Environment&quot;</STRING>
        </VAR>
        <VAR name = "UserComment">
            <STRING>&quot;STK RF Environment&quot;</STRING>
        </VAR>
        <VAR name = "ReadOnly">
            <BOOL>false</BOOL>
        </VAR>
        <VAR name = "Clonable">
            <BOOL>true</BOOL>
        </VAR>
        <VAR name = "Category">
            <STRING>&quot;&quot;</STRING>
        </VAR>
        <VAR name = "PropagationChannel">
            <VAR name = "RF_Propagation_Channel">
                <SCOPE Class = "PropagationChannel">
                    <VAR name = "Version">
                        <STRING>&quot;1.0.0 a&quot;</STRING>
                    </VAR>
                    <VAR name = "STKVersion">
                        <INT>1140</INT>
                    </VAR>
                    <VAR name = "ComponentName">
                        <STRING>&quot;RF_Propagation_Channel&quot;</STRING>
                    </VAR>
                    <VAR name = "Description">
                        <STRING>&quot;RF Propagation Channel&quot;</STRING>
                    </VAR>
                    <VAR name = "Type">
                        <STRING>&quot;RF Propagation Channel&quot;</STRING>
                    </VAR>
                    <VAR name = "UserComment">
                        <STRING>&quot;RF Propagation Channel&quot;</STRING>
                    </VAR>
                    <VAR name = "ReadOnly">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "Clonable">
                        <BOOL>true</BOOL>
                    </VAR>
                    <VAR name = "Category">
                        <STRING>&quot;&quot;</STRING>
                    </VAR>
                    <VAR name = "UseITU618Section2p5">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "UseCloudFogModel">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "CloudFogModel">
                        <VAR name = "ITU-R_P840-3">
                            <SCOPE Class = "CloudFogLossModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.0 a&quot;</STRING>
                                </VAR>
                                <VAR name = "STKVersion">
                                    <INT>1140</INT>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;ITU-R_P840-3&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;ITU-R P840-3&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;ITU-R P840-3&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;ITU-R P840-3&quot;</STRING>
                                </VAR>
                                <VAR name = "ReadOnly">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "Clonable">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "Category">
                                    <STRING>&quot;&quot;</STRING>
                                </VAR>
                                <VAR name = "CloudCeiling">
                                    <QUANTITY Dimension = "DistanceUnit" Unit = "m">
                                        <REAL>3000</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "CloudLayerThickness">
                                    <QUANTITY Dimension = "DistanceUnit" Unit = "m">
                                        <REAL>500</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "CloudTemp">
                                    <QUANTITY Dimension = "Temperature" Unit = "K">
                                        <REAL>273.15</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "CloudLiqWaterDensity">
                                    <QUANTITY Dimension = "SmallDensity" Unit = "kg*m^-3">
                                        <REAL>0.0075</REAL>
                                    </QUANTITY>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                    <VAR name = "UseTropoScintModel">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "TropoScintModel">
                        <VAR name = "ITU-R_P618-8">
                            <SCOPE Class = "TropoScintLossModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.0 a&quot;</STRING>
                                </VAR>
                                <VAR name = "STKVersion">
                                    <INT>1140</INT>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;ITU-R_P618-8&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;ITU-R P618-8&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;ITU-R P618-8&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;ITU-R P618-8&quot;</STRING>
                                </VAR>
                                <VAR name = "ReadOnly">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "Clonable">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "Category">
                                    <STRING>&quot;&quot;</STRING>
                                </VAR>
                                <VAR name = "ComputeDeepFade">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "FadeOutage">
                                    <QUANTITY Dimension = "Percent" Unit = "unitValue">
                                        <REAL>0.001</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "PercentTimeRefracGrad">
                                    <QUANTITY Dimension = "Percent" Unit = "unitValue">
                                        <REAL>0.1</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "SurfaceTemperature">
                                    <QUANTITY Dimension = "Temperature" Unit = "K">
                                        <REAL>273.15</REAL>
                                    </QUANTITY>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                    <VAR name = "UseIonoFadingModel">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "IonoFadingModel">
                        <VAR name = "ITU-R_P531-13">
                            <SCOPE Class = "IonoFadingLossModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.0 a&quot;</STRING>
                                </VAR>
                                <VAR name = "STKVersion">
                                    <INT>1140</INT>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;ITU-R_P531-13&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;ITU-R P531-13&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;ITU-R P531-13&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;ITU-R P531-13&quot;</STRING>
                                </VAR>
                                <VAR name = "ReadOnly">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "Clonable">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "Category">
                                    <STRING>&quot;&quot;</STRING>
                                </VAR>
                                <VAR name = "UseAlternateAPFile">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "AlternateAPDataFile">
                                    <STRING>
                                        <PROP name = "FullName">
                                            <STRING>&quot;&quot;</STRING>
                                        </PROP>&quot;&quot;</STRING>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                    <VAR name = "UseRainModel">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "RainModel">
                        <VAR name = "ITU-R_P618-10">
                            <SCOPE Class = "RainLossModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.0 a&quot;</STRING>
                                </VAR>
                                <VAR name = "STKVersion">
                                    <INT>1140</INT>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;ITU-R_P618-10&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;ITU-R P618-10 rain model&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;ITU-R P618-10&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;ITU-R P618-10 rain model&quot;</STRING>
                                </VAR>
                                <VAR name = "ReadOnly">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "Clonable">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "Category">
                                    <STRING>&quot;&quot;</STRING>
                                </VAR>
                                <VAR name = "SurfaceTemperature">
                                    <QUANTITY Dimension = "Temperature" Unit = "K">
                                        <REAL>273.15</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "EnableDepolarizationLoss">
                                    <BOOL>false</BOOL>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                    <VAR name = "UseAtmosAbsorptionModel">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "AtmosAbsorptionModel">
                        <VAR name = "Simple_Satcom">
                            <SCOPE Class = "AtmosphericAbsorptionModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.1 a&quot;</STRING>
                                </VAR>
                                <VAR name = "STKVersion">
                                    <INT>1140</INT>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;Simple_Satcom&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;Simple Satcom gaseous absorption model&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;Simple Satcom&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;Simple Satcom gaseous absorption model&quot;</STRING>
                                </VAR>
                                <VAR name = "ReadOnly">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "Clonable">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "Category">
                                    <STRING>&quot;&quot;</STRING>
                                </VAR>
                                <VAR name = "SurfaceTemperature">
                                    <QUANTITY Dimension = "Temperature" Unit = "K">
                                        <REAL>293.15</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "WaterVaporConcentration">
                                    <QUANTITY Dimension = "Density" Unit = "g*m^-3">
                                        <REAL>7.5</REAL>
                                    </QUANTITY>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                    <VAR name = "UseUrbanTerresPropLossModel">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "UrbanTerresPropLossModel">
                        <VAR name = "Two_Ray">
                            <SCOPE Class = "UrbanTerrestrialPropagationLossModel">
                                <VAR name = "Version">
                                    <STRING>&quot;1.0.0 a&quot;</STRING>
                                </VAR>
                                <VAR name = "STKVersion">
                                    <INT>1140</INT>
                                </VAR>
                                <VAR name = "ComponentName">
                                    <STRING>&quot;Two_Ray&quot;</STRING>
                                </VAR>
                                <VAR name = "Description">
                                    <STRING>&quot;Two Ray (Fourth Power Law) atmospheric absorption model&quot;</STRING>
                                </VAR>
                                <VAR name = "Type">
                                    <STRING>&quot;Two Ray&quot;</STRING>
                                </VAR>
                                <VAR name = "UserComment">
                                    <STRING>&quot;Two Ray (Fourth Power Law) atmospheric absorption model&quot;</STRING>
                                </VAR>
                                <VAR name = "ReadOnly">
                                    <BOOL>false</BOOL>
                                </VAR>
                                <VAR name = "Clonable">
                                    <BOOL>true</BOOL>
                                </VAR>
                                <VAR name = "Category">
                                    <STRING>&quot;&quot;</STRING>
                                </VAR>
                                <VAR name = "SurfaceTemperature">
                                    <QUANTITY Dimension = "Temperature" Unit = "K">
                                        <REAL>273.15</REAL>
                                    </QUANTITY>
                                </VAR>
                                <VAR name = "LossFactor">
                                    <REAL>1</REAL>
                                </VAR>
                            </SCOPE>
                        </VAR>
                    </VAR>
                    <VAR name = "UseCustomA">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "UseCustomB">
                        <BOOL>false</BOOL>
                    </VAR>
                    <VAR name = "UseCustomC">
                        <BOOL>false</BOOL>
                    </VAR>
                </SCOPE>
            </VAR>
        </VAR>
        <VAR name = "EarthTemperature">
            <QUANTITY Dimension = "Temperature" Unit = "K">
                <REAL>290</REAL>
            </QUANTITY>
        </VAR>
        <VAR name = "RainOutagePercent">
            <PROP name = "FormatString">
                <STRING>&quot;%#6.3f&quot;</STRING>
            </PROP>
            <REAL>0.1</REAL>
        </VAR>
        <VAR name = "ActiveCommSystem">
            <LINKTOOBJ>
                <STRING>&quot;None&quot;</STRING>
            </LINKTOOBJ>
        </VAR>
    </SCOPE>
</VAR>        END RfEnv

        BEGIN CommRad
        END CommRad

        BEGIN Gator
        END Gator

        BEGIN Crdn
        END Crdn

        BEGIN SpiceExt
        END SpiceExt

        BEGIN Graphics

            BEGIN Animation

                StartTime		 5 Feb 2016 14:25:00.000000000
                EndTime		 5 Feb 2016 15:45:00.000000000
                CurrentTime		 5 Feb 2016 14:28:49.000000000
                Direction		 Forward
                UpdateDelta		 5
                RefreshDelta		 0.010000
                XRealTimeMult		 1
                RealTimeOffset		 0
                XRtStartFromPause		                Yes		

            END Animation


            BEGIN DisplayFlags
                ShowLabels		 On
                ShowPassLabel		 Off
                ShowElsetNum		 Off
                ShowGndTracks		 On
                ShowGndMarkers		 On
                ShowOrbitMarkers		 On
                ShowPlanetOrbits		 Off
                ShowPlanetCBIPos		 On
                ShowPlanetCBILabel		 On
                ShowPlanetGndPos		 On
                ShowPlanetGndLabel		 On
                ShowSensors		 On
                ShowWayptMarkers		 Off
                ShowWayptTurnMarkers		 Off
                ShowOrbits		 On
                ShowDtedRegions		 Off
                ShowAreaTgtCentroids		 On
                ShowToolBar		 On
                ShowStatusBar		 On
                ShowScrollBars		 On
                AllowAnimUpdate		 On
                AccShowLine		 On
                AccAnimHigh		 On
                AccStatHigh		 On
                ShowPrintButton		 On
                ShowAnimButtons		 On
                ShowAnimModeButtons		 On
                ShowZoomMsrButtons		 On
                ShowMapCbButton		 Off
            END DisplayFlags

            BEGIN WinFonts

                System
                MS Sans Serif,22,0,0
                MS Sans Serif,28,0,0

            END WinFonts

            BEGIN MapData

                BEGIN TerrainConverterData
                    NorthLat		 0.0000000000000000e+00
                    EastLon		 0.0000000000000000e+00
                    SouthLat		 0.0000000000000000e+00
                    WestLon		 0.0000000000000000e+00
                    ColorByRGB		 No
                    AltsFromMSL		 No
                    UseColorRamp		 Yes
                    UseRegionMinMax		 Yes
                    SizeSameAsSrc		 Yes
                    MinAltHSV		 0.0000000000000000e+00 6.9999999999999996e-01 8.0000000000000004e-01 4.0000000000000002e-01
                    MaxAltHSV		 1.0000000000000000e+06 0.0000000000000000e+00 2.0000000000000001e-01 1.0000000000000000e+00
                    SmoothColors		 Yes
                    CreateChunkTrn		 No
                    OutputFormat		 PDTTX
                END TerrainConverterData

                DisableDefKbdActions		 Off
                TextShadowStyle		 Dark
                TextShadowColor		 #000000
                BingLevelOfDetailScale		 2
                BEGIN Map
                    MapNum		 1
                    TrackingMode		 LatLon
                    PickEnabled		 On
                    PanEnabled		 On

                    BEGIN MapAttributes
                        PrimaryBody		 Earth
                        SecondaryBody		 Sun
                        CenterLatitude		 34.693473
                        CenterLongitude		 -96.09619299999997
                        ProjectionAltitude		 63621860
                        FieldOfView		 35
                        OrthoDisplayDistance		 20000000
                        TransformTrajectory		 On
                        EquatorialRadius		 6378137
                        BackgroundColor		 #000000
                        LatLonLines		 On
                        LatSpacing		 30
                        LonSpacing		 30
                        LatLonLineColor		 #999999
                        LatLonLineStyle		 2
                        ShowOrthoDistGrid		 Off
                        OrthoGridXSpacing		 5
                        OrthoGridYSpacing		 5
                        OrthoGridColor		 #ffffff
                        ShowImageExtents		 Off
                        ImageExtentLineColor		 #ffffff
                        ImageExtentLineStyle		 0
                        ImageExtentLineWidth		 1
                        ShowImageNames		 Off
                        ImageNameFont		 0
                        Projection		 EquidistantCylindrical
                        Resolution		 Medium
                        CoordinateSys		 ECF
                        UseBackgroundImage		 On
                        UseBingForBackground		 Off
                        BingType		 Aerial
                        BingLogoHorizAlign		 Right
                        BingLogoVertAlign		 Bottom
                        BackgroundImageFile		 Basic.bmp
                        UseNightLights		 Off
                        NightLightsFactor		 3.5
                        UseCloudsFile		 Off
                        BEGIN ZoomLocations
                            BEGIN ZoomLocation
                                CenterLat		 44.286363
                                CenterLon		 -107.038941
                                ZoomWidth		 359.999998
                                ZoomHeight		 180
                            END ZoomLocation
                            BEGIN ZoomLocation
                                CenterLat		 34.693473
                                CenterLon		 -96.096193
                                ZoomWidth		 91.507171
                                ZoomHeight		 48.487641
                            END ZoomLocation
                        END ZoomLocations
                        UseVarAspectRatio		 No
                        SwapMapResolution		 Yes
                        NoneToVLowSwapDist		 2000000
                        VLowToLowSwapDist		 20000
                        LowToMediumSwapDist		 10000
                        MediumToHighSwapDist		 5000
                        HighToVHighSwapDist		 1000
                        VHighToSHighSwapDist		 100
                        BEGIN Axes
                            DisplayAxes		 no
                            CoordSys		 CBI
                            2aryCB		 Sun
                            Display+x		 yes
                            Label+x		 yes
                            Color+x		 #ffffff
                            Scale+x		 3
                            Display-x		 yes
                            Label-x		 yes
                            Color-x		 #ffffff
                            Scale-x		 3
                            Display+y		 yes
                            Label+y		 yes
                            Color+y		 #ffffff
                            Scale+y		 3
                            Display-y		 yes
                            Label-y		 yes
                            Color-y		 #ffffff
                            Scale-y		 3
                            Display+z		 yes
                            Label+z		 yes
                            Color+z		 #ffffff
                            Scale+z		 3
                            Display-z		 yes
                            Label-z		 yes
                            Color-z		 #ffffff
                            Scale-z		 3
                        END Axes

                    END MapAttributes

                    BEGIN MapList
                        BEGIN Detail
                            Alias		 RWDB2_Coastlines
                            Show		 Yes
                            Color		 #8fbc8f
                        END Detail
                        BEGIN Detail
                            Alias		 RWDB2_International_Borders
                            Show		 No
                            Color		 #8fbc8f
                        END Detail
                        BEGIN Detail
                            Alias		 RWDB2_Islands
                            Show		 No
                            Color		 #8fbc8f
                        END Detail
                        BEGIN Detail
                            Alias		 RWDB2_Lakes
                            Show		 No
                            Color		 #87cefa
                        END Detail
                        BEGIN Detail
                            Alias		 RWDB2_Provincial_Borders
                            Show		 No
                            Color		 #8fbc8f
                        END Detail
                        BEGIN Detail
                            Alias		 RWDB2_Rivers
                            Show		 No
                            Color		 #87cefa
                        END Detail
                    END MapList


                    BEGIN MapAnnotations
                    END MapAnnotations

                    BEGIN DisplayFlags
                        ShowLabels		 On
                        ShowPassLabel		 Off
                        ShowElsetNum		 Off
                        ShowGndTracks		 On
                        ShowGndMarkers		 On
                        ShowOrbitMarkers		 On
                        ShowPlanetOrbits		 Off
                        ShowPlanetCBIPos		 On
                        ShowPlanetCBILabel		 On
                        ShowPlanetGndPos		 On
                        ShowPlanetGndLabel		 On
                        ShowSensors		 On
                        ShowWayptMarkers		 Off
                        ShowWayptTurnMarkers		 Off
                        ShowOrbits		 On
                        ShowDtedRegions		 Off
                        ShowAreaTgtCentroids		 On
                        ShowToolBar		 On
                        ShowStatusBar		 On
                        ShowScrollBars		 On
                        AllowAnimUpdate		 Off
                        AccShowLine		 On
                        AccAnimHigh		 On
                        AccStatHigh		 On
                        ShowPrintButton		 On
                        ShowAnimButtons		 On
                        ShowAnimModeButtons		 On
                        ShowZoomMsrButtons		 On
                        ShowMapCbButton		 Off
                    END DisplayFlags

                    BEGIN SoftVTR
                        OutputFormat		 WMV
                        Directory		 C:\Users\Kyle\Desktop\Programs\Aquila\Scenario\
                        BaseName		 Frame
                        Digits		 4
                        Frame		 0
                        LastAnimTime		 0
                        OutputMode		 Normal
                        HiResAssembly		 Assemble
                        HRWidth		 6000
                        HRHeight		 4500
                        HRDPI		 600
                        UseSnapInterval		 No
                        SnapInterval		 0
                        WmvCodec		 "Windows Media Video 9"
                        Framerate		 30
                        Bitrate		 3000000
                    END SoftVTR


                    BEGIN TimeDisplay
                        Show		 0
                        TextColor		 #ffffff
                        TextTranslucency		 0
                        ShowBackground		 0
                        BackColor		 #4d4d4d
                        BackTranslucency		 0.4
                        XPosition		 20
                        YPosition		 -20
                    END TimeDisplay

                    BEGIN LightingData
                        DisplayAltitude		 0
                        SubsolarPoint		 Off
                        SubsolarPointColor		 #ffff00
                        SubsolarPointMarkerStyle		 2

                        ShowUmbraLine		 Off
                        UmbraLineColor		 #000000
                        UmbraLineStyle		 0
                        UmbraLineWidth		 2
                        FillUmbra		 On
                        UmbraFillColor		 #000000
                        ShowSunlightLine		 Off
                        SunlightLineColor		 #ffff00
                        SunlightLineStyle		 0
                        SunlightLineWidth		 2
                        FillSunlight		 On
                        SunlightFillColor		 #ffffff
                        SunlightMinOpacity		 0
                        SunlightMaxOpacity		 0.2
                        UmbraMaxOpacity		 0.7
                        UmbraMinOpacity		 0.4
                    END LightingData
                END Map

                BEGIN MapStyles

                    UseStyleTime		 No

                    BEGIN Style
                        Name		 DefaultWithBing
                        Time		 -69900
                        UpdateDelta		 60

                        BEGIN MapAttributes
                            PrimaryBody		 Earth
                            SecondaryBody		 Sun
                            CenterLatitude		 0
                            CenterLongitude		 0
                            ProjectionAltitude		 63621860
                            FieldOfView		 35
                            OrthoDisplayDistance		 20000000
                            TransformTrajectory		 On
                            EquatorialRadius		 6378137
                            BackgroundColor		 #000000
                            LatLonLines		 On
                            LatSpacing		 30
                            LonSpacing		 30
                            LatLonLineColor		 #999999
                            LatLonLineStyle		 2
                            ShowOrthoDistGrid		 Off
                            OrthoGridXSpacing		 5
                            OrthoGridYSpacing		 5
                            OrthoGridColor		 #ffffff
                            ShowImageExtents		 Off
                            ImageExtentLineColor		 #ffffff
                            ImageExtentLineStyle		 0
                            ImageExtentLineWidth		 1
                            ShowImageNames		 Off
                            ImageNameFont		 0
                            Projection		 EquidistantCylindrical
                            Resolution		 VeryLow
                            CoordinateSys		 ECF
                            UseBackgroundImage		 On
                            UseBingForBackground		 Off
                            BingType		 Aerial
                            BingLogoHorizAlign		 Right
                            BingLogoVertAlign		 Bottom
                            BackgroundImageFile		 Basic.bmp
                            UseNightLights		 Off
                            NightLightsFactor		 3.5
                            UseCloudsFile		 Off
                            BEGIN ZoomLocations
                                BEGIN ZoomLocation
                                    CenterLat		 0
                                    CenterLon		 0
                                    ZoomWidth		 359.999998
                                    ZoomHeight		 180
                                END ZoomLocation
                            END ZoomLocations
                            UseVarAspectRatio		 No
                            SwapMapResolution		 Yes
                            NoneToVLowSwapDist		 2000000
                            VLowToLowSwapDist		 20000
                            LowToMediumSwapDist		 10000
                            MediumToHighSwapDist		 5000
                            HighToVHighSwapDist		 1000
                            VHighToSHighSwapDist		 100
                            BEGIN Axes
                                DisplayAxes		 no
                                CoordSys		 CBI
                                2aryCB		 Sun
                                Display+x		 yes
                                Label+x		 yes
                                Color+x		 #ffffff
                                Scale+x		 3
                                Display-x		 yes
                                Label-x		 yes
                                Color-x		 #ffffff
                                Scale-x		 3
                                Display+y		 yes
                                Label+y		 yes
                                Color+y		 #ffffff
                                Scale+y		 3
                                Display-y		 yes
                                Label-y		 yes
                                Color-y		 #ffffff
                                Scale-y		 3
                                Display+z		 yes
                                Label+z		 yes
                                Color+z		 #ffffff
                                Scale+z		 3
                                Display-z		 yes
                                Label-z		 yes
                                Color-z		 #ffffff
                                Scale-z		 3
                            END Axes

                        END MapAttributes

                        BEGIN MapList
                            BEGIN Detail
                                Alias		 RWDB2_Coastlines
                                Show		 Yes
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_International_Borders
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Islands
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Lakes
                                Show		 No
                                Color		 #87cefa
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Provincial_Borders
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Rivers
                                Show		 No
                                Color		 #87cefa
                            END Detail
                        END MapList


                        BEGIN MapAnnotations
                        END MapAnnotations

                        BEGIN SoftVTR
                            OutputFormat		 WMV
                            Directory		 C:\Users\Kyle\Desktop\Programs\Aquila\Scenario\
                            BaseName		 Frame
                            Digits		 4
                            Frame		 0
                            LastAnimTime		 0
                            OutputMode		 Normal
                            HiResAssembly		 Assemble
                            HRWidth		 6000
                            HRHeight		 4500
                            HRDPI		 600
                            UseSnapInterval		 No
                            SnapInterval		 0
                            WmvCodec		 "Windows Media Video 9"
                            Framerate		 30
                            Bitrate		 3000000
                        END SoftVTR


                        BEGIN TimeDisplay
                            Show		 0
                            TextColor		 #ffffff
                            TextTranslucency		 0
                            ShowBackground		 0
                            BackColor		 #4d4d4d
                            BackTranslucency		 0.4
                            XPosition		 20
                            YPosition		 -20
                        END TimeDisplay

                        BEGIN LightingData
                            DisplayAltitude		 0
                            SubsolarPoint		 Off
                            SubsolarPointColor		 #ffff00
                            SubsolarPointMarkerStyle		 2

                            ShowUmbraLine		 Off
                            UmbraLineColor		 #000000
                            UmbraLineStyle		 0
                            UmbraLineWidth		 2
                            FillUmbra		 On
                            UmbraFillColor		 #000000
                            ShowSunlightLine		 Off
                            SunlightLineColor		 #ffff00
                            SunlightLineStyle		 0
                            SunlightLineWidth		 2
                            FillSunlight		 On
                            SunlightFillColor		 #ffffff
                            SunlightMinOpacity		 0
                            SunlightMaxOpacity		 0.2
                            UmbraMaxOpacity		 0.7
                            UmbraMinOpacity		 0.4
                        END LightingData

                        ShowDtedRegions		 Off

                    END Style

                    BEGIN Style
                        Name		 DefaultWithoutBing
                        Time		 -69900
                        UpdateDelta		 60

                        BEGIN MapAttributes
                            PrimaryBody		 Earth
                            SecondaryBody		 Sun
                            CenterLatitude		 0
                            CenterLongitude		 0
                            ProjectionAltitude		 63621860
                            FieldOfView		 35
                            OrthoDisplayDistance		 20000000
                            TransformTrajectory		 On
                            EquatorialRadius		 6378137
                            BackgroundColor		 #000000
                            LatLonLines		 On
                            LatSpacing		 30
                            LonSpacing		 30
                            LatLonLineColor		 #999999
                            LatLonLineStyle		 2
                            ShowOrthoDistGrid		 Off
                            OrthoGridXSpacing		 5
                            OrthoGridYSpacing		 5
                            OrthoGridColor		 #ffffff
                            ShowImageExtents		 Off
                            ImageExtentLineColor		 #ffffff
                            ImageExtentLineStyle		 0
                            ImageExtentLineWidth		 1
                            ShowImageNames		 Off
                            ImageNameFont		 0
                            Projection		 EquidistantCylindrical
                            Resolution		 VeryLow
                            CoordinateSys		 ECF
                            UseBackgroundImage		 On
                            UseBingForBackground		 Off
                            BingType		 Aerial
                            BingLogoHorizAlign		 Right
                            BingLogoVertAlign		 Bottom
                            BackgroundImageFile		 Basic.bmp
                            UseNightLights		 Off
                            NightLightsFactor		 3.5
                            UseCloudsFile		 Off
                            BEGIN ZoomLocations
                                BEGIN ZoomLocation
                                    CenterLat		 0
                                    CenterLon		 0
                                    ZoomWidth		 359.999998
                                    ZoomHeight		 180
                                END ZoomLocation
                            END ZoomLocations
                            UseVarAspectRatio		 No
                            SwapMapResolution		 Yes
                            NoneToVLowSwapDist		 2000000
                            VLowToLowSwapDist		 20000
                            LowToMediumSwapDist		 10000
                            MediumToHighSwapDist		 5000
                            HighToVHighSwapDist		 1000
                            VHighToSHighSwapDist		 100
                            BEGIN Axes
                                DisplayAxes		 no
                                CoordSys		 CBI
                                2aryCB		 Sun
                                Display+x		 yes
                                Label+x		 yes
                                Color+x		 #ffffff
                                Scale+x		 3
                                Display-x		 yes
                                Label-x		 yes
                                Color-x		 #ffffff
                                Scale-x		 3
                                Display+y		 yes
                                Label+y		 yes
                                Color+y		 #ffffff
                                Scale+y		 3
                                Display-y		 yes
                                Label-y		 yes
                                Color-y		 #ffffff
                                Scale-y		 3
                                Display+z		 yes
                                Label+z		 yes
                                Color+z		 #ffffff
                                Scale+z		 3
                                Display-z		 yes
                                Label-z		 yes
                                Color-z		 #ffffff
                                Scale-z		 3
                            END Axes

                        END MapAttributes

                        BEGIN MapList
                            BEGIN Detail
                                Alias		 RWDB2_Coastlines
                                Show		 Yes
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_International_Borders
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Islands
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Lakes
                                Show		 No
                                Color		 #87cefa
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Provincial_Borders
                                Show		 No
                                Color		 #8fbc8f
                            END Detail
                            BEGIN Detail
                                Alias		 RWDB2_Rivers
                                Show		 No
                                Color		 #87cefa
                            END Detail
                        END MapList


                        BEGIN MapAnnotations
                        END MapAnnotations

                        BEGIN SoftVTR
                            OutputFormat		 WMV
                            Directory		 C:\Users\Kyle\Desktop\Programs\Aquila\Scenario\
                            BaseName		 Frame
                            Digits		 4
                            Frame		 0
                            LastAnimTime		 0
                            OutputMode		 Normal
                            HiResAssembly		 Assemble
                            HRWidth		 6000
                            HRHeight		 4500
                            HRDPI		 600
                            UseSnapInterval		 No
                            SnapInterval		 0
                            WmvCodec		 "Windows Media Video 9"
                            Framerate		 30
                            Bitrate		 3000000
                        END SoftVTR


                        BEGIN TimeDisplay
                            Show		 0
                            TextColor		 #ffffff
                            TextTranslucency		 0
                            ShowBackground		 0
                            BackColor		 #4d4d4d
                            BackTranslucency		 0.4
                            XPosition		 20
                            YPosition		 -20
                        END TimeDisplay

                        BEGIN LightingData
                            DisplayAltitude		 0
                            SubsolarPoint		 Off
                            SubsolarPointColor		 #ffff00
                            SubsolarPointMarkerStyle		 2

                            ShowUmbraLine		 Off
                            UmbraLineColor		 #000000
                            UmbraLineStyle		 0
                            UmbraLineWidth		 2
                            FillUmbra		 On
                            UmbraFillColor		 #000000
                            ShowSunlightLine		 Off
                            SunlightLineColor		 #ffff00
                            SunlightLineStyle		 0
                            SunlightLineWidth		 2
                            FillSunlight		 On
                            SunlightFillColor		 #ffffff
                            SunlightMinOpacity		 0
                            SunlightMaxOpacity		 0.2
                            UmbraMaxOpacity		 0.7
                            UmbraMinOpacity		 0.4
                        END LightingData

                        ShowDtedRegions		 Off

                    END Style

                END MapStyles

            END MapData

            BEGIN GfxClassPref

            END GfxClassPref


            BEGIN ConnectGraphicsOptions

                AsyncPickReturnUnique		 OFF

            END ConnectGraphicsOptions

        END Graphics

        BEGIN Overlays
        END Overlays

        BEGIN VO
        END VO

    END Extensions

    BEGIN SubObjects

        Class Satellite

            Landmapper_BC		

        END Class

    END SubObjects

    BEGIN References
        Instance *
            *		
        END Instance
        Instance Satellite/Landmapper_BC
            *		
            Satellite/Landmapper_BC		
        END Instance
    END References

END Scenario
