
  package gen;
  public class I_Gen191 {
  		@com.google.inject.Inject
  		public I_Gen191(I_Gen192 i_gen192){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen192 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  