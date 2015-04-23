
  package gen;
  public class I_Gen130 {
  		@com.google.inject.Inject
  		public I_Gen130(I_Gen131 i_gen131){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen131 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  