
  package gen;
  public class I_Gen176 {
  		@com.google.inject.Inject
  		public I_Gen176(I_Gen177 i_gen177){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen177 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  