
  package gen;
  public class I_Gen21 {
  		@com.google.inject.Inject
  		public I_Gen21(I_Gen22 i_gen22){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen22 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  