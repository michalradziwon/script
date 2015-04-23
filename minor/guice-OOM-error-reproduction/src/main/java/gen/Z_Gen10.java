
  package gen;
  public class Z_Gen10 {
  		@com.google.inject.Inject
  		public Z_Gen10(Z_Gen11 z_gen11){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen11 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  