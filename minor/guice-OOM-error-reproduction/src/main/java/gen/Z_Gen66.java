
  package gen;
  public class Z_Gen66 {
  		@com.google.inject.Inject
  		public Z_Gen66(Z_Gen67 z_gen67){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen67 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  