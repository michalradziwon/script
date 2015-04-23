
  package gen;
  public class I_Gen139 {
  		@com.google.inject.Inject
  		public I_Gen139(I_Gen140 i_gen140){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen140 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  