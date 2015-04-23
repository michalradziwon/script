
  package gen;
  public class I_Gen154 {
  		@com.google.inject.Inject
  		public I_Gen154(I_Gen155 i_gen155){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen155 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  