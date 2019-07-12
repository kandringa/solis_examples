stk.v.11.0
WrittenBy    STK_v11.6.0
BEGIN Scenario
    Name		 SOLISExample_TargetPlanner

    BEGIN Epoch

        Epoch		 14 Feb 2018 12:00:00.000000000
        SmartEpoch		
        BEGIN EVENT
            Epoch		 14 Feb 2018 12:00:00.000000000
            EventEpoch		
            BEGIN EVENT
                Type		 EVENT_LINKTO
                Name		 AnalysisStartTime
            END EVENT
            EpochState		 Implicit
        END EVENT


    END Epoch

    BEGIN Interval

        Start		 14 Feb 2018 12:00:00.000000000
        Stop		 14 Feb 2018 15:00:00.000000000
        SmartInterval		
        BEGIN EVENTINTERVAL
            BEGIN Interval
                Start		 14 Feb 2018 12:00:00.000000000
                Stop		 14 Feb 2018 15:00:00.000000000
            END Interval
            IntervalState		 Explicit
        END EVENTINTERVAL

        EpochUsesAnalStart		 No
        AnimStartUsesAnalStart		 Yes
        AnimStopUsesAnalStop		 Yes

    END Interval

    BEGIN EOPFile

        InheritEOPSource		 No
        EOPFilename		 C:\Users\kdand\Documents\STK 11 (x64)\SOLISExample_TargetPlanner\EOP-v1.1.txt

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
        Module		 ASTGv11.6
        Module		 AnalysisWBv11.6
        Module		 COVv11.6
        Module		 Commv11.6
        Module		 STKIntegrationv11.6
        Module		 STKProfessionalv11.6
        Module		 STKv11.6
        Module		 SatProv11.6
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
            LaunchWindowStart		 -6.39972e+07
            LaunchWindowStop		 -6.39216e+07
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
            MaxTSRStep		  1.8000000000000000e+02
            MaxTSRRelMotion		  2.0000000000000000e+01
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
            AreaMaxTSRStep		  3.0000000000000000e+01
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
            DateFormat		 GregorianUTC
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
            Optimize		 Yes
            UseBasicGlobe		 Yes
            ReadOnly		 No
            ViewerPassword		 No
            STKPassword		 No
            ExcludeInstallFiles		 No
            BEGIN ExternalFileList
                BEGIN File
                    Name		 "Landmapper_BC.a"
                    FileType		 External Attitude
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Sun.rst"
                    FileType		 Report/Graph Style
                    IncludeInVDF		 No
                END File
                BEGIN File
                    Name		 "Aero.rst"
                    FileType		 Report/Graph Style
                    IncludeInVDF		 No
                END File
                BEGIN File
                    Name		 "AttErr.rsg"
                    FileType		 Report/Graph Style
                    IncludeInVDF		 No
                END File
                BEGIN File
                    Name		 "CBF2CBI.rst"
                    FileType		 Report/Graph Style
                    IncludeInVDF		 No
                END File
                BEGIN File
                    Name		 "GPS_TSLV.rsg"
                    FileType		 Report/Graph Style
                    IncludeInVDF		 No
                END File
                BEGIN File
                    Name		 "Gravity.rst"
                    FileType		 Report/Graph Style
                    IncludeInVDF		 No
                END File
                BEGIN File
                    Name		 "LLA Position.rst"
                    FileType		 Report/Graph Style
                    IncludeInVDF		 No
                END File
                BEGIN File
                    Name		 "Momentum.rsg"
                    FileType		 Report/Graph Style
                    IncludeInVDF		 No
                END File
                BEGIN File
                    Name		 "Rates.rsg"
                    FileType		 Report/Graph Style
                    IncludeInVDF		 No
                END File
                BEGIN File
                    Name		 "TgtNormal.rst"
                    FileType		 Report/Graph Style
                    IncludeInVDF		 No
                END File
                BEGIN File
                    Name		 "Thrust.rsg"
                    FileType		 Report/Graph Style
                    IncludeInVDF		 No
                END File
                BEGIN File
                    Name		 "TlmMon.rsg"
                    FileType		 Report/Graph Style
                    IncludeInVDF		 No
                END File
                BEGIN File
                    Name		 "Landmapper_BC.dae"
                    FileType		 Model
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "target.mdl"
                    FileType		 Model
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Target.bmp"
                    FileType		 Marker/Label
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "EOP-v1.1.txt"
                    FileType		 EOP
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Analytic_Orbit.CBOrbitModel"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Ceres.cb"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "JPL_SPICE.CBOrbitModel"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Oblate_Spheroid.CBShapeModel"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "RotationCoefficientsFile.CBSpinModel"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ZonalsToJ4.grv"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Hyperion.cb"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "IAU_1994.CBSpinModel"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "JPL_SPICE.CBOrbitModel"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Triaxial_Ellipsoid.CBShapeModel"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ZonalsToJ4.grv"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Iapetus.cb"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "JPL_SPICE.CBOrbitModel"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Oblate_Spheroid.CBShapeModel"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "RotationCoefficientsFile.CBSpinModel"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ZonalsToJ4.grv"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "JPL_SPICE.CBOrbitModel"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Mimas.cb"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "RotationCoefficientsFile.CBSpinModel"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Triaxial_Ellipsoid.CBShapeModel"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ZonalsToJ4.grv"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "JPL_SPICE.CBOrbitModel"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Phoebe.cb"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "RotationCoefficientsFile.CBSpinModel"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Triaxial_Ellipsoid.CBShapeModel"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ZonalsToJ4.grv"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "JPL_SPICE.CBOrbitModel"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Rhea.cb"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "RotationCoefficientsFile.CBSpinModel"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Triaxial_Ellipsoid.CBShapeModel"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ZonalsToJ4.grv"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "JPL_SPICE.CBOrbitModel"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "RotationCoefficientsFile.CBSpinModel"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Tethys.cb"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Triaxial_Ellipsoid.CBShapeModel"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ZonalsToJ4.grv"
                    FileType		 Central Body
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Basic.bmp"
                    FileType		 Map
                    IncludeInVDF		 No
                END File
                BEGIN File
                    Name		 "Earth_PE_b.jp2"
                    FileType		 Globe Data
                    IncludeInVDF		 No
                END File
                BEGIN File
                    Name		 "water.jp2"
                    FileType		 Globe Data
                    IncludeInVDF		 No
                END File
                BEGIN File
                    Name		 "Sun.jp2"
                    FileType		 Celestial Image
                    IncludeInVDF		 No
                END File
                BEGIN File
                    Name		 "Moon.jp2"
                    FileType		 Celestial Image
                    IncludeInVDF		 No
                END File
                BEGIN File
                    Name		 "ASITargetPlannerTgt.t"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ASITargetPlannerTgt.t3"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ASITargetPlannerTgtEnd.t"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ASITargetPlannerTgtEnd.t3"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "facility.mdl"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "goldfoil.tga"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "GroundStation.f"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "GroundStation.f3"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "mottled-grey.tga"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Sat2.sa"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Sat2.sa3"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "satellite.mdl"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Tgt1.t"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Tgt1.t3"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Tgt2.t"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Tgt2.t3"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Tgt3.t"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Tgt3.t3"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Tgt4.t"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Tgt4.t3"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Tgt5.t"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Tgt5.t3"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Tgt6.t"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Tgt6.t3"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Tgt7.t"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Tgt7.t3"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Tgt8.t"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Tgt8.t3"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Tgt9.t"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "Tgt9.t3"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "DPT_rec_payload.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "DPT_rt_only.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_CommonParameters.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_Components.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_HWR_Components.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_MissionSpecific.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_MissionSpecific_CommonParameters.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_Objects.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_SecondaryComponents.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_SelectedTelemetry.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_SimulationSpecific.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_Static.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_Subsystems.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_TOC.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_UnitSpecific.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FSW_UTL_Objects.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ODY_CommonParameters.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ODY_Components.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ODY_ConnectionsToFSW.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ODY_SecondaryComponents.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ODY_SelectedTelemetry.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ODY_SimulationSpecific.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ODY_TOC.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "ODY_UnitSpecific.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "SOL_CommonParameters.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "SOL_ConnectionsToODySSy.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "SOL_SecondaryComponents.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "SOL_SelectedTelemetry.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "SOL_TOC.cfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FswCmdDetail.csv"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FswCmdEnum.csv"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FswCmdMaster.csv"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FswParamDB.xml"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FswTlmDetail.csv"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FswTlmEnum.csv"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "FswTlmMaster.csv"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "CommOff.fj"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "CommOn.fj"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "MissionSequenceExecutionScript.fj"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "PayloadOff.fj"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "PayloadOn.fj"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "TargetPlan_AnyDirection.fj"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "TargetPlan_ForceDirection.fj"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "CommOff.seqs"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "CommOn.seqs"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "PayloadOff.seqs"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "PayloadOn.seqs"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "TargetPlan_AnyDirection.seqs"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "TargetPlan_ForceDirection.seqs"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "exported.ctlm"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "exported.lcfg"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "exported.msel"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "exported.mtlm"
                    FileType		 Scenario Associated
                    IncludeInVDF		 Yes
                END File
                BEGIN File
                    Name		 "exported.tpc"
                    FileType		 Scenario Associated
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

                StartTime		 14 Feb 2018 12:00:00.000000000
                EndTime		 14 Feb 2018 15:00:00.000000000
                CurrentTime		 14 Feb 2018 12:00:00.000000000
                Direction		 Forward
                UpdateDelta		 3
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
                    NorthLat		  0.0000000000000000e+00
                    EastLon		  0.0000000000000000e+00
                    SouthLat		  0.0000000000000000e+00
                    WestLon		  0.0000000000000000e+00
                    ColorByRGB		 No
                    AltsFromMSL		 No
                    UseColorRamp		 Yes
                    UseRegionMinMax		 Yes
                    SizeSameAsSrc		 Yes
                    MinAltHSV		  0.0000000000000000e+00  6.9999999999999996e-01  8.0000000000000004e-01  4.0000000000000002e-01
                    MaxAltHSV		  1.0000000000000000e+06  0.0000000000000000e+00  2.0000000000000001e-01  1.0000000000000000e+00
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
                        CenterLatitude		 -24.04474020379669
                        CenterLongitude		 -57.26245526452288
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
                                CenterLat		 -24.14634146341463
                                CenterLon		 -56.6641443184584
                                ZoomWidth		 359.999998
                                ZoomHeight		 180
                            END ZoomLocation
                            BEGIN ZoomLocation
                                CenterLat		 0.2192448233861145
                                CenterLon		 -13.21586445030425
                                ZoomWidth		 359.99999
                                ZoomHeight		 180
                            END ZoomLocation
                            BEGIN ZoomLocation
                                CenterLat		 -24.87804878048781
                                CenterLon		 -55.30172920172026
                                ZoomWidth		 48.33189744808531
                                ZoomHeight		 80.48780487804878
                            END ZoomLocation
                            BEGIN ZoomLocation
                                CenterLat		 -24.04474020379669
                                CenterLon		 -57.26245526452288
                                ZoomWidth		 22.60333304568473
                                ZoomHeight		 30.58732657972134
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

                    BEGIN RecordMovie
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
                    END RecordMovie


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
                        Time		 -63997201
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

                        BEGIN RecordMovie
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
                        END RecordMovie


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
                        Time		 -63997201
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

                        BEGIN RecordMovie
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
                        END RecordMovie


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

        Class LineTarget

            Scan1		
            Scan2		
            Scan3		

        END Class

        Class Satellite

            Landmapper_BC		

        END Class

        Class Target

            SE1		
            SE2		
            SE3		
            SS1		
            SS2		
            SS3		

        END Class

    END SubObjects

    BEGIN References
        Instance *
            *		
        END Instance
        Instance LineTarget/Scan1
            LineTarget/Scan1		
        END Instance
        Instance LineTarget/Scan2
            LineTarget/Scan2		
        END Instance
        Instance LineTarget/Scan3
            LineTarget/Scan3		
        END Instance
        Instance Satellite/Landmapper_BC
            *		
            Satellite/Landmapper_BC		
            Satellite/Landmapper_BC/Sensor/AtlasPayload		
            Satellite/Landmapper_BC/Sensor/FieldOfRegard		
            Satellite/Landmapper_BC/Sensor/StarTracker		
        END Instance
        Instance Satellite/Landmapper_BC/Sensor/AtlasPayload
            Satellite/Landmapper_BC/Sensor/AtlasPayload		
        END Instance
        Instance Satellite/Landmapper_BC/Sensor/FieldOfRegard
            Satellite/Landmapper_BC/Sensor/FieldOfRegard		
        END Instance
        Instance Satellite/Landmapper_BC/Sensor/StarTracker
            Satellite/Landmapper_BC/Sensor/StarTracker		
        END Instance
        Instance Target/SE1
            Target/SE1		
        END Instance
        Instance Target/SE2
            Target/SE2		
        END Instance
        Instance Target/SE3
            Target/SE3		
        END Instance
        Instance Target/SS1
            Target/SS1		
        END Instance
        Instance Target/SS2
            Target/SS2		
        END Instance
        Instance Target/SS3
            Target/SS3		
        END Instance
    END References

END Scenario
