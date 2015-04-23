
  package gen;
  public class I_Gen152 {
  		@com.google.inject.Inject
  		public I_Gen152(I_Gen153 i_gen153){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen153 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  