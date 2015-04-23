
  package gen;
  public class I_Gen155 {
  		@com.google.inject.Inject
  		public I_Gen155(I_Gen156 i_gen156){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen156 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  