
  package gen;
  public class Z_Gen62 {
  		@com.google.inject.Inject
  		public Z_Gen62(Z_Gen63 z_gen63){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen63 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  