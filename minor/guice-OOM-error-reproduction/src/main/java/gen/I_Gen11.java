
  package gen;
  public class I_Gen11 {
  		@com.google.inject.Inject
  		public I_Gen11(I_Gen12 i_gen12){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen12 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  