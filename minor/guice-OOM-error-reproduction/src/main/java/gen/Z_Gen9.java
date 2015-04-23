
  package gen;
  public class Z_Gen9 {
  		@com.google.inject.Inject
  		public Z_Gen9(Z_Gen10 z_gen10){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen10 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  