
  package gen;
  public class Z_Gen33 {
  		@com.google.inject.Inject
  		public Z_Gen33(Z_Gen34 z_gen34){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen34 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  