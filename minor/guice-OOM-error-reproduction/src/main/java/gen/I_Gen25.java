
  package gen;
  public class I_Gen25 {
  		@com.google.inject.Inject
  		public I_Gen25(I_Gen26 i_gen26){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen26 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  