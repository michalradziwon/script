
  package gen;
  public class I_Gen69 {
  		@com.google.inject.Inject
  		public I_Gen69(I_Gen70 i_gen70){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen70 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  