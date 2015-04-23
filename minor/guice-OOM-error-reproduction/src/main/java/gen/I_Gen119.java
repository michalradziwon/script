
  package gen;
  public class I_Gen119 {
  		@com.google.inject.Inject
  		public I_Gen119(I_Gen120 i_gen120){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen120 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  