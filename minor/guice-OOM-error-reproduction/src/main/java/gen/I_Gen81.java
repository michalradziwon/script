
  package gen;
  public class I_Gen81 {
  		@com.google.inject.Inject
  		public I_Gen81(I_Gen82 i_gen82){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen82 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  