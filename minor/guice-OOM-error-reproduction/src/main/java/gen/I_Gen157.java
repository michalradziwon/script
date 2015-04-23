
  package gen;
  public class I_Gen157 {
  		@com.google.inject.Inject
  		public I_Gen157(I_Gen158 i_gen158){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen158 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  