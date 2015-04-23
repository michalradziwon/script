
  package gen;
  public class Z_Gen121 {
  		@com.google.inject.Inject
  		public Z_Gen121(Z_Gen122 z_gen122){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen122 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  