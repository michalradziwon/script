
  package gen;
  public class I_Gen96 {
  		@com.google.inject.Inject
  		public I_Gen96(I_Gen97 i_gen97){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen97 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  