
  package gen;
  public class I_Gen133 {
  		@com.google.inject.Inject
  		public I_Gen133(I_Gen134 i_gen134){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen134 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  