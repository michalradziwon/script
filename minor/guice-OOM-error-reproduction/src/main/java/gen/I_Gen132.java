
  package gen;
  public class I_Gen132 {
  		@com.google.inject.Inject
  		public I_Gen132(I_Gen133 i_gen133){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen133 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  