
  package gen;
  public class I_Gen145 {
  		@com.google.inject.Inject
  		public I_Gen145(I_Gen146 i_gen146){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen146 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  