
  package gen;
  public class I_Gen34 {
  		@com.google.inject.Inject
  		public I_Gen34(I_Gen35 i_gen35){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen35 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  