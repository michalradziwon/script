
  package gen;
  public class Z_Gen40 {
  		@com.google.inject.Inject
  		public Z_Gen40(Z_Gen41 z_gen41){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen41 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  