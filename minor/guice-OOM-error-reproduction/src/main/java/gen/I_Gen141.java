
  package gen;
  public class I_Gen141 {
  		@com.google.inject.Inject
  		public I_Gen141(I_Gen142 i_gen142){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen142 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  