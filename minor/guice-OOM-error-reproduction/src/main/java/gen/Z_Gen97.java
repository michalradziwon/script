
  package gen;
  public class Z_Gen97 {
  		@com.google.inject.Inject
  		public Z_Gen97(Z_Gen98 z_gen98){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen98 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  