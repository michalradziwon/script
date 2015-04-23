
  package gen;
  public class Z_Gen188 {
  		@com.google.inject.Inject
  		public Z_Gen188(Z_Gen189 z_gen189){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen189 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  