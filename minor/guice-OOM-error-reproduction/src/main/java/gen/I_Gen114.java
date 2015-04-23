
  package gen;
  public class I_Gen114 {
  		@com.google.inject.Inject
  		public I_Gen114(I_Gen115 i_gen115){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen115 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  