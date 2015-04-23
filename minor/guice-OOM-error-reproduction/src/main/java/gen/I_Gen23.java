
  package gen;
  public class I_Gen23 {
  		@com.google.inject.Inject
  		public I_Gen23(I_Gen24 i_gen24){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen24 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  