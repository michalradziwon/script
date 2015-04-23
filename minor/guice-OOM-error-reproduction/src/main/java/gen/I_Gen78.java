
  package gen;
  public class I_Gen78 {
  		@com.google.inject.Inject
  		public I_Gen78(I_Gen79 i_gen79){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen79 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  