
  package gen;
  public class Z_Gen183 {
  		@com.google.inject.Inject
  		public Z_Gen183(Z_Gen184 z_gen184){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen184 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  