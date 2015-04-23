
  package gen;
  public class I_Gen26 {
  		@com.google.inject.Inject
  		public I_Gen26(I_Gen27 i_gen27){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen27 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  