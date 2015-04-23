
  package gen;
  public class I_Gen99 {
  		@com.google.inject.Inject
  		public I_Gen99(I_Gen100 i_gen100){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen100 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  