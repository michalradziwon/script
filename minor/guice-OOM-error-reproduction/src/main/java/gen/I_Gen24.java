
  package gen;
  public class I_Gen24 {
  		@com.google.inject.Inject
  		public I_Gen24(I_Gen25 i_gen25){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen25 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  