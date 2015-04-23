
  package gen;
  public class Z_Gen86 {
  		@com.google.inject.Inject
  		public Z_Gen86(Z_Gen87 z_gen87){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen87 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  