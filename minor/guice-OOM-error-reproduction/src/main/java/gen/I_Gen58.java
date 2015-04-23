
  package gen;
  public class I_Gen58 {
  		@com.google.inject.Inject
  		public I_Gen58(I_Gen59 i_gen59){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen59 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  