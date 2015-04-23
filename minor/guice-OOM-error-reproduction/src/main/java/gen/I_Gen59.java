
  package gen;
  public class I_Gen59 {
  		@com.google.inject.Inject
  		public I_Gen59(I_Gen60 i_gen60){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen60 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  