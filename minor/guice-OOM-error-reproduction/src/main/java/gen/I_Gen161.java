
  package gen;
  public class I_Gen161 {
  		@com.google.inject.Inject
  		public I_Gen161(I_Gen162 i_gen162){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen162 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  