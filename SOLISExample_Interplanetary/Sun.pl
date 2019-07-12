stk.v.11.0
WrittenBy    STK_v11.6.0

BEGIN Planet

    Name		 Sun

    BEGIN PathDescription

        CentralBody		 Sun
        UseCbEphemeris		 Yes

        BEGIN EphemerisData

            EphemerisSource		 JplDE

            JplIndex		 10

            JplSpiceId		 10

            ApplyTDTtoTDBCorrectionForDE		 Yes

            OrbitEpoch		  2.4515450000000000e+06
            OrbitMeanDist		  1.4959788645576999e+11
            OrbitEcc		  1.6710220000001001e-02
            OrbitInc		  2.3439340817689001e+01
            OrbitRAAN		  3.5999996261505999e+02
            OrbitPerLong		  4.6294718913083000e+02
            OrbitMeanLong		  8.2046434913082999e+02
            OrbitMeanDistDot		 -2.0478832306639000e-01
            OrbitEccDot		 -1.0414784394251000e-09
            OrbitIncDot		 -3.5013667765767000e-07
            OrbitRAANDot		  1.7494818152673999e-07
            OrbitPerLongDot		  9.1275248714007003e-06
            OrbitMeanLongDot		  9.8560911497639003e-01

        END EphemerisData

    END PathDescription

    BEGIN PhysicalData

        GM		  1.3271220000000000e+20
        Radius		  6.9550800000000000e+08
        Magnitude		  0.0000000000000000e+00
        ReferenceDistance		  0.0000000000000000e+00

    END PhysicalData

    BEGIN AutoRename

        AutoRename		 Yes

    END AutoRename

    BEGIN Extensions

        BEGIN ExternData
        END ExternData

        BEGIN ADFFileData
        END ADFFileData

        BEGIN AccessConstraints
            LineOfSight IncludeIntervals
        END AccessConstraints

        BEGIN Desc
        END Desc

        BEGIN Crdn
        END Crdn

        BEGIN Graphics

            BEGIN Attributes

                MarkerColor		 #ffff00
                LabelColor		 #ffff00
                LineColor		 #ffff00
                LineStyle		 0
                LineWidth		 1
                MarkerStyle		 2
                FontStyle		 0

            END Attributes

            BEGIN Graphics

                Show		 On
                Inherit		 Off
                ShowLabel		 On
                ShowPlanetPoint		 On
                ShowSubPlanetPoint		 Off
                ShowSubPlanetLabel		 Off
                ShowOrbit		 Off
                NumOrbitPoints		 360
                OrbitTime		  0.0000000000000000e+00
                OrbitDisplay		                OneOrbit		
                TransformTrajectory		 On

            END Graphics
        END Graphics

        BEGIN VO
        END VO

    END Extensions

END Planet

