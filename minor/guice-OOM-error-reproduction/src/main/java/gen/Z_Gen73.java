
  package gen;
  public class Z_Gen73 {
  		@com.google.inject.Inject
  		public Z_Gen73(Z_Gen74 z_gen74){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen74 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  