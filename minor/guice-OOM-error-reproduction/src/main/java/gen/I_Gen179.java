
  package gen;
  public class I_Gen179 {
  		@com.google.inject.Inject
  		public I_Gen179(I_Gen180 i_gen180){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen180 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  