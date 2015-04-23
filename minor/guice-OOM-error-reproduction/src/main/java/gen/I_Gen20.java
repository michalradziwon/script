
  package gen;
  public class I_Gen20 {
  		@com.google.inject.Inject
  		public I_Gen20(I_Gen21 i_gen21){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen21 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  