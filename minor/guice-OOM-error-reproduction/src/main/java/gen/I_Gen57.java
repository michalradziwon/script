
  package gen;
  public class I_Gen57 {
  		@com.google.inject.Inject
  		public I_Gen57(I_Gen58 i_gen58){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen58 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  