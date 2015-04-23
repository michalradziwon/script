
  package gen;
  public class Z_Gen41 {
  		@com.google.inject.Inject
  		public Z_Gen41(Z_Gen42 z_gen42){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen42 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  