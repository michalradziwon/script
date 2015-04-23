
  package gen;
  public class Z_Gen192 {
  		@com.google.inject.Inject
  		public Z_Gen192(Z_Gen193 z_gen193){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen193 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  