
  package gen;
  public class I_Gen195 {
  		@com.google.inject.Inject
  		public I_Gen195(I_Gen196 i_gen196){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen196 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  