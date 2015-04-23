
  package gen;
  public class I_Gen125 {
  		@com.google.inject.Inject
  		public I_Gen125(I_Gen126 i_gen126){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen126 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  