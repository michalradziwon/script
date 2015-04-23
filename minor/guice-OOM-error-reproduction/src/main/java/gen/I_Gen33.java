
  package gen;
  public class I_Gen33 {
  		@com.google.inject.Inject
  		public I_Gen33(I_Gen34 i_gen34){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen34 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  