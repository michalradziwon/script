
  package gen;
  public class I_Gen6 {
  		@com.google.inject.Inject
  		public I_Gen6(I_Gen7 i_gen7){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen7 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  