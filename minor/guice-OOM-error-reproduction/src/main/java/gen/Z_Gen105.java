
  package gen;
  public class Z_Gen105 {
  		@com.google.inject.Inject
  		public Z_Gen105(Z_Gen106 z_gen106){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen106 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  