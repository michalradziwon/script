
  package gen;
  public class S_Gen155 {
  		@com.google.inject.Inject
  		public S_Gen155(S_Gen156 s_gen156){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen156 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  