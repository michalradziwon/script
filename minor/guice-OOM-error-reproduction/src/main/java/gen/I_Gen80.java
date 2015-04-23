
  package gen;
  public class I_Gen80 {
  		@com.google.inject.Inject
  		public I_Gen80(I_Gen81 i_gen81){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen81 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  