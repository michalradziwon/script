
  package gen;
  public class I_Gen144 {
  		@com.google.inject.Inject
  		public I_Gen144(I_Gen145 i_gen145){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen145 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  