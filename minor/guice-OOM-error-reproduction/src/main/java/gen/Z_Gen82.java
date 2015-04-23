
  package gen;
  public class Z_Gen82 {
  		@com.google.inject.Inject
  		public Z_Gen82(Z_Gen83 z_gen83){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen83 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  