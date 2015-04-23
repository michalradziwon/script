
  package gen;
  public class Z_Gen125 {
  		@com.google.inject.Inject
  		public Z_Gen125(Z_Gen126 z_gen126){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen126 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  