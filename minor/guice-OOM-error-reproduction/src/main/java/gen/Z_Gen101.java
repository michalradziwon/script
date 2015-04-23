
  package gen;
  public class Z_Gen101 {
  		@com.google.inject.Inject
  		public Z_Gen101(Z_Gen102 z_gen102){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen102 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  