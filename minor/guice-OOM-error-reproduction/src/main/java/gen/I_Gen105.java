
  package gen;
  public class I_Gen105 {
  		@com.google.inject.Inject
  		public I_Gen105(I_Gen106 i_gen106){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen106 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  