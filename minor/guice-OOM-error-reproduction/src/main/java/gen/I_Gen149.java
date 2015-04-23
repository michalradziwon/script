
  package gen;
  public class I_Gen149 {
  		@com.google.inject.Inject
  		public I_Gen149(I_Gen150 i_gen150){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen150 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  