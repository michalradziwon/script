
  package gen;
  public class I_Gen120 {
  		@com.google.inject.Inject
  		public I_Gen120(I_Gen121 i_gen121){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen121 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  