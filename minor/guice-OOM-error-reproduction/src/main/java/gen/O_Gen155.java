
  package gen;
  public class O_Gen155 {
  		@com.google.inject.Inject
  		public O_Gen155(O_Gen156 o_gen156){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen156 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  