package de.dnpm.dip.mtb.mvh.api


import scala.concurrent.Future
import cats.Monad
import de.dnpm.dip.util.{
  SPI,
  SPILoader
}
import de.dnpm.dip.service.mvh.MVHService
import de.dnpm.dip.mtb.model.MTBPatientRecord



trait MTBMVHService extends MVHService[Future,Monad[Future],MTBPatientRecord]

trait MTBMVHServiceProvider extends SPI[MTBMVHService]

object MTBMVHService extends SPILoader[MTBMVHServiceProvider]


