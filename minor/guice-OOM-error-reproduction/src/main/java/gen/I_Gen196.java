
  package gen;
  public class I_Gen196 {
  		@com.google.inject.Inject
  		public I_Gen196(I_Gen197 i_gen197){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen197 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  