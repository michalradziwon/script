
  package gen;
  public class I_Gen140 {
  		@com.google.inject.Inject
  		public I_Gen140(I_Gen141 i_gen141){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen141 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  