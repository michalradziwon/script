
  package gen;
  public class I_Gen129 {
  		@com.google.inject.Inject
  		public I_Gen129(I_Gen130 i_gen130){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen130 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  