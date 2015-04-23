
  package gen;
  public class I_Gen55 {
  		@com.google.inject.Inject
  		public I_Gen55(I_Gen56 i_gen56){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen56 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  