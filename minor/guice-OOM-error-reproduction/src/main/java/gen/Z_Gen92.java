
  package gen;
  public class Z_Gen92 {
  		@com.google.inject.Inject
  		public Z_Gen92(Z_Gen93 z_gen93){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen93 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  