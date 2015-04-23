
  package gen;
  public class I_Gen50 {
  		@com.google.inject.Inject
  		public I_Gen50(I_Gen51 i_gen51){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen51 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  