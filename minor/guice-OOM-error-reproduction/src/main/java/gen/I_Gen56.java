
  package gen;
  public class I_Gen56 {
  		@com.google.inject.Inject
  		public I_Gen56(I_Gen57 i_gen57){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen57 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  