
  package gen;
  public class Z_Gen128 {
  		@com.google.inject.Inject
  		public Z_Gen128(Z_Gen129 z_gen129){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen129 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  