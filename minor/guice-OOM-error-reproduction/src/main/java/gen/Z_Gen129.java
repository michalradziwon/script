
  package gen;
  public class Z_Gen129 {
  		@com.google.inject.Inject
  		public Z_Gen129(Z_Gen130 z_gen130){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen130 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  