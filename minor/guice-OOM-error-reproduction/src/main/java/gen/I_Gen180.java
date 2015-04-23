
  package gen;
  public class I_Gen180 {
  		@com.google.inject.Inject
  		public I_Gen180(I_Gen181 i_gen181){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen181 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  