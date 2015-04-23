
  package gen;
  public class I_Gen142 {
  		@com.google.inject.Inject
  		public I_Gen142(I_Gen143 i_gen143){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen143 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  