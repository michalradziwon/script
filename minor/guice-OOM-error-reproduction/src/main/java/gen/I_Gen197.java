
  package gen;
  public class I_Gen197 {
  		@com.google.inject.Inject
  		public I_Gen197(I_Gen198 i_gen198){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen198 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  