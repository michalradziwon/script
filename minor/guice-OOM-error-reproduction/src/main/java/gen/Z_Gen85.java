
  package gen;
  public class Z_Gen85 {
  		@com.google.inject.Inject
  		public Z_Gen85(Z_Gen86 z_gen86){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen86 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  