
  package gen;
  public class Z_Gen16 {
  		@com.google.inject.Inject
  		public Z_Gen16(Z_Gen17 z_gen17){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen17 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  