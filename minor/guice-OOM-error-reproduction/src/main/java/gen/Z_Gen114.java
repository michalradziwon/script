
  package gen;
  public class Z_Gen114 {
  		@com.google.inject.Inject
  		public Z_Gen114(Z_Gen115 z_gen115){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen115 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  