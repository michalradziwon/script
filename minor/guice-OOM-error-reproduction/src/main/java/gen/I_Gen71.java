
  package gen;
  public class I_Gen71 {
  		@com.google.inject.Inject
  		public I_Gen71(I_Gen72 i_gen72){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen72 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  