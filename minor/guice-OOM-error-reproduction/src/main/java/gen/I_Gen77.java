
  package gen;
  public class I_Gen77 {
  		@com.google.inject.Inject
  		public I_Gen77(I_Gen78 i_gen78){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen78 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  